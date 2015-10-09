package gov.hhs.cms.prp.entity; /**
 * Created by VivekKumar.ReddyYara on 9/2/2015.
 */

import java.io.Serializable;
import java.util.Date;

public class ApplicationsEntity implements Serializable {

    private String sponsor;
    private String appid;
    private String status;
    private String amount;
    private Date stdate;
    private Date eddate;

    public ApplicationsEntity(String sponsor, String appid, String status, String amount, Date stdate, Date eddate) {
        this.sponsor = sponsor;
        this.appid = appid;
        this.status = status;
        this.amount = amount;
        this.stdate = stdate;
        this.eddate = eddate;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Date getStdate() {
        return stdate;
    }

    public void setStdate(Date stdate) {
        this.stdate = stdate;
    }

    public Date getEddate() {
        return eddate;
    }

    public void setEddate(Date eddate) {
        this.eddate = eddate;
    }
}
