package com.gdit.facade;

import com.gdit.entity.*;

import java.util.ArrayList;

/**
 * Created by VivekKumar.ReddyYara on 9/11/2015.
 */
public class MasterData {


  /*  private dataapplicationsEntity dataapp;
    private Dataapplicationsdatatablebean dataappdatabean;
    private Datachecks datachec;
    private Datalogin datalogin;*/

    public DataloginEntity getDataloginEntity() {
        return dataloginEntity;
    }

    public void setDataloginEntity(DataloginEntity dataloginEntity) {
        this.dataloginEntity = dataloginEntity;
    }

    private DataloginEntity dataloginEntity;

    private DataapplicationsdatatablebeanEntity dataappdatabean;


    private DataValidation dataValidation;


    public MasterData() {

     /*   dataappdatabean = new Dataapplicationsdatatablebean();
        datachec = new Datachecks();
        datalogin = new Datalogin();*/
        dataappdatabean = new DataapplicationsdatatablebeanEntity();

        dataValidation = new DataValidation();
    }

    public ArrayList getApplications() {
        ArrayList applications = dataappdatabean.getApplications();

        return applications;
    }

    public String checkLogin(DataloginEntity datalogin) {
        return dataValidation.checkLogin(datalogin);
    }

    public void writeData(DatachecksEntity datachecks) {
        dataValidation.writeData(datachecks);
    }
}
