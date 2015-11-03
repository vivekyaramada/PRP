package gov.hhs.cms.prp.ws;

/**
 * Created by VivekKumar.ReddyYara on 10/1/2015.
 */


import javax.persistence.EntityManagerFactory;



import javax.ws.rs.*;

import gov.hhs.cms.prp.dao.bean.AddChecksDAOBean;
import gov.hhs.cms.prp.dao.bean.CheckLoginDAOBean;
import gov.hhs.cms.prp.dao.bean.GetMsgDAOBean;
import gov.hhs.coms.prp.dao.factory.MySQLDAOFactory;
import  org.apache.log4j.Logger;
import javax.persistence.PersistenceUnit;




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
    @Path("checklogin/{param}/{name}")
    @Produces("application/json")
    public String checkLogin(@PathParam("param") String username, @PathParam("name") String name) {


        CheckLoginDAOBean checkLoginDAOBean = (CheckLoginDAOBean) mySQLDAOFactory.getBean("checklogindaobean");
        return checkLoginDAOBean.checkLogin(username);
    }

    @GET
    @Path("addcheck/{param}/{name}")
    @Produces("application/json")
    public void addchecks(@PathParam("param") String applPsId, @PathParam("name") String name) {
        AddChecksDAOBean addChecksDAOBean = (AddChecksDAOBean) mySQLDAOFactory.getBean("addchecksdaobean");
        addChecksDAOBean.addchecks(applPsId);
    }
}