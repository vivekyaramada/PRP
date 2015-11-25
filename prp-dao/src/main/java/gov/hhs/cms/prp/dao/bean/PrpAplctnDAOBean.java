package gov.hhs.cms.prp.dao.bean;

import gov.hhs.cms.prp.entity.PrpAplctnEntity;
import gov.hhs.cms.prp.entity.PrpPlanoptionsEntity;
import org.apache.log4j.Logger;

import javax.persistence.*;

/**
 * Created by jarsen on 11/18/2015.
 */
public class PrpAplctnDAOBean {
    private final static Logger LOGGER = Logger.getLogger(PrpAplctnDAOBean.class.getName());

    @PersistenceUnit
    private EntityManagerFactory factory;

    private EntityManager entityManager;

    private EntityManagerFactory getEntityManagerFactory() {
        if (null == factory) {
            factory = Persistence.createEntityManagerFactory("REPORTINGJPA");
        }
        return factory;
    }

    private EntityManager getEntityManager() {
        if (null == entityManager) {
            entityManager = getEntityManagerFactory().createEntityManager();
        }
        return entityManager;
    }

    public void mergeAplctn(PrpAplctnEntity prpAplctnEntity) {
        LOGGER.info("Attempting to merge PrpAplctnEntity");
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.merge(prpAplctnEntity);
        em.flush();
        em.getTransaction().commit();

    }

    public void mergePlanoption(PrpPlanoptionsEntity prpPlanoptionsEntity) {
        LOGGER.info("Attempting to merge PrpPlanoptionsEntity");
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.merge(prpPlanoptionsEntity);
        em.flush();
        em.getTransaction().commit();

    }

    public void mergeEntity(Entity entity) {
        LOGGER.info("Attempting to merge Entity: " + entity.toString());
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.merge(entity);
        em.flush();
        em.getTransaction().commit();
    }

}
