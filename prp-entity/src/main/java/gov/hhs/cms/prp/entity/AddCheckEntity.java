package gov.hhs.cms.prp.entity; /**
 * Created by VivekKumar.ReddyYara on 9/2/2015.
 */


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.Date;


public class AddCheckEntity implements Serializable {

    private String sponsor;
    private double checkAmount;
    private String checkNumber;
    private String rsn;
    private String checkName;
    private String note;
    private Date checkDate;


    private static final Logger logger = LogManager.getLogger("checks");

    public AddCheckEntity(String sponsor, double checkAmount, String checkNumber, String rsn, String checkName, String note, Date checkDate) {
        this.sponsor = sponsor;
        this.checkAmount = checkAmount;
        this.checkNumber = checkNumber;
        this.rsn = rsn;
        this.checkName = checkName;
        this.note = note;
        this.checkDate = checkDate;
    }

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

    public double getCheckAmount() {
        return checkAmount;
    }

    public void setCheckAmount(double checkAmount) {
        this.checkAmount = checkAmount;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

}
