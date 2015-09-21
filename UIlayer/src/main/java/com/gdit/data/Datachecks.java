package com.gdit.data;

/**
 * Created by VivekKumar.ReddyYara on 9/2/2015.
 */

import com.gdit.facade.MasterData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

import com.gdit.entity.*;

/*import org.primefaces.showcase.domain.Car;
import org.primefaces.showcase.service.CarService;*/

@ManagedBean
@RequestScoped
public class Datachecks implements Serializable {

    private String sponsor;
    private String checkAmount;
    private String checkNumber;
    private String rsn;
    private String checkName;
    private String note;
    private String checkDate;


    private static final Logger logger = LogManager.getLogger("checks");

 /*   public checks(String sponsor, String checkAmount, String checkNumber,String rsn, String checkName, String note,String checkDate) {
        this.sponsor = sponsor;
        this.checkAmount = checkAmount;
        this.checkNumber = checkNumber;
        this.rsn = rsn;
        this.checkName = checkName;
        this.note = note;
        this.checkDate = checkDate;
    }*/

    public String getRsn() {
        return rsn;
    }

    public void setRsn(String rsn) {
        this.rsn = rsn;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getCheckAmount() {
        return checkAmount;
    }

    public void setCheckAmount(String checkAmount) {
        this.checkAmount = checkAmount;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate;
    }


    public void writeData() {
        MasterData masterData = new MasterData();
        DatachecksEntity datachecksEntity = new DatachecksEntity(sponsor, checkAmount, checkNumber, rsn, checkName, note, checkDate);
        masterData.writeData(datachecksEntity);
    }
}
