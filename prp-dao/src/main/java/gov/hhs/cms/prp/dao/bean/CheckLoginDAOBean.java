package gov.hhs.cms.prp.dao.bean;

import com.google.gson.Gson;
import gov.hhs.cms.prp.entity.PrpUsersEntity;
import org.apache.log4j.Logger;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by VivekKumar.ReddyYara on 11/2/2015.
 */
public class CheckLoginDAOBean {

    private final static Logger LOGGER = Logger.getLogger(CheckLoginDAOBean.class.getName());

    @PersistenceUnit
    private EntityManagerFactory factory;
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

}



