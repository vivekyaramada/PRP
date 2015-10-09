package gov.hhs.cms.prp.facade;

import gov.hhs.cms.prp.entity.*;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * Created by VivekKumar.ReddyYara on 9/11/2015.
 */
public class prpFacade {

    private final static Logger LOGGER = Logger.getLogger(ApplicationTableEntity.class.getName());

    public LoginEntity getLoginEntity() {
        return loginEntity;
    }

    public void setLoginEntity(LoginEntity loginEntity) {
        this.loginEntity = loginEntity;
    }

    private LoginEntity loginEntity;

    private ApplicationTableEntity dataappdatabean;


    private prpValidation prpValidation;


    public prpFacade() {
        dataappdatabean = new ApplicationTableEntity();

        prpValidation = new prpValidation();
    }

    public ArrayList getApplications(String keyword) {

        ArrayList applications = dataappdatabean.getApplications(keyword);
        return applications;
    }

    public String checkLogin(LoginEntity datalogin) {
        return prpValidation.checkLogin(datalogin);
    }

    public void writeData(AddCheckEntity datachecks) {
        prpValidation.writeData(datachecks);
    }
}
