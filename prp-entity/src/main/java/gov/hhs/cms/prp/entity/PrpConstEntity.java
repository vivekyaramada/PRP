package gov.hhs.cms.prp.entity;

import javax.persistence.*;

/**
 * Created by VivekKumar.ReddyYara on 11/17/2015.
 */
@Entity
@Table(name = "prp_const", schema = "", catalog = "prp")
public class PrpConstEntity {
    private String constId;
    private String value;

    @Id
    @Column(name = "const_id")
    public String getConstId() {
        return constId;
    }

    public void setConstId(String constId) {
        this.constId = constId;
    }

    @Basic
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpConstEntity that = (PrpConstEntity) o;

        if (constId != null ? !constId.equals(that.constId) : that.constId != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = constId != null ? constId.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
