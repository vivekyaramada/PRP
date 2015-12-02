package gov.hhs.cms.prp.entity;

import javax.persistence.*;

/**
 * Created by VivekKumar.ReddyYara on 11/20/2015.
 */
@Entity
@Table(name = "prp_usr_role", schema = "", catalog = "prp")
public class PrpUsrRoleEntity {
    private String id;
    private String usrName;
    private String role;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "usr_name")
    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    @Basic
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpUsrRoleEntity that = (PrpUsrRoleEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (usrName != null ? !usrName.equals(that.usrName) : that.usrName != null) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (usrName != null ? usrName.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}
