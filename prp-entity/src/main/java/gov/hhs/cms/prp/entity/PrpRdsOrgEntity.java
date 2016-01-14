package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_rds_org", schema = "", catalog = "prp")
@IdClass(PrpRdsOrgEntityPK.class)
public class PrpRdsOrgEntity {
    private String orgId;
    private String orgTypCd;
    private String orgName;
    private String transMethod;
    private String stusPgm;
    private Timestamp stusTs;
    private String updtPgm;
    private Timestamp updtTs;
    private String stusCtgryCd;
    private String stusCd;

    @Id
    @Column(name = "ORG_ID")
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Id
    @Column(name = "ORG_TYP_CD")
    public String getOrgTypCd() {
        return orgTypCd;
    }

    public void setOrgTypCd(String orgTypCd) {
        this.orgTypCd = orgTypCd;
    }

    @Basic
    @Column(name = "ORG_NAME")
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Basic
    @Column(name = "TRANS_METHOD")
    public String getTransMethod() {
        return transMethod;
    }

    public void setTransMethod(String transMethod) {
        this.transMethod = transMethod;
    }

    @Basic
    @Column(name = "STUS_PGM")
    public String getStusPgm() {
        return stusPgm;
    }

    public void setStusPgm(String stusPgm) {
        this.stusPgm = stusPgm;
    }

    @Basic
    @Column(name = "STUS_TS")
    public Timestamp getStusTs() {
        return stusTs;
    }

    public void setStusTs(Timestamp stusTs) {
        this.stusTs = stusTs;
    }

    @Basic
    @Column(name = "UPDT_PGM")
    public String getUpdtPgm() {
        return updtPgm;
    }

    public void setUpdtPgm(String updtPgm) {
        this.updtPgm = updtPgm;
    }

    @Basic
    @Column(name = "UPDT_TS")
    public Timestamp getUpdtTs() {
        return updtTs;
    }

    public void setUpdtTs(Timestamp updtTs) {
        this.updtTs = updtTs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpRdsOrgEntity that = (PrpRdsOrgEntity) o;

        if (orgId != null ? !orgId.equals(that.orgId) : that.orgId != null) return false;
        if (orgTypCd != null ? !orgTypCd.equals(that.orgTypCd) : that.orgTypCd != null) return false;
        if (orgName != null ? !orgName.equals(that.orgName) : that.orgName != null) return false;
        if (transMethod != null ? !transMethod.equals(that.transMethod) : that.transMethod != null) return false;
        if (stusPgm != null ? !stusPgm.equals(that.stusPgm) : that.stusPgm != null) return false;
        if (stusTs != null ? !stusTs.equals(that.stusTs) : that.stusTs != null) return false;
        if (updtPgm != null ? !updtPgm.equals(that.updtPgm) : that.updtPgm != null) return false;
        if (updtTs != null ? !updtTs.equals(that.updtTs) : that.updtTs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orgId != null ? orgId.hashCode() : 0;
        result = 31 * result + (orgTypCd != null ? orgTypCd.hashCode() : 0);
        result = 31 * result + (orgName != null ? orgName.hashCode() : 0);
        result = 31 * result + (transMethod != null ? transMethod.hashCode() : 0);
        result = 31 * result + (stusPgm != null ? stusPgm.hashCode() : 0);
        result = 31 * result + (stusTs != null ? stusTs.hashCode() : 0);
        result = 31 * result + (updtPgm != null ? updtPgm.hashCode() : 0);
        result = 31 * result + (updtTs != null ? updtTs.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "STUS_CTGRY_CD")
    public String getStusCtgryCd() {
        return stusCtgryCd;
    }

    public void setStusCtgryCd(String stusCtgryCd) {
        this.stusCtgryCd = stusCtgryCd;
    }

    @Basic
    @Column(name = "STUS_CD")
    public String getStusCd() {
        return stusCd;
    }

    public void setStusCd(String stusCd) {
        this.stusCd = stusCd;
    }
}
