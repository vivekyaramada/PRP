package gov.hhs.cms.prp.facade;

import gov.hhs.cms.prp.entity.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.logging.Logger;


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




    private prpValidation prpValidation;


    public prpFacade() {

        prpValidation = new prpValidation();
    }

    public ArrayList getApplications(String keyword) {

        ArrayList applications = prpValidation.getApplications(keyword);
        return applications;
    }

    public ArrayList getEvents(String keyword) {
        ArrayList events = prpValidation.getEvents(keyword);
        return events;
    }

    public String checkLogin(LoginEntity datalogin,UserDetails userDetails) {
        /*HttpSession session = SessionBean.getSession();
        LOGGER.info("SATHVIK>>>>>>>>>>>>" + session.getAttribute("username"));*/
        return prpValidation.checkLogin(datalogin,userDetails);
    }

    public String writeData(AddCheckEntity datachecks,UserDetails userDetails) {
        LOGGER.info("SATHVIK>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+ userDetails.getCheckName() + userDetails.getPassword() + userDetails.getUsername());
       return prpValidation.writeData(datachecks,userDetails);
    }
}
