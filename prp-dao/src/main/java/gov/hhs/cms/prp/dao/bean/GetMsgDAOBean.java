package gov.hhs.cms.prp.dao.bean;

import com.google.gson.Gson;
import gov.hhs.cms.prp.entity.PrpAplctnEntity;
import gov.hhs.cms.prp.entity.PrpConstEntity;
import java.util.logging.Logger;
import org.springframework.cache.annotation.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.logging.Level;

/**
 * Created by VivekKumar.ReddyYara on 11/2/2015.
 */
public class GetMsgDAOBean {
    private final static Logger LOGGER = Logger.getLogger(GetMsgDAOBean.class.getName());

    @PersistenceUnit
    private EntityManagerFactory factory;


    public String getMsg(int applPsId)
    {
        try {
            LOGGER.info("Calling getMsg Method from DAOBean>>>>>>>>>>>>>");
            factory = Persistence.createEntityManagerFactory("REPORTINGJPA");
            EntityManager em = factory.createEntityManager();
            String sql = "SELECT e FROM PrpAplctnEntity e where e.applPsId =" + applPsId;
            Query query = em.createQuery(sql);
            Collection<PrpAplctnEntity> list = (Collection<PrpAplctnEntity>) query.getResultList();
            em.close();
            factory.close();
            return new Gson().toJson(list);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}


