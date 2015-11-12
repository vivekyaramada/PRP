package gov.hhs.cms.prp.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.logging.Logger;

/**
 * Created by grussell99 on 10/23/2015.
 */
@Entity
@javax.persistence.Table(name = "prp_evnt_final", schema = "", catalog = "prp")
public class PrpEvntFinalEntity {

    // private final static Logger LOGGER                = Logger.getLogger(PrpEvntFinalEntity.class.getName());
    private int pkPrpEventId;

    @Id
    @javax.persistence.Column(name = "PK_PRP_EVENT_ID")
    public int getPkPrpEventId() {
        return pkPrpEventId;
    }

    public void setPkPrpEventId(int pkPrpEventId) {
        this.pkPrpEventId = pkPrpEventId;
    }

    private String evntTypeCd;

    @Basic
    @javax.persistence.Column(name = "EVNT_TYPE_CD")
    public String getEvntTypeCd() {
        return evntTypeCd;
    }

    public void setEvntTypeCd(String xevntTypeCd) {
        this.evntTypeCd = xevntTypeCd;
    }

    private String evntOrgnCd;

    @Basic
    @javax.persistence.Column(name = "EVNT_ORGN_CD")
    public String getEvntOrgnCd() {
        return evntOrgnCd;
    }

    public void setEvntOrgnCd(String evntOrgnCd) {
        this.evntOrgnCd = evntOrgnCd;
    }

    private Timestamp procTs;

    @Basic
    @javax.persistence.Column(name = "PROC_TS")
    public Timestamp getProcTs() {
        return procTs;
    }

    public void setProcTs(Timestamp procTs) {
        this.procTs = procTs;
    }

    private String userName;

    @Basic
    @javax.persistence.Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private Integer planSpnsrIdent;

    @Basic
    @javax.persistence.Column(name = "PLAN_SPNSR_IDENT")
    public Integer getPlanSpnsrIdent() {
        return planSpnsrIdent;
    }

    public void setPlanSpnsrIdent(Integer planSpnsrIdent) {
        this.planSpnsrIdent = planSpnsrIdent;
    }

    private Integer aplctnIdent;

    @Basic
    @javax.persistence.Column(name = "APLCTN_IDENT")
    public Integer getAplctnIdent() {
        return aplctnIdent;
    }

    public void setAplctnIdent(Integer aplctnIdent) {
        this.aplctnIdent = aplctnIdent;
    }

    private Short evntNum;

    @Basic
    @javax.persistence.Column(name = "EVNT_NUM")
    public Short getEvntNum() {
        return evntNum;
    }

    public void setEvntNum(Short evntNum) {
        this.evntNum = evntNum;
    }

    private Date cycDt;

    @Basic
    @javax.persistence.Column(name = "CYC_DT")
    public Date getCycDt() {
        return cycDt;
    }

    public void setCycDt(Date cycDt) {
        this.cycDt = cycDt;
    }

    private Short cycNum;

    @Basic
    @javax.persistence.Column(name = "CYC_NUM")
    public Short getCycNum() {
        return cycNum;
    }

    public void setCycNum(Short cycNum) {
        this.cycNum = cycNum;
    }

    private Short evntRfrncNum;

    @Basic
    @javax.persistence.Column(name = "EVNT_RFRNC_NUM")
    public Short getEvntRfrncNum() {
        return evntRfrncNum;
    }

    public void setEvntRfrncNum(Short evntRfrncNum) {
        this.evntRfrncNum = evntRfrncNum;
    }

    private Short procRfrncNum;

    @Basic
    @javax.persistence.Column(name = "PROC_RFRNC_NUM")
    public Short getProcRfrncNum() {
        return procRfrncNum;
    }

    public void setProcRfrncNum(Short procRfrncNum) {
        this.procRfrncNum = procRfrncNum;
    }

    private Integer extrnlRfrncAplctn;

    @Basic
    @javax.persistence.Column(name = "EXTRNL_RFRNC_APLCTN")
    public Integer getExtrnlRfrncAplctn() {
        return extrnlRfrncAplctn;
    }

    public void setExtrnlRfrncAplctn(Integer extrnlRfrncAplctn) {
        this.extrnlRfrncAplctn = extrnlRfrncAplctn;
    }

    private Short extrnlRfrncNum;

    @Basic
    @javax.persistence.Column(name = "EXTRNL_RFRNC_NUM")
    public Short getExtrnlRfrncNum() {
        return extrnlRfrncNum;
    }

    public void setExtrnlRfrncNum(Short extrnlRfrncNum) {
        this.extrnlRfrncNum = extrnlRfrncNum;
    }

    private Short rsnCd;

    @Basic
    @javax.persistence.Column(name = "RSN_CD")
    public Short getRsnCd() {
        return rsnCd;
    }

    public void setRsnCd(Short rsnCd) {
        this.rsnCd = rsnCd;
    }

    private BigDecimal transAmt;

    @Basic
    @javax.persistence.Column(name = "TRANS_AMT")
    public BigDecimal getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(BigDecimal transAmt) {
        this.transAmt = transAmt;
    }

    private BigDecimal pyblAmt;

    @Basic
    @javax.persistence.Column(name = "PYBL_AMT")
    public BigDecimal getPyblAmt() {
        return pyblAmt;
    }

    public void setPyblAmt(BigDecimal pyblAmt) {
        this.pyblAmt = pyblAmt;
    }

    private BigDecimal intrmAdjstmtAmt;

    @Basic
    @javax.persistence.Column(name = "INTRM_ADJSTMT_AMT")
    public BigDecimal getIntrmAdjstmtAmt() {
        return intrmAdjstmtAmt;
    }

    public void setIntrmAdjstmtAmt(BigDecimal intrmAdjstmtAmt) {
        this.intrmAdjstmtAmt = intrmAdjstmtAmt;
    }

    private BigDecimal unapldCashAmt;

    @Basic
    @javax.persistence.Column(name = "UNAPLD_CASH_AMT")
    public BigDecimal getUnapldCashAmt() {
        return unapldCashAmt;
    }

    public void setUnapldCashAmt(BigDecimal unapldCashAmt) {
        this.unapldCashAmt = unapldCashAmt;
    }

    private BigDecimal rcvblPrncpalAmt;

    @Basic
    @javax.persistence.Column(name = "RCVBL_PRNCPAL_AMT")
    public BigDecimal getRcvblPrncpalAmt() {
        return rcvblPrncpalAmt;
    }

    public void setRcvblPrncpalAmt(BigDecimal rcvblPrncpalAmt) {
        this.rcvblPrncpalAmt = rcvblPrncpalAmt;
    }

    private BigDecimal rcvblIntrstAmt;

    @Basic
    @javax.persistence.Column(name = "RCVBL_INTRST_AMT")
    public BigDecimal getRcvblIntrstAmt() {
        return rcvblIntrstAmt;
    }

    public void setRcvblIntrstAmt(BigDecimal rcvblIntrstAmt) {
        this.rcvblIntrstAmt = rcvblIntrstAmt;
    }

    private String evntCtgry;

    @Basic
    @javax.persistence.Column(name = "EVNT_CTGRY")
    public String getEvntCtgry() {
        return evntCtgry;
    }

    public void setEvntCtgry(String evntCtgry) {
        this.evntCtgry = evntCtgry;
    }

    protected String evntCtgryData;

    @Basic
    @javax.persistence.Column(name = "EVNT_CTGRY_DATA")

    public String getEvntCtgryData() {
        return evntCtgryData;
    }

    public void setEvntCtgryData(String evntCtgryData) {
        this.evntCtgryData = evntCtgryData;
     }

    public void copyFrom (PrpEvntFinalEntity source) {  // protected did not allow use in MysqlApplicationServiceDAO
        pkPrpEventId      = source.getPkPrpEventId();
        evntTypeCd        = source.getEvntTypeCd();
        evntOrgnCd        = source.getEvntOrgnCd();
        procTs            = source.getProcTs();
        userName          = source.getUserName();
        planSpnsrIdent    = source.getPlanSpnsrIdent();
        aplctnIdent       = source.getAplctnIdent();
        evntNum           = source.getEvntNum();
        cycDt             = source.getCycDt();
        cycNum            = source.getCycNum();
        evntRfrncNum      = source.getEvntRfrncNum();
        procRfrncNum      = source.getProcRfrncNum();
        extrnlRfrncAplctn = source.getExtrnlRfrncAplctn();
        extrnlRfrncNum    = source.getExtrnlRfrncNum();
        rsnCd             = source.getRsnCd();
        transAmt          = source.getTransAmt();
        pyblAmt           = source.getPyblAmt();
        intrmAdjstmtAmt   = source.getIntrmAdjstmtAmt();
        unapldCashAmt     = source.getUnapldCashAmt();
        rcvblPrncpalAmt   = source.getRcvblPrncpalAmt();
        rcvblIntrstAmt    = source.getRcvblIntrstAmt();
        evntCtgry         = source.getEvntCtgry();
    }

    // -----------------------------------------------------------------------------------


    protected int           getInteger    (String data) {
        return Integer.getInteger(data, 0);
    }

    protected String        setInteger    (int    data) {
        return Integer.toString(data);
    }

    protected Date          getDate       (String data) {
        if (data == null || data.equals("") || data.length() != 8) return null;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        try {
            java.util.Date temp = format.parse(data);
            java.sql.Date  date = new Date(temp.getTime());
            return date;
        }
        catch (ParseException e) {
            return null;
        }
    }

    protected String        setDate       (Date data) {
        if (data == null) return "";
        return "";
    }

    protected BigDecimal    getBigDecimal (String data) {
        if (data == null || data.equals("")) return BigDecimal.ZERO;;
        try {
            return new BigDecimal(data);
        }
        catch (NumberFormatException e) {
            return BigDecimal.ZERO;
        }
    }

    protected String        setBigDecimal (BigDecimal data) {
        if (data == null) return "";
        return "";
    }

    // -----------------------------------------------------------------------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpEvntFinalEntity that = (PrpEvntFinalEntity) o;

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
