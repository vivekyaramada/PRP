package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_bene_hs", schema = "", catalog = "prp")
@IdClass(PrpBeneHsEntityPK.class)
public class PrpBeneHsEntity {
    private int beneId;
    private Timestamp updtTs;
    private String linkKey;
    private String ssn;
    private String firstName;
    private String middleInit;
    private String lastName;
    private int dob;
    private String sexCode;
    private int dod;
    private String dodProofCd;
    private String currHicn;
    private String updtPgmId;
    private Timestamp termTs;
    private String termPgmId;
    private String stusCd;
    private Date mbdUpdtDt;

    public void setBeneId(Integer beneId) {
        this.beneId = beneId;
    }

    public void setDob(Integer dob) {
        this.dob = dob;
    }

    public void setDod(Integer dod) {
        this.dod = dod;
    }

    @Id
    @Column(name = "BENE_ID")
    public int getBeneId() {
        return beneId;
    }

    public void setBeneId(int beneId) {
        this.beneId = beneId;
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
    @Column(name = "CURR_HICN")
    public String getCurrHicn() {
        return currHicn;
    }

    public void setCurrHicn(String currHicn) {
        this.currHicn = currHicn;
    }

    @Basic
    @Column(name = "UPDT_PGM_ID")
    public String getUpdtPgmId() {
        return updtPgmId;
    }

    public void setUpdtPgmId(String updtPgmId) {
        this.updtPgmId = updtPgmId;
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

    @Basic
    @Column(name = "STUS_CD")
    public String getStusCd() {
        return stusCd;
    }

    public void setStusCd(String stusCd) {
        this.stusCd = stusCd;
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

        PrpBeneHsEntity that = (PrpBeneHsEntity) o;

        if (beneId != that.beneId) return false;
        if (dob != that.dob) return false;
        if (dod != that.dod) return false;
        if (updtTs != null ? !updtTs.equals(that.updtTs) : that.updtTs != null) return false;
        if (linkKey != null ? !linkKey.equals(that.linkKey) : that.linkKey != null) return false;
        if (ssn != null ? !ssn.equals(that.ssn) : that.ssn != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (middleInit != null ? !middleInit.equals(that.middleInit) : that.middleInit != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (sexCode != null ? !sexCode.equals(that.sexCode) : that.sexCode != null) return false;
        if (dodProofCd != null ? !dodProofCd.equals(that.dodProofCd) : that.dodProofCd != null) return false;
        if (currHicn != null ? !currHicn.equals(that.currHicn) : that.currHicn != null) return false;
        if (updtPgmId != null ? !updtPgmId.equals(that.updtPgmId) : that.updtPgmId != null) return false;
        if (termTs != null ? !termTs.equals(that.termTs) : that.termTs != null) return false;
        if (termPgmId != null ? !termPgmId.equals(that.termPgmId) : that.termPgmId != null) return false;
        if (stusCd != null ? !stusCd.equals(that.stusCd) : that.stusCd != null) return false;
        if (mbdUpdtDt != null ? !mbdUpdtDt.equals(that.mbdUpdtDt) : that.mbdUpdtDt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = beneId;
        result = 31 * result + (updtTs != null ? updtTs.hashCode() : 0);
        result = 31 * result + (linkKey != null ? linkKey.hashCode() : 0);
        result = 31 * result + (ssn != null ? ssn.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleInit != null ? middleInit.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + dob;
        result = 31 * result + (sexCode != null ? sexCode.hashCode() : 0);
        result = 31 * result + dod;
        result = 31 * result + (dodProofCd != null ? dodProofCd.hashCode() : 0);
        result = 31 * result + (currHicn != null ? currHicn.hashCode() : 0);
        result = 31 * result + (updtPgmId != null ? updtPgmId.hashCode() : 0);
        result = 31 * result + (termTs != null ? termTs.hashCode() : 0);
        result = 31 * result + (termPgmId != null ? termPgmId.hashCode() : 0);
        result = 31 * result + (stusCd != null ? stusCd.hashCode() : 0);
        result = 31 * result + (mbdUpdtDt != null ? mbdUpdtDt.hashCode() : 0);
        return result;
    }
}
