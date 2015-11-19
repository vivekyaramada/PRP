package gov.hhs.cms.prp.dao.bean;

import com.google.gson.Gson;

import gov.hhs.cms.prp.entity.PrpConstEntity;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

import javax.persistence.*;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Level;

/**
 * Created by VivekKumar.ReddyYara on 11/18/2015.
 */
@Repository("constantsdaobean")
public class ConstantsDAOBean {
    private final static Logger LOGGER = Logger.getLogger(ConstantsDAOBean.class.getName());

    @PersistenceUnit
    private EntityManagerFactory factory;

    @org.springframework.cache.annotation.Cacheable(value="eventypecache")
    public  String getEventType()
    {
        LOGGER.log(Level.INFO, "Entering getEventType>>>>>>>");
        factory = Persistence.createEntityManagerFactory("REPORTINGJPA");
        EntityManager em = factory.createEntityManager();
        String sql = "SELECT e FROM PrpConstEntity e";
        Query query = em.createQuery(sql);
        Collection<PrpConstEntity> list = (Collection<PrpConstEntity>) query.getResultList();
        em.close();
        factory.close();
        return new Gson().toJson(list);
    }
}

