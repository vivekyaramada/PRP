package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_events_stage", schema = "", catalog = "prp")
public class PrpEventsStageEntity {
    private int pkPrpEventId;
    private String evntTypeCd;
    private String evntOrgnCd;
    private Timestamp procTs;
    private String userName;
    private String planSpnsrIdent;
    private String aplctnIdent;
    private Short evntNum;
    private Date cycDt;
    private Short cycNum;
    private Short evntRfrncNum;
    private Short procRfrncNum;
    private String extrnlRfrncAplctn;
    private Short extrnlRfrncNum;
    private Short rsnCd;
    private BigDecimal transAmt;
    private BigDecimal pyblAmt;
    private BigDecimal intrmAdjstmtAmt;
    private BigDecimal unapldCashAmt;
    private BigDecimal rcvblPrncpalAmt;
    private BigDecimal rcvblIntrstAmt;
    private String evntCtgry;
    private String evntCtgryData;

    public void setPkPrpEventId(Integer pkPrpEventId) {
        this.pkPrpEventId = pkPrpEventId;
    }

    @Id
    @Column(name = "PK_PRP_EVENT_ID")
    public int getPkPrpEventId() {
        return pkPrpEventId;
    }

    public void setPkPrpEventId(int pkPrpEventId) {
        this.pkPrpEventId = pkPrpEventId;
    }

    @Basic
    @Column(name = "EVNT_TYPE_CD")
    public String getEvntTypeCd() {
        return evntTypeCd;
    }

    public void setEvntTypeCd(String evntTypeCd) {
        this.evntTypeCd = evntTypeCd;
    }

    @Basic
    @Column(name = "EVNT_ORGN_CD")
    public String getEvntOrgnCd() {
        return evntOrgnCd;
    }

    public void setEvntOrgnCd(String evntOrgnCd) {
        this.evntOrgnCd = evntOrgnCd;
    }

    @Basic
    @Column(name = "PROC_TS")
    public Timestamp getProcTs() {
        return procTs;
    }

    public void setProcTs(Timestamp procTs) {
        this.procTs = procTs;
    }

    @Basic
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "PLAN_SPNSR_IDENT")
    public String getPlanSpnsrIdent() {
        return planSpnsrIdent;
    }

    public void setPlanSpnsrIdent(String planSpnsrIdent) {
        this.planSpnsrIdent = planSpnsrIdent;
    }

    @Basic
    @Column(name = "APLCTN_IDENT")
    public String getAplctnIdent() {
        return aplctnIdent;
    }

    public void setAplctnIdent(String aplctnIdent) {
        this.aplctnIdent = aplctnIdent;
    }

    @Basic
    @Column(name = "EVNT_NUM")
    public Short getEvntNum() {
        return evntNum;
    }

    public void setEvntNum(Short evntNum) {
        this.evntNum = evntNum;
    }

    @Basic
    @Column(name = "CYC_DT")
    public Date getCycDt() {
        return cycDt;
    }

    public void setCycDt(Date cycDt) {
        this.cycDt = cycDt;
    }

    @Basic
    @Column(name = "CYC_NUM")
    public Short getCycNum() {
        return cycNum;
    }

    public void setCycNum(Short cycNum) {
        this.cycNum = cycNum;
    }

    @Basic
    @Column(name = "EVNT_RFRNC_NUM")
    public Short getEvntRfrncNum() {
        return evntRfrncNum;
    }

    public void setEvntRfrncNum(Short evntRfrncNum) {
        this.evntRfrncNum = evntRfrncNum;
    }

    @Basic
    @Column(name = "PROC_RFRNC_NUM")
    public Short getProcRfrncNum() {
        return procRfrncNum;
    }

    public void setProcRfrncNum(Short procRfrncNum) {
        this.procRfrncNum = procRfrncNum;
    }

    @Basic
    @Column(name = "EXTRNL_RFRNC_APLCTN")
    public String getExtrnlRfrncAplctn() {
        return extrnlRfrncAplctn;
    }

    public void setExtrnlRfrncAplctn(String extrnlRfrncAplctn) {
        this.extrnlRfrncAplctn = extrnlRfrncAplctn;
    }

    @Basic
    @Column(name = "EXTRNL_RFRNC_NUM")
    public Short getExtrnlRfrncNum() {
        return extrnlRfrncNum;
    }

    public void setExtrnlRfrncNum(Short extrnlRfrncNum) {
        this.extrnlRfrncNum = extrnlRfrncNum;
    }

    @Basic
    @Column(name = "RSN_CD")
    public Short getRsnCd() {
        return rsnCd;
    }

    public void setRsnCd(Short rsnCd) {
        this.rsnCd = rsnCd;
    }

    @Basic
    @Column(name = "TRANS_AMT")
    public BigDecimal getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(BigDecimal transAmt) {
        this.transAmt = transAmt;
    }

    @Basic
    @Column(name = "PYBL_AMT")
    public BigDecimal getPyblAmt() {
        return pyblAmt;
    }

    public void setPyblAmt(BigDecimal pyblAmt) {
        this.pyblAmt = pyblAmt;
    }

    @Basic
    @Column(name = "INTRM_ADJSTMT_AMT")
    public BigDecimal getIntrmAdjstmtAmt() {
        return intrmAdjstmtAmt;
    }

    public void setIntrmAdjstmtAmt(BigDecimal intrmAdjstmtAmt) {
        this.intrmAdjstmtAmt = intrmAdjstmtAmt;
    }

    @Basic
    @Column(name = "UNAPLD_CASH_AMT")
    public BigDecimal getUnapldCashAmt() {
        return unapldCashAmt;
    }

    public void setUnapldCashAmt(BigDecimal unapldCashAmt) {
        this.unapldCashAmt = unapldCashAmt;
    }

    @Basic
    @Column(name = "RCVBL_PRNCPAL_AMT")
    public BigDecimal getRcvblPrncpalAmt() {
        return rcvblPrncpalAmt;
    }

    public void setRcvblPrncpalAmt(BigDecimal rcvblPrncpalAmt) {
        this.rcvblPrncpalAmt = rcvblPrncpalAmt;
    }

    @Basic
    @Column(name = "RCVBL_INTRST_AMT")
    public BigDecimal getRcvblIntrstAmt() {
        return rcvblIntrstAmt;
    }

    public void setRcvblIntrstAmt(BigDecimal rcvblIntrstAmt) {
        this.rcvblIntrstAmt = rcvblIntrstAmt;
    }

    @Basic
    @Column(name = "EVNT_CTGRY")
    public String getEvntCtgry() {
        return evntCtgry;
    }

    public void setEvntCtgry(String evntCtgry) {
        this.evntCtgry = evntCtgry;
    }

    @Basic
    @Column(name = "EVNT_CTGRY_DATA")
    public String getEvntCtgryData() {
        return evntCtgryData;
    }

    public void setEvntCtgryData(String evntCtgryData) {
        this.evntCtgryData = evntCtgryData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpEventsStageEntity that = (PrpEventsStageEntity) o;

        if (pkPrpEventId != that.pkPrpEventId) return false;
        if (evntTypeCd != null ? !evntTypeCd.equals(that.evntTypeCd) : that.evntTypeCd != null) return false;
        if (evntOrgnCd != null ? !evntOrgnCd.equals(that.evntOrgnCd) : that.evntOrgnCd != null) return false;
        if (procTs != null ? !procTs.equals(that.procTs) : that.procTs != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (planSpnsrIdent != null ? !planSpnsrIdent.equals(that.planSpnsrIdent) : that.planSpnsrIdent != null)
            return false;
        if (aplctnIdent != null ? !aplctnIdent.equals(that.aplctnIdent) : that.aplctnIdent != null) return false;
        if (evntNum != null ? !evntNum.equals(that.evntNum) : that.evntNum != null) return false;
        if (cycDt != null ? !cycDt.equals(that.cycDt) : that.cycDt != null) return false;
        if (cycNum != null ? !cycNum.equals(that.cycNum) : that.cycNum != null) return false;
        if (evntRfrncNum != null ? !evntRfrncNum.equals(that.evntRfrncNum) : that.evntRfrncNum != null) return false;
        if (procRfrncNum != null ? !procRfrncNum.equals(that.procRfrncNum) : that.procRfrncNum != null) return false;
        if (extrnlRfrncAplctn != null ? !extrnlRfrncAplctn.equals(that.extrnlRfrncAplctn) : that.extrnlRfrncAplctn != null)
            return false;
        if (extrnlRfrncNum != null ? !extrnlRfrncNum.equals(that.extrnlRfrncNum) : that.extrnlRfrncNum != null)
            return false;
        if (rsnCd != null ? !rsnCd.equals(that.rsnCd) : that.rsnCd != null) return false;
        if (transAmt != null ? !transAmt.equals(that.transAmt) : that.transAmt != null) return false;
        if (pyblAmt != null ? !pyblAmt.equals(that.pyblAmt) : that.pyblAmt != null) return false;
        if (intrmAdjstmtAmt != null ? !intrmAdjstmtAmt.equals(that.intrmAdjstmtAmt) : that.intrmAdjstmtAmt != null)
            return false;
        if (unapldCashAmt != null ? !unapldCashAmt.equals(that.unapldCashAmt) : that.unapldCashAmt != null)
            return false;
        if (rcvblPrncpalAmt != null ? !rcvblPrncpalAmt.equals(that.rcvblPrncpalAmt) : that.rcvblPrncpalAmt != null)
            return false;
        if (rcvblIntrstAmt != null ? !rcvblIntrstAmt.equals(that.rcvblIntrstAmt) : that.rcvblIntrstAmt != null)
            return false;
        if (evntCtgry != null ? !evntCtgry.equals(that.evntCtgry) : that.evntCtgry != null) return false;
        if (evntCtgryData != null ? !evntCtgryData.equals(that.evntCtgryData) : that.evntCtgryData != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkPrpEventId;
        result = 31 * result + (evntTypeCd != null ? evntTypeCd.hashCode() : 0);
        result = 31 * result + (evntOrgnCd != null ? evntOrgnCd.hashCode() : 0);
        result = 31 * result + (procTs != null ? procTs.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (planSpnsrIdent != null ? planSpnsrIdent.hashCode() : 0);
        result = 31 * result + (aplctnIdent != null ? aplctnIdent.hashCode() : 0);
        result = 31 * result + (evntNum != null ? evntNum.hashCode() : 0);
        result = 31 * result + (cycDt != null ? cycDt.hashCode() : 0);
        result = 31 * result + (cycNum != null ? cycNum.hashCode() : 0);
        result = 31 * result + (evntRfrncNum != null ? evntRfrncNum.hashCode() : 0);
        result = 31 * result + (procRfrncNum != null ? procRfrncNum.hashCode() : 0);
        result = 31 * result + (extrnlRfrncAplctn != null ? extrnlRfrncAplctn.hashCode() : 0);
        result = 31 * result + (extrnlRfrncNum != null ? extrnlRfrncNum.hashCode() : 0);
        result = 31 * result + (rsnCd != null ? rsnCd.hashCode() : 0);
        result = 31 * result + (transAmt != null ? transAmt.hashCode() : 0);
        result = 31 * result + (pyblAmt != null ? pyblAmt.hashCode() : 0);
        result = 31 * result + (intrmAdjstmtAmt != null ? intrmAdjstmtAmt.hashCode() : 0);
        result = 31 * result + (unapldCashAmt != null ? unapldCashAmt.hashCode() : 0);
        result = 31 * result + (rcvblPrncpalAmt != null ? rcvblPrncpalAmt.hashCode() : 0);
        result = 31 * result + (rcvblIntrstAmt != null ? rcvblIntrstAmt.hashCode() : 0);
        result = 31 * result + (evntCtgry != null ? evntCtgry.hashCode() : 0);
        result = 31 * result + (evntCtgryData != null ? evntCtgryData.hashCode() : 0);
        return result;
    }
}
