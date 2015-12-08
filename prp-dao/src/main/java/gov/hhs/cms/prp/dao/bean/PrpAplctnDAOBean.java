package gov.hhs.cms.prp.dao.bean;

import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

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

    public void mergeEntity(Object entity) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.merge(entity);
        em.flush();
        em.getTransaction().commit();
    }

}
