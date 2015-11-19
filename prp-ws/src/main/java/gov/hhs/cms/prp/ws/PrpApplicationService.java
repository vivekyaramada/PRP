package gov.hhs.cms.prp.ws;

/**
 * Created by VivekKumar.ReddyYara on 10/1/2015.
 */


import javax.persistence.EntityManagerFactory;



import javax.ws.rs.*;

import gov.hhs.cms.prp.dao.bean.AddChecksDAOBean;
import gov.hhs.cms.prp.dao.bean.CheckLoginDAOBean;
import gov.hhs.cms.prp.dao.bean.ConstantsDAOBean;
import gov.hhs.cms.prp.dao.bean.GetMsgDAOBean;
import gov.hhs.cms.prp.entity.*;
import gov.hhs.coms.prp.dao.factory.MySQLDAOFactory;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceUnit;
import com.google.gson.Gson;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


@Path("/hello")
public class PrpApplicationService {
    private final static Logger LOGGER = Logger.getLogger(PrpApplicationService.class.getName());

    @PersistenceUnit
    private EntityManagerFactory factory;
    MySQLDAOFactory mySQLDAOFactory;


    public PrpApplicationService() {

        mySQLDAOFactory = new MySQLDAOFactory();
    }


    @GET
       @Path("applications/{param}/{name}")
       @Produces("application/json")
       public String getMsg(@PathParam("param") int applPsId , @PathParam("name") String name) {

        GetMsgDAOBean getMsgDAOBean = (GetMsgDAOBean) mySQLDAOFactory.getBean("getmsgdaobean");
        return getMsgDAOBean.getMsg(applPsId);
    }

    @GET
    @Path("checklogin/{param}/{userdetails}")
    @Produces("application/json")
    public String checkLogin(@PathParam("param") String login,@PathParam("userdetails") String userdetails) {


        Gson gson = new Gson();
        LoginEntity loginEntity = gson.fromJson (login, LoginEntity.class);
        UserDetails userDetails = gson.fromJson (userdetails,UserDetails.class);
        LOGGER.info("The value of userdetails are>>>>" + userDetails.getUsername() + userDetails.getPassword());
        //JsonElement element = gson.fromJson (loginentity, JsonElement.class);
        //JsonObject jsonObj = element.getAsJsonObject();
        CheckLoginDAOBean checkLoginDAOBean = (CheckLoginDAOBean) mySQLDAOFactory.getBean("checklogindaobean");
        return checkLoginDAOBean.checkLogin(loginEntity.getUsername());
    }

    @GET
    @Path("addcheck/{param}/{name}")
    @Produces("application/json")
    public void addchecks(@PathParam("param") String applPsId, @PathParam("name") String name) {
        AddChecksDAOBean addChecksDAOBean = (AddChecksDAOBean) mySQLDAOFactory.getBean("addchecksdaobean");
        addChecksDAOBean.addchecks(applPsId);
    }

    @GET
    @Path("getconstants")
    @Produces("application/json")
    public String getConstants() {
        String Constants = null;
        String Constants1=null;
        try {
            LOGGER.log(Level.INFO, "Entering getconstants>>>");
            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            ConstantsDAOBean constantsDAOBean = (ConstantsDAOBean)  context.getBean("constantsdaobean");
            Constants=constantsDAOBean.getEventType();
           //second call to test Spring Cache.
            Constants1=constantsDAOBean.getEventType();
            LOGGER.log(Level.INFO, "Constants>>>>"+ Constants);
            LOGGER.log(Level.INFO, "Constants1>>>>"+ Constants1);
            ((ConfigurableApplicationContext)context).close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
            LOGGER.log(Level.INFO, "Exception in getConstants()"+ e);
            Constants="false";
        }
        return Constants;
    }

}