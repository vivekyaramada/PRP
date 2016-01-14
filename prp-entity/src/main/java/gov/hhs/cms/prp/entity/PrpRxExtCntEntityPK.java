package gov.hhs.cms.prp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
public class PrpRxExtCntEntityPK implements Serializable {
    private String applId;
    private String groupNumber;
    private short costYearNum;
    private short costMnthNum;
    private String srcTypeCd;

    @Column(name = "APPL_ID")
    @Id
    public String getApplId() {
        return applId;
    }

    public void setApplId(String applId) {
        this.applId = applId;
    }

    @Column(name = "GROUP_NUMBER")
    @Id
    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Column(name = "COST_YEAR_NUM")
    @Id
    public short getCostYearNum() {
        return costYearNum;
    }

    public void setCostYearNum(short costYearNum) {
        this.costYearNum = costYearNum;
    }

    @Column(name = "COST_MNTH_NUM")
    @Id
    public short getCostMnthNum() {
        return costMnthNum;
    }

    public void setCostMnthNum(short costMnthNum) {
        this.costMnthNum = costMnthNum;
    }

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

        PrpRxExtCntEntityPK that = (PrpRxExtCntEntityPK) o;

        if (costYearNum != that.costYearNum) return false;
        if (costMnthNum != that.costMnthNum) return false;
        if (applId != null ? !applId.equals(that.applId) : that.applId != null) return false;
        if (groupNumber != null ? !groupNumber.equals(that.groupNumber) : that.groupNumber != null) return false;
        if (srcTypeCd != null ? !srcTypeCd.equals(that.srcTypeCd) : that.srcTypeCd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = applId != null ? applId.hashCode() : 0;
        result = 31 * result + (groupNumber != null ? groupNumber.hashCode() : 0);
        result = 31 * result + (int) costYearNum;
        result = 31 * result + (int) costMnthNum;
        result = 31 * result + (srcTypeCd != null ? srcTypeCd.hashCode() : 0);
        return result;
    }
}
