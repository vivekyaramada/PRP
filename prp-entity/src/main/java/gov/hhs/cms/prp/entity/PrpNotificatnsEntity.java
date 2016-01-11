package gov.hhs.cms.prp.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@javax.persistence.Table(name = "prp_notificatns", schema = "", catalog = "prp")
public class PrpNotificatnsEntity {
    private String fileId;

    @Id
    @javax.persistence.Column(name = "FILE_ID")
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    private int sequence;

    @Id
    @javax.persistence.Column(name = "SEQUENCE")
    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    private String hicn;

    @Basic
    @javax.persistence.Column(name = "HICN")
    public String getHicn() {
        return hicn;
    }

    public void setHicn(String hicn) {
        this.hicn = hicn;
    }

    private String corrHicn;

    @Basic
    @javax.persistence.Column(name = "CORR_HICN")
    public String getCorrHicn() {
        return corrHicn;
    }

    public void setCorrHicn(String corrHicn) {
        this.corrHicn = corrHicn;
    }

    private String linkKey;

    @Basic
    @javax.persistence.Column(name = "LINK_KEY")
    public String getLinkKey() {
        return linkKey;
    }

    public void setLinkKey(String linkKey) {
        this.linkKey = linkKey;
    }

    private String ssn;

    @Basic
    @javax.persistence.Column(name = "SSN")
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    private String firstName;

    @Basic
    @javax.persistence.Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String middleInit;

    @Basic
    @javax.persistence.Column(name = "MIDDLE_INIT")
    public String getMiddleInit() {
        return middleInit;
    }

    public void setMiddleInit(String middleInit) {
        this.middleInit = middleInit;
    }

    private String lastName;

    @Basic
    @javax.persistence.Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String dob;

    @Basic
    @javax.persistence.Column(name = "DOB")
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    private String sexCode;

    @Basic
    @javax.persistence.Column(name = "SEX_CODE")
    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    private String relationship;

    @Basic
    @javax.persistence.Column(name = "RELATIONSHIP")
    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    private String cvgEffDate;

    @Basic
    @javax.persistence.Column(name = "CVG_EFF_DATE")
    public String getCvgEffDate() {
        return cvgEffDate;
    }

    public void setCvgEffDate(String cvgEffDate) {
        this.cvgEffDate = cvgEffDate;
    }

    private String cvgTermDate;

    @Basic
    @javax.persistence.Column(name = "CVG_TERM_DATE")
    public String getCvgTermDate() {
        return cvgTermDate;
    }

    public void setCvgTermDate(String cvgTermDate) {
        this.cvgTermDate = cvgTermDate;
    }

    private String groupNumber;

    @Basic
    @javax.persistence.Column(name = "GROUP_NUMBER")
    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    private String actionType;

    @Basic
    @javax.persistence.Column(name = "ACTION_TYPE")
    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    private String status;

    @Basic
    @javax.persistence.Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String subsidySw;

    @Basic
    @javax.persistence.Column(name = "SUBSIDY_SW")
    public String getSubsidySw() {
        return subsidySw;
    }

    public void setSubsidySw(String subsidySw) {
        this.subsidySw = subsidySw;
    }

    private String splitCvgSw;

    @Basic
    @javax.persistence.Column(name = "SPLIT_CVG_SW")
    public String getSplitCvgSw() {
        return splitCvgSw;
    }

    public void setSplitCvgSw(String splitCvgSw) {
        this.splitCvgSw = splitCvgSw;
    }

    private int rdsEffDate;

    @Basic
    @javax.persistence.Column(name = "RDS_EFF_DATE")
    public int getRdsEffDate() {
        return rdsEffDate;
    }

    public void setRdsEffDate(int rdsEffDate) {
        this.rdsEffDate = rdsEffDate;
    }

    private int rdsTermDate;

    @Basic
    @javax.persistence.Column(name = "RDS_TERM_DATE")
    public int getRdsTermDate() {
        return rdsTermDate;
    }

    public void setRdsTermDate(int rdsTermDate) {
        this.rdsTermDate = rdsTermDate;
    }

    private String errorCode;

    @Basic
    @javax.persistence.Column(name = "ERROR_CODE")
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    private String cobcDcn;

    @Basic
    @javax.persistence.Column(name = "COBC_DCN")
    public String getCobcDcn() {
        return cobcDcn;
    }

    public void setCobcDcn(String cobcDcn) {
        this.cobcDcn = cobcDcn;
    }

    private String updtPgm;

    @Basic
    @javax.persistence.Column(name = "UPDT_PGM")
    public String getUpdtPgm() {
        return updtPgm;
    }

    public void setUpdtPgm(String updtPgm) {
        this.updtPgm = updtPgm;
    }

    private Timestamp timestamp;

    @Basic
    @javax.persistence.Column(name = "TIMESTAMP")
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    private Integer beneId;

    @Basic
    @javax.persistence.Column(name = "BENE_ID")
    public Integer getBeneId() {
        return beneId;
    }

    public void setBeneId(Integer beneId) {
        this.beneId = beneId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpNotificatnsEntity that = (PrpNotificatnsEntity) o;

        if (sequence != that.sequence) return false;
        if (rdsEffDate != that.rdsEffDate) return false;
        if (rdsTermDate != that.rdsTermDate) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;
        if (hicn != null ? !hicn.equals(that.hicn) : that.hicn != null) return false;
        if (corrHicn != null ? !corrHicn.equals(that.corrHicn) : that.corrHicn != null) return false;
        if (linkKey != null ? !linkKey.equals(that.linkKey) : that.linkKey != null) return false;
        if (ssn != null ? !ssn.equals(that.ssn) : that.ssn != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (middleInit != null ? !middleInit.equals(that.middleInit) : that.middleInit != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (dob != null ? !dob.equals(that.dob) : that.dob != null) return false;
        if (sexCode != null ? !sexCode.equals(that.sexCode) : that.sexCode != null) return false;
        if (relationship != null ? !relationship.equals(that.relationship) : that.relationship != null) return false;
        if (cvgEffDate != null ? !cvgEffDate.equals(that.cvgEffDate) : that.cvgEffDate != null) return false;
        if (cvgTermDate != null ? !cvgTermDate.equals(that.cvgTermDate) : that.cvgTermDate != null) return false;
        if (groupNumber != null ? !groupNumber.equals(that.groupNumber) : that.groupNumber != null) return false;
        if (actionType != null ? !actionType.equals(that.actionType) : that.actionType != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (subsidySw != null ? !subsidySw.equals(that.subsidySw) : that.subsidySw != null) return false;
        if (splitCvgSw != null ? !splitCvgSw.equals(that.splitCvgSw) : that.splitCvgSw != null) return false;
        if (errorCode != null ? !errorCode.equals(that.errorCode) : that.errorCode != null) return false;
        if (cobcDcn != null ? !cobcDcn.equals(that.cobcDcn) : that.cobcDcn != null) return false;
        if (updtPgm != null ? !updtPgm.equals(that.updtPgm) : that.updtPgm != null) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;
        if (beneId != null ? !beneId.equals(that.beneId) : that.beneId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + sequence;
        result = 31 * result + (hicn != null ? hicn.hashCode() : 0);
        result = 31 * result + (corrHicn != null ? corrHicn.hashCode() : 0);
        result = 31 * result + (linkKey != null ? linkKey.hashCode() : 0);
        result = 31 * result + (ssn != null ? ssn.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleInit != null ? middleInit.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (sexCode != null ? sexCode.hashCode() : 0);
        result = 31 * result + (relationship != null ? relationship.hashCode() : 0);
        result = 31 * result + (cvgEffDate != null ? cvgEffDate.hashCode() : 0);
        result = 31 * result + (cvgTermDate != null ? cvgTermDate.hashCode() : 0);
        result = 31 * result + (groupNumber != null ? groupNumber.hashCode() : 0);
        result = 31 * result + (actionType != null ? actionType.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (subsidySw != null ? subsidySw.hashCode() : 0);
        result = 31 * result + (splitCvgSw != null ? splitCvgSw.hashCode() : 0);
        result = 31 * result + rdsEffDate;
        result = 31 * result + rdsTermDate;
        result = 31 * result + (errorCode != null ? errorCode.hashCode() : 0);
        result = 31 * result + (cobcDcn != null ? cobcDcn.hashCode() : 0);
        result = 31 * result + (updtPgm != null ? updtPgm.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (beneId != null ? beneId.hashCode() : 0);
        return result;
    }
}
