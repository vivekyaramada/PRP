package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_file_rel", schema = "", catalog = "prp")
@IdClass(PrpFileRelEntityPK.class)
public class PrpFileRelEntity {
    private String relFileId;
    private String fileId;
    private String relTypeCd;
    private Timestamp pstgTs;
    private String pstgPgm;
    private String termPgm;
    private Timestamp termTs;

    @Id
    @Column(name = "REL_FILE_ID")
    public String getRelFileId() {
        return relFileId;
    }

    public void setRelFileId(String relFileId) {
        this.relFileId = relFileId;
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
    @Column(name = "REL_TYPE_CD")
    public String getRelTypeCd() {
        return relTypeCd;
    }

    public void setRelTypeCd(String relTypeCd) {
        this.relTypeCd = relTypeCd;
    }

    @Id
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

    @Basic
    @Column(name = "TERM_PGM")
    public String getTermPgm() {
        return termPgm;
    }

    public void setTermPgm(String termPgm) {
        this.termPgm = termPgm;
    }

    @Basic
    @Column(name = "TERM_TS")
    public Timestamp getTermTs() {
        return termTs;
    }

    public void setTermTs(Timestamp termTs) {
        this.termTs = termTs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpFileRelEntity that = (PrpFileRelEntity) o;

        if (relFileId != null ? !relFileId.equals(that.relFileId) : that.relFileId != null) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;
        if (relTypeCd != null ? !relTypeCd.equals(that.relTypeCd) : that.relTypeCd != null) return false;
        if (pstgTs != null ? !pstgTs.equals(that.pstgTs) : that.pstgTs != null) return false;
        if (pstgPgm != null ? !pstgPgm.equals(that.pstgPgm) : that.pstgPgm != null) return false;
        if (termPgm != null ? !termPgm.equals(that.termPgm) : that.termPgm != null) return false;
        if (termTs != null ? !termTs.equals(that.termTs) : that.termTs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = relFileId != null ? relFileId.hashCode() : 0;
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        result = 31 * result + (relTypeCd != null ? relTypeCd.hashCode() : 0);
        result = 31 * result + (pstgTs != null ? pstgTs.hashCode() : 0);
        result = 31 * result + (pstgPgm != null ? pstgPgm.hashCode() : 0);
        result = 31 * result + (termPgm != null ? termPgm.hashCode() : 0);
        result = 31 * result + (termTs != null ? termTs.hashCode() : 0);
        return result;
    }
}
