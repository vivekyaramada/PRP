package gov.hhs.cms.prp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
public class PrpRdsOrgHsEntityPK implements Serializable {
    private String orgId;
    private String orgTypCd;
    private Timestamp pstgTs;

    @Column(name = "ORG_ID")
    @Id
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Column(name = "ORG_TYP_CD")
    @Id
    public String getOrgTypCd() {
        return orgTypCd;
    }

    public void setOrgTypCd(String orgTypCd) {
        this.orgTypCd = orgTypCd;
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

        PrpRdsOrgHsEntityPK that = (PrpRdsOrgHsEntityPK) o;

        if (orgId != null ? !orgId.equals(that.orgId) : that.orgId != null) return false;
        if (orgTypCd != null ? !orgTypCd.equals(that.orgTypCd) : that.orgTypCd != null) return false;
        if (pstgTs != null ? !pstgTs.equals(that.pstgTs) : that.pstgTs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orgId != null ? orgId.hashCode() : 0;
        result = 31 * result + (orgTypCd != null ? orgTypCd.hashCode() : 0);
        result = 31 * result + (pstgTs != null ? pstgTs.hashCode() : 0);
        return result;
    }
}
