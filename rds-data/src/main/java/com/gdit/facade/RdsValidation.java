package com.gdit.facade;

import com.gdit.entity.AddCheckEntity;
import com.gdit.entity.LoginEntity;

/**
 * Created by VivekKumar.ReddyYara on 9/11/2015.
 */
public class RdsValidation {


    public String checkLogin(LoginEntity datalogin) {
        if (datalogin.getUsername().equals("vivek") && datalogin.getPassword().equals("password")) {
            System.out.println("Method reached2 >>>>>>");
            return "success";
        } else
            return "failure";
    }

    public void writeData(AddCheckEntity datachecks) {
        System.out.println("sponsor2>>>" + datachecks.getSponsor());
        System.out.println("checkAmount2>>>>" + datachecks.getCheckAmount());
        System.out.println("checkNumber2>>>" + datachecks.getCheckNumber());
        System.out.println("rsn2>>>" + datachecks.getRsn());
        System.out.println("checkName>2>>" + datachecks.getCheckName());
        System.out.println("note2>>>" + datachecks.getNote());
        System.out.println("checkDate2>>>" + datachecks.getCheckDate());
    }


}
