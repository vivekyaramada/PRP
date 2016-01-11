package gov.hhs.cms.prp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
public class PrpApplEvntEntityPK implements Serializable {
    private String applId;
    private Timestamp pstgTs;

    @Column(name = "APPL_ID")
    @Id
    public String getApplId() {
        return applId;
    }

    public void setApplId(String applId) {
        this.applId = applId;
    }

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

        PrpApplEvntEntityPK that = (PrpApplEvntEntityPK) o;

        if (applId != null ? !applId.equals(that.applId) : that.applId != null) return false;
        if (pstgTs != null ? !pstgTs.equals(that.pstgTs) : that.pstgTs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = applId != null ? applId.hashCode() : 0;
        result = 31 * result + (pstgTs != null ? pstgTs.hashCode() : 0);
        return result;
    }
}
