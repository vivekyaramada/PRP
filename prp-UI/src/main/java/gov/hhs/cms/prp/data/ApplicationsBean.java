package gov.hhs.cms.prp.data; /**
 * Created by VivekKumar.ReddyYara on 9/2/2015.
 */

import java.io.Serializable;
import java.util.logging.Logger;


public class ApplicationsBean implements Serializable {


    private final static Logger LOGGER = java.util.logging.Logger.getLogger(ApplicationsBean.class.getName());

    private String sponsor;
    private String appid;
    private String status;
    private String amount;
    private String stdate;
    private String eddate;

    private String keyword;

    public ApplicationsBean(String sponsor, String appid, String status, String amount, String stdate, String eddate) {
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

    public String getStdate() {
        return stdate;
    }

    public void setStdate(String stdate) {
        this.stdate = stdate;
    }

    public String getEddate1() {
        return eddate;
    }

    public void setEddate1(String eddate) {
        this.eddate = eddate;
    }
}
