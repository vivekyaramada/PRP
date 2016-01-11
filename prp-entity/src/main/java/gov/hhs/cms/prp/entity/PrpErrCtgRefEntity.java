package gov.hhs.cms.prp.entity;

import javax.persistence.*;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_err_ctg_ref", schema = "", catalog = "prp")
public class PrpErrCtgRefEntity {
    private String errCtgryCd;
    private String descTxt;

    @Id
    @Column(name = "ERR_CTGRY_CD")
    public String getErrCtgryCd() {
        return errCtgryCd;
    }

    public void setErrCtgryCd(String errCtgryCd) {
        this.errCtgryCd = errCtgryCd;
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

        PrpErrCtgRefEntity that = (PrpErrCtgRefEntity) o;

        if (errCtgryCd != null ? !errCtgryCd.equals(that.errCtgryCd) : that.errCtgryCd != null) return false;
        if (descTxt != null ? !descTxt.equals(that.descTxt) : that.descTxt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = errCtgryCd != null ? errCtgryCd.hashCode() : 0;
        result = 31 * result + (descTxt != null ? descTxt.hashCode() : 0);
        return result;
    }
}
