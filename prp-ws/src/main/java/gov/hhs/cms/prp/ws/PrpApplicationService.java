package gov.hhs.cms.prp.ws;

/**
 * Created by VivekKumar.ReddyYara on 10/1/2015.
 */

import javax.persistence.EntityManagerFactory;

import com.google.gson.reflect.TypeToken;
import gov.hhs.cms.prp.entity.PrpAplctnEntity;
import gov.hhs.cms.prp.entity.PrpEvntFinalEntity;
import gov.hhs.coms.prp.dao.factory.DAOFactory;
import com.google.gson.Gson;

import javax.ws.rs.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
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

        //LOGGER.info("PrpApplicationService.getEvents() started");
        DAOFactory mysqlDAOFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        ApplicationServiceDAO applicationServiceDAO = mysqlDAOFactory.getApplicationServiceDAO();
        return applicationServiceDAO.getEvents(keyPsid, keyApplid);
    }

    @GET
    @Path("updateEvent/{event}/{name}")
    @Produces("application/json")
    public int  updateEvent (@PathParam("event") String inEventString, @PathParam("name") String name) {

        LOGGER.info("PrpApplicationService.updateEvent, string: " + inEventString);
        String eventString = unescapeString(inEventString);
        LOGGER.info("PrpApplicationService.updateEvent, string: " + eventString);

        DAOFactory mysqlDAOFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        Gson gson  = new Gson();
        Type listOfTestObject = new TypeToken<PrpEvntFinalEntity>() { }.getType();
        PrpEvntFinalEntity event = gson.fromJson(eventString, listOfTestObject);

        ApplicationServiceDAO applicationServiceDAO = mysqlDAOFactory.getApplicationServiceDAO();
        return applicationServiceDAO.updateEvent(event);
    }

    private String unescapeString (String inString) {
        StringBuffer sb    = new StringBuffer ();
        int          lgth  = inString.length();
        int          lgth2 = lgth - 2;
        int          a     = 0;

        for (; a<lgth2; a++) {
            char x = inString.charAt(a);
            if (x   != '%')   { sb.append(x); continue; }
            String hexValue = inString.substring(a+1, a+3);
            if      (hexValue.equalsIgnoreCase("7B")) {
                sb.append('{');
                a += 2;
            }
            else if (hexValue.equalsIgnoreCase("7D")) {
                sb.append('}');
                a += 2;
            }
            else sb.append(x);
        }

        for (; a<lgth; a++) {
            sb.append(inString.charAt(a));
        }
        return sb.toString();
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
