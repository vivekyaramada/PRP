package gov.hhs.cms.prp.dao.bean;

import gov.hhs.cms.prp.entity.PrpEvntNwEntity;
import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 11/2/2015.
 */
public class AddChecksDAOBean {
    private final static Logger LOGGER = Logger.getLogger(AddChecksDAOBean.class.getName());

    @PersistenceUnit
    private EntityManagerFactory factory;

    public void addchecks(String applPsId) throws SQLException {
        LOGGER.info("Calling Addchecks Method from DAOBean>>>>>>>>>>>>>");
        factory = Persistence.createEntityManagerFactory("REPORTINGJPA");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
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
