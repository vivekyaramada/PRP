package gov.hhs.cms.prp.dao;

import com.google.gson.Gson;
import gov.hhs.cms.prp.entity.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;       // gr
import java.util.ArrayList;  // gr
import java.util.Collections;
import java.util.logging.Logger;

/**
 * Created by VivekKumar.ReddyYara on 10/23/2015.
 */
public class MysqlApplicationServiceDAO implements ApplicationServiceDAO{
    private final static Logger LOGGER = Logger.getLogger(MysqlApplicationServiceDAO.class.getName());

    @PersistenceUnit
    private EntityManagerFactory factory;

    public String getMsg(int applPsId)
    {
        factory = Persistence.createEntityManagerFactory("REPORTINGJPA");
        EntityManager em = factory.createEntityManager();
        String sql = "SELECT e FROM PrpAplctnEntity e where e.applPsId =" + applPsId;
        Query query = em.createQuery(sql);
        Collection<PrpAplctnEntity> list = (Collection<PrpAplctnEntity>) query.getResultList();
        em.close();
        factory.close();
        return new Gson().toJson(list);
    }

    public String getEvents(Integer keyPsid, Integer keyApplid)
    {
        factory = Persistence.createEntityManagerFactory("REPORTINGJPA");
        EntityManager em = factory.createEntityManager();
        String sql;
        if      (keyApplid  > 0) {
            sql = "SELECT e FROM PrpEvntFinalEntity e where e.aplctnIdent = " + keyApplid;
        }
        else if (keyPsid    > 0) {
            sql = "SELECT e FROM PrpEvntFinalEntity e where e.aplctnIdent is null and e.planSpnsrIdent = " + keyPsid;
        }
        else {
            sql = "SELECT e FROM PrpEvntFinalEntity e where e.planSpnsrIdent is null ";
        }
        Query query = em.createQuery(sql);
        Collection<PrpEvntFinalEntity>  list  = (Collection<PrpEvntFinalEntity>) query.getResultList();
        em.close();
        factory.close();
        return new Gson().toJson(list);
    }

    public int    updateEvent (PrpEvntFinalEntity event) {
        factory = Persistence.createEntityManagerFactory("REPORTINGJPA");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        LOGGER.info("MysqlApplicationServiceDAO.addEvent: " + event.getEvntCtgryData());
        em.merge(event);
        em.getTransaction().commit();
        return 0;
    }

    public String checkLogin(String usrname)
    {
        factory = Persistence.createEntityManagerFactory("REPORTINGJPA");
        EntityManager em = factory.createEntityManager();
        String sql = "SELECT e FROM PrpUsersEntity e where e.usrNm =" +" '"+ usrname+"' ";
        LOGGER.info("The SQL query is >>>>>>" + sql);
        Query query = em.createQuery(sql);
        Collection<PrpUsersEntity> list = (Collection<PrpUsersEntity>) query.getResultList();
        em.close();
        factory.close();
        return new Gson().toJson(list);

    }

    public void addchecks(String applPsId) {
        factory = Persistence.createEntityManagerFactory("REPORTINGJPA");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        LOGGER.info("Calling the query statement in addcheck method from DAO.>>>>>>>>>>>>>");
        PrpEvntNwEntity insertPrpEvntNwEntity = new PrpEvntNwEntity();
        insertPrpEvntNwEntity.setPlanSpnsrIdent(Integer.valueOf(applPsId));
        insertPrpEvntNwEntity.setEvntTypeCd("CR");
        insertPrpEvntNwEntity.setEvntOrgnCd("C");
        insertPrpEvntNwEntity.setProcTs(new Timestamp(new java.util.Date().getTime()));
        insertPrpEvntNwEntity.setUserName("vivek");
        insertPrpEvntNwEntity.setEvntCtgry("CR");
        em.persist(insertPrpEvntNwEntity);
        em.getTransaction().commit();
    }
}
