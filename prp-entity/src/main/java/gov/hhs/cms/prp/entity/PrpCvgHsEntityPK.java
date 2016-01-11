package gov.hhs.cms.prp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
public class PrpCvgHsEntityPK implements Serializable {
    private int beneId;
    private int sequence;
    private Timestamp termTs;

    @Column(name = "BENE_ID")
    @Id
    public int getBeneId() {
        return beneId;
    }

    public void setBeneId(int beneId) {
        this.beneId = beneId;
    }

    @Column(name = "SEQUENCE")
    @Id
    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    @Column(name = "TERM_TS")
    @Id
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

        PrpCvgHsEntityPK that = (PrpCvgHsEntityPK) o;

        if (beneId != that.beneId) return false;
        if (sequence != that.sequence) return false;
        if (termTs != null ? !termTs.equals(that.termTs) : that.termTs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = beneId;
        result = 31 * result + sequence;
        result = 31 * result + (termTs != null ? termTs.hashCode() : 0);
        return result;
    }
}
