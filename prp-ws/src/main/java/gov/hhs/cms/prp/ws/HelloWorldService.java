package gov.hhs.cms.prp.ws; /**
 * Created by VivekKumar.ReddyYara on 10/1/2015.
 */


import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import gov.hhs.cms.prp.entity.PrpAplctnEntity;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.logging.Logger;

@Path("/hello")
public class HelloWorldService {
    private final static Logger LOGGER = Logger.getLogger(HelloWorldService.class.getName());

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {

        String output = "Jersey say : " + msg;
        java.util.Map<Object,Object> map = new java.util.HashMap<Object,Object>();
        LOGGER.info("Before vivek1>>>>>>>>>>>>>>");
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("REPORTINGJPA");
        LOGGER.info("Before vivek2>>>>>>>>>>>>>>");
        EntityManager em = factory.createEntityManager();
        LOGGER.info("Before vivek3>>>>>>>>>>>>>>");
        String sql = "SELECT e FROM PrpAplctnEntity e";
        LOGGER.info("Before vivek4>>>>>>>>>>>>>>");
        Query query = em.createQuery(sql);
        LOGGER.info("Before vivek5>>>>>>>>>>>>>>");
        Collection<PrpAplctnEntity> list =  (Collection<PrpAplctnEntity>) query.getResultList();

        for (PrpAplctnEntity AplctnEntity : list)
        {
            System.out.println("The value of vivek is prpAplctnEntity is " + AplctnEntity.getApplPsCompany());
            LOGGER.info("The value of vivek is prpAplctnEntity is " + AplctnEntity.getApplPsCompany());
        }

        em.close();
        factory.close();

        return Response.status(200).entity(output).build();

    }

}