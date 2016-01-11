package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_file_hs", schema = "", catalog = "prp")
@IdClass(PrpFileHsEntityPK.class)
public class PrpFileHsEntity {
    private String fileId;
    private Timestamp updtTs;
    private int responseDt;
    private String status;
    private String errorReason;
    private int addCnt;
    private int updateCnt;
    private int errorCnt;
    private int deleteCnt;
    private int totalCnt;
    private String updtPgmId;
    private Timestamp termTs;
    private String termPgmId;

    @Id
    @Column(name = "FILE_ID")
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Id
    @Column(name = "UPDT_TS")
    public Timestamp getUpdtTs() {
        return updtTs;
    }

    public void setUpdtTs(Timestamp updtTs) {
        this.updtTs = updtTs;
    }

    @Basic
    @Column(name = "RESPONSE_DT")
    public int getResponseDt() {
        return responseDt;
    }

    public void setResponseDt(int responseDt) {
        this.responseDt = responseDt;
    }

    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "ERROR_REASON")
    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    @Basic
    @Column(name = "ADD_CNT")
    public int getAddCnt() {
        return addCnt;
    }

    public void setAddCnt(int addCnt) {
        this.addCnt = addCnt;
    }

    @Basic
    @Column(name = "UPDATE_CNT")
    public int getUpdateCnt() {
        return updateCnt;
    }

    public void setUpdateCnt(int updateCnt) {
        this.updateCnt = updateCnt;
    }

    @Basic
    @Column(name = "ERROR_CNT")
    public int getErrorCnt() {
        return errorCnt;
    }

    public void setErrorCnt(int errorCnt) {
        this.errorCnt = errorCnt;
    }

    @Basic
    @Column(name = "DELETE_CNT")
    public int getDeleteCnt() {
        return deleteCnt;
    }

    public void setDeleteCnt(int deleteCnt) {
        this.deleteCnt = deleteCnt;
    }

    @Basic
    @Column(name = "TOTAL_CNT")
    public int getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(int totalCnt) {
        this.totalCnt = totalCnt;
    }

    @Basic
    @Column(name = "UPDT_PGM_ID")
    public String getUpdtPgmId() {
        return updtPgmId;
    }

    public void setUpdtPgmId(String updtPgmId) {
        this.updtPgmId = updtPgmId;
    }

    @Basic
    @Column(name = "TERM_TS")
    public Timestamp getTermTs() {
        return termTs;
    }

    public void setTermTs(Timestamp termTs) {
        this.termTs = termTs;
    }

    @Basic
    @Column(name = "TERM_PGM_ID")
    public String getTermPgmId() {
        return termPgmId;
    }

    public void setTermPgmId(String termPgmId) {
        this.termPgmId = termPgmId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpFileHsEntity that = (PrpFileHsEntity) o;

        if (responseDt != that.responseDt) return false;
        if (addCnt != that.addCnt) return false;
        if (updateCnt != that.updateCnt) return false;
        if (errorCnt != that.errorCnt) return false;
        if (deleteCnt != that.deleteCnt) return false;
        if (totalCnt != that.totalCnt) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;
        if (updtTs != null ? !updtTs.equals(that.updtTs) : that.updtTs != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (errorReason != null ? !errorReason.equals(that.errorReason) : that.errorReason != null) return false;
        if (updtPgmId != null ? !updtPgmId.equals(that.updtPgmId) : that.updtPgmId != null) return false;
        if (termTs != null ? !termTs.equals(that.termTs) : that.termTs != null) return false;
        if (termPgmId != null ? !termPgmId.equals(that.termPgmId) : that.termPgmId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + (updtTs != null ? updtTs.hashCode() : 0);
        result = 31 * result + responseDt;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (errorReason != null ? errorReason.hashCode() : 0);
        result = 31 * result + addCnt;
        result = 31 * result + updateCnt;
        result = 31 * result + errorCnt;
        result = 31 * result + deleteCnt;
        result = 31 * result + totalCnt;
        result = 31 * result + (updtPgmId != null ? updtPgmId.hashCode() : 0);
        result = 31 * result + (termTs != null ? termTs.hashCode() : 0);
        result = 31 * result + (termPgmId != null ? termPgmId.hashCode() : 0);
        return result;
    }
}
