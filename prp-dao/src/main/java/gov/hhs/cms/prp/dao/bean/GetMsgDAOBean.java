package gov.hhs.cms.prp.dao.bean;

import com.google.gson.Gson;
import gov.hhs.cms.prp.entity.PrpAplctnEntity;
import org.apache.log4j.Logger;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by VivekKumar.ReddyYara on 11/2/2015.
 */
public class GetMsgDAOBean {
    private final static Logger LOGGER = Logger.getLogger(GetMsgDAOBean.class.getName());

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

}
