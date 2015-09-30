package gov.hhs.cms.prp.facade;

import gov.hhs.cms.prp.entity.*;

import java.util.ArrayList;

/**
 * Created by VivekKumar.ReddyYara on 9/11/2015.
 */
public class prpFacade {


  /*  private ApplicationsEntity dataapp;
    private Dataapplicationsdatatablebean dataappdatabean;
    private Datachecks datachec;
    private Datalogin datalogin;*/

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

     /*   dataappdatabean = new Dataapplicationsdatatablebean();
        datachec = new Datachecks();
        datalogin = new Datalogin();*/
        dataappdatabean = new ApplicationTableEntity();

        prpValidation = new prpValidation();
    }

    public ArrayList getApplications() {
        ArrayList applications = dataappdatabean.getApplications();

        return applications;
    }

    public String checkLogin(LoginEntity datalogin) {
        return prpValidation.checkLogin(datalogin);
    }

    public void writeData(AddCheckEntity datachecks) {
        prpValidation.writeData(datachecks);
    }
}
