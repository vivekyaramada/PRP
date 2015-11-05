package gov.hhs.cms.prp.entity;

import java.sql.Timestamp;

/**
 * Created by jarsen on 11/3/15.
 */
public class PrpPlanOptionsEntity {
    private int planApplId;
    private String planGroupNumber;
    private Timestamp planTimestamp;
    private String planSubmMethod;
    private String planRespMethod;
    private String planNotifMethod;
    private String planNdmVendor;
    private String planVdsaPlanNum;
    private String planVdsaMirId;

    public int getPlanApplId() {
        return planApplId;
    }

    public void setPlanApplId(int planApplId) {
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

        PrpPlanOptionsEntity that = (PrpPlanOptionsEntity) o;

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
        return !(planVdsaMirId != null ? !planVdsaMirId.equals(that.planVdsaMirId) : that.planVdsaMirId != null);

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
        return "PrpPlanOptionsEntity{" +
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
