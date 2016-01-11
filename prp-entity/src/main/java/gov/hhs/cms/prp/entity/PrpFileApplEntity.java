package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_file_appl", schema = "", catalog = "prp")
@IdClass(PrpFileApplEntityPK.class)
public class PrpFileApplEntity {
    private String fileId;
    private int applSeqNum;
    private String submApplId;
    private String psId;
    private String pstgPgm;
    private Timestamp pstgTs;
    private Timestamp stusTs;
    private String stusPgm;

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

    @Basic
    @Column(name = "SUBM_APPL_ID")
    public String getSubmApplId() {
        return submApplId;
    }

    public void setSubmApplId(String submApplId) {
        this.submApplId = submApplId;
    }

    @Basic
    @Column(name = "PS_ID")
    public String getPsId() {
        return psId;
    }

    public void setPsId(String psId) {
        this.psId = psId;
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
    @Column(name = "PSTG_TS")
    public Timestamp getPstgTs() {
        return pstgTs;
    }

    public void setPstgTs(Timestamp pstgTs) {
        this.pstgTs = pstgTs;
    }

    @Basic
    @Column(name = "STUS_TS")
    public Timestamp getStusTs() {
        return stusTs;
    }

    public void setStusTs(Timestamp stusTs) {
        this.stusTs = stusTs;
    }

    @Basic
    @Column(name = "STUS_PGM")
    public String getStusPgm() {
        return stusPgm;
    }

    public void setStusPgm(String stusPgm) {
        this.stusPgm = stusPgm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpFileApplEntity that = (PrpFileApplEntity) o;

        if (applSeqNum != that.applSeqNum) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;
        if (submApplId != null ? !submApplId.equals(that.submApplId) : that.submApplId != null) return false;
        if (psId != null ? !psId.equals(that.psId) : that.psId != null) return false;
        if (pstgPgm != null ? !pstgPgm.equals(that.pstgPgm) : that.pstgPgm != null) return false;
        if (pstgTs != null ? !pstgTs.equals(that.pstgTs) : that.pstgTs != null) return false;
        if (stusTs != null ? !stusTs.equals(that.stusTs) : that.stusTs != null) return false;
        if (stusPgm != null ? !stusPgm.equals(that.stusPgm) : that.stusPgm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + applSeqNum;
        result = 31 * result + (submApplId != null ? submApplId.hashCode() : 0);
        result = 31 * result + (psId != null ? psId.hashCode() : 0);
        result = 31 * result + (pstgPgm != null ? pstgPgm.hashCode() : 0);
        result = 31 * result + (pstgTs != null ? pstgTs.hashCode() : 0);
        result = 31 * result + (stusTs != null ? stusTs.hashCode() : 0);
        result = 31 * result + (stusPgm != null ? stusPgm.hashCode() : 0);
        return result;
    }
}
