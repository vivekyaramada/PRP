package gov.hhs.cms.prp.entity;

import javax.persistence.*;

/**
 * Created by VivekKumar.ReddyYara on 11/20/2015.
 */
@Entity
@Table(name = "prp_role_mtd", schema = "", catalog = "prp")
public class PrpRoleMtdEntity {
    private int id;
    private String role;
    private String method;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "method")
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpRoleMtdEntity that = (PrpRoleMtdEntity) o;

        if (id != that.id) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;
        if (method != null ? !method.equals(that.method) : that.method != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (method != null ? method.hashCode() : 0);
        return result;
    }
}
