package gov.hhs.cms.prp.entity;

import javax.persistence.Basic;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by grussell99 on 11/11/2015.
 */
public class PrpEvntFinalEntityAch extends PrpEvntFinalEntityCatData {

    private String achPaymentAmount;
    private String achRoutingNumber;
    private String achAccountNumber;
    private String achAccountType;
    private String achTracerNumber;

    public   PrpEvntFinalEntityAch (PrpEvntFinalEntity source) {
        super (source);
    }

    @Basic
    @javax.persistence.Column(name = "EVNT_CTGRY_DATA")

    public String getEvntCtgryData() {
        CsvUtility csvUtility = new CsvUtility();
        String evntCtgryData = csvUtility.buildCsvString(achPaymentAmount, achRoutingNumber, achAccountNumber,
                                                         achAccountType,   achTracerNumber);
        return evntCtgryData;
    }

    public void setEvntCtgryData(String evntCtgryData) {
        super.setEvntCtgryData(evntCtgryData);
        CsvUtility csvUtility = new CsvUtility();
        ArrayList<String> csv = csvUtility.parseCsvString(evntCtgryData, 5);
        achPaymentAmount  = csv.get(0);
        achRoutingNumber  = csv.get(1);
        achAccountNumber  = csv.get(2);
        achAccountType    = csv.get(3);
        achTracerNumber   = csv.get(4);
    }

    @Transient
    public BigDecimal getAchPaymentAmount()                        { return getBigDecimal(achPaymentAmount); }
    public void   setAchPaymentAmount(BigDecimal achPaymentAmount) { this.achPaymentAmount = setBigDecimal(achPaymentAmount); }

    @Transient
    public String getAchRoutingNumber()                        { return achRoutingNumber; }
    public void   setAchRoutingNumber(String achRoutingNumber) { this.achRoutingNumber    = achRoutingNumber; }

    @Transient
    public String getAchAccountNumber()                        { return achAccountNumber; }
    public void   setAchAccountNumber(String achAccountNumber) { this.achAccountNumber    = achAccountNumber; }

    @Transient
    public String getAchAccountType  ()                        { return achAccountType; }
    public void   setAchAccountType  (String achAccountType)   { this.achAccountType    = achAccountType; }

    @Transient
    public String getAchTracerNumber ()                        { return achTracerNumber; }
    public void   setAchTracerNumber (String achTracerNumber)  { this.achTracerNumber    = achTracerNumber; }
}
