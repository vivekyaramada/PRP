package gov.hhs.cms.prp.dao.bean;

import gov.hhs.cms.prp.entity.PrpAplctnEntity;
import org.apache.log4j.Logger;

import javax.persistence.*;

/**
 * Created by jarsen on 11/18/2015.
 */
public class PrpAplctnDAOBean {
    private final static Logger LOGGER = Logger.getLogger(PrpAplctnDAOBean.class.getName());

    @PersistenceUnit
    private EntityManagerFactory factory;


    public void persistAplctn(PrpAplctnEntity prpAplctnEntity)
    {
        LOGGER.info("Attempting to persist PrpAplctnEntity");
        factory = Persistence.createEntityManagerFactory("REPORTINGJPA");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(prpAplctnEntity);
        em.getTransaction().commit();
        em.close();
        factory.close();
    }

    public void mergeAplctn(PrpAplctnEntity prpAplctnEntity) {
        LOGGER.info("Attempting to merge PrpAplctnEntity");
        factory = Persistence.createEntityManagerFactory("REPORTINGJPA");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.merge(prpAplctnEntity);
        em.getTransaction().commit();
        em.close();
        factory.close();
    }

}
