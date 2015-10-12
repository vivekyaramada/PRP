package gov.hhs.cms.prp.ws;

/**
 * Created by VivekKumar.ReddyYara on 10/1/2015.
 */


import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.google.gson.Gson;
import gov.hhs.cms.prp.entity.PrpAplctnEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;
import javax.persistence.PersistenceUnit;

import com.google.gson.*;

@Path("/hello")
public class PrpApplicationService {
    private final static Logger LOGGER = Logger.getLogger(PrpApplicationService.class.getName());

    @PersistenceUnit
    private EntityManagerFactory factory;

    @GET
    @Path("/{param}")
    @Produces("application/json")
    public String getMsg(@PathParam("param") int applPsId) {

        java.util.Map<Object, Object> map = new java.util.HashMap<Object, Object>();

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