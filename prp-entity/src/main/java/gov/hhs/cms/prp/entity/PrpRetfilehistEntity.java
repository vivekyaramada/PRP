package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_retfilehist", schema = "", catalog = "prp")
public class PrpRetfilehistEntity {
    private String fileId;
    private String psId;
    private String applId;
    private int receiptDt;
    private int responseDt;
    private String status;
    private String prevStatus;
    private String errorReason;
    private int addCnt;
    private int updateCnt;
    private int deleteCnt;
    private int errorCnt;
    private int totalCnt;
    private String transMethod;
    private String inputFile;
    private String responseFile;
    private String mailboxFile;
    private String cobcPlanNum;
    private String updtPgm;
    private Timestamp timestamp;
    private String originId;

    @Id
    @Column(name = "FILE_ID")
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Basic
    @Column(name = "PS_ID")
    public String getPsId() {
        return psId;
    }

    public void setPsId(String psId) {
        this.psId = psId;
    }

    @Basic
    @Column(name = "APPL_ID")
    public String getApplId() {
        return applId;
    }

    public void setApplId(String applId) {
        this.applId = applId;
    }

    public void setReceiptDt(Integer receiptDt) {
        this.receiptDt = receiptDt;
    }

    @Basic
    @Column(name = "RECEIPT_DT")
    public int getReceiptDt() {
        return receiptDt;
    }

    public void setReceiptDt(int receiptDt) {
        this.receiptDt = receiptDt;
    }

    public void setResponseDt(Integer responseDt) {
        this.responseDt = responseDt;
    }

    @Basic
    @Column(name = "RESPONSE_DT")
    public int getResponseDt() {
        return responseDt;
    }

    public void setResponseDt(int responseDt) {
        this.responseDt = responseDt;
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
    @Column(name = "PREV_STATUS")
    public String getPrevStatus() {
        return prevStatus;
    }

    public void setPrevStatus(String prevStatus) {
        this.prevStatus = prevStatus;
    }

    @Basic
    @Column(name = "ERROR_REASON")
    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    public void setAddCnt(Integer addCnt) {
        this.addCnt = addCnt;
    }

    @Basic
    @Column(name = "ADD_CNT")
    public int getAddCnt() {
        return addCnt;
    }

    public void setAddCnt(int addCnt) {
        this.addCnt = addCnt;
    }

    public void setUpdateCnt(Integer updateCnt) {
        this.updateCnt = updateCnt;
    }

    @Basic
    @Column(name = "UPDATE_CNT")
    public int getUpdateCnt() {
        return updateCnt;
    }

    public void setUpdateCnt(int updateCnt) {
        this.updateCnt = updateCnt;
    }

    public void setDeleteCnt(Integer deleteCnt) {
        this.deleteCnt = deleteCnt;
    }

    @Basic
    @Column(name = "DELETE_CNT")
    public int getDeleteCnt() {
        return deleteCnt;
    }

    public void setDeleteCnt(int deleteCnt) {
        this.deleteCnt = deleteCnt;
    }

    public void setErrorCnt(Integer errorCnt) {
        this.errorCnt = errorCnt;
    }

    @Basic
    @Column(name = "ERROR_CNT")
    public int getErrorCnt() {
        return errorCnt;
    }

    public void setErrorCnt(int errorCnt) {
        this.errorCnt = errorCnt;
    }

    public void setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
    }

    @Basic
    @Column(name = "TOTAL_CNT")
    public int getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(int totalCnt) {
        this.totalCnt = totalCnt;
    }

    @Basic
    @Column(name = "TRANS_METHOD")
    public String getTransMethod() {
        return transMethod;
    }

    public void setTransMethod(String transMethod) {
        this.transMethod = transMethod;
    }

    @Basic
    @Column(name = "INPUT_FILE")
    public String getInputFile() {
        return inputFile;
    }

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    @Basic
    @Column(name = "RESPONSE_FILE")
    public String getResponseFile() {
        return responseFile;
    }

    public void setResponseFile(String responseFile) {
        this.responseFile = responseFile;
    }

    @Basic
    @Column(name = "MAILBOX_FILE")
    public String getMailboxFile() {
        return mailboxFile;
    }

    public void setMailboxFile(String mailboxFile) {
        this.mailboxFile = mailboxFile;
    }

    @Basic
    @Column(name = "COBC_PLAN_NUM")
    public String getCobcPlanNum() {
        return cobcPlanNum;
    }

    public void setCobcPlanNum(String cobcPlanNum) {
        this.cobcPlanNum = cobcPlanNum;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpRetfilehistEntity that = (PrpRetfilehistEntity) o;

        if (receiptDt != that.receiptDt) return false;
        if (responseDt != that.responseDt) return false;
        if (addCnt != that.addCnt) return false;
        if (updateCnt != that.updateCnt) return false;
        if (deleteCnt != that.deleteCnt) return false;
        if (errorCnt != that.errorCnt) return false;
        if (totalCnt != that.totalCnt) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;
        if (psId != null ? !psId.equals(that.psId) : that.psId != null) return false;
        if (applId != null ? !applId.equals(that.applId) : that.applId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (prevStatus != null ? !prevStatus.equals(that.prevStatus) : that.prevStatus != null) return false;
        if (errorReason != null ? !errorReason.equals(that.errorReason) : that.errorReason != null) return false;
        if (transMethod != null ? !transMethod.equals(that.transMethod) : that.transMethod != null) return false;
        if (inputFile != null ? !inputFile.equals(that.inputFile) : that.inputFile != null) return false;
        if (responseFile != null ? !responseFile.equals(that.responseFile) : that.responseFile != null) return false;
        if (mailboxFile != null ? !mailboxFile.equals(that.mailboxFile) : that.mailboxFile != null) return false;
        if (cobcPlanNum != null ? !cobcPlanNum.equals(that.cobcPlanNum) : that.cobcPlanNum != null) return false;
        if (updtPgm != null ? !updtPgm.equals(that.updtPgm) : that.updtPgm != null) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;
        if (originId != null ? !originId.equals(that.originId) : that.originId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + (psId != null ? psId.hashCode() : 0);
        result = 31 * result + (applId != null ? applId.hashCode() : 0);
        result = 31 * result + receiptDt;
        result = 31 * result + responseDt;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (prevStatus != null ? prevStatus.hashCode() : 0);
        result = 31 * result + (errorReason != null ? errorReason.hashCode() : 0);
        result = 31 * result + addCnt;
        result = 31 * result + updateCnt;
        result = 31 * result + deleteCnt;
        result = 31 * result + errorCnt;
        result = 31 * result + totalCnt;
        result = 31 * result + (transMethod != null ? transMethod.hashCode() : 0);
        result = 31 * result + (inputFile != null ? inputFile.hashCode() : 0);
        result = 31 * result + (responseFile != null ? responseFile.hashCode() : 0);
        result = 31 * result + (mailboxFile != null ? mailboxFile.hashCode() : 0);
        result = 31 * result + (cobcPlanNum != null ? cobcPlanNum.hashCode() : 0);
        result = 31 * result + (updtPgm != null ? updtPgm.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (originId != null ? originId.hashCode() : 0);
        return result;
    }
}
