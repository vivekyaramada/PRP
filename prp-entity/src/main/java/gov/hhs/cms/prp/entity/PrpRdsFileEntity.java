package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/13/2016.
 */
@Entity
@Table(name = "prp_rds_file", schema = "", catalog = "prp")
public class PrpRdsFileEntity {
    private String fileId;
    private String fileDirCd;
    private Date fileDt;
    private Date fileTm;
    private String fileName;
    private String fileDescTxt;
    private String submOrgId;
    private Timestamp stusTs;
    private String stusPgm;
    private String uptdPgm;
    private Timestamp updtTs;
    private Date processDt;
    private Date receiptDt;
    private String fileTypeCd;
    private String orgTypCd;
    private String orgId;
    private String stusCtgryCd;
    private String stusCd;

    @Id
    @Column(name = "FILE_ID")
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Basic
    @Column(name = "FILE_DIR_CD")
    public String getFileDirCd() {
        return fileDirCd;
    }

    public void setFileDirCd(String fileDirCd) {
        this.fileDirCd = fileDirCd;
    }

    @Basic
    @Column(name = "FILE_DT")
    public Date getFileDt() {
        return fileDt;
    }

    public void setFileDt(Date fileDt) {
        this.fileDt = fileDt;
    }

    @Basic
    @Column(name = "FILE_TM")
    public Date getFileTm() {
        return fileTm;
    }

    public void setFileTm(Date fileTm) {
        this.fileTm = fileTm;
    }

    @Basic
    @Column(name = "FILE_NAME")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Basic
    @Column(name = "FILE_DESC_TXT")
    public String getFileDescTxt() {
        return fileDescTxt;
    }

    public void setFileDescTxt(String fileDescTxt) {
        this.fileDescTxt = fileDescTxt;
    }

    @Basic
    @Column(name = "SUBM_ORG_ID")
    public String getSubmOrgId() {
        return submOrgId;
    }

    public void setSubmOrgId(String submOrgId) {
        this.submOrgId = submOrgId;
    }

    @Basic
    @Column(name = "STUS_TS")
    public Timestamp getStusTs() {
        return stusTs;
    }

    public void setStusTs(Timestamp stusTs) {
        this.stusTs = stusTs;
    }

    @Basic
    @Column(name = "STUS_PGM")
    public String getStusPgm() {
        return stusPgm;
    }

    public void setStusPgm(String stusPgm) {
        this.stusPgm = stusPgm;
    }

    @Basic
    @Column(name = "UPTD_PGM")
    public String getUptdPgm() {
        return uptdPgm;
    }

    public void setUptdPgm(String uptdPgm) {
        this.uptdPgm = uptdPgm;
    }

    @Basic
    @Column(name = "UPDT_TS")
    public Timestamp getUpdtTs() {
        return updtTs;
    }

    public void setUpdtTs(Timestamp updtTs) {
        this.updtTs = updtTs;
    }

    @Basic
    @Column(name = "PROCESS_DT")
    public Date getProcessDt() {
        return processDt;
    }

    public void setProcessDt(Date processDt) {
        this.processDt = processDt;
    }

    @Basic
    @Column(name = "RECEIPT_DT")
    public Date getReceiptDt() {
        return receiptDt;
    }

    public void setReceiptDt(Date receiptDt) {
        this.receiptDt = receiptDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpRdsFileEntity that = (PrpRdsFileEntity) o;

        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;
        if (fileDirCd != null ? !fileDirCd.equals(that.fileDirCd) : that.fileDirCd != null) return false;
        if (fileDt != null ? !fileDt.equals(that.fileDt) : that.fileDt != null) return false;
        if (fileTm != null ? !fileTm.equals(that.fileTm) : that.fileTm != null) return false;
        if (fileName != null ? !fileName.equals(that.fileName) : that.fileName != null) return false;
        if (fileDescTxt != null ? !fileDescTxt.equals(that.fileDescTxt) : that.fileDescTxt != null) return false;
        if (submOrgId != null ? !submOrgId.equals(that.submOrgId) : that.submOrgId != null) return false;
        if (stusTs != null ? !stusTs.equals(that.stusTs) : that.stusTs != null) return false;
        if (stusPgm != null ? !stusPgm.equals(that.stusPgm) : that.stusPgm != null) return false;
        if (uptdPgm != null ? !uptdPgm.equals(that.uptdPgm) : that.uptdPgm != null) return false;
        if (updtTs != null ? !updtTs.equals(that.updtTs) : that.updtTs != null) return false;
        if (processDt != null ? !processDt.equals(that.processDt) : that.processDt != null) return false;
        if (receiptDt != null ? !receiptDt.equals(that.receiptDt) : that.receiptDt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + (fileDirCd != null ? fileDirCd.hashCode() : 0);
        result = 31 * result + (fileDt != null ? fileDt.hashCode() : 0);
        result = 31 * result + (fileTm != null ? fileTm.hashCode() : 0);
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        result = 31 * result + (fileDescTxt != null ? fileDescTxt.hashCode() : 0);
        result = 31 * result + (submOrgId != null ? submOrgId.hashCode() : 0);
        result = 31 * result + (stusTs != null ? stusTs.hashCode() : 0);
        result = 31 * result + (stusPgm != null ? stusPgm.hashCode() : 0);
        result = 31 * result + (uptdPgm != null ? uptdPgm.hashCode() : 0);
        result = 31 * result + (updtTs != null ? updtTs.hashCode() : 0);
        result = 31 * result + (processDt != null ? processDt.hashCode() : 0);
        result = 31 * result + (receiptDt != null ? receiptDt.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "FILE_TYPE_CD")
    public String getFileTypeCd() {
        return fileTypeCd;
    }

    public void setFileTypeCd(String fileTypeCd) {
        this.fileTypeCd = fileTypeCd;
    }

    @Basic
    @Column(name = "ORG_TYP_CD")
    public String getOrgTypCd() {
        return orgTypCd;
    }

    public void setOrgTypCd(String orgTypCd) {
        this.orgTypCd = orgTypCd;
    }

    @Basic
    @Column(name = "ORG_ID")
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "STUS_CTGRY_CD")
    public String getStusCtgryCd() {
        return stusCtgryCd;
    }

    public void setStusCtgryCd(String stusCtgryCd) {
        this.stusCtgryCd = stusCtgryCd;
    }

    @Basic
    @Column(name = "STUS_CD")
    public String getStusCd() {
        return stusCd;
    }

    public void setStusCd(String stusCd) {
        this.stusCd = stusCd;
    }
}
