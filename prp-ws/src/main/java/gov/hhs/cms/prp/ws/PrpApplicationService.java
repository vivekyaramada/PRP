package gov.hhs.cms.prp.ws;

/**
 * Created by VivekKumar.ReddyYara on 10/1/2015.
 */
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.*;
import com.google.gson.reflect.TypeToken;
import gov.hhs.cms.prp.dao.bean.AddChecksDAOBean;
import gov.hhs.cms.prp.dao.bean.CheckLoginDAOBean;
import gov.hhs.cms.prp.dao.bean.ConstantsDAOBean;
import gov.hhs.cms.prp.dao.bean.GetMsgDAOBean;
import gov.hhs.cms.prp.entity.*;
import gov.hhs.coms.prp.dao.factory.MySQLDAOFactory;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceUnit;
import com.google.gson.Gson;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.ui.Model;


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
        LOGGER.info("Calling getMsg Method from webservice>>>>>>>>>>>>>");
        String status = null;
        try {
            if (!isUserAuthenticated(name, "getmsg")) {
                status="no access";
                return null;
            }
            GetMsgDAOBean getMsgDAOBean = (GetMsgDAOBean) mySQLDAOFactory.getBean("getmsgdaobean");
            status="success";
            return getMsgDAOBean.getMsg(applPsId);
        }
        catch(Exception e)
        {
            status="exception occured";
            LOGGER.info("Exception Occured in getMsg>>>" + e);
            return null;
        }
        finally {
            CheckLoginDAOBean checkLoginDAOBean = (CheckLoginDAOBean) mySQLDAOFactory.getBean("checklogindaobean");
            checkLoginDAOBean.insertAudit(name,"getmsg",status);
        }
    }

    @GET
    @Path("checklogin/{param}/{userdetails}")
    @Produces("application/json")
    public String checkLogin(@PathParam("param") String login,@PathParam("userdetails") String userdetails) {
        LOGGER.info("Calling checkLogin Method from webservice>>>>>>>>>>>>>");
        String status = null;
        Gson gson = new Gson();
        LoginEntity loginEntity = gson.fromJson (login, LoginEntity.class);
        try {
            if (!isUserAuthenticated(loginEntity.getUsername(), "checklogin")) {
                status="no access";
                return null;
            }
            UserDetails userDetails = gson.fromJson (userdetails,UserDetails.class);
            LOGGER.info("The value of userdetails are>>>>" + userDetails.getUsername() + userDetails.getPassword());
            //JsonElement element = gson.fromJson (loginentity, JsonElement.class);
            //JsonObject jsonObj = element.getAsJsonObject();
            CheckLoginDAOBean checkLoginDAOBean = (CheckLoginDAOBean) mySQLDAOFactory.getBean("checklogindaobean");
            status="success";
            LOGGER.info("Success of method checkLogin()>>>>>>");
            return checkLoginDAOBean.checkLogin(loginEntity.getUsername());
        }
        catch(Exception e)
        {
            status="exception occured";
            LOGGER.info("Exception Occured in checkLogin>>>" + e);
            return null;
        }
        finally {
            CheckLoginDAOBean checkLoginDAOBean = (CheckLoginDAOBean) mySQLDAOFactory.getBean("checklogindaobean");
            checkLoginDAOBean.insertAudit(loginEntity.getUsername(),"checkLogin",status);

        }
    }

    @GET
    @Path("addcheck/{param}/{name}")
    @Produces("application/json")
    public void addchecks(@PathParam("param") String applPsId, @PathParam("name") String name) {
        LOGGER.info("Calling addchecks Method from webservice>>>>>>>>>>>>>");
        String status = null;
        try {
            if (!isUserAuthenticated(name, "addchecks")) {
                status = "no access";
            }
            AddChecksDAOBean addChecksDAOBean = (AddChecksDAOBean) mySQLDAOFactory.getBean("addchecksdaobean");
            addChecksDAOBean.addchecks(applPsId);
            status = "success";
            LOGGER.info("Success of method addchecks()>>>>>>");
        }
        catch(Exception e)
        {
            status="exception occured";
            LOGGER.info("Exception Occured in addchecks>>>" + e);

        }
        finally {
            CheckLoginDAOBean checkLoginDAOBean = (CheckLoginDAOBean) mySQLDAOFactory.getBean("checklogindaobean");
            checkLoginDAOBean.insertAudit(name,"addchecks",status);

        }
    }

    @GET
    @Path("getconstant")
    @Produces("application/json")
    public String getConstants() {
        LOGGER.info("Calling addchecks Method from webservice>>>>>>>>>>>>>");
        String Constants = null;
        String Constants1=null;
        try {
            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            ConstantsDAOBean constantsDAOBean = (ConstantsDAOBean)  context.getBean("constantsdaobean");
            Constants=constantsDAOBean.getEventType();
            //second call to test Spring Cache.
            Constants1=constantsDAOBean.getEventType();
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


    private boolean isUserAuthenticated(String username,String methodname){
        LOGGER.info("Calling isUserAuthenticated Method from webservice>>>>>>>>>>>>>");
        try {
            Gson gson = new Gson();
            CheckLoginDAOBean checkLoginDAOBean = (CheckLoginDAOBean) mySQLDAOFactory.getBean("checklogindaobean");
            String responseUserRoles = checkLoginDAOBean.getUserRoles();
            Type listOfUsrRoleEntity = new TypeToken<List<PrpUsrRoleEntity>>() {
            }.getType();
            ArrayList<PrpUsrRoleEntity> listUsrRoleEntity = gson.fromJson(responseUserRoles, listOfUsrRoleEntity);
            for (int i = 0; i < listUsrRoleEntity.size(); i++) {

                if (listUsrRoleEntity.get(i).getUsrName().equals(username)) {
                    String responseRoleMethods = checkLoginDAOBean.getRoleMethods();
                    Type listOfRoleMtdEntity = new TypeToken<List<PrpRoleMtdEntity>>() {
                    }.getType();
                    ArrayList<PrpRoleMtdEntity> listRoleMtdEntity = gson.fromJson(responseRoleMethods, listOfRoleMtdEntity);
                    for (int j = 0; j < listRoleMtdEntity.size(); j++) {
                        if (listRoleMtdEntity.get(j).getRole().equals(listUsrRoleEntity.get(i).getRole())) {
                            if (listRoleMtdEntity.get(j).getMethod().equals(methodname)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            LOGGER.log(Level.INFO, "Exception in isUserAuthenticated()" + e);
        }

        return false;
    }
}