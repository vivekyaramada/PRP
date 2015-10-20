package gov.hhs.cms.prp.ws;

/**
 * Created by VivekKumar.ReddyYara on 10/1/2015.
 */


import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.google.gson.Gson;
import gov.hhs.cms.prp.entity.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.Collection;
import java.util.logging.Logger;
import javax.persistence.PersistenceUnit;

@Path("/hello")
public class PrpApplicationService {
    private final static Logger LOGGER = Logger.getLogger(PrpApplicationService.class.getName());

    @PersistenceUnit
    private EntityManagerFactory factory;

    @GET
    @Path("applications/{param}")
    @Produces("application/json")
    public String getMsg(@PathParam("param") int applPsId) {

        //java.util.Map<Object, Object> map = new java.util.HashMap<Object, Object>();

        factory = Persistence.createEntityManagerFactory("REPORTINGJPA");

        EntityManager em = factory.createEntityManager();

        String sql = "SELECT e FROM PrpAplctnEntity e where e.applPsId =" + applPsId;

        Query query = em.createQuery(sql);



        Collection<PrpAplctnEntity> list = (Collection<PrpAplctnEntity>) query.getResultList();

        em.close();
        factory.close();

        return new Gson().toJson(list);

    }

    @GET
    @Path("addcheck/{param}")
    @Produces("application/json")
    public void addchecks(@PathParam("param") int applPsId) {

       /* java.util.Map<Object, Object> map = new java.util.HashMap<Object, Object>();

        factory = Persistence.createEntityManagerFactory("REPORTINGJPA");

        EntityManager em = factory.createEntityManager();

        String sql = "SELECT e FROM PrpAplctnEntity e where e.applPsId =" + applPsId;

        Query query = em.createQuery(sql);

        Collection<PrpAplctnEntity> list = (Collection<PrpAplctnEntity>) query.getResultList();

        em.close();
        factory.close();

        return new Gson().toJson(list);*/


        factory = Persistence.createEntityManagerFactory("REPORTINGJPA");

        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

        LOGGER.info("Calling the query statement in addcheck method>>>>>>>>>>>>>");

       /* String sql = " INSERT INTO PrpEvntNwEntity(pkPrpEventId) values('123456789')";

        Query query = em.createQuery(sql);

        query.executeUpdate();*/



        PrpEvntNwEntity insertPrpEvntNwEntity = new PrpEvntNwEntity();
        insertPrpEvntNwEntity.setPkPrpEventId(applPsId);

        em.persist(insertPrpEvntNwEntity);
        em.getTransaction().commit();

        LOGGER.info("HUrray Vivek your transaction is committed>>>>>>>>>>>>>>>");

    }
}