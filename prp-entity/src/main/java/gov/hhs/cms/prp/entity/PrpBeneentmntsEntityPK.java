package gov.hhs.cms.prp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
public class PrpBeneentmntsEntityPK implements Serializable {
    private int beneId;
    private String entmntType;
    private int sequence;

    @Column(name = "BENE_ID")
    @Id
    public int getBeneId() {
        return beneId;
    }

    public void setBeneId(int beneId) {
        this.beneId = beneId;
    }

    @Column(name = "ENTMNT_TYPE")
    @Id
    public String getEntmntType() {
        return entmntType;
    }

    public void setEntmntType(String entmntType) {
        this.entmntType = entmntType;
    }

    @Column(name = "SEQUENCE")
    @Id
    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpBeneentmntsEntityPK that = (PrpBeneentmntsEntityPK) o;

        if (beneId != that.beneId) return false;
        if (sequence != that.sequence) return false;
        if (entmntType != null ? !entmntType.equals(that.entmntType) : that.entmntType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = beneId;
        result = 31 * result + (entmntType != null ? entmntType.hashCode() : 0);
        result = 31 * result + sequence;
        return result;
    }
}
