package gov.hhs.cms.prp.entity;

import javax.persistence.*;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_tot_cnt_ref", schema = "", catalog = "prp")
public class PrpTotCntRefEntity {
    private String totCntCd;
    private String descTxt;

    @Id
    @Column(name = "TOT_CNT_CD")
    public String getTotCntCd() {
        return totCntCd;
    }

    public void setTotCntCd(String totCntCd) {
        this.totCntCd = totCntCd;
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

        PrpTotCntRefEntity that = (PrpTotCntRefEntity) o;

        if (totCntCd != null ? !totCntCd.equals(that.totCntCd) : that.totCntCd != null) return false;
        if (descTxt != null ? !descTxt.equals(that.descTxt) : that.descTxt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = totCntCd != null ? totCntCd.hashCode() : 0;
        result = 31 * result + (descTxt != null ? descTxt.hashCode() : 0);
        return result;
    }
}
