package gov.hhs.cms.prp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
public class PrpFileTotEntityPK implements Serializable {
    private String fileId;
    private String totCntCd;

    @Column(name = "FILE_ID")
    @Id
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Column(name = "TOT_CNT_CD")
    @Id
    public String getTotCntCd() {
        return totCntCd;
    }

    public void setTotCntCd(String totCntCd) {
        this.totCntCd = totCntCd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpFileTotEntityPK that = (PrpFileTotEntityPK) o;

        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;
        if (totCntCd != null ? !totCntCd.equals(that.totCntCd) : that.totCntCd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + (totCntCd != null ? totCntCd.hashCode() : 0);
        return result;
    }
}
