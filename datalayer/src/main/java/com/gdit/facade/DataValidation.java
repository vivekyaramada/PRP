package com.gdit.facade;

import com.gdit.entity.DatachecksEntity;
import com.gdit.entity.DataloginEntity;

/**
 * Created by VivekKumar.ReddyYara on 9/11/2015.
 */
public class DataValidation {


    public String checkLogin(DataloginEntity datalogin) {
        if (datalogin.getUsername().equals("vivek") && datalogin.getPassword().equals("password")) {
            System.out.println("Method reached2 >>>>>>");
            return "success";
        } else
            return "failure";
    }

    public void writeData(DatachecksEntity datachecks) {
        System.out.println("sponsor2>>>" + datachecks.getSponsor());
        System.out.println("checkAmount2>>>>" + datachecks.getCheckAmount());
        System.out.println("checkNumber2>>>" + datachecks.getCheckNumber());
        System.out.println("rsn2>>>" + datachecks.getRsn());
        System.out.println("checkName>2>>" + datachecks.getCheckName());
        System.out.println("note2>>>" + datachecks.getNote());
        System.out.println("checkDate2>>>" + datachecks.getCheckDate());
    }


}
