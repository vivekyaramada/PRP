package gov.hhs.cms.prp.entity;

import javax.persistence.*;

/**
 * Created by VivekKumar.ReddyYara on 10/28/2015.
 */
@Entity
@Table(name = "prp_users", schema = "", catalog = "prp")
public class PrpUsersEntity {
    private int id;
    private String usrNm;
    private String passwd;

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "usr_nm")
    public String getUsrNm() {
        return usrNm;
    }

    public void setUsrNm(String usrNm) {
        this.usrNm = usrNm;
    }

    @Basic
    @Column(name = "passwd")
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpUsersEntity that = (PrpUsersEntity) o;

        if (id != that.id) return false;
        if (usrNm != null ? !usrNm.equals(that.usrNm) : that.usrNm != null) return false;
        if (passwd != null ? !passwd.equals(that.passwd) : that.passwd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (usrNm != null ? usrNm.hashCode() : 0);
        result = 31 * result + (passwd != null ? passwd.hashCode() : 0);
        return result;
    }
}
