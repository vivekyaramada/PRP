package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_beneentmnts", schema = "", catalog = "prp")
@IdClass(PrpBeneentmntsEntityPK.class)
public class PrpBeneentmntsEntity {
    private int beneId;
    private String entmntType;
    private int sequence;
    private int effDate;
    private int termDate;
    private String updtPgm;
    private Timestamp timestamp;

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
    @Column(name = "UPDT_PGM")
    public String getUpdtPgm() {
        return updtPgm;
    }

    public void setUpdtPgm(String updtPgm) {
        this.updtPgm = updtPgm;
    }

    @Basic
    @Column(name = "TIMESTAMP")
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpBeneentmntsEntity that = (PrpBeneentmntsEntity) o;

        if (beneId != that.beneId) return false;
        if (sequence != that.sequence) return false;
        if (effDate != that.effDate) return false;
        if (termDate != that.termDate) return false;
        if (entmntType != null ? !entmntType.equals(that.entmntType) : that.entmntType != null) return false;
        if (updtPgm != null ? !updtPgm.equals(that.updtPgm) : that.updtPgm != null) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = beneId;
        result = 31 * result + (entmntType != null ? entmntType.hashCode() : 0);
        result = 31 * result + sequence;
        result = 31 * result + effDate;
        result = 31 * result + termDate;
        result = 31 * result + (updtPgm != null ? updtPgm.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        return result;
    }
}
