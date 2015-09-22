package com.gdit.facade;

import com.gdit.entity.*;

import java.util.ArrayList;

/**
 * Created by VivekKumar.ReddyYara on 9/11/2015.
 */
public class RdsFacade {


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


    private RdsValidation rdsValidation;


    public RdsFacade() {

     /*   dataappdatabean = new Dataapplicationsdatatablebean();
        datachec = new Datachecks();
        datalogin = new Datalogin();*/
        dataappdatabean = new ApplicationTableEntity();

        rdsValidation = new RdsValidation();
    }

    public ArrayList getApplications() {
        ArrayList applications = dataappdatabean.getApplications();

        return applications;
    }

    public String checkLogin(LoginEntity datalogin) {
        return rdsValidation.checkLogin(datalogin);
    }

    public void writeData(AddCheckEntity datachecks) {
        rdsValidation.writeData(datachecks);
    }
}
