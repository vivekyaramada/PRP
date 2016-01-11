package gov.hhs.cms.prp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
public class PrpStusRefEntityPK implements Serializable {
    private String stusCtgryCd;
    private String stusCd;

    @Column(name = "STUS_CTGRY_CD")
    @Id
    public String getStusCtgryCd() {
        return stusCtgryCd;
    }

    public void setStusCtgryCd(String stusCtgryCd) {
        this.stusCtgryCd = stusCtgryCd;
    }

    @Column(name = "STUS_CD")
    @Id
    public String getStusCd() {
        return stusCd;
    }

    public void setStusCd(String stusCd) {
        this.stusCd = stusCd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpStusRefEntityPK that = (PrpStusRefEntityPK) o;

        if (stusCtgryCd != null ? !stusCtgryCd.equals(that.stusCtgryCd) : that.stusCtgryCd != null) return false;
        if (stusCd != null ? !stusCd.equals(that.stusCd) : that.stusCd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stusCtgryCd != null ? stusCtgryCd.hashCode() : 0;
        result = 31 * result + (stusCd != null ? stusCd.hashCode() : 0);
        return result;
    }
}
