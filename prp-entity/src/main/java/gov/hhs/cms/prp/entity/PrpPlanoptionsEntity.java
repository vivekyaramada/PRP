package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by jarsen on 11/24/15.
 */
@Entity
@Table(name = "prp_planoptions")
@IdClass(PrpPlanoptionsEntityPK.class)
public class PrpPlanoptionsEntity {

    @Id
    @Column(name = "plan_appl_id")
    private Integer planApplId;

    @Id
    @Column(name = "plan_group_number")
    private String planGroupNumber;


    @Basic
    @Column(name = "plan_timestamp", insertable = false)
    private Timestamp planTimestamp;

    @Basic
    @Column(name = "plan_subm_method")
    private String planSubmMethod;

    @Basic
    @Column(name = "plan_resp_method")
    private String planRespMethod;

    @Basic
    @Column(name = "plan_notif_method")
    private String planNotifMethod;

    @Basic
    @Column(name = "plan_ndm_vendor")
    private String planNdmVendor;

    @Basic
    @Column(name = "plan_vdsa_plan_num")
    private String planVdsaPlanNum;

    @Basic
    @Column(name = "plan_vdsa_mir_id")
    private String planVdsaMirId;

    public Integer getPlanApplId() {
        return planApplId;
    }

    public void setPlanApplId(Integer planApplId) {
        this.planApplId = planApplId;
    }

    public String getPlanGroupNumber() {
        return planGroupNumber;
    }

    public void setPlanGroupNumber(String planGroupNumber) {
        this.planGroupNumber = planGroupNumber;
    }

    public Timestamp getPlanTimestamp() {
        return planTimestamp;
    }

    public void setPlanTimestamp(Timestamp planTimestamp) {
        this.planTimestamp = planTimestamp;
    }

    public String getPlanSubmMethod() {
        return planSubmMethod;
    }

    public void setPlanSubmMethod(String planSubmMethod) {
        this.planSubmMethod = planSubmMethod;
    }

    public String getPlanRespMethod() {
        return planRespMethod;
    }

    public void setPlanRespMethod(String planRespMethod) {
        this.planRespMethod = planRespMethod;
    }

    public String getPlanNotifMethod() {
        return planNotifMethod;
    }

    public void setPlanNotifMethod(String planNotifMethod) {
        this.planNotifMethod = planNotifMethod;
    }

    public String getPlanNdmVendor() {
        return planNdmVendor;
    }

    public void setPlanNdmVendor(String planNdmVendor) {
        this.planNdmVendor = planNdmVendor;
    }

    public String getPlanVdsaPlanNum() {
        return planVdsaPlanNum;
    }

    public void setPlanVdsaPlanNum(String planVdsaPlanNum) {
        this.planVdsaPlanNum = planVdsaPlanNum;
    }

    public String getPlanVdsaMirId() {
        return planVdsaMirId;
    }

    public void setPlanVdsaMirId(String planVdsaMirId) {
        this.planVdsaMirId = planVdsaMirId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpPlanoptionsEntity that = (PrpPlanoptionsEntity) o;

        if (planApplId != that.planApplId) return false;
        if (planGroupNumber != null ? !planGroupNumber.equals(that.planGroupNumber) : that.planGroupNumber != null)
            return false;
        if (planTimestamp != null ? !planTimestamp.equals(that.planTimestamp) : that.planTimestamp != null)
            return false;
        if (planSubmMethod != null ? !planSubmMethod.equals(that.planSubmMethod) : that.planSubmMethod != null)
            return false;
        if (planRespMethod != null ? !planRespMethod.equals(that.planRespMethod) : that.planRespMethod != null)
            return false;
        if (planNotifMethod != null ? !planNotifMethod.equals(that.planNotifMethod) : that.planNotifMethod != null)
            return false;
        if (planNdmVendor != null ? !planNdmVendor.equals(that.planNdmVendor) : that.planNdmVendor != null)
            return false;
        if (planVdsaPlanNum != null ? !planVdsaPlanNum.equals(that.planVdsaPlanNum) : that.planVdsaPlanNum != null)
            return false;
        if (planVdsaMirId != null ? !planVdsaMirId.equals(that.planVdsaMirId) : that.planVdsaMirId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = planApplId;
        result = 31 * result + (planGroupNumber != null ? planGroupNumber.hashCode() : 0);
        result = 31 * result + (planTimestamp != null ? planTimestamp.hashCode() : 0);
        result = 31 * result + (planSubmMethod != null ? planSubmMethod.hashCode() : 0);
        result = 31 * result + (planRespMethod != null ? planRespMethod.hashCode() : 0);
        result = 31 * result + (planNotifMethod != null ? planNotifMethod.hashCode() : 0);
        result = 31 * result + (planNdmVendor != null ? planNdmVendor.hashCode() : 0);
        result = 31 * result + (planVdsaPlanNum != null ? planVdsaPlanNum.hashCode() : 0);
        result = 31 * result + (planVdsaMirId != null ? planVdsaMirId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PrpPlanoptionsEntity{" +
                "planApplId=" + planApplId +
                ", planGroupNumber='" + planGroupNumber + '\'' +
                ", planTimestamp=" + planTimestamp +
                ", planSubmMethod='" + planSubmMethod + '\'' +
                ", planRespMethod='" + planRespMethod + '\'' +
                ", planNotifMethod='" + planNotifMethod + '\'' +
                ", planNdmVendor='" + planNdmVendor + '\'' +
                ", planVdsaPlanNum='" + planVdsaPlanNum + '\'' +
                ", planVdsaMirId='" + planVdsaMirId + '\'' +
                '}';
    }
}

class PrpPlanoptionsEntityPK implements Serializable {

    private static final long serialVersionUID = 720771157481626607L;

    private Integer planApplId;
    private String planGroupNumber;

    public PrpPlanoptionsEntityPK() {
        super();
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PrpPlanoptionsEntityPK)) {
            return false;
        }
        PrpPlanoptionsEntityPK other = (PrpPlanoptionsEntityPK) object;
        if ((this.planApplId == null && other.planApplId != null &&
                this.planGroupNumber == null && other.planGroupNumber != null)
                || (this.planApplId != null && !this.planApplId.equals(other.planApplId)) &&
                this.planGroupNumber != null && !this.planGroupNumber.equals(other.planGroupNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (planApplId != null ? planApplId.hashCode() + planGroupNumber.hashCode() : 0);
        return hash;
    }

}

