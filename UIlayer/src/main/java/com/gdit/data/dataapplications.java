package com.gdit.data; /**
 * Created by VivekKumar.ReddyYara on 9/2/2015.
 */

import java.io.Serializable;
/*import org.primefaces.showcase.domain.Car;
import org.primefaces.showcase.service.CarService;*/


public class dataapplications implements Serializable {

    private String sponsor;
    private String appid;
    private String status;
    private String amount;
    private String stdate;
    private String eddate;

    public dataapplications(String sponsor, String appid, String status, String amount, String stdate, String eddate) {
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

    public String getEddate() {
        return eddate;
    }

    public void setEddate(String eddate) {
        this.eddate = eddate;
    }
}
