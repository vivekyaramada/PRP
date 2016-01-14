package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_bene_ent_hs", schema = "", catalog = "prp")
@IdClass(PrpBeneEntHsEntityPK.class)
public class PrpBeneEntHsEntity {
    private int beneId;
    private String entmntType;
    private int sequence;
    private Timestamp pstgTs;
    private int effDate;
    private int termDate;
    private String pstgPgmId;
    private Timestamp deleteTs;
    private String deletePgmId;

    public void setBeneId(Integer beneId) {
        this.beneId = beneId;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public void setEffDate(Integer effDate) {
        this.effDate = effDate;
    }

    public void setTermDate(Integer termDate) {
        this.termDate = termDate;
    }

    @Id
    @Column(name = "BENE_ID")
    public int getBeneId() {
        return beneId;
    }

    public void setBeneId(int beneId) {
        this.beneId = beneId;
    }

    @Id
    @Column(name = "ENTMNT_TYPE")
    public String getEntmntType() {
        return entmntType;
    }

    public void setEntmntType(String entmntType) {
        this.entmntType = entmntType;
    }

    @Id
    @Column(name = "SEQUENCE")
    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
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
    @Column(name = "EFF_DATE")
    public int getEffDate() {
        return effDate;
    }

    public void setEffDate(int effDate) {
        this.effDate = effDate;
    }

    @Basic
    @Column(name = "TERM_DATE")
    public int getTermDate() {
        return termDate;
    }

    public void setTermDate(int termDate) {
        this.termDate = termDate;
    }

    @Basic
    @Column(name = "PSTG_PGM_ID")
    public String getPstgPgmId() {
        return pstgPgmId;
    }

    public void setPstgPgmId(String pstgPgmId) {
        this.pstgPgmId = pstgPgmId;
    }

    @Basic
    @Column(name = "DELETE_TS")
    public Timestamp getDeleteTs() {
        return deleteTs;
    }

    public void setDeleteTs(Timestamp deleteTs) {
        this.deleteTs = deleteTs;
    }

    @Basic
    @Column(name = "DELETE_PGM_ID")
    public String getDeletePgmId() {
        return deletePgmId;
    }

    public void setDeletePgmId(String deletePgmId) {
        this.deletePgmId = deletePgmId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpBeneEntHsEntity that = (PrpBeneEntHsEntity) o;

        if (beneId != that.beneId) return false;
        if (sequence != that.sequence) return false;
        if (effDate != that.effDate) return false;
        if (termDate != that.termDate) return false;
        if (entmntType != null ? !entmntType.equals(that.entmntType) : that.entmntType != null) return false;
        if (pstgTs != null ? !pstgTs.equals(that.pstgTs) : that.pstgTs != null) return false;
        if (pstgPgmId != null ? !pstgPgmId.equals(that.pstgPgmId) : that.pstgPgmId != null) return false;
        if (deleteTs != null ? !deleteTs.equals(that.deleteTs) : that.deleteTs != null) return false;
        if (deletePgmId != null ? !deletePgmId.equals(that.deletePgmId) : that.deletePgmId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = beneId;
        result = 31 * result + (entmntType != null ? entmntType.hashCode() : 0);
        result = 31 * result + sequence;
        result = 31 * result + (pstgTs != null ? pstgTs.hashCode() : 0);
        result = 31 * result + effDate;
        result = 31 * result + termDate;
        result = 31 * result + (pstgPgmId != null ? pstgPgmId.hashCode() : 0);
        result = 31 * result + (deleteTs != null ? deleteTs.hashCode() : 0);
        result = 31 * result + (deletePgmId != null ? deletePgmId.hashCode() : 0);
        return result;
    }
}
