package gov.hhs.cms.prp.dao;

import com.google.gson.Gson;
import gov.hhs.cms.prp.entity.PrpAplctnEntity;
import gov.hhs.cms.prp.entity.PrpEvntNwEntity;
import gov.hhs.cms.prp.entity.PrpUsersEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
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
        insertPrpEvntNwEntity.setPlanSpnsrIdent(applPsId);
        insertPrpEvntNwEntity.setEvntTypeCd("CR");
        insertPrpEvntNwEntity.setEvntOrgnCd("C");
        insertPrpEvntNwEntity.setProcTs(new Timestamp(new java.util.Date().getTime()));
        insertPrpEvntNwEntity.setUserName("vivek");
        insertPrpEvntNwEntity.setEvntCtgry("CR");
        em.persist(insertPrpEvntNwEntity);
        em.getTransaction().commit();
    }
}
