package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_appl_hs", schema = "", catalog = "prp")
@IdClass(PrpApplHsEntityPK.class)
public class PrpApplHsEntity {
    private String id;
    private Timestamp updtTs;
    private String psId;
    private String psCompany;
    private int startDate;
    private int endDate;
    private String transMethod;
    private String status;
    private String retlistSw;
    private String extension;
    private String updtPgmId;
    private Timestamp termTs;
    private String termPgmId;
    private Date rcncltnDate;
    private Date stp4Dt;
    private Date frzDt;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    @Column(name = "UPDT_TS")
    public Timestamp getUpdtTs() {
        return updtTs;
    }

    public void setUpdtTs(Timestamp updtTs) {
        this.updtTs = updtTs;
    }

    @Basic
    @Column(name = "PS_ID")
    public String getPsId() {
        return psId;
    }

    public void setPsId(String psId) {
        this.psId = psId;
    }

    @Basic
    @Column(name = "PS_COMPANY")
    public String getPsCompany() {
        return psCompany;
    }

    public void setPsCompany(String psCompany) {
        this.psCompany = psCompany;
    }

    @Basic
    @Column(name = "START_DATE")
    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "END_DATE")
    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
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
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "RETLIST_SW")
    public String getRetlistSw() {
        return retlistSw;
    }

    public void setRetlistSw(String retlistSw) {
        this.retlistSw = retlistSw;
    }

    @Basic
    @Column(name = "EXTENSION")
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Basic
    @Column(name = "UPDT_PGM_ID")
    public String getUpdtPgmId() {
        return updtPgmId;
    }

    public void setUpdtPgmId(String updtPgmId) {
        this.updtPgmId = updtPgmId;
    }

    @Basic
    @Column(name = "TERM_TS")
    public Timestamp getTermTs() {
        return termTs;
    }

    public void setTermTs(Timestamp termTs) {
        this.termTs = termTs;
    }

    @Basic
    @Column(name = "TERM_PGM_ID")
    public String getTermPgmId() {
        return termPgmId;
    }

    public void setTermPgmId(String termPgmId) {
        this.termPgmId = termPgmId;
    }

    @Basic
    @Column(name = "RCNCLTN_DATE")
    public Date getRcncltnDate() {
        return rcncltnDate;
    }

    public void setRcncltnDate(Date rcncltnDate) {
        this.rcncltnDate = rcncltnDate;
    }

    @Basic
    @Column(name = "STP4_DT")
    public Date getStp4Dt() {
        return stp4Dt;
    }

    public void setStp4Dt(Date stp4Dt) {
        this.stp4Dt = stp4Dt;
    }

    @Basic
    @Column(name = "FRZ_DT")
    public Date getFrzDt() {
        return frzDt;
    }

    public void setFrzDt(Date frzDt) {
        this.frzDt = frzDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpApplHsEntity that = (PrpApplHsEntity) o;

        if (startDate != that.startDate) return false;
        if (endDate != that.endDate) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (updtTs != null ? !updtTs.equals(that.updtTs) : that.updtTs != null) return false;
        if (psId != null ? !psId.equals(that.psId) : that.psId != null) return false;
        if (psCompany != null ? !psCompany.equals(that.psCompany) : that.psCompany != null) return false;
        if (transMethod != null ? !transMethod.equals(that.transMethod) : that.transMethod != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (retlistSw != null ? !retlistSw.equals(that.retlistSw) : that.retlistSw != null) return false;
        if (extension != null ? !extension.equals(that.extension) : that.extension != null) return false;
        if (updtPgmId != null ? !updtPgmId.equals(that.updtPgmId) : that.updtPgmId != null) return false;
        if (termTs != null ? !termTs.equals(that.termTs) : that.termTs != null) return false;
        if (termPgmId != null ? !termPgmId.equals(that.termPgmId) : that.termPgmId != null) return false;
        if (rcncltnDate != null ? !rcncltnDate.equals(that.rcncltnDate) : that.rcncltnDate != null) return false;
        if (stp4Dt != null ? !stp4Dt.equals(that.stp4Dt) : that.stp4Dt != null) return false;
        if (frzDt != null ? !frzDt.equals(that.frzDt) : that.frzDt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (updtTs != null ? updtTs.hashCode() : 0);
        result = 31 * result + (psId != null ? psId.hashCode() : 0);
        result = 31 * result + (psCompany != null ? psCompany.hashCode() : 0);
        result = 31 * result + startDate;
        result = 31 * result + endDate;
        result = 31 * result + (transMethod != null ? transMethod.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (retlistSw != null ? retlistSw.hashCode() : 0);
        result = 31 * result + (extension != null ? extension.hashCode() : 0);
        result = 31 * result + (updtPgmId != null ? updtPgmId.hashCode() : 0);
        result = 31 * result + (termTs != null ? termTs.hashCode() : 0);
        result = 31 * result + (termPgmId != null ? termPgmId.hashCode() : 0);
        result = 31 * result + (rcncltnDate != null ? rcncltnDate.hashCode() : 0);
        result = 31 * result + (stp4Dt != null ? stp4Dt.hashCode() : 0);
        result = 31 * result + (frzDt != null ? frzDt.hashCode() : 0);
        return result;
    }
}
