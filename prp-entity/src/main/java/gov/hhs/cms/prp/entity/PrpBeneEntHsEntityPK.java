package gov.hhs.cms.prp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
public class PrpBeneEntHsEntityPK implements Serializable {
    private int beneId;

    @Column(name = "BENE_ID")
    @Id
    public int getBeneId() {
        return beneId;
    }

    public void setBeneId(int beneId) {
        this.beneId = beneId;
    }

    private String entmntType;

    @Column(name = "ENTMNT_TYPE")
    @Id
    public String getEntmntType() {
        return entmntType;
    }

    public void setEntmntType(String entmntType) {
        this.entmntType = entmntType;
    }

    private int sequence;

    @Column(name = "SEQUENCE")
    @Id
    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
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

        PrpBeneEntHsEntityPK that = (PrpBeneEntHsEntityPK) o;

        if (beneId != that.beneId) return false;
        if (sequence != that.sequence) return false;
        if (entmntType != null ? !entmntType.equals(that.entmntType) : that.entmntType != null) return false;
        if (pstgTs != null ? !pstgTs.equals(that.pstgTs) : that.pstgTs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = beneId;
        result = 31 * result + (entmntType != null ? entmntType.hashCode() : 0);
        result = 31 * result + sequence;
        result = 31 * result + (pstgTs != null ? pstgTs.hashCode() : 0);
        return result;
    }
}
