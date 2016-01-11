package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_planopt_hs", schema = "", catalog = "prp")
@IdClass(PrpPlanoptHsEntityPK.class)
public class PrpPlanoptHsEntity {
    private String applId;
    private String groupNumber;
    private Timestamp updtTs;
    private String submMethod;
    private String respMethod;
    private String notifMethod;
    private String ndmVendor;
    private String vdsaPlanNum;
    private String vdsaMirId;
    private Timestamp termTs;
    private String termPgmId;

    @Id
    @Column(name = "APPL_ID")
    public String getApplId() {
        return applId;
    }

    public void setApplId(String applId) {
        this.applId = applId;
    }

    @Id
    @Column(name = "GROUP_NUMBER")
    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
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
    @Column(name = "SUBM_METHOD")
    public String getSubmMethod() {
        return submMethod;
    }

    public void setSubmMethod(String submMethod) {
        this.submMethod = submMethod;
    }

    @Basic
    @Column(name = "RESP_METHOD")
    public String getRespMethod() {
        return respMethod;
    }

    public void setRespMethod(String respMethod) {
        this.respMethod = respMethod;
    }

    @Basic
    @Column(name = "NOTIF_METHOD")
    public String getNotifMethod() {
        return notifMethod;
    }

    public void setNotifMethod(String notifMethod) {
        this.notifMethod = notifMethod;
    }

    @Basic
    @Column(name = "NDM_VENDOR")
    public String getNdmVendor() {
        return ndmVendor;
    }

    public void setNdmVendor(String ndmVendor) {
        this.ndmVendor = ndmVendor;
    }

    @Basic
    @Column(name = "VDSA_PLAN_NUM")
    public String getVdsaPlanNum() {
        return vdsaPlanNum;
    }

    public void setVdsaPlanNum(String vdsaPlanNum) {
        this.vdsaPlanNum = vdsaPlanNum;
    }

    @Basic
    @Column(name = "VDSA_MIR_ID")
    public String getVdsaMirId() {
        return vdsaMirId;
    }

    public void setVdsaMirId(String vdsaMirId) {
        this.vdsaMirId = vdsaMirId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpPlanoptHsEntity that = (PrpPlanoptHsEntity) o;

        if (applId != null ? !applId.equals(that.applId) : that.applId != null) return false;
        if (groupNumber != null ? !groupNumber.equals(that.groupNumber) : that.groupNumber != null) return false;
        if (updtTs != null ? !updtTs.equals(that.updtTs) : that.updtTs != null) return false;
        if (submMethod != null ? !submMethod.equals(that.submMethod) : that.submMethod != null) return false;
        if (respMethod != null ? !respMethod.equals(that.respMethod) : that.respMethod != null) return false;
        if (notifMethod != null ? !notifMethod.equals(that.notifMethod) : that.notifMethod != null) return false;
        if (ndmVendor != null ? !ndmVendor.equals(that.ndmVendor) : that.ndmVendor != null) return false;
        if (vdsaPlanNum != null ? !vdsaPlanNum.equals(that.vdsaPlanNum) : that.vdsaPlanNum != null) return false;
        if (vdsaMirId != null ? !vdsaMirId.equals(that.vdsaMirId) : that.vdsaMirId != null) return false;
        if (termTs != null ? !termTs.equals(that.termTs) : that.termTs != null) return false;
        if (termPgmId != null ? !termPgmId.equals(that.termPgmId) : that.termPgmId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = applId != null ? applId.hashCode() : 0;
        result = 31 * result + (groupNumber != null ? groupNumber.hashCode() : 0);
        result = 31 * result + (updtTs != null ? updtTs.hashCode() : 0);
        result = 31 * result + (submMethod != null ? submMethod.hashCode() : 0);
        result = 31 * result + (respMethod != null ? respMethod.hashCode() : 0);
        result = 31 * result + (notifMethod != null ? notifMethod.hashCode() : 0);
        result = 31 * result + (ndmVendor != null ? ndmVendor.hashCode() : 0);
        result = 31 * result + (vdsaPlanNum != null ? vdsaPlanNum.hashCode() : 0);
        result = 31 * result + (vdsaMirId != null ? vdsaMirId.hashCode() : 0);
        result = 31 * result + (termTs != null ? termTs.hashCode() : 0);
        result = 31 * result + (termPgmId != null ? termPgmId.hashCode() : 0);
        return result;
    }
}
