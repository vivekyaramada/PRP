package gov.hhs.cms.prp.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.logging.Logger;

/**
 * Created by grussell99 on 11/10/2015.
 */

public class PrpEvntFinalEntityCmt extends PrpEvntFinalEntityCatData {

    private String cmtComment;

    public   PrpEvntFinalEntityCmt (PrpEvntFinalEntity source) {
        super (source);
    }

    @Basic
    @javax.persistence.Column(name = "EVNT_CTGRY_DATA")

    public String getEvntCtgryData() {
        CsvUtility csvUtility = new CsvUtility();
        String evntCtgryData = csvUtility.buildCsvString(cmtComment);
        return evntCtgryData;
    }

    public void setEvntCtgryData(String evntCtgryData) {
        super.setEvntCtgryData(evntCtgryData);
        CsvUtility csvUtility = new CsvUtility();
        ArrayList<String> csv = csvUtility.parseCsvString(evntCtgryData,1);
        cmtComment        = csv.get(0);
    }

    @Transient
    public String getCmtComment      ()                        { return cmtComment; }
    public void   setCmtComment      (String cmtComment)       { this.cmtComment    = cmtComment; }
}
