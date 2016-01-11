package gov.hhs.cms.prp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
public class PrpCovgBkupEntityPK implements Serializable {
    private String hicn;
    private int sequence;

    @Column(name = "HICN")
    @Id
    public String getHicn() {
        return hicn;
    }

    public void setHicn(String hicn) {
        this.hicn = hicn;
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

        PrpCovgBkupEntityPK that = (PrpCovgBkupEntityPK) o;

        if (sequence != that.sequence) return false;
        if (hicn != null ? !hicn.equals(that.hicn) : that.hicn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hicn != null ? hicn.hashCode() : 0;
        result = 31 * result + sequence;
        return result;
    }
}
