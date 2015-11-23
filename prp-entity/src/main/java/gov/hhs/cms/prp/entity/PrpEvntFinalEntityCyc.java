package gov.hhs.cms.prp.entity;

import javax.persistence.Basic;
import javax.persistence.Transient;
import java.util.ArrayList;

/**
 * Created by grussell99 on 11/11/2015.
 */
public class PrpEvntFinalEntityCyc extends PrpEvntFinalEntityCatData {

    private String cycCycleNumber;

    @Basic
    @javax.persistence.Column(name = "EVNT_CTGRY_DATA")

    public String getEvntCtgryData() {
        CsvUtility csvUtility = new CsvUtility();
        String evntCtgryData = csvUtility.buildCsvString(cycCycleNumber);
        super.setEvntCtgryData(evntCtgryData);
        return evntCtgryData;
    }

    public void setEvntCtgryData(String evntCtgryData) {
        super.setEvntCtgryData(evntCtgryData);
        CsvUtility csvUtility = new CsvUtility();
        ArrayList<String> csv = csvUtility.parseCsvString(evntCtgryData, 1);
        cycCycleNumber        = csv.get(0);
    }

    @Transient
    public int    getCycCycleNumber  ()                        { return getInteger(cycCycleNumber); }
    public void   setCycCycleNumber  (int cycCycleNumber)      { this.cycCycleNumber    = setInteger(cycCycleNumber); }
}
