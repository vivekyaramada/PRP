package gov.hhs.cms.prp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
public class PrpFileRelEntityPK implements Serializable {
    private String relFileId;

    @Column(name = "REL_FILE_ID")
    @Id
    public String getRelFileId() {
        return relFileId;
    }

    public void setRelFileId(String relFileId) {
        this.relFileId = relFileId;
    }

    private String fileId;

    @Column(name = "FILE_ID")
    @Id
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    private String relTypeCd;

    @Column(name = "REL_TYPE_CD")
    @Id
    public String getRelTypeCd() {
        return relTypeCd;
    }

    public void setRelTypeCd(String relTypeCd) {
        this.relTypeCd = relTypeCd;
    }

    private Timestamp pstgTs;

    @Column(name = "PSTG_TS")
    @Id
    public Timestamp getPstgTs() {
        return pstgTs;
    }

    public void setPstgTs(Timestamp pstgTs) {
        this.pstgTs = pstgTs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpFileRelEntityPK that = (PrpFileRelEntityPK) o;

        if (relFileId != null ? !relFileId.equals(that.relFileId) : that.relFileId != null) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;
        if (relTypeCd != null ? !relTypeCd.equals(that.relTypeCd) : that.relTypeCd != null) return false;
        if (pstgTs != null ? !pstgTs.equals(that.pstgTs) : that.pstgTs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = relFileId != null ? relFileId.hashCode() : 0;
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        result = 31 * result + (relTypeCd != null ? relTypeCd.hashCode() : 0);
        result = 31 * result + (pstgTs != null ? pstgTs.hashCode() : 0);
        return result;
    }
}
