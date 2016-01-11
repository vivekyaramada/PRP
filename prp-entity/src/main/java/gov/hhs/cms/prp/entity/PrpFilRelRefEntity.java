package gov.hhs.cms.prp.entity;

import javax.persistence.*;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_fil_rel_ref", schema = "", catalog = "prp")
public class PrpFilRelRefEntity {
    private String relTypeCd;
    private String descTxt;

    @Id
    @Column(name = "REL_TYPE_CD")
    public String getRelTypeCd() {
        return relTypeCd;
    }

    public void setRelTypeCd(String relTypeCd) {
        this.relTypeCd = relTypeCd;
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

        PrpFilRelRefEntity that = (PrpFilRelRefEntity) o;

        if (relTypeCd != null ? !relTypeCd.equals(that.relTypeCd) : that.relTypeCd != null) return false;
        if (descTxt != null ? !descTxt.equals(that.descTxt) : that.descTxt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = relTypeCd != null ? relTypeCd.hashCode() : 0;
        result = 31 * result + (descTxt != null ? descTxt.hashCode() : 0);
        return result;
    }
}
