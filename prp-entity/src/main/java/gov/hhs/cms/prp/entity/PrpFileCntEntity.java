package gov.hhs.cms.prp.entity;

import javax.persistence.*;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_file_cnt", schema = "", catalog = "prp")
@IdClass(PrpFileCntEntityPK.class)
public class PrpFileCntEntity {
    private String fileId;
    private String totCntCd;
    private int cntVal;

    @Id
    @Column(name = "FILE_ID")
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
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
    @Column(name = "CNT_VAL")
    public int getCntVal() {
        return cntVal;
    }

    public void setCntVal(int cntVal) {
        this.cntVal = cntVal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpFileCntEntity that = (PrpFileCntEntity) o;

        if (cntVal != that.cntVal) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;
        if (totCntCd != null ? !totCntCd.equals(that.totCntCd) : that.totCntCd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + (totCntCd != null ? totCntCd.hashCode() : 0);
        result = 31 * result + cntVal;
        return result;
    }
}
