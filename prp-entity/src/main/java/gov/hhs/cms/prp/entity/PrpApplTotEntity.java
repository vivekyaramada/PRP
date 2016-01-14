package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_appl_tot", schema = "", catalog = "prp")
@IdClass(PrpApplTotEntityPK.class)
public class PrpApplTotEntity {
    private String fileId;
    private int applSeqNum;
    private String totCntCd;
    private BigDecimal totAmt;

    public void setApplSeqNum(Integer applSeqNum) {
        this.applSeqNum = applSeqNum;
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
    @Column(name = "TOT_CNT_CD")
    public String getTotCntCd() {
        return totCntCd;
    }

    public void setTotCntCd(String totCntCd) {
        this.totCntCd = totCntCd;
    }

    @Basic
    @Column(name = "TOT_AMT")
    public BigDecimal getTotAmt() {
        return totAmt;
    }

    public void setTotAmt(BigDecimal totAmt) {
        this.totAmt = totAmt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpApplTotEntity that = (PrpApplTotEntity) o;

        if (applSeqNum != that.applSeqNum) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;
        if (totCntCd != null ? !totCntCd.equals(that.totCntCd) : that.totCntCd != null) return false;
        if (totAmt != null ? !totAmt.equals(that.totAmt) : that.totAmt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + applSeqNum;
        result = 31 * result + (totCntCd != null ? totCntCd.hashCode() : 0);
        result = 31 * result + (totAmt != null ? totAmt.hashCode() : 0);
        return result;
    }
}
