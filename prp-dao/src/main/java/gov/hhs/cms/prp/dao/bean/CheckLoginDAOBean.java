package gov.hhs.cms.prp.dao.bean;

import com.google.gson.Gson;
import gov.hhs.cms.prp.entity.*;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.logging.Logger;

/**
 * Created by VivekKumar.ReddyYara on 11/2/2015.
 */
public class CheckLoginDAOBean {

    private final static Logger LOGGER = Logger.getLogger(CheckLoginDAOBean.class.getName());

    @PersistenceUnit
    private EntityManagerFactory factory;

    public String checkLogin(String usrname)
    {
        try {
            LOGGER.info("Calling checkLogin Method from DAOBean>>>>>>>>>>>>>");
            factory = Persistence.createEntityManagerFactory("REPORTINGJPA");
            EntityManager em = factory.createEntityManager();
            String sql = "SELECT e FROM PrpUsersEntity e where e.usrNm =" + " '" + usrname + "' ";
            LOGGER.info("The SQL query is >>>>>>" + sql);
            Query query = em.createQuery(sql);
            Collection<PrpUsersEntity> list = (Collection<PrpUsersEntity>) query.getResultList();
            em.close();
            factory.close();
            return new Gson().toJson(list);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public String getUserRoles()
    {
        LOGGER.info("Calling getUserRoles Method from DAOBean>>>>>>>>>>>>>");
        try {
            factory = Persistence.createEntityManagerFactory("REPORTINGJPA");
            EntityManager em = factory.createEntityManager();
            String sql = "SELECT e FROM PrpUsrRoleEntity e ";
            LOGGER.info("The SQL query is >>>>>>" + sql);
            Query query = em.createQuery(sql);
            Collection<PrpUsrRoleEntity> list = (Collection<PrpUsrRoleEntity>) query.getResultList();
            em.close();
            factory.close();
            return new Gson().toJson(list);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public String getRoleMethods() {
        try {
            LOGGER.info("Calling getRoleMethods Method from DAOBean>>>>>>>>>>>>>");
            factory = Persistence.createEntityManagerFactory("REPORTINGJPA");
            EntityManager em = factory.createEntityManager();
            String sql = "SELECT e FROM PrpRoleMtdEntity e ";
            LOGGER.info("The SQL query is >>>>>>" + sql);
            Query query = em.createQuery(sql);
            Collection<PrpRoleMtdEntity> list = (Collection<PrpRoleMtdEntity>) query.getResultList();
            em.close();
            factory.close();
            return new Gson().toJson(list);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public void insertAudit(String name,String methodname, String status) {
        LOGGER.info("Calling insertAudit Method from DAOBean>>>>>>>>>>>>>");
        try {
            factory = Persistence.createEntityManagerFactory("REPORTINGJPA");
            EntityManager em = factory.createEntityManager();
            em.getTransaction().begin();
            PrpAuditEntity insertPrpAuditEntity = new PrpAuditEntity();
            insertPrpAuditEntity.setUsername(name);
            insertPrpAuditEntity.setMethod(methodname);
            insertPrpAuditEntity.setStatus(status);
            insertPrpAuditEntity.setTimestamp(new Timestamp(new java.util.Date().getTime()));
            em.persist(insertPrpAuditEntity);
            em.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}



