package gov.hhs.cms.prp.entity;

import javax.persistence.*;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_org_typ_ref", schema = "", catalog = "prp")
public class PrpOrgTypRefEntity {
    private String orgTypCd;
    private String descTxt;

    @Id
    @Column(name = "ORG_TYP_CD")
    public String getOrgTypCd() {
        return orgTypCd;
    }

    public void setOrgTypCd(String orgTypCd) {
        this.orgTypCd = orgTypCd;
    }

    @Basic
    @Column(name = "DESC_TXT")
    public String getDescTxt() {
        return descTxt;
    }

    public void setDescTxt(String descTxt) {
        this.descTxt = descTxt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpOrgTypRefEntity that = (PrpOrgTypRefEntity) o;

        if (orgTypCd != null ? !orgTypCd.equals(that.orgTypCd) : that.orgTypCd != null) return false;
        if (descTxt != null ? !descTxt.equals(that.descTxt) : that.descTxt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orgTypCd != null ? orgTypCd.hashCode() : 0;
        result = 31 * result + (descTxt != null ? descTxt.hashCode() : 0);
        return result;
    }
}
