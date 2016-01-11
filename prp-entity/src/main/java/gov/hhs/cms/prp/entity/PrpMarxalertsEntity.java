package gov.hhs.cms.prp.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@javax.persistence.Table(name = "prp_marxalerts", schema = "", catalog = "prp")
public class PrpMarxalertsEntity {
    private int alrtNum;

    @Id
    @javax.persistence.Column(name = "ALRT_NUM")
    public int getAlrtNum() {
        return alrtNum;
    }

    public void setAlrtNum(int alrtNum) {
        this.alrtNum = alrtNum;
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

    private String psId;

    @Basic
    @javax.persistence.Column(name = "PS_ID")
    public String getPsId() {
        return psId;
    }

    public void setPsId(String psId) {
        this.psId = psId;
    }

    private String applId;

    @Basic
    @javax.persistence.Column(name = "APPL_ID")
    public String getApplId() {
        return applId;
    }

    public void setApplId(String applId) {
        this.applId = applId;
    }

    private String originId;

    @Basic
    @javax.persistence.Column(name = "ORIGIN_ID")
    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    private Integer alrtRecvDt;

    @Basic
    @javax.persistence.Column(name = "ALRT_RECV_DT")
    public Integer getAlrtRecvDt() {
        return alrtRecvDt;
    }

    public void setAlrtRecvDt(Integer alrtRecvDt) {
        this.alrtRecvDt = alrtRecvDt;
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

    private Integer statusDate;

    @Basic
    @javax.persistence.Column(name = "STATUS_DATE")
    public Integer getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Integer statusDate) {
        this.statusDate = statusDate;
    }

    private String groupNum;

    @Basic
    @javax.persistence.Column(name = "GROUP_NUM")
    public String getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum;
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

    private String relationship;

    @Basic
    @javax.persistence.Column(name = "RELATIONSHIP")
    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
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

    private Integer dob;

    @Basic
    @javax.persistence.Column(name = "DOB")
    public Integer getDob() {
        return dob;
    }

    public void setDob(Integer dob) {
        this.dob = dob;
    }

    private Integer cvgEffDt;

    @Basic
    @javax.persistence.Column(name = "CVG_EFF_DT")
    public Integer getCvgEffDt() {
        return cvgEffDt;
    }

    public void setCvgEffDt(Integer cvgEffDt) {
        this.cvgEffDt = cvgEffDt;
    }

    private Integer cvgTermDt;

    @Basic
    @javax.persistence.Column(name = "CVG_TERM_DT")
    public Integer getCvgTermDt() {
        return cvgTermDt;
    }

    public void setCvgTermDt(Integer cvgTermDt) {
        this.cvgTermDt = cvgTermDt;
    }

    private Integer rdsEffDt;

    @Basic
    @javax.persistence.Column(name = "RDS_EFF_DT")
    public Integer getRdsEffDt() {
        return rdsEffDt;
    }

    public void setRdsEffDt(Integer rdsEffDt) {
        this.rdsEffDt = rdsEffDt;
    }

    private Integer rdsTermDt;

    @Basic
    @javax.persistence.Column(name = "RDS_TERM_DT")
    public Integer getRdsTermDt() {
        return rdsTermDt;
    }

    public void setRdsTermDt(Integer rdsTermDt) {
        this.rdsTermDt = rdsTermDt;
    }

    private Integer prtdAtmptDt;

    @Basic
    @javax.persistence.Column(name = "PRTD_ATMPT_DT")
    public Integer getPrtdAtmptDt() {
        return prtdAtmptDt;
    }

    public void setPrtdAtmptDt(Integer prtdAtmptDt) {
        this.prtdAtmptDt = prtdAtmptDt;
    }

    private Integer alrtSentDt;

    @Basic
    @javax.persistence.Column(name = "ALRT_SENT_DT")
    public Integer getAlrtSentDt() {
        return alrtSentDt;
    }

    public void setAlrtSentDt(Integer alrtSentDt) {
        this.alrtSentDt = alrtSentDt;
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

    private String fileId;

    @Basic
    @javax.persistence.Column(name = "FILE_ID")
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    private Integer sequence;

    @Basic
    @javax.persistence.Column(name = "SEQUENCE")
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpMarxalertsEntity that = (PrpMarxalertsEntity) o;

        if (alrtNum != that.alrtNum) return false;
        if (hicn != null ? !hicn.equals(that.hicn) : that.hicn != null) return false;
        if (psId != null ? !psId.equals(that.psId) : that.psId != null) return false;
        if (applId != null ? !applId.equals(that.applId) : that.applId != null) return false;
        if (originId != null ? !originId.equals(that.originId) : that.originId != null) return false;
        if (alrtRecvDt != null ? !alrtRecvDt.equals(that.alrtRecvDt) : that.alrtRecvDt != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (statusDate != null ? !statusDate.equals(that.statusDate) : that.statusDate != null) return false;
        if (groupNum != null ? !groupNum.equals(that.groupNum) : that.groupNum != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (middleInit != null ? !middleInit.equals(that.middleInit) : that.middleInit != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (relationship != null ? !relationship.equals(that.relationship) : that.relationship != null) return false;
        if (sexCode != null ? !sexCode.equals(that.sexCode) : that.sexCode != null) return false;
        if (dob != null ? !dob.equals(that.dob) : that.dob != null) return false;
        if (cvgEffDt != null ? !cvgEffDt.equals(that.cvgEffDt) : that.cvgEffDt != null) return false;
        if (cvgTermDt != null ? !cvgTermDt.equals(that.cvgTermDt) : that.cvgTermDt != null) return false;
        if (rdsEffDt != null ? !rdsEffDt.equals(that.rdsEffDt) : that.rdsEffDt != null) return false;
        if (rdsTermDt != null ? !rdsTermDt.equals(that.rdsTermDt) : that.rdsTermDt != null) return false;
        if (prtdAtmptDt != null ? !prtdAtmptDt.equals(that.prtdAtmptDt) : that.prtdAtmptDt != null) return false;
        if (alrtSentDt != null ? !alrtSentDt.equals(that.alrtSentDt) : that.alrtSentDt != null) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;
        if (beneId != null ? !beneId.equals(that.beneId) : that.beneId != null) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;
        if (sequence != null ? !sequence.equals(that.sequence) : that.sequence != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = alrtNum;
        result = 31 * result + (hicn != null ? hicn.hashCode() : 0);
        result = 31 * result + (psId != null ? psId.hashCode() : 0);
        result = 31 * result + (applId != null ? applId.hashCode() : 0);
        result = 31 * result + (originId != null ? originId.hashCode() : 0);
        result = 31 * result + (alrtRecvDt != null ? alrtRecvDt.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (statusDate != null ? statusDate.hashCode() : 0);
        result = 31 * result + (groupNum != null ? groupNum.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleInit != null ? middleInit.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (relationship != null ? relationship.hashCode() : 0);
        result = 31 * result + (sexCode != null ? sexCode.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (cvgEffDt != null ? cvgEffDt.hashCode() : 0);
        result = 31 * result + (cvgTermDt != null ? cvgTermDt.hashCode() : 0);
        result = 31 * result + (rdsEffDt != null ? rdsEffDt.hashCode() : 0);
        result = 31 * result + (rdsTermDt != null ? rdsTermDt.hashCode() : 0);
        result = 31 * result + (prtdAtmptDt != null ? prtdAtmptDt.hashCode() : 0);
        result = 31 * result + (alrtSentDt != null ? alrtSentDt.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (beneId != null ? beneId.hashCode() : 0);
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        result = 31 * result + (sequence != null ? sequence.hashCode() : 0);
        return result;
    }
}
