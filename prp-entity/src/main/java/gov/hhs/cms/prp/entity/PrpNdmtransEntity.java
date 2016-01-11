package gov.hhs.cms.prp.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@javax.persistence.Table(name = "prp_ndmtrans", schema = "", catalog = "prp")
public class PrpNdmtransEntity {
    private String originId;

    @Id
    @javax.persistence.Column(name = "ORIGIN_ID")
    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    private String tranType;

    @Id
    @javax.persistence.Column(name = "TRAN_TYPE")
    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    private String acctId;

    @Basic
    @javax.persistence.Column(name = "ACCT_ID")
    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    private String nodeId;

    @Basic
    @javax.persistence.Column(name = "NODE_ID")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    private String ndmApplId;

    @Basic
    @javax.persistence.Column(name = "NDM_APPL_ID")
    public String getNdmApplId() {
        return ndmApplId;
    }

    public void setNdmApplId(String ndmApplId) {
        this.ndmApplId = ndmApplId;
    }

    private String netId;

    @Basic
    @javax.persistence.Column(name = "NET_ID")
    public String getNetId() {
        return netId;
    }

    public void setNetId(String netId) {
        this.netId = netId;
    }

    private String ipAddress;

    @Basic
    @javax.persistence.Column(name = "IP_ADDRESS")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    private String capsInd;

    @Basic
    @javax.persistence.Column(name = "CAPS_IND")
    public String getCapsInd() {
        return capsInd;
    }

    public void setCapsInd(String capsInd) {
        this.capsInd = capsInd;
    }

    private String processName;

    @Basic
    @javax.persistence.Column(name = "PROCESS_NAME")
    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    private String useridPasswd;

    @Basic
    @javax.persistence.Column(name = "USERID_PASSWD")
    public String getUseridPasswd() {
        return useridPasswd;
    }

    public void setUseridPasswd(String useridPasswd) {
        this.useridPasswd = useridPasswd;
    }

    private String newname;

    @Basic
    @javax.persistence.Column(name = "NEWNAME")
    public String getNewname() {
        return newname;
    }

    public void setNewname(String newname) {
        this.newname = newname;
    }

    private String frm1Symbolic;

    @Basic
    @javax.persistence.Column(name = "FRM1_SYMBOLIC")
    public String getFrm1Symbolic() {
        return frm1Symbolic;
    }

    public void setFrm1Symbolic(String frm1Symbolic) {
        this.frm1Symbolic = frm1Symbolic;
    }

    private String to1Symbolic;

    @Basic
    @javax.persistence.Column(name = "TO1_SYMBOLIC")
    public String getTo1Symbolic() {
        return to1Symbolic;
    }

    public void setTo1Symbolic(String to1Symbolic) {
        this.to1Symbolic = to1Symbolic;
    }

    private String testFile1;

    @Basic
    @javax.persistence.Column(name = "TEST_FILE1")
    public String getTestFile1() {
        return testFile1;
    }

    public void setTestFile1(String testFile1) {
        this.testFile1 = testFile1;
    }

    private String prodFile1;

    @Basic
    @javax.persistence.Column(name = "PROD_FILE1")
    public String getProdFile1() {
        return prodFile1;
    }

    public void setProdFile1(String prodFile1) {
        this.prodFile1 = prodFile1;
    }

    private String trigSymbolic;

    @Basic
    @javax.persistence.Column(name = "TRIG_SYMBOLIC")
    public String getTrigSymbolic() {
        return trigSymbolic;
    }

    public void setTrigSymbolic(String trigSymbolic) {
        this.trigSymbolic = trigSymbolic;
    }

    private String testTrigger;

    @Basic
    @javax.persistence.Column(name = "TEST_TRIGGER")
    public String getTestTrigger() {
        return testTrigger;
    }

    public void setTestTrigger(String testTrigger) {
        this.testTrigger = testTrigger;
    }

    private String prodTrigger;

    @Basic
    @javax.persistence.Column(name = "PROD_TRIGGER")
    public String getProdTrigger() {
        return prodTrigger;
    }

    public void setProdTrigger(String prodTrigger) {
        this.prodTrigger = prodTrigger;
    }

    private String frm2Symbolic;

    @Basic
    @javax.persistence.Column(name = "FRM2_SYMBOLIC")
    public String getFrm2Symbolic() {
        return frm2Symbolic;
    }

    public void setFrm2Symbolic(String frm2Symbolic) {
        this.frm2Symbolic = frm2Symbolic;
    }

    private String to2Symbolic;

    @Basic
    @javax.persistence.Column(name = "TO2_SYMBOLIC")
    public String getTo2Symbolic() {
        return to2Symbolic;
    }

    public void setTo2Symbolic(String to2Symbolic) {
        this.to2Symbolic = to2Symbolic;
    }

    private String testFile2;

    @Basic
    @javax.persistence.Column(name = "TEST_FILE2")
    public String getTestFile2() {
        return testFile2;
    }

    public void setTestFile2(String testFile2) {
        this.testFile2 = testFile2;
    }

    private String prodFile2;

    @Basic
    @javax.persistence.Column(name = "PROD_FILE2")
    public String getProdFile2() {
        return prodFile2;
    }

    public void setProdFile2(String prodFile2) {
        this.prodFile2 = prodFile2;
    }

    private String testProdInd;

    @Basic
    @javax.persistence.Column(name = "TEST_PROD_IND")
    public String getTestProdInd() {
        return testProdInd;
    }

    public void setTestProdInd(String testProdInd) {
        this.testProdInd = testProdInd;
    }

    private String updtOper;

    @Basic
    @javax.persistence.Column(name = "UPDT_OPER")
    public String getUpdtOper() {
        return updtOper;
    }

    public void setUpdtOper(String updtOper) {
        this.updtOper = updtOper;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpNdmtransEntity that = (PrpNdmtransEntity) o;

        if (originId != null ? !originId.equals(that.originId) : that.originId != null) return false;
        if (tranType != null ? !tranType.equals(that.tranType) : that.tranType != null) return false;
        if (acctId != null ? !acctId.equals(that.acctId) : that.acctId != null) return false;
        if (nodeId != null ? !nodeId.equals(that.nodeId) : that.nodeId != null) return false;
        if (ndmApplId != null ? !ndmApplId.equals(that.ndmApplId) : that.ndmApplId != null) return false;
        if (netId != null ? !netId.equals(that.netId) : that.netId != null) return false;
        if (ipAddress != null ? !ipAddress.equals(that.ipAddress) : that.ipAddress != null) return false;
        if (capsInd != null ? !capsInd.equals(that.capsInd) : that.capsInd != null) return false;
        if (processName != null ? !processName.equals(that.processName) : that.processName != null) return false;
        if (useridPasswd != null ? !useridPasswd.equals(that.useridPasswd) : that.useridPasswd != null) return false;
        if (newname != null ? !newname.equals(that.newname) : that.newname != null) return false;
        if (frm1Symbolic != null ? !frm1Symbolic.equals(that.frm1Symbolic) : that.frm1Symbolic != null) return false;
        if (to1Symbolic != null ? !to1Symbolic.equals(that.to1Symbolic) : that.to1Symbolic != null) return false;
        if (testFile1 != null ? !testFile1.equals(that.testFile1) : that.testFile1 != null) return false;
        if (prodFile1 != null ? !prodFile1.equals(that.prodFile1) : that.prodFile1 != null) return false;
        if (trigSymbolic != null ? !trigSymbolic.equals(that.trigSymbolic) : that.trigSymbolic != null) return false;
        if (testTrigger != null ? !testTrigger.equals(that.testTrigger) : that.testTrigger != null) return false;
        if (prodTrigger != null ? !prodTrigger.equals(that.prodTrigger) : that.prodTrigger != null) return false;
        if (frm2Symbolic != null ? !frm2Symbolic.equals(that.frm2Symbolic) : that.frm2Symbolic != null) return false;
        if (to2Symbolic != null ? !to2Symbolic.equals(that.to2Symbolic) : that.to2Symbolic != null) return false;
        if (testFile2 != null ? !testFile2.equals(that.testFile2) : that.testFile2 != null) return false;
        if (prodFile2 != null ? !prodFile2.equals(that.prodFile2) : that.prodFile2 != null) return false;
        if (testProdInd != null ? !testProdInd.equals(that.testProdInd) : that.testProdInd != null) return false;
        if (updtOper != null ? !updtOper.equals(that.updtOper) : that.updtOper != null) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = originId != null ? originId.hashCode() : 0;
        result = 31 * result + (tranType != null ? tranType.hashCode() : 0);
        result = 31 * result + (acctId != null ? acctId.hashCode() : 0);
        result = 31 * result + (nodeId != null ? nodeId.hashCode() : 0);
        result = 31 * result + (ndmApplId != null ? ndmApplId.hashCode() : 0);
        result = 31 * result + (netId != null ? netId.hashCode() : 0);
        result = 31 * result + (ipAddress != null ? ipAddress.hashCode() : 0);
        result = 31 * result + (capsInd != null ? capsInd.hashCode() : 0);
        result = 31 * result + (processName != null ? processName.hashCode() : 0);
        result = 31 * result + (useridPasswd != null ? useridPasswd.hashCode() : 0);
        result = 31 * result + (newname != null ? newname.hashCode() : 0);
        result = 31 * result + (frm1Symbolic != null ? frm1Symbolic.hashCode() : 0);
        result = 31 * result + (to1Symbolic != null ? to1Symbolic.hashCode() : 0);
        result = 31 * result + (testFile1 != null ? testFile1.hashCode() : 0);
        result = 31 * result + (prodFile1 != null ? prodFile1.hashCode() : 0);
        result = 31 * result + (trigSymbolic != null ? trigSymbolic.hashCode() : 0);
        result = 31 * result + (testTrigger != null ? testTrigger.hashCode() : 0);
        result = 31 * result + (prodTrigger != null ? prodTrigger.hashCode() : 0);
        result = 31 * result + (frm2Symbolic != null ? frm2Symbolic.hashCode() : 0);
        result = 31 * result + (to2Symbolic != null ? to2Symbolic.hashCode() : 0);
        result = 31 * result + (testFile2 != null ? testFile2.hashCode() : 0);
        result = 31 * result + (prodFile2 != null ? prodFile2.hashCode() : 0);
        result = 31 * result + (testProdInd != null ? testProdInd.hashCode() : 0);
        result = 31 * result + (updtOper != null ? updtOper.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        return result;
    }
}
