package gov.hhs.cms.prp.ws;

/**
 * Created by VivekKumar.ReddyYara on 10/1/2015.
 */

import javax.persistence.EntityManagerFactory;

import gov.hhs.coms.prp.dao.factory.DAOFactory;

import javax.ws.rs.*;
import java.util.logging.Logger;
import javax.persistence.PersistenceUnit;
import gov.hhs.cms.prp.entity.UserDetails;

import gov.hhs.cms.prp.dao.ApplicationServiceDAO;

@Path("/hello")
public class PrpApplicationService {
    private final static Logger LOGGER = Logger.getLogger(PrpApplicationService.class.getName());

    @PersistenceUnit
    private EntityManagerFactory factory;

    @GET
    @Path("applications/{param}/{name}")
    @Produces("application/json")
    public String getMsg(@PathParam("param") int applPsId , @PathParam("name") String name) {

        DAOFactory mysqlDAOFactory =
                DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        ApplicationServiceDAO applicationServiceDAO = mysqlDAOFactory.getApplicationServiceDAO();
        return applicationServiceDAO.getMsg(applPsId);
    }

    @GET
    @Path("events/{keyPsid}/{keyApplid}/{name}")
    @Produces("application/json")
    public String getEvents(@PathParam("keyPsid") Integer keyPsid , @PathParam("keyApplid") Integer keyApplid , @PathParam("name") String name) {

        DAOFactory mysqlDAOFactory =
                DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        ApplicationServiceDAO applicationServiceDAO = mysqlDAOFactory.getApplicationServiceDAO();
        return applicationServiceDAO.getEvents(keyPsid, keyApplid);
    }

    @GET
    @Path("checklogin/{param}/{name}")
    @Produces("application/json")
    public String checkLogin(@PathParam("param") String username, @PathParam("name") String name) {

        DAOFactory mysqlDAOFactory =
                DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        ApplicationServiceDAO applicationServiceDAO = mysqlDAOFactory.getApplicationServiceDAO();
        return applicationServiceDAO.checkLogin(username);
    }



    @GET
    @Path("addcheck/{param}/{name}")
    @Produces("application/json")
    public void addchecks(@PathParam("param") String applPsId, @PathParam("name") String name) {
        DAOFactory mysqlDAOFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        ApplicationServiceDAO applicationServiceDAO = mysqlDAOFactory.getApplicationServiceDAO();
        applicationServiceDAO.addchecks(applPsId);
    }
}
