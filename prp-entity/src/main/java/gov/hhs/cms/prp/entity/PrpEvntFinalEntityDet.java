package gov.hhs.cms.prp.entity;

import javax.persistence.Basic;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by grussell99 on 11/11/2015.
 */
public class PrpEvntFinalEntityDet extends PrpEvntFinalEntity {
    private String detPaymentAmt;
    private String detReduceAmt;

    @Basic
    @javax.persistence.Column(name = "EVNT_CTGRY_DATA")

    public String getEvntCtgryData() {
        CsvUtility csvUtility = new CsvUtility();
        String evntCtgryData = csvUtility.buildCsvString(detPaymentAmt, detReduceAmt);
        return evntCtgryData;
    }

    public void setEvntCtgryData(String evntCtgryData) {
        this.evntCtgryData = evntCtgryData;
        CsvUtility csvUtility = new CsvUtility();
        ArrayList<String> csv = csvUtility.parseCsvString(evntCtgryData, 2);
        detPaymentAmt     = csv.get(0);
        detReduceAmt      = csv.get(1);
    }

    @Transient
    public BigDecimal getDetPaymentAmt   ()                     { return getBigDecimal(detPaymentAmt); }
    public void   setDetPaymentAmt   (BigDecimal detPaymentAmt) { this.detPaymentAmt  = setBigDecimal(detPaymentAmt); }

    @Transient
    public BigDecimal getDetReduceAmt    ()                    { return getBigDecimal(detReduceAmt); }
    public void   setDetReduceAmt    (BigDecimal detReduceAmt) { this.detReduceAmt   = setBigDecimal(detReduceAmt); }
}
