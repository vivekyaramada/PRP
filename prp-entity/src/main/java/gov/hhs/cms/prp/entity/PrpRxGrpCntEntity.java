package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_rx_grp_cnt", schema = "", catalog = "prp")
@IdClass(PrpRxGrpCntEntityPK.class)
public class PrpRxGrpCntEntity {
    private String applId;
    private String groupNumber;
    private short costYearNum;
    private short costMnthNum;
    private String srcTypeCd;
    private Integer actvCvgCnt;
    private Timestamp pstgTs;
    private String pstgPgm;

    public void setCostYearNum(Short costYearNum) {
        this.costYearNum = costYearNum;
    }

    public void setCostMnthNum(Short costMnthNum) {
        this.costMnthNum = costMnthNum;
    }

    @Id
    @Column(name = "APPL_ID")
    public String getApplId() {
        return applId;
    }

    public void setApplId(String applId) {
        this.applId = applId;
    }

    @Id
    @Column(name = "GROUP_NUMBER")
    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Id
    @Column(name = "COST_YEAR_NUM")
    public short getCostYearNum() {
        return costYearNum;
    }

    public void setCostYearNum(short costYearNum) {
        this.costYearNum = costYearNum;
    }

    @Id
    @Column(name = "COST_MNTH_NUM")
    public short getCostMnthNum() {
        return costMnthNum;
    }

    public void setCostMnthNum(short costMnthNum) {
        this.costMnthNum = costMnthNum;
    }

    @Id
    @Column(name = "SRC_TYPE_CD")
    public String getSrcTypeCd() {
        return srcTypeCd;
    }

    public void setSrcTypeCd(String srcTypeCd) {
        this.srcTypeCd = srcTypeCd;
    }

    @Basic
    @Column(name = "ACTV_CVG_CNT")
    public Integer getActvCvgCnt() {
        return actvCvgCnt;
    }

    public void setActvCvgCnt(Integer actvCvgCnt) {
        this.actvCvgCnt = actvCvgCnt;
    }

    @Basic
    @Column(name = "PSTG_TS")
    public Timestamp getPstgTs() {
        return pstgTs;
    }

    public void setPstgTs(Timestamp pstgTs) {
        this.pstgTs = pstgTs;
    }

    @Basic
    @Column(name = "PSTG_PGM")
    public String getPstgPgm() {
        return pstgPgm;
    }

    public void setPstgPgm(String pstgPgm) {
        this.pstgPgm = pstgPgm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpRxGrpCntEntity that = (PrpRxGrpCntEntity) o;

        if (costYearNum != that.costYearNum) return false;
        if (costMnthNum != that.costMnthNum) return false;
        if (applId != null ? !applId.equals(that.applId) : that.applId != null) return false;
        if (groupNumber != null ? !groupNumber.equals(that.groupNumber) : that.groupNumber != null) return false;
        if (srcTypeCd != null ? !srcTypeCd.equals(that.srcTypeCd) : that.srcTypeCd != null) return false;
        if (actvCvgCnt != null ? !actvCvgCnt.equals(that.actvCvgCnt) : that.actvCvgCnt != null) return false;
        if (pstgTs != null ? !pstgTs.equals(that.pstgTs) : that.pstgTs != null) return false;
        if (pstgPgm != null ? !pstgPgm.equals(that.pstgPgm) : that.pstgPgm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = applId != null ? applId.hashCode() : 0;
        result = 31 * result + (groupNumber != null ? groupNumber.hashCode() : 0);
        result = 31 * result + (int) costYearNum;
        result = 31 * result + (int) costMnthNum;
        result = 31 * result + (srcTypeCd != null ? srcTypeCd.hashCode() : 0);
        result = 31 * result + (actvCvgCnt != null ? actvCvgCnt.hashCode() : 0);
        result = 31 * result + (pstgTs != null ? pstgTs.hashCode() : 0);
        result = 31 * result + (pstgPgm != null ? pstgPgm.hashCode() : 0);
        return result;
    }
}
