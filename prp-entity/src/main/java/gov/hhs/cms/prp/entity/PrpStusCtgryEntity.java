package gov.hhs.cms.prp.entity;

import javax.persistence.*;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_stus_ctgry", schema = "", catalog = "prp")
public class PrpStusCtgryEntity {
    private String stusCtgryCd;
    private String description;

    @Id
    @Column(name = "STUS_CTGRY_CD")
    public String getStusCtgryCd() {
        return stusCtgryCd;
    }

    public void setStusCtgryCd(String stusCtgryCd) {
        this.stusCtgryCd = stusCtgryCd;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpStusCtgryEntity that = (PrpStusCtgryEntity) o;

        if (stusCtgryCd != null ? !stusCtgryCd.equals(that.stusCtgryCd) : that.stusCtgryCd != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stusCtgryCd != null ? stusCtgryCd.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
