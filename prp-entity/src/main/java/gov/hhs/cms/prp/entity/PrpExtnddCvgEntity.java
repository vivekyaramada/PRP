package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_extndd_cvg", schema = "", catalog = "prp")
@IdClass(PrpExtnddCvgEntityPK.class)
public class PrpExtnddCvgEntity {
    private int beneId;
    private int sequence;
    private String linkKey;
    private String applId;
    private int rdsEffDate;
    private int rdsTermDate;
    private String groupNumber;
    private String relationship;
    private String deleteInd;
    private int cvgEffDate;
    private int cvgTermDate;
    private String updtPgm;
    private Timestamp timestamp;
    private String originId;
    private String cvgRsnCd;

    @Id
    @Column(name = "BENE_ID")
    public int getBeneId() {
        return beneId;
    }

    public void setBeneId(int beneId) {
        this.beneId = beneId;
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
    @Column(name = "LINK_KEY")
    public String getLinkKey() {
        return linkKey;
    }

    public void setLinkKey(String linkKey) {
        this.linkKey = linkKey;
    }

    @Basic
    @Column(name = "APPL_ID")
    public String getApplId() {
        return applId;
    }

    public void setApplId(String applId) {
        this.applId = applId;
    }

    @Basic
    @Column(name = "RDS_EFF_DATE")
    public int getRdsEffDate() {
        return rdsEffDate;
    }

    public void setRdsEffDate(int rdsEffDate) {
        this.rdsEffDate = rdsEffDate;
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
    @Column(name = "GROUP_NUMBER")
    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
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
    @Column(name = "DELETE_IND")
    public String getDeleteInd() {
        return deleteInd;
    }

    public void setDeleteInd(String deleteInd) {
        this.deleteInd = deleteInd;
    }

    @Basic
    @Column(name = "CVG_EFF_DATE")
    public int getCvgEffDate() {
        return cvgEffDate;
    }

    public void setCvgEffDate(int cvgEffDate) {
        this.cvgEffDate = cvgEffDate;
    }

    @Basic
    @Column(name = "CVG_TERM_DATE")
    public int getCvgTermDate() {
        return cvgTermDate;
    }

    public void setCvgTermDate(int cvgTermDate) {
        this.cvgTermDate = cvgTermDate;
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
    @Column(name = "ORIGIN_ID")
    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    @Basic
    @Column(name = "CVG_RSN_CD")
    public String getCvgRsnCd() {
        return cvgRsnCd;
    }

    public void setCvgRsnCd(String cvgRsnCd) {
        this.cvgRsnCd = cvgRsnCd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpExtnddCvgEntity that = (PrpExtnddCvgEntity) o;

        if (beneId != that.beneId) return false;
        if (sequence != that.sequence) return false;
        if (rdsEffDate != that.rdsEffDate) return false;
        if (rdsTermDate != that.rdsTermDate) return false;
        if (cvgEffDate != that.cvgEffDate) return false;
        if (cvgTermDate != that.cvgTermDate) return false;
        if (linkKey != null ? !linkKey.equals(that.linkKey) : that.linkKey != null) return false;
        if (applId != null ? !applId.equals(that.applId) : that.applId != null) return false;
        if (groupNumber != null ? !groupNumber.equals(that.groupNumber) : that.groupNumber != null) return false;
        if (relationship != null ? !relationship.equals(that.relationship) : that.relationship != null) return false;
        if (deleteInd != null ? !deleteInd.equals(that.deleteInd) : that.deleteInd != null) return false;
        if (updtPgm != null ? !updtPgm.equals(that.updtPgm) : that.updtPgm != null) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;
        if (originId != null ? !originId.equals(that.originId) : that.originId != null) return false;
        if (cvgRsnCd != null ? !cvgRsnCd.equals(that.cvgRsnCd) : that.cvgRsnCd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = beneId;
        result = 31 * result + sequence;
        result = 31 * result + (linkKey != null ? linkKey.hashCode() : 0);
        result = 31 * result + (applId != null ? applId.hashCode() : 0);
        result = 31 * result + rdsEffDate;
        result = 31 * result + rdsTermDate;
        result = 31 * result + (groupNumber != null ? groupNumber.hashCode() : 0);
        result = 31 * result + (relationship != null ? relationship.hashCode() : 0);
        result = 31 * result + (deleteInd != null ? deleteInd.hashCode() : 0);
        result = 31 * result + cvgEffDate;
        result = 31 * result + cvgTermDate;
        result = 31 * result + (updtPgm != null ? updtPgm.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (originId != null ? originId.hashCode() : 0);
        result = 31 * result + (cvgRsnCd != null ? cvgRsnCd.hashCode() : 0);
        return result;
    }
}
