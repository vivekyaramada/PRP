package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.logging.Logger;

/**
 * Created by VivekKumar.ReddyYara on 9/30/2015.
 */
@Entity
@Table(name = "prp_aplctn", schema = "", catalog = "prp")
public class PrpAplctnEntity {
    private final static Logger LOGGER                = Logger.getLogger(PrpEvntFinalEntity.class.getName());
    private int applId;
    private int applPsId;
    private String applPsCompany;
    private Date applStartDate;
    private Date applEndDate;
    private String applTransMethod;
    private String applStatus;
    private String applRetlistSw;
    private String applExtension;
    private Timestamp applTimestamp;
    private int applUpdtPgmId;
    private Date applRcncltnDate;
    private Date applStp4Dt;
    private Date applFrzDt;

    @Id
    @Column(name = "APPL_ID")
    public int getApplId() {
        return applId;
    }

    public void setApplId(int applId) {
        this.applId = applId;
    }

    @Basic
    @Column(name = "APPL_PS_ID")
    public int getApplPsId() {
        return applPsId;
    }

    public void setApplPsId(int applPsId) {
        this.applPsId = applPsId;
    }

    @Basic
    @Column(name = "APPL_PS_COMPANY")
    public String getApplPsCompany() {
        return applPsCompany;
    }

    public void setApplPsCompany(String applPsCompany) {
        this.applPsCompany = applPsCompany;
    }

    @Basic
    @Column(name = "APPL_START_DATE")
    public Date getApplStartDate() {
        return applStartDate;
    }

    public void setApplStartDate(Date applStartDate) {
        this.applStartDate = applStartDate;
    }

    @Basic
    @Column(name = "APPL_END_DATE")
    public Date getApplEndDate() {
        return applEndDate;
    }

    public void setApplEndDate(Date applEndDate) {
        this.applEndDate = applEndDate;
    }

    @Basic
    @Column(name = "APPL_TRANS_METHOD")
    public String getApplTransMethod() {
        return applTransMethod;
    }

    public void setApplTransMethod(String applTransMethod) {
        this.applTransMethod = applTransMethod;
    }

    @Basic
    @Column(name = "APPL_STATUS")
    public String getApplStatus() {
        LOGGER.info("==== PrpAplctnEntity.getApplStatus    (invoked) ===== " + applStatus);
        return applStatus;
    }

    public void setApplStatus(String applStatus) {
        LOGGER.info("==== PrpAplctnEntity.setApplStatus    (invoked) ===== " + applStatus);
        this.applStatus = applStatus;
    }

    @Basic
    @Column(name = "APPL_RETLIST_SW")
    public String getApplRetlistSw() {
        return applRetlistSw;
    }

    public void setApplRetlistSw(String applRetlistSw) {
        this.applRetlistSw = applRetlistSw;
    }

    @Basic
    @Column(name = "APPL_EXTENSION")
    public String getApplExtension() {
        return applExtension;
    }

    public void setApplExtension(String applExtension) {
        this.applExtension = applExtension;
    }

    @Basic
    @Column(name = "APPL_TIMESTAMP")
    public Timestamp getApplTimestamp() {
        return applTimestamp;
    }

    public void setApplTimestamp(Timestamp applTimestamp) {
        this.applTimestamp = applTimestamp;
    }

    @Basic
    @Column(name = "APPL_UPDT_PGM_ID")
    public int getApplUpdtPgmId() {
        return applUpdtPgmId;
    }

    public void setApplUpdtPgmId(int applUpdtPgmId) {
        this.applUpdtPgmId = applUpdtPgmId;
    }

    @Basic
    @Column(name = "APPL_RCNCLTN_DATE")
    public Date getApplRcncltnDate() {
        return applRcncltnDate;
    }

    public void setApplRcncltnDate(Date applRcncltnDate) {
        this.applRcncltnDate = applRcncltnDate;
    }

    @Basic
    @Column(name = "APPL_STP4_DT")
    public Date getApplStp4Dt() {
        return applStp4Dt;
    }

    public void setApplStp4Dt(Date applStp4Dt) {
        this.applStp4Dt = applStp4Dt;
    }

    @Basic
    @Column(name = "APPL_FRZ_DT")
    public Date getApplFrzDt() {
        return applFrzDt;
    }

    public void setApplFrzDt(Date applFrzDt) {
        this.applFrzDt = applFrzDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpAplctnEntity that = (PrpAplctnEntity) o;

        if (applId != that.applId) return false;
        if (applPsId != that.applPsId) return false;
        if (applUpdtPgmId != that.applUpdtPgmId) return false;
        if (applPsCompany != null ? !applPsCompany.equals(that.applPsCompany) : that.applPsCompany != null)
            return false;
        if (applStartDate != null ? !applStartDate.equals(that.applStartDate) : that.applStartDate != null)
            return false;
        if (applEndDate != null ? !applEndDate.equals(that.applEndDate) : that.applEndDate != null) return false;
        if (applTransMethod != null ? !applTransMethod.equals(that.applTransMethod) : that.applTransMethod != null)
            return false;
        if (applStatus != null ? !applStatus.equals(that.applStatus) : that.applStatus != null) return false;
        if (applRetlistSw != null ? !applRetlistSw.equals(that.applRetlistSw) : that.applRetlistSw != null)
            return false;
        if (applExtension != null ? !applExtension.equals(that.applExtension) : that.applExtension != null)
            return false;
        if (applTimestamp != null ? !applTimestamp.equals(that.applTimestamp) : that.applTimestamp != null)
            return false;
        if (applRcncltnDate != null ? !applRcncltnDate.equals(that.applRcncltnDate) : that.applRcncltnDate != null)
            return false;
        if (applStp4Dt != null ? !applStp4Dt.equals(that.applStp4Dt) : that.applStp4Dt != null) return false;
        if (applFrzDt != null ? !applFrzDt.equals(that.applFrzDt) : that.applFrzDt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = applId;
        result = 31 * result + applPsId;
        result = 31 * result + (applPsCompany != null ? applPsCompany.hashCode() : 0);
        result = 31 * result + (applStartDate != null ? applStartDate.hashCode() : 0);
        result = 31 * result + (applEndDate != null ? applEndDate.hashCode() : 0);
        result = 31 * result + (applTransMethod != null ? applTransMethod.hashCode() : 0);
        result = 31 * result + (applStatus != null ? applStatus.hashCode() : 0);
        result = 31 * result + (applRetlistSw != null ? applRetlistSw.hashCode() : 0);
        result = 31 * result + (applExtension != null ? applExtension.hashCode() : 0);
        result = 31 * result + (applTimestamp != null ? applTimestamp.hashCode() : 0);
        result = 31 * result + applUpdtPgmId;
        result = 31 * result + (applRcncltnDate != null ? applRcncltnDate.hashCode() : 0);
        result = 31 * result + (applStp4Dt != null ? applStp4Dt.hashCode() : 0);
        result = 31 * result + (applFrzDt != null ? applFrzDt.hashCode() : 0);
        return result;
    }
}
