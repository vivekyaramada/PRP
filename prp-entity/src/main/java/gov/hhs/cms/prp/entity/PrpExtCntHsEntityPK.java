package gov.hhs.cms.prp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
public class PrpExtCntHsEntityPK implements Serializable {
    private String applId;

    @Column(name = "APPL_ID")
    @Id
    public String getApplId() {
        return applId;
    }

    public void setApplId(String applId) {
        this.applId = applId;
    }

    private String groupNumber;

    @Column(name = "GROUP_NUMBER")
    @Id
    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    private Timestamp deleteTs;

    @Column(name = "DELETE_TS")
    @Id
    public Timestamp getDeleteTs() {
        return deleteTs;
    }

    public void setDeleteTs(Timestamp deleteTs) {
        this.deleteTs = deleteTs;
    }

    private short costYearNum;

    @Column(name = "COST_YEAR_NUM")
    @Id
    public short getCostYearNum() {
        return costYearNum;
    }

    public void setCostYearNum(short costYearNum) {
        this.costYearNum = costYearNum;
    }

    private short costMnthNum;

    @Column(name = "COST_MNTH_NUM")
    @Id
    public short getCostMnthNum() {
        return costMnthNum;
    }

    public void setCostMnthNum(short costMnthNum) {
        this.costMnthNum = costMnthNum;
    }

    private String srcTypeCd;

    @Column(name = "SRC_TYPE_CD")
    @Id
    public String getSrcTypeCd() {
        return srcTypeCd;
    }

    public void setSrcTypeCd(String srcTypeCd) {
        this.srcTypeCd = srcTypeCd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpExtCntHsEntityPK that = (PrpExtCntHsEntityPK) o;

        if (costYearNum != that.costYearNum) return false;
        if (costMnthNum != that.costMnthNum) return false;
        if (applId != null ? !applId.equals(that.applId) : that.applId != null) return false;
        if (groupNumber != null ? !groupNumber.equals(that.groupNumber) : that.groupNumber != null) return false;
        if (deleteTs != null ? !deleteTs.equals(that.deleteTs) : that.deleteTs != null) return false;
        if (srcTypeCd != null ? !srcTypeCd.equals(that.srcTypeCd) : that.srcTypeCd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = applId != null ? applId.hashCode() : 0;
        result = 31 * result + (groupNumber != null ? groupNumber.hashCode() : 0);
        result = 31 * result + (deleteTs != null ? deleteTs.hashCode() : 0);
        result = 31 * result + (int) costYearNum;
        result = 31 * result + (int) costMnthNum;
        result = 31 * result + (srcTypeCd != null ? srcTypeCd.hashCode() : 0);
        return result;
    }
}
