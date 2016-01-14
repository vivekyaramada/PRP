package gov.hhs.cms.prp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
public class PrpFileErrEntityPK implements Serializable {
    private String fileId;
    private String errCd;
    private String errCtgryCd;
    private int errSeqNum;

    @Column(name = "FILE_ID")
    @Id
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Column(name = "ERR_CD")
    @Id
    public String getErrCd() {
        return errCd;
    }

    public void setErrCd(String errCd) {
        this.errCd = errCd;
    }

    @Column(name = "ERR_CTGRY_CD")
    @Id
    public String getErrCtgryCd() {
        return errCtgryCd;
    }

    public void setErrCtgryCd(String errCtgryCd) {
        this.errCtgryCd = errCtgryCd;
    }

    @Column(name = "ERR_SEQ_NUM")
    @Id
    public int getErrSeqNum() {
        return errSeqNum;
    }

    public void setErrSeqNum(int errSeqNum) {
        this.errSeqNum = errSeqNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpFileErrEntityPK that = (PrpFileErrEntityPK) o;

        if (errSeqNum != that.errSeqNum) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;
        if (errCd != null ? !errCd.equals(that.errCd) : that.errCd != null) return false;
        if (errCtgryCd != null ? !errCtgryCd.equals(that.errCtgryCd) : that.errCtgryCd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + (errCd != null ? errCd.hashCode() : 0);
        result = 31 * result + (errCtgryCd != null ? errCtgryCd.hashCode() : 0);
        result = 31 * result + errSeqNum;
        return result;
    }
}
