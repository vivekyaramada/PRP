package gov.hhs.cms.prp.entity;

import javax.persistence.Basic;
import javax.persistence.Transient;
import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by grussell99 on 11/11/2015.
 */
public class PrpEvntFinalEntityChk extends PrpEvntFinalEntity {

    private String chkCheckType;
    private String chkCheckDate;
    private String chkCheckNumber;
    private String chkPayerName;
    private String chkReason;
    private String chkDepositDate;
    private String chkNote;

    @Basic
    @javax.persistence.Column(name = "EVNT_CTGRY_DATA")

    public String getEvntCtgryData() {
        CsvUtility csvUtility = new CsvUtility();
        String evntCtgryData = csvUtility.buildCsvString(chkCheckType,   chkCheckDate, chkCheckNumber,
                                                         chkPayerName,   chkReason,    chkDepositDate,
                                                         chkNote);
        return evntCtgryData;
    }

    public void setEvntCtgryData(String evntCtgryData) {
        this.evntCtgryData = evntCtgryData;
        CsvUtility csvUtility = new CsvUtility();
        ArrayList<String> csv = csvUtility.parseCsvString(evntCtgryData, 8);
        chkCheckType      = csv.get(0);
        chkCheckDate      = csv.get(1);
        chkCheckNumber    = csv.get(2);
        chkPayerName      = csv.get(3);
        chkReason         = csv.get(4);
        chkDepositDate    = csv.get(5);
        chkNote           = csv.get(6);
    }

    @Transient
    public String getChkCheckType    ()                        { return chkCheckType; }
    public void   setChkCheckType    (String chkCheckType)     { this.chkCheckType    = chkCheckType; }

    @Transient
    public Date getChkCheckDate    ()                        { return getDate(chkCheckDate); }
    public void   setChkCheckDate    (Date   chkCheckDate)     { this.chkCheckDate    = setDate(chkCheckDate); }

    @Transient
    public String getChkCheckNumber  ()                        { return chkCheckNumber; }
    public void   setChkCheckNumber  (String chkCheckNumber)   { this.chkCheckNumber    = chkCheckNumber; }

    @Transient
    public String getChkPayerName    ()                        { return chkPayerName; }
    public void   setChkPayerName    (String chkPayerName)     { this.chkPayerName    = chkPayerName; }

    @Transient
    public String getChkReason       ()                        { return chkReason; }
    public void   setChkReason       (String chkReason)        { this.chkReason    = chkReason; }

    @Transient
    public Date   getChkDepositDate  ()                        { return getDate(chkDepositDate); }
    public void   setChkDepositDate  (Date   chkDepositDate)   { this.chkDepositDate    = setDate(chkDepositDate); }

    @Transient
    public String getChkNote         ()                        { return chkNote; }
    public void   setChkNote         (String chkNote)          { this.chkNote    = chkNote; }
}
