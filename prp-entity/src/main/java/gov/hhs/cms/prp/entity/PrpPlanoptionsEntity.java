package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_planoptions", schema = "", catalog = "prp")
@IdClass(PrpPlanoptionsEntityPK.class)
public class PrpPlanoptionsEntity {
    private String applId;
    private String groupNumber;
    private Timestamp timestamp;
    private String submMethod;
    private String respMethod;
    private String notifMethod;
    private String ndmVendor;
    private String vdsaPlanNum;
    private String vdsaMirId;

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

    @Basic
    @Column(name = "TIMESTAMP")
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpPlanoptionsEntity that = (PrpPlanoptionsEntity) o;

        if (applId != null ? !applId.equals(that.applId) : that.applId != null) return false;
        if (groupNumber != null ? !groupNumber.equals(that.groupNumber) : that.groupNumber != null) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;
        if (submMethod != null ? !submMethod.equals(that.submMethod) : that.submMethod != null) return false;
        if (respMethod != null ? !respMethod.equals(that.respMethod) : that.respMethod != null) return false;
        if (notifMethod != null ? !notifMethod.equals(that.notifMethod) : that.notifMethod != null) return false;
        if (ndmVendor != null ? !ndmVendor.equals(that.ndmVendor) : that.ndmVendor != null) return false;
        if (vdsaPlanNum != null ? !vdsaPlanNum.equals(that.vdsaPlanNum) : that.vdsaPlanNum != null) return false;
        if (vdsaMirId != null ? !vdsaMirId.equals(that.vdsaMirId) : that.vdsaMirId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = applId != null ? applId.hashCode() : 0;
        result = 31 * result + (groupNumber != null ? groupNumber.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (submMethod != null ? submMethod.hashCode() : 0);
        result = 31 * result + (respMethod != null ? respMethod.hashCode() : 0);
        result = 31 * result + (notifMethod != null ? notifMethod.hashCode() : 0);
        result = 31 * result + (ndmVendor != null ? ndmVendor.hashCode() : 0);
        result = 31 * result + (vdsaPlanNum != null ? vdsaPlanNum.hashCode() : 0);
        result = 31 * result + (vdsaMirId != null ? vdsaMirId.hashCode() : 0);
        return result;
    }
}
