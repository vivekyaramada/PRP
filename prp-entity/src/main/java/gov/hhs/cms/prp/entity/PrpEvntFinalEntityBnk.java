package gov.hhs.cms.prp.entity;

import javax.persistence.Basic;
import javax.persistence.Transient;
import java.util.ArrayList;

/**
 * Created by grussell99 on 11/11/2015.
 */
public class PrpEvntFinalEntityBnk extends PrpEvntFinalEntityCatData {
    private String bnkRoutingNumber;
    private String bnkAccountNumber;
    private String bnkAccountType;
    private String bnkBusinessName;
    private String bnkBankName;
    private String bnkAddress1;
    private String bnkAddress2;
    private String bnkCity;
    private String bnkState;
    private String bnkZip;
    private String bnkPhone;
    private String bnkContact;

    public   PrpEvntFinalEntityBnk (PrpEvntFinalEntity source) {
        super (source);
    }

    @Basic
    @javax.persistence.Column(name = "EVNT_CTGRY_DATA")

    public String getEvntCtgryData() {
        CsvUtility csvUtility = new CsvUtility();
        String evntCtgryData = csvUtility.buildCsvString(bnkRoutingNumber, bnkAccountNumber, bnkAccountType,
                                                         bnkBusinessName,  bnkBankName,      bnkAddress1,
                                                         bnkAddress2,      bnkCity,          bnkState,
                                                         bnkZip,           bnkPhone,         bnkContact);
        return evntCtgryData;
    }

    public void setEvntCtgryData(String evntCtgryData) {
        super.setEvntCtgryData(evntCtgryData);
        CsvUtility csvUtility = new CsvUtility();
        ArrayList<String> csv = csvUtility.parseCsvString(evntCtgryData, 12);
        bnkRoutingNumber  = csv.get(0);
        bnkAccountNumber  = csv.get(1);
        bnkAccountType    = csv.get(2);
        bnkBusinessName   = csv.get(3);
        bnkBankName       = csv.get(4);
        bnkAddress1       = csv.get(5);
        bnkAddress2       = csv.get(6);
        bnkCity           = csv.get(7);
        bnkState          = csv.get(8);
        bnkZip            = csv.get(9);
        bnkPhone          = csv.get(10);
        bnkContact        = csv.get(11);
    }

    @Transient
    public String getBnkRoutingNumber()                        { return bnkRoutingNumber; }
    public void   setBnkRoutingNumber(String bnkRoutingNumber) { this.bnkRoutingNumber    = bnkRoutingNumber; }

    @Transient
    public String getBnkAccountNumber()                        { return bnkAccountNumber; }
    public void   setBnkAccountNumber(String bnkAccountNumber) { this.bnkAccountNumber    = bnkAccountNumber; }

    @Transient
    public String getBnkAccountType  ()                        { return bnkAccountType; }
    public void   setBnkAccountType  (String bnkAccountType)   { this.bnkAccountType    = bnkAccountType; }

    @Transient
    public String getBnkBusinessName ()                        { return bnkBusinessName; }
    public void   setBnkBusinessName (String bnkBusinessName)  { this.bnkBusinessName   = bnkBusinessName; }

    @Transient
    public String getBnkBankName     ()                        { return bnkBankName; }
    public void   setBnkBankName     (String bnkBankName)      { this.bnkBankName    = bnkBankName; }

    @Transient
    public String getBnkAddress1     ()                        { return bnkAddress1; }
    public void   setBnkAddress1     (String bnkAddress1)      { this.bnkAddress1    = bnkAddress1; }

    @Transient
    public String getBnkAddress2     ()                        { return bnkAddress2; }
    public void   setBnkAddress2     (String bnkAddress2)      { this.bnkAddress2    = bnkAddress2; }

    @Transient
    public String getBnkCity         ()                        { return bnkCity; }
    public void   setBnkCity         (String bnkCity)          { this.bnkCity    = bnkCity; }

    @Transient
    public String getBnkState        ()                        { return bnkState; }
    public void   setBnkState        (String bnkState)         { this.bnkState    = bnkState; }

    @Transient
    public String getBnkZip          ()                        { return bnkZip; }
    public void   setBnkZip          (String bnkZip)           { this.bnkZip    = bnkZip; }

    @Transient
    public String getBnkPhone        ()                        { return bnkPhone; }
    public void   setBnkPhone        (String bnkPhone)         { this.bnkPhone    = bnkPhone; }

    @Transient
    public String getBnkContact      ()                        { return bnkContact; }
    public void   setBnkContact      (String bnkContact)       { this.bnkContact    = bnkContact; }
}
