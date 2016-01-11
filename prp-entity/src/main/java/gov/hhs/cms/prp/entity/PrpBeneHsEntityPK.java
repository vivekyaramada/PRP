package gov.hhs.cms.prp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
public class PrpBeneHsEntityPK implements Serializable {
    private int beneId;
    private Timestamp updtTs;

    @Column(name = "BENE_ID")
    @Id
    public int getBeneId() {
        return beneId;
    }

    public void setBeneId(int beneId) {
        this.beneId = beneId;
    }

    @Column(name = "UPDT_TS")
    @Id
    public Timestamp getUpdtTs() {
        return updtTs;
    }

    public void setUpdtTs(Timestamp updtTs) {
        this.updtTs = updtTs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpBeneHsEntityPK that = (PrpBeneHsEntityPK) o;

        if (beneId != that.beneId) return false;
        if (updtTs != null ? !updtTs.equals(that.updtTs) : that.updtTs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = beneId;
        result = 31 * result + (updtTs != null ? updtTs.hashCode() : 0);
        return result;
    }
}
