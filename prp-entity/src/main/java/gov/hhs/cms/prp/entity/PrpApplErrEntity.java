package gov.hhs.cms.prp.entity;

import javax.persistence.*;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_appl_err", schema = "", catalog = "prp")
@IdClass(PrpApplErrEntityPK.class)
public class PrpApplErrEntity {
    private String fileId;
    private int applSeqNum;
    private String errCtgryCd;
    private String errCd;
    private int errSeqNum;
    private short costYearNum;
    private short costMnthNum;
    private String rxGrpNum;
    private String errInfo;

    public void setApplSeqNum(Integer applSeqNum) {
        this.applSeqNum = applSeqNum;
    }

    public void setErrSeqNum(Integer errSeqNum) {
        this.errSeqNum = errSeqNum;
    }

    public void setCostYearNum(Short costYearNum) {
        this.costYearNum = costYearNum;
    }

    public void setCostMnthNum(Short costMnthNum) {
        this.costMnthNum = costMnthNum;
    }

    @Id
    @Column(name = "FILE_ID")
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Id
    @Column(name = "APPL_SEQ_NUM")
    public int getApplSeqNum() {
        return applSeqNum;
    }

    public void setApplSeqNum(int applSeqNum) {
        this.applSeqNum = applSeqNum;
    }

    @Id
    @Column(name = "ERR_CTGRY_CD")
    public String getErrCtgryCd() {
        return errCtgryCd;
    }

    public void setErrCtgryCd(String errCtgryCd) {
        this.errCtgryCd = errCtgryCd;
    }

    @Id
    @Column(name = "ERR_CD")
    public String getErrCd() {
        return errCd;
    }

    public void setErrCd(String errCd) {
        this.errCd = errCd;
    }

    @Id
    @Column(name = "ERR_SEQ_NUM")
    public int getErrSeqNum() {
        return errSeqNum;
    }

    public void setErrSeqNum(int errSeqNum) {
        this.errSeqNum = errSeqNum;
    }

    @Basic
    @Column(name = "COST_YEAR_NUM")
    public short getCostYearNum() {
        return costYearNum;
    }

    public void setCostYearNum(short costYearNum) {
        this.costYearNum = costYearNum;
    }

    @Basic
    @Column(name = "COST_MNTH_NUM")
    public short getCostMnthNum() {
        return costMnthNum;
    }

    public void setCostMnthNum(short costMnthNum) {
        this.costMnthNum = costMnthNum;
    }

    @Basic
    @Column(name = "RX_GRP_NUM")
    public String getRxGrpNum() {
        return rxGrpNum;
    }

    public void setRxGrpNum(String rxGrpNum) {
        this.rxGrpNum = rxGrpNum;
    }

    @Basic
    @Column(name = "ERR_INFO")
    public String getErrInfo() {
        return errInfo;
    }

    public void setErrInfo(String errInfo) {
        this.errInfo = errInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpApplErrEntity that = (PrpApplErrEntity) o;

        if (applSeqNum != that.applSeqNum) return false;
        if (errSeqNum != that.errSeqNum) return false;
        if (costYearNum != that.costYearNum) return false;
        if (costMnthNum != that.costMnthNum) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;
        if (errCtgryCd != null ? !errCtgryCd.equals(that.errCtgryCd) : that.errCtgryCd != null) return false;
        if (errCd != null ? !errCd.equals(that.errCd) : that.errCd != null) return false;
        if (rxGrpNum != null ? !rxGrpNum.equals(that.rxGrpNum) : that.rxGrpNum != null) return false;
        if (errInfo != null ? !errInfo.equals(that.errInfo) : that.errInfo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + applSeqNum;
        result = 31 * result + (errCtgryCd != null ? errCtgryCd.hashCode() : 0);
        result = 31 * result + (errCd != null ? errCd.hashCode() : 0);
        result = 31 * result + errSeqNum;
        result = 31 * result + (int) costYearNum;
        result = 31 * result + (int) costMnthNum;
        result = 31 * result + (rxGrpNum != null ? rxGrpNum.hashCode() : 0);
        result = 31 * result + (errInfo != null ? errInfo.hashCode() : 0);
        return result;
    }
}
