package gov.hhs.cms.prp.ws;

/**
 * Created by VivekKumar.ReddyYara on 10/1/2015.
 */


import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.google.gson.Gson;
import gov.hhs.cms.prp.dao.DAOFactory;
import gov.hhs.cms.prp.entity.*;

import javax.ws.rs.*;
import java.util.Collection;
import java.util.logging.Logger;
import javax.persistence.PersistenceUnit;
import java.sql.Timestamp;
import java.util.Date;
import gov.hhs.cms.prp.dao.ApplicationServiceDAO;

@Path("/hello")
public class PrpApplicationService {
    private final static Logger LOGGER = Logger.getLogger(PrpApplicationService.class.getName());

    @PersistenceUnit
    private EntityManagerFactory factory;

    @GET
    @Path("applications/{param}")
    @Produces("application/json")
    public String getMsg(@PathParam("param") int applPsId) {
        DAOFactory mysqlDAOFactory =
                DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        ApplicationServiceDAO applicationServiceDAO = mysqlDAOFactory.getApplicationServiceDAO();
        return applicationServiceDAO.getMsg(applPsId);
    }

    @POST
    @Path("addcheck/{param}")

    public void addchecks(@PathParam("param") String applPsId) {

        LOGGER.info("Inside the webservice >>>>>>>>>>>>>>>>" );
        DAOFactory mysqlDAOFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        ApplicationServiceDAO applicationServiceDAO = mysqlDAOFactory.getApplicationServiceDAO();
        applicationServiceDAO.addchecks(applPsId);
    }
}