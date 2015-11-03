package gov.hhs.cms.prp.facade;

import gov.hhs.cms.prp.entity.*;

import java.util.ArrayList;

import gov.hhs.cms.prp.facadebeans.CheckLoginBean;
import gov.hhs.cms.prp.facadebeans.GetApplicationsBean;
import gov.hhs.cms.prp.facadebeans.WriteDataBean;
import  org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


/**
 * Created by VivekKumar.ReddyYara on 9/11/2015.
 */
public class prpFacade {

    private final static Logger LOGGER = Logger.getLogger(prpFacade.class.getName());

    public LoginEntity getLoginEntity() {
        return loginEntity;
    }

    public void setLoginEntity(LoginEntity loginEntity) {
        this.loginEntity = loginEntity;
    }

    private LoginEntity loginEntity;

    ApplicationContext context;



    public prpFacade() {

       context = new ClassPathXmlApplicationContext("beans.xml");
    }

    public ArrayList getApplications(String keyword,UserDetails userDetails) {
        GetApplicationsBean getApplicationsBean = (GetApplicationsBean) context.getBean("getapplicationsbean");

        return getApplicationsBean.getApplications(keyword,userDetails);
    }

    public String checkLogin(LoginEntity datalogin,UserDetails userDetails) {


        CheckLoginBean checkLoginBean = (CheckLoginBean) context.getBean("checkloginbean");
        return checkLoginBean.checkLogin(datalogin,userDetails);

    }

    public String writeData(AddCheckEntity datachecks,UserDetails userDetails) {

        WriteDataBean writeDataBean =  (WriteDataBean) context.getBean("writedatabean");

       return writeDataBean.writeData(datachecks,userDetails);
    }
}
