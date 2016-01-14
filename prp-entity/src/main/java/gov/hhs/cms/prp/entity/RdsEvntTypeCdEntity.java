package gov.hhs.cms.prp.entity;

import javax.persistence.*;

/**
 * Created by VivekKumar.ReddyYara on 9/30/2015.
 */
@Entity
@Table(name = "rds_evnt_type_cd", schema = "", catalog = "prp")
public class RdsEvntTypeCdEntity {
    private int evntTypeId;
    private String evntTypeCd;
    private String evntTypeDesc;
    private String evntTypeName;

    public void setEvntTypeId(Integer evntTypeId) {
        this.evntTypeId = evntTypeId;
    }

    @Id
    @Column(name = "EVNT_TYPE_ID")
    public int getEvntTypeId() {
        return evntTypeId;
    }

    public void setEvntTypeId(int evntTypeId) {
        this.evntTypeId = evntTypeId;
    }

    @Basic
    @Column(name = "EVNT_TYPE_CD")
    public String getEvntTypeCd() {
        return evntTypeCd;
    }

    public void setEvntTypeCd(String evntTypeCd) {
        this.evntTypeCd = evntTypeCd;
    }

    @Basic
    @Column(name = "EVNT_TYPE_DESC")
    public String getEvntTypeDesc() {
        return evntTypeDesc;
    }

    public void setEvntTypeDesc(String evntTypeDesc) {
        this.evntTypeDesc = evntTypeDesc;
    }

    @Basic
    @Column(name = "EVNT_TYPE_NAME")
    public String getEvntTypeName() {
        return evntTypeName;
    }

    public void setEvntTypeName(String evntTypeName) {
        this.evntTypeName = evntTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RdsEvntTypeCdEntity that = (RdsEvntTypeCdEntity) o;

        if (evntTypeId != that.evntTypeId) return false;
        if (evntTypeCd != null ? !evntTypeCd.equals(that.evntTypeCd) : that.evntTypeCd != null) return false;
        if (evntTypeDesc != null ? !evntTypeDesc.equals(that.evntTypeDesc) : that.evntTypeDesc != null) return false;
        if (evntTypeName != null ? !evntTypeName.equals(that.evntTypeName) : that.evntTypeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = evntTypeId;
        result = 31 * result + (evntTypeCd != null ? evntTypeCd.hashCode() : 0);
        result = 31 * result + (evntTypeDesc != null ? evntTypeDesc.hashCode() : 0);
        result = 31 * result + (evntTypeName != null ? evntTypeName.hashCode() : 0);
        return result;
    }
}
