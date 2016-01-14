package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_notificatns", schema = "", catalog = "prp")
@IdClass(PrpNotificatnsEntityPK.class)
public class PrpNotificatnsEntity {
    private String fileId;
    private int sequence;
    private String hicn;
    private String corrHicn;
    private String linkKey;
    private String ssn;
    private String firstName;
    private String middleInit;
    private String lastName;
    private String dob;
    private String sexCode;
    private String relationship;
    private String cvgEffDate;
    private String cvgTermDate;
    private String groupNumber;
    private String actionType;
    private String status;
    private String subsidySw;
    private String splitCvgSw;
    private int rdsEffDate;
    private int rdsTermDate;
    private String errorCode;
    private String cobcDcn;
    private String updtPgm;
    private Timestamp timestamp;
    private Integer beneId;

    @Id
    @Column(name = "FILE_ID")
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Id
    @Column(name = "SEQUENCE")
    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    @Basic
    @Column(name = "HICN")
    public String getHicn() {
        return hicn;
    }

    public void setHicn(String hicn) {
        this.hicn = hicn;
    }

    @Basic
    @Column(name = "CORR_HICN")
    public String getCorrHicn() {
        return corrHicn;
    }

    public void setCorrHicn(String corrHicn) {
        this.corrHicn = corrHicn;
    }

    @Basic
    @Column(name = "LINK_KEY")
    public String getLinkKey() {
        return linkKey;
    }

    public void setLinkKey(String linkKey) {
        this.linkKey = linkKey;
    }

    @Basic
    @Column(name = "SSN")
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Basic
    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "MIDDLE_INIT")
    public String getMiddleInit() {
        return middleInit;
    }

    public void setMiddleInit(String middleInit) {
        this.middleInit = middleInit;
    }

    @Basic
    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "DOB")
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Basic
    @Column(name = "SEX_CODE")
    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    @Basic
    @Column(name = "RELATIONSHIP")
    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Basic
    @Column(name = "CVG_EFF_DATE")
    public String getCvgEffDate() {
        return cvgEffDate;
    }

    public void setCvgEffDate(String cvgEffDate) {
        this.cvgEffDate = cvgEffDate;
    }

    @Basic
    @Column(name = "CVG_TERM_DATE")
    public String getCvgTermDate() {
        return cvgTermDate;
    }

    public void setCvgTermDate(String cvgTermDate) {
        this.cvgTermDate = cvgTermDate;
    }

    @Basic
    @Column(name = "GROUP_NUMBER")
    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Basic
    @Column(name = "ACTION_TYPE")
    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
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
    @Column(name = "SUBSIDY_SW")
    public String getSubsidySw() {
        return subsidySw;
    }

    public void setSubsidySw(String subsidySw) {
        this.subsidySw = subsidySw;
    }

    @Basic
    @Column(name = "SPLIT_CVG_SW")
    public String getSplitCvgSw() {
        return splitCvgSw;
    }

    public void setSplitCvgSw(String splitCvgSw) {
        this.splitCvgSw = splitCvgSw;
    }

    public void setRdsEffDate(Integer rdsEffDate) {
        this.rdsEffDate = rdsEffDate;
    }

    @Basic
    @Column(name = "RDS_EFF_DATE")
    public int getRdsEffDate() {
        return rdsEffDate;
    }

    public void setRdsEffDate(int rdsEffDate) {
        this.rdsEffDate = rdsEffDate;
    }

    public void setRdsTermDate(Integer rdsTermDate) {
        this.rdsTermDate = rdsTermDate;
    }

    @Basic
    @Column(name = "RDS_TERM_DATE")
    public int getRdsTermDate() {
        return rdsTermDate;
    }

    public void setRdsTermDate(int rdsTermDate) {
        this.rdsTermDate = rdsTermDate;
    }

    @Basic
    @Column(name = "ERROR_CODE")
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Basic
    @Column(name = "COBC_DCN")
    public String getCobcDcn() {
        return cobcDcn;
    }

    public void setCobcDcn(String cobcDcn) {
        this.cobcDcn = cobcDcn;
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
    @Column(name = "TIMESTAMP")
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Basic
    @Column(name = "BENE_ID")
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
