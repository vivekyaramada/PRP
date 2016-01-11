package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_beneficiary", schema = "", catalog = "prp")
public class PrpBeneficiaryEntity {
    private int beneId;
    private String linkKey;
    private String ssn;
    private String firstName;
    private String middleInit;
    private String lastName;
    private int dob;
    private String sexCode;
    private int dod;
    private String dodProofCd;
    private String updtPgm;
    private Timestamp timestamp;
    private String currHicn;
    private Date mbdUpdtDt;

    @Id
    @Column(name = "BENE_ID")
    public int getBeneId() {
        return beneId;
    }

    public void setBeneId(int beneId) {
        this.beneId = beneId;
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
    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
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
    @Column(name = "DOD")
    public int getDod() {
        return dod;
    }

    public void setDod(int dod) {
        this.dod = dod;
    }

    @Basic
    @Column(name = "DOD_PROOF_CD")
    public String getDodProofCd() {
        return dodProofCd;
    }

    public void setDodProofCd(String dodProofCd) {
        this.dodProofCd = dodProofCd;
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
    @Column(name = "CURR_HICN")
    public String getCurrHicn() {
        return currHicn;
    }

    public void setCurrHicn(String currHicn) {
        this.currHicn = currHicn;
    }

    @Basic
    @Column(name = "MBD_UPDT_DT")
    public Date getMbdUpdtDt() {
        return mbdUpdtDt;
    }

    public void setMbdUpdtDt(Date mbdUpdtDt) {
        this.mbdUpdtDt = mbdUpdtDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpBeneficiaryEntity that = (PrpBeneficiaryEntity) o;

        if (beneId != that.beneId) return false;
        if (dob != that.dob) return false;
        if (dod != that.dod) return false;
        if (linkKey != null ? !linkKey.equals(that.linkKey) : that.linkKey != null) return false;
        if (ssn != null ? !ssn.equals(that.ssn) : that.ssn != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (middleInit != null ? !middleInit.equals(that.middleInit) : that.middleInit != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (sexCode != null ? !sexCode.equals(that.sexCode) : that.sexCode != null) return false;
        if (dodProofCd != null ? !dodProofCd.equals(that.dodProofCd) : that.dodProofCd != null) return false;
        if (updtPgm != null ? !updtPgm.equals(that.updtPgm) : that.updtPgm != null) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;
        if (currHicn != null ? !currHicn.equals(that.currHicn) : that.currHicn != null) return false;
        if (mbdUpdtDt != null ? !mbdUpdtDt.equals(that.mbdUpdtDt) : that.mbdUpdtDt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = beneId;
        result = 31 * result + (linkKey != null ? linkKey.hashCode() : 0);
        result = 31 * result + (ssn != null ? ssn.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleInit != null ? middleInit.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + dob;
        result = 31 * result + (sexCode != null ? sexCode.hashCode() : 0);
        result = 31 * result + dod;
        result = 31 * result + (dodProofCd != null ? dodProofCd.hashCode() : 0);
        result = 31 * result + (updtPgm != null ? updtPgm.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (currHicn != null ? currHicn.hashCode() : 0);
        result = 31 * result + (mbdUpdtDt != null ? mbdUpdtDt.hashCode() : 0);
        return result;
    }
}
