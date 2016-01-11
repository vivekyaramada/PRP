package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import gov.hhs.cms.prp.entity.PrpEventFinalEntity;

/**
 * Created by grussell99 on 11/24/2015.
 */

@MappedSuperclass
// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class PrpEventEntity {

    // -------- persisted fields --------
    private int        pkPrpEventId;
    private String     evntTypeCd;
    private String     evntOrgnCd;
    private Timestamp  procTs;
    private String     userName;
    private Integer    planSpnsrIdent;
    private Integer    aplctnIdent;
    private Short      evntNum;
    private Date       cycDt;
    private Short      cycNum;
    private Short      evntRfrncNum;
    private Short      procRfrncNum;
    private Integer    extrnlRfrncAplctn;
    private Short      extrnlRfrncNum;
    private Short      rsnCd;
    private BigDecimal transAmt;
    private BigDecimal pyblAmt;
    private BigDecimal intrmAdjstmtAmt;
    private BigDecimal unapldCashAmt;
    private BigDecimal rcvblPrncpalAmt;
    private BigDecimal rcvblIntrstAmt;
    private String     evntCtgry;
    private String     evntCtgryData;

    // -------- category data component fields --------

    private String     achPaymentAmount;
    private String     achRoutingNumber;
    private String     achAccountNumber;
    private String     achAccountType;
    private String     achTracerNumber;
    private String     bnkRoutingNumber;
    private String     bnkAccountNumber;
    private String     bnkAccountType;
    private String     bnkBusinessName;
    private String     bnkBankName;
    private String     bnkAddress1;
    private String     bnkAddress2;
    private String     bnkCity;
    private String     bnkState;
    private String     bnkZip;
    private String     bnkPhone;
    private String     bnkContact;
    private String     chkCheckType;
    private String     chkCheckDate;
    private String     chkCheckNumber;
    private String     chkPayerName;
    private String     chkReason;
    private String     chkDepositDate;
    private String     chkNote;
    private String     cmtComment;
    private String     cycCycleNumber;
    private String     detPaymentAmt;
    private String     detReduceAmt;
    private String     reqRequester;
    private String     reqRefNumber;
    private String     reqRequestDate;

    // ------------------------------------------------

    @Id
    @javax.persistence.Column(name = "PK_PRP_EVENT_ID")
    public int getPkPrpEventId() {
        return pkPrpEventId;
    }
    public void setPkPrpEventId(int pkPrpEventId) {
        this.pkPrpEventId = pkPrpEventId;
    }

    @Basic
    @javax.persistence.Column(name = "EVNT_TYPE_CD")
    public String getEvntTypeCd() {
        return evntTypeCd;
    }
    public void setEvntTypeCd(String xevntTypeCd) {
        this.evntTypeCd = xevntTypeCd;
    }

    @Basic
    @javax.persistence.Column(name = "EVNT_ORGN_CD")
    public String getEvntOrgnCd() {
        return evntOrgnCd;
    }
    public void setEvntOrgnCd(String evntOrgnCd) {
        this.evntOrgnCd = evntOrgnCd;
    }

    @Basic
    @javax.persistence.Column(name = "PROC_TS")
    public Timestamp getProcTs() {
        return procTs;
    }
    public void setProcTs(Timestamp procTs) {
        this.procTs = procTs;
    }

    @Basic
    @javax.persistence.Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @javax.persistence.Column(name = "PLAN_SPNSR_IDENT")
    public Integer getPlanSpnsrIdent() {
        return planSpnsrIdent;
    }
    public void setPlanSpnsrIdent(Integer planSpnsrIdent) {
        this.planSpnsrIdent = planSpnsrIdent;
    }

    @Basic
    @javax.persistence.Column(name = "APLCTN_IDENT")
    public Integer getAplctnIdent() {
        return aplctnIdent;
    }
    public void setAplctnIdent(Integer aplctnIdent) {
        this.aplctnIdent = aplctnIdent;
    }

    @Basic
    @javax.persistence.Column(name = "EVNT_NUM")
    public Short getEvntNum() {
        return evntNum;
    }
    public void setEvntNum(Short evntNum) {
        this.evntNum = evntNum;
    }

    @Basic
    @javax.persistence.Column(name = "CYC_DT")
    public Date getCycDt() {
        return cycDt;
    }
    public void setCycDt(Date cycDt) {
        this.cycDt = cycDt;
    }

    @Basic
    @javax.persistence.Column(name = "CYC_NUM")
    public Short getCycNum() {
        return cycNum;
    }
    public void setCycNum(Short cycNum) {
        this.cycNum = cycNum;
    }

    @Basic
    @javax.persistence.Column(name = "EVNT_RFRNC_NUM")
    public Short getEvntRfrncNum() {
        return evntRfrncNum;
    }
    public void setEvntRfrncNum(Short evntRfrncNum) {
        this.evntRfrncNum = evntRfrncNum;
    }

    @Basic
    @javax.persistence.Column(name = "PROC_RFRNC_NUM")
    public Short getProcRfrncNum() {
        return procRfrncNum;
    }
    public void setProcRfrncNum(Short procRfrncNum) {
        this.procRfrncNum = procRfrncNum;
    }

    @Basic
    @javax.persistence.Column(name = "EXTRNL_RFRNC_APLCTN")
    public Integer getExtrnlRfrncAplctn() {
        return extrnlRfrncAplctn;
    }
    public void setExtrnlRfrncAplctn(Integer extrnlRfrncAplctn) {
        this.extrnlRfrncAplctn = extrnlRfrncAplctn;
    }

    @Basic
    @javax.persistence.Column(name = "EXTRNL_RFRNC_NUM")
    public Short getExtrnlRfrncNum() {
        return extrnlRfrncNum;
    }
    public void setExtrnlRfrncNum(Short extrnlRfrncNum) {
        this.extrnlRfrncNum = extrnlRfrncNum;
    }

    @Basic
    @javax.persistence.Column(name = "RSN_CD")
    public Short getRsnCd() {
        return rsnCd;
    }
    public void setRsnCd(Short rsnCd) {
        this.rsnCd = rsnCd;
    }

    @Basic
    @javax.persistence.Column(name = "TRANS_AMT")
    public BigDecimal getTransAmt() {
        return transAmt;
    }
    public void setTransAmt(BigDecimal transAmt) {
        this.transAmt = transAmt;
    }

    @Basic
    @javax.persistence.Column(name = "PYBL_AMT")
    public BigDecimal getPyblAmt() {
        return pyblAmt;
    }
    public void setPyblAmt(BigDecimal pyblAmt) {
        this.pyblAmt = pyblAmt;
    }

    @Basic
    @javax.persistence.Column(name = "INTRM_ADJSTMT_AMT")
    public BigDecimal getIntrmAdjstmtAmt() {
        return intrmAdjstmtAmt;
    }
    public void setIntrmAdjstmtAmt(BigDecimal intrmAdjstmtAmt) {
        this.intrmAdjstmtAmt = intrmAdjstmtAmt;
    }

    @Basic
    @javax.persistence.Column(name = "UNAPLD_CASH_AMT")
    public BigDecimal getUnapldCashAmt() {
        return unapldCashAmt;
    }
    public void setUnapldCashAmt(BigDecimal unapldCashAmt) {
        this.unapldCashAmt = unapldCashAmt;
    }

    @Basic
    @javax.persistence.Column(name = "RCVBL_PRNCPAL_AMT")
    public BigDecimal getRcvblPrncpalAmt() {
        return rcvblPrncpalAmt;
    }
    public void setRcvblPrncpalAmt(BigDecimal rcvblPrncpalAmt) {
        this.rcvblPrncpalAmt = rcvblPrncpalAmt;
    }

    @Basic
    @javax.persistence.Column(name = "RCVBL_INTRST_AMT")
    public BigDecimal getRcvblIntrstAmt() {
        return rcvblIntrstAmt;
    }
    public void setRcvblIntrstAmt(BigDecimal rcvblIntrstAmt) {
        this.rcvblIntrstAmt = rcvblIntrstAmt;
    }

    @Basic
    @javax.persistence.Column(name = "EVNT_CTGRY")
    public String getEvntCtgry() {
        return evntCtgry;
    }
    public void setEvntCtgry(String evntCtgry) {
        this.evntCtgry = evntCtgry;
    }

    @Basic
    @javax.persistence.Column(name = "EVNT_CTGRY_DATA")
    public String getEvntCtgryData() {
        buildCategoryDataField();
        return evntCtgryData;
    }
    public void setEvntCtgryData(String evntCtgryData) {
        this.evntCtgryData = evntCtgryData;
        buildCategoryDataComponents();
    }

    // -------- build event category data field from components --------


    private void buildCategoryDataField() {
        if ((evntCtgry == null) || (evntCtgry.equalsIgnoreCase("nxd"))) {
            evntCtgryData = "";
            return;
        }
        CsvUtility csvUtility = new CsvUtility();
        if      (evntCtgry.equalsIgnoreCase("ach")) {
            evntCtgryData = csvUtility.buildCsvString(achPaymentAmount, achRoutingNumber, achAccountNumber,
                    achAccountType,   achTracerNumber);
        }
        else if (evntCtgry.equalsIgnoreCase("bnk")) {
            evntCtgryData = csvUtility.buildCsvString(bnkRoutingNumber, bnkAccountNumber, bnkAccountType,
                    bnkBusinessName,  bnkBankName,      bnkAddress1,
                    bnkAddress2,      bnkCity,          bnkState,
                    bnkZip,           bnkPhone,         bnkContact);
        }
        else if (evntCtgry.equalsIgnoreCase("chk")) {
            evntCtgryData = csvUtility.buildCsvString(chkCheckType,   chkCheckDate, chkCheckNumber,
                    chkPayerName,   chkReason,    chkDepositDate,
                    chkNote);
        }
        else if (evntCtgry.equalsIgnoreCase("cmt")) {
            evntCtgryData = csvUtility.buildCsvString(cmtComment);
        }
        else if (evntCtgry.equalsIgnoreCase("cyc")) {
            evntCtgryData = csvUtility.buildCsvString(cycCycleNumber);
        }
        else if (evntCtgry.equalsIgnoreCase("det")) {
            evntCtgryData = csvUtility.buildCsvString(detPaymentAmt, detReduceAmt);
        }
        else if (evntCtgry.equalsIgnoreCase("req")) {
            evntCtgryData = csvUtility.buildCsvString(reqRequester, reqRefNumber, reqRequestDate);
        }
        else {
            evntCtgryData = "";
        }
    }

    // -------- build components from event category data field --------

    private void buildCategoryDataComponents() {
        if (evntCtgry == null)                 return;
        if (evntCtgry.equalsIgnoreCase("nxd")) return;

        CsvUtility csvUtility = new CsvUtility();
        if      (evntCtgry.equalsIgnoreCase("ach")) {
            ArrayList<String> csv = csvUtility.parseCsvString(evntCtgryData, 5);
            achPaymentAmount  = csv.get(0);
            achRoutingNumber  = csv.get(1);
            achAccountNumber  = csv.get(2);
            achAccountType    = csv.get(3);
            achTracerNumber   = csv.get(4);
        }
        else if (evntCtgry.equalsIgnoreCase("bnk")) {
            ArrayList<String> csv = csvUtility.parseCsvString(evntCtgryData, 12);
            bnkRoutingNumber  = csv.get(0);
            bnkAccountNumber  = csv.get(1);
            bnkAccountType    = csv.get(2);
            bnkBusinessName   = csv.get(3);
            bnkBankName       = csv.get(4);
            bnkAddress1       = csv.get(5);
            bnkAddress2       = csv.get(6);
            bnkCity           = csv.get(7);
            bnkState          = csv.get(8);
            bnkZip            = csv.get(9);
            bnkPhone          = csv.get(10);
            bnkContact        = csv.get(11);
        }
        else if (evntCtgry.equalsIgnoreCase("chk")) {
            ArrayList<String> csv = csvUtility.parseCsvString(evntCtgryData, 8);
            chkCheckType      = csv.get(0);
            chkCheckDate      = csv.get(1);
            chkCheckNumber    = csv.get(2);
            chkPayerName      = csv.get(3);
            chkReason         = csv.get(4);
            chkDepositDate    = csv.get(5);
            chkNote           = csv.get(6);
        }
        else if (evntCtgry.equalsIgnoreCase("cmt")) {
            ArrayList<String> csv = csvUtility.parseCsvString(evntCtgryData, 1);
            cmtComment        = csv.get(0);
        }
        else if (evntCtgry.equalsIgnoreCase("cyc")) {
            ArrayList<String> csv = csvUtility.parseCsvString(evntCtgryData, 1);
            cycCycleNumber    = csv.get(0);
        }
        else if (evntCtgry.equalsIgnoreCase("det")) {
            ArrayList<String> csv = csvUtility.parseCsvString(evntCtgryData, 2);
            detPaymentAmt     = csv.get(0);
            detReduceAmt      = csv.get(1);
        }
        else if (evntCtgry.equalsIgnoreCase("req")) {
            ArrayList<String> csv = csvUtility.parseCsvString(evntCtgryData, 3);
            reqRequester      = csv.get(0);
            reqRefNumber      = csv.get(1);
            reqRequestDate    = csv.get(2);
        }
    }


    // -------- get/set methods for category component fields --------

    @Transient
    public BigDecimal getAchPaymentAmount()                        { return getBigDecimal(achPaymentAmount); }
    public void   setAchPaymentAmount(BigDecimal achPaymentAmount) { this.achPaymentAmount = setBigDecimal(achPaymentAmount); }

    @Transient
    public String getAchRoutingNumber()                        { return achRoutingNumber; }
    public void   setAchRoutingNumber(String achRoutingNumber) { this.achRoutingNumber    = achRoutingNumber; }

    @Transient
    public String getAchAccountNumber()                        { return achAccountNumber; }
    public void   setAchAccountNumber(String achAccountNumber) { this.achAccountNumber    = achAccountNumber; }

    @Transient
    public String getAchAccountType  ()                        { return achAccountType; }
    public void   setAchAccountType  (String achAccountType)   { this.achAccountType    = achAccountType; }

    @Transient
    public String getAchTracerNumber ()                        { return achTracerNumber; }
    public void   setAchTracerNumber (String achTracerNumber)  { this.achTracerNumber    = achTracerNumber; }

    @Transient
    public String getBnkRoutingNumber()                        { return bnkRoutingNumber; }
    public void   setBnkRoutingNumber(String bnkRoutingNumber) { this.bnkRoutingNumber    = bnkRoutingNumber; }

    @Transient
    public String getBnkAccountNumber()                        { return bnkAccountNumber; }
    public void   setBnkAccountNumber(String bnkAccountNumber) { this.bnkAccountNumber    = bnkAccountNumber; }

    @Transient
    public String getBnkAccountType  ()                        { return bnkAccountType; }
    public void   setBnkAccountType  (String bnkAccountType)   { this.bnkAccountType    = bnkAccountType; }

    @Transient
    public String getBnkBusinessName ()                        { return bnkBusinessName; }
    public void   setBnkBusinessName (String bnkBusinessName)  { this.bnkBusinessName   = bnkBusinessName; }

    @Transient
    public String getBnkBankName     ()                        { return bnkBankName; }
    public void   setBnkBankName     (String bnkBankName)      { this.bnkBankName    = bnkBankName; }

    @Transient
    public String getBnkAddress1     ()                        { return bnkAddress1; }
    public void   setBnkAddress1     (String bnkAddress1)      { this.bnkAddress1    = bnkAddress1; }

    @Transient
    public String getBnkAddress2     ()                        { return bnkAddress2; }
    public void   setBnkAddress2     (String bnkAddress2)      { this.bnkAddress2    = bnkAddress2; }

    @Transient
    public String getBnkCity         ()                        { return bnkCity; }
    public void   setBnkCity         (String bnkCity)          { this.bnkCity    = bnkCity; }

    @Transient
    public String getBnkState        ()                        { return bnkState; }
    public void   setBnkState        (String bnkState)         { this.bnkState    = bnkState; }

    @Transient
    public String getBnkZip          ()                        { return bnkZip; }
    public void   setBnkZip          (String bnkZip)           { this.bnkZip    = bnkZip; }

    @Transient
    public String getBnkPhone        ()                        { return bnkPhone; }
    public void   setBnkPhone        (String bnkPhone)         { this.bnkPhone    = bnkPhone; }

    @Transient
    public String getBnkContact      ()                        { return bnkContact; }
    public void   setBnkContact      (String bnkContact)       { this.bnkContact    = bnkContact; }

    @Transient
    public String getChkCheckType    ()                        { return chkCheckType; }
    public void   setChkCheckType    (String chkCheckType)     { this.chkCheckType    = chkCheckType; }

    @Transient
    public Date   getChkCheckDate    ()                        { return getDate(chkCheckDate); }
    public void   setChkCheckDate    (Date chkCheckDate)       { this.chkCheckDate  = setDate(chkCheckDate); }

    @Transient
    public String getChkCheckNumber  ()                        { return chkCheckNumber; }
    public void   setChkCheckNumber  (String chkCheckNumber)   { this.chkCheckNumber    = chkCheckNumber; }

    @Transient
    public String getChkPayerName    ()                        { return chkPayerName; }
    public void   setChkPayerName    (String chkPayerName)     { this.chkPayerName    = chkPayerName; }

    @Transient
    public String getChkReason       ()                        { return chkReason; }
    public void   setChkReason       (String chkReason)        { this.chkReason    = chkReason; }

    @Transient
    public Date   getChkDepositDate  ()                        { return getDate(chkDepositDate); }
    public void   setChkDepositDate  (Date chkDepositDate)     { this.chkDepositDate  = setDate(chkDepositDate); }

    @Transient
    public String getChkNote         ()                        { return chkNote; }
    public void   setChkNote         (String chkNote)          { this.chkNote    = chkNote; }

    @Transient
    public String getCmtComment      ()                        { return cmtComment; }
    public void   setCmtComment      (String cmtComment)       { this.cmtComment    = cmtComment; }

    @Transient
    public int    getCycCycleNumber  ()                        { return getInteger(cycCycleNumber); }
    public void   setCycCycleNumber  (int cycCycleNumber)      { this.cycCycleNumber    = setInteger(cycCycleNumber); }

    @Transient
    public BigDecimal getDetPaymentAmt   ()                     { return getBigDecimal(detPaymentAmt); }
    public void   setDetPaymentAmt   (BigDecimal detPaymentAmt) { this.detPaymentAmt  = setBigDecimal(detPaymentAmt); }

    @Transient
    public BigDecimal getDetReduceAmt    ()                    { return getBigDecimal(detReduceAmt); }
    public void   setDetReduceAmt    (BigDecimal detReduceAmt) { this.detReduceAmt   = setBigDecimal(detReduceAmt); }

    @Transient
    public String getReqRequester    ()                        { return reqRequester; }
    public void   setReqRequester    (String reqRequester)     { this.reqRequester   = reqRequester; }

    @Transient
    public String getReqRefNumber    ()                        { return reqRefNumber; }
    public void   setReqRefNumber    (String reqRefNumber)     { this.reqRefNumber   = reqRefNumber; }

    @Transient
    public Date  getReqRequestDate  ()                         { return getDate(reqRequestDate); }
    public void   setReqRequestDate  (Date reqRequestDate)     { this.reqRequestDate = setDate(reqRequestDate); }

    // -------- get/set access format methods --------

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
            Date date = format.parse(data);
            return date;
        }
        catch (ParseException e) {
            return null;
        }
    }

    protected String        setDate       (Date data) {
        if (data == null) return "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String dateString = sdf.format(data);
        return dateString;
    }

    protected BigDecimal getBigDecimal (String data) {
        if (data == null || data.equals("")) return BigDecimal.ZERO;
        try {
            return new BigDecimal(data);
        }
        catch (NumberFormatException e) {
            return BigDecimal.ZERO;
        }
    }

    protected String        setBigDecimal (BigDecimal data) {
        if (data == null) return "0.00";
        String amountString = data.toString();
        return amountString;
    }

    // -------- copy entity from another entity -------------

    protected void copyFrom (PrpEventFinalEntity source) {
        setPkPrpEventId      (source.getPkPrpEventId());
        setEvntTypeCd        (source.getEvntTypeCd());
        setEvntOrgnCd        (source.getEvntOrgnCd());
        setProcTs            (source.getProcTs());
        setUserName          (source.getUserName());
        setPlanSpnsrIdent    (source.getPlanSpnsrIdent());
        setAplctnIdent       (source.getAplctnIdent());
        setEvntNum           (source.getEvntNum());
        setCycDt             (source.getCycDt());
        setCycNum            (source.getCycNum());
        setEvntRfrncNum      (source.getEvntRfrncNum());
        setProcRfrncNum      (source.getProcRfrncNum());
        setExtrnlRfrncAplctn (source.getExtrnlRfrncAplctn());
        setExtrnlRfrncNum    (source.getExtrnlRfrncNum());
        setRsnCd             (source.getRsnCd());
        setTransAmt          (source.getTransAmt());
        setPyblAmt           (source.getPyblAmt());
        setIntrmAdjstmtAmt   (source.getIntrmAdjstmtAmt());
        setUnapldCashAmt     (source.getUnapldCashAmt());
        setRcvblPrncpalAmt   (source.getRcvblPrncpalAmt());
        setRcvblIntrstAmt    (source.getRcvblIntrstAmt());
        setEvntCtgry         (source.getEvntCtgry());
        setEvntCtgryData     (source.getEvntCtgryData());
    }

    // --------------------------------------------------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpEventEntity that = (PrpEventEntity) o;

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
