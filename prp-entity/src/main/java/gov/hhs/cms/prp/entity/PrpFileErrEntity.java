package gov.hhs.cms.prp.entity;

import javax.persistence.*;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_file_err", schema = "", catalog = "prp")
@IdClass(PrpFileErrEntityPK.class)
public class PrpFileErrEntity {
    private String fileId;
    private String errCd;
    private String errCtgryCd;
    private int errSeqNum;
    private String errInfo;

    @Id
    @Column(name = "FILE_ID")
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
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
    @Column(name = "ERR_CTGRY_CD")
    public String getErrCtgryCd() {
        return errCtgryCd;
    }

    public void setErrCtgryCd(String errCtgryCd) {
        this.errCtgryCd = errCtgryCd;
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

        PrpFileErrEntity that = (PrpFileErrEntity) o;

        if (errSeqNum != that.errSeqNum) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;
        if (errCd != null ? !errCd.equals(that.errCd) : that.errCd != null) return false;
        if (errCtgryCd != null ? !errCtgryCd.equals(that.errCtgryCd) : that.errCtgryCd != null) return false;
        if (errInfo != null ? !errInfo.equals(that.errInfo) : that.errInfo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + (errCd != null ? errCd.hashCode() : 0);
        result = 31 * result + (errCtgryCd != null ? errCtgryCd.hashCode() : 0);
        result = 31 * result + errSeqNum;
        result = 31 * result + (errInfo != null ? errInfo.hashCode() : 0);
        return result;
    }
}
