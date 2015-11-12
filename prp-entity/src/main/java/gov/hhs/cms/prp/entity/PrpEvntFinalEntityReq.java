package gov.hhs.cms.prp.entity;

import javax.persistence.Basic;
import javax.persistence.Transient;
import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by grussell99 on 11/11/2015.
 */
public class PrpEvntFinalEntityReq extends PrpEvntFinalEntityCatData {
    private String reqRequester;
    private String reqRefNumber;
    private String reqRequestDate;

    public   PrpEvntFinalEntityReq (PrpEvntFinalEntity source) {
        super (source);
    }

    @Basic
    @javax.persistence.Column(name = "EVNT_CTGRY_DATA")

    public String getEvntCtgryData() {
        CsvUtility csvUtility = new CsvUtility();
        String evntCtgryData = csvUtility.buildCsvString(reqRequester, reqRefNumber, reqRequestDate);
        return evntCtgryData;
    }

    public void setEvntCtgryData(String evntCtgryData) {
        super.setEvntCtgryData(evntCtgryData);
        CsvUtility csvUtility = new CsvUtility();
        ArrayList<String> csv = csvUtility.parseCsvString(evntCtgryData, 3);
        reqRequester      = csv.get(0);
        reqRefNumber      = csv.get(1);
        reqRequestDate    = csv.get(2);
    }

    @Transient
    public String getReqRequester    ()                        { return reqRequester; }
    public void   setReqRequester    (String reqRequester)     { this.reqRequester   = reqRequester; }

    @Transient
    public String getReqRefNumber    ()                        { return reqRefNumber; }
    public void   setReqRefNumber    (String reqRefNumber)     { this.reqRefNumber   = reqRefNumber; }

    @Transient
    public Date   getReqRequestDate  ()                        { return getDate(reqRequestDate); }
    public void   setReqRequestDate  (Date   reqRequestDate)   { this.reqRequestDate = setDate(reqRequestDate); }
}
