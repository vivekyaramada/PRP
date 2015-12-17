package gov.hhs.cms.prp.mq.to;

import java.util.Date;

/**
 * Created by jarsen on 12/16/15.
 */
public class RetireeListDetailTO {

    private String segmentId;
    private Integer applicationId;
    private String rxGroupNumber;
    private Date coverageEffectiveDate;
    private Date coverageTerminationDate;
    private String beneFirstName;
    private String beneMiddleInitial;
    private String beneLastName;
    private String beneSsn;
    private String beneHicn;
    private Date beneBirthDate;
    private String beneSexCode;
    private String beneRelationshipCode;
    private String recordActionCode;
    private Date fileReceiptDate;
    private Integer planId;

    public String getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public String getRxGroupNumber() {
        return rxGroupNumber;
    }

    public void setRxGroupNumber(String rxGroupNumber) {
        this.rxGroupNumber = rxGroupNumber;
    }

    public Date getCoverageEffectiveDate() {
        return coverageEffectiveDate;
    }

    public void setCoverageEffectiveDate(Date coverageEffectiveDate) {
        this.coverageEffectiveDate = coverageEffectiveDate;
    }

    public Date getCoverageTerminationDate() {
        return coverageTerminationDate;
    }

    public void setCoverageTerminationDate(Date coverageTerminationDate) {
        this.coverageTerminationDate = coverageTerminationDate;
    }

    public String getBeneFirstName() {
        return beneFirstName;
    }

    public void setBeneFirstName(String beneFirstName) {
        this.beneFirstName = beneFirstName;
    }

    public String getBeneMiddleInitial() {
        return beneMiddleInitial;
    }

    public void setBeneMiddleInitial(String beneMiddleInitial) {
        this.beneMiddleInitial = beneMiddleInitial;
    }

    public String getBeneLastName() {
        return beneLastName;
    }

    public void setBeneLastName(String beneLastName) {
        this.beneLastName = beneLastName;
    }

    public String getBeneSsn() {
        return beneSsn;
    }

    public void setBeneSsn(String beneSsn) {
        this.beneSsn = beneSsn;
    }

    public String getBeneHicn() {
        return beneHicn;
    }

    public void setBeneHicn(String beneHicn) {
        this.beneHicn = beneHicn;
    }

    public Date getBeneBirthDate() {
        return beneBirthDate;
    }

    public void setBeneBirthDate(Date beneBirthDate) {
        this.beneBirthDate = beneBirthDate;
    }

    public String getBeneSexCode() {
        return beneSexCode;
    }

    public void setBeneSexCode(String beneSexCode) {
        this.beneSexCode = beneSexCode;
    }

    public String getBeneRelationshipCode() {
        return beneRelationshipCode;
    }

    public void setBeneRelationshipCode(String beneRelationshipCode) {
        this.beneRelationshipCode = beneRelationshipCode;
    }

    public String getRecordActionCode() {
        return recordActionCode;
    }

    public void setRecordActionCode(String recordActionCode) {
        this.recordActionCode = recordActionCode;
    }

    public Date getFileReceiptDate() {
        return fileReceiptDate;
    }

    public void setFileReceiptDate(Date fileReceiptDate) {
        this.fileReceiptDate = fileReceiptDate;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }
}
