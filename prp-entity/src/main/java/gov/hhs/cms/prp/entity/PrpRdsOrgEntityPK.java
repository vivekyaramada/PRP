package gov.hhs.cms.prp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
public class PrpRdsOrgEntityPK implements Serializable {
    private String orgId;
    private String orgTypCd;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpRdsOrgEntityPK that = (PrpRdsOrgEntityPK) o;

        if (orgId != null ? !orgId.equals(that.orgId) : that.orgId != null) return false;
        if (orgTypCd != null ? !orgTypCd.equals(that.orgTypCd) : that.orgTypCd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orgId != null ? orgId.hashCode() : 0;
        result = 31 * result + (orgTypCd != null ? orgTypCd.hashCode() : 0);
        return result;
    }
}
