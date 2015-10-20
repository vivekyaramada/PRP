package gov.hhs.cms.prp.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 10/15/2015.
 */
@Entity
@javax.persistence.Table(name = "prp_evnt_nw", schema = "", catalog = "prp")
public class PrpEvntNwEntity {
    private int pkPrpEventId;

    @Id
    @javax.persistence.Column(name = "PK_PRP_Event_ID")
    public int getPkPrpEventId() {
        return pkPrpEventId;
    }

    public void setPkPrpEventId(int pkPrpEventId) {
        this.pkPrpEventId = pkPrpEventId;
    }

    private String eventType;

    @Basic
    @javax.persistence.Column(name = "Event type")
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    private String eventOrigin;

    @Basic
    @javax.persistence.Column(name = "Event origin")
    public String getEventOrigin() {
        return eventOrigin;
    }

    public void setEventOrigin(String eventOrigin) {
        this.eventOrigin = eventOrigin;
    }

    private Timestamp recordAddTimestamp;

    @Basic
    @javax.persistence.Column(name = "Record add timestamp")
    public Timestamp getRecordAddTimestamp() {
        return recordAddTimestamp;
    }

    public void setRecordAddTimestamp(Timestamp recordAddTimestamp) {
        this.recordAddTimestamp = recordAddTimestamp;
    }

    private String recordAddUser;

    @Basic
    @javax.persistence.Column(name = "Record add user")
    public String getRecordAddUser() {
        return recordAddUser;
    }

    public void setRecordAddUser(String recordAddUser) {
        this.recordAddUser = recordAddUser;
    }

    private String planSponsorIdent;

    @Basic
    @javax.persistence.Column(name = "Plan sponsor Ident")
    public String getPlanSponsorIdent() {
        return planSponsorIdent;
    }

    public void setPlanSponsorIdent(String planSponsorIdent) {
        this.planSponsorIdent = planSponsorIdent;
    }

    private String applicationIdent;

    @Basic
    @javax.persistence.Column(name = "Application Ident")
    public String getApplicationIdent() {
        return applicationIdent;
    }

    public void setApplicationIdent(String applicationIdent) {
        this.applicationIdent = applicationIdent;
    }

    private Short sequenceNumber;

    @Basic
    @javax.persistence.Column(name = "Sequence number")
    public Short getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Short sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    private Date cycleDate;

    @Basic
    @javax.persistence.Column(name = "Cycle date")
    public Date getCycleDate() {
        return cycleDate;
    }

    public void setCycleDate(Date cycleDate) {
        this.cycleDate = cycleDate;
    }

    private Short cycleNumber;

    @Basic
    @javax.persistence.Column(name = "Cycle number")
    public Short getCycleNumber() {
        return cycleNumber;
    }

    public void setCycleNumber(Short cycleNumber) {
        this.cycleNumber = cycleNumber;
    }

    private Short eventReferenceNumber;

    @Basic
    @javax.persistence.Column(name = "Event reference number")
    public Short getEventReferenceNumber() {
        return eventReferenceNumber;
    }

    public void setEventReferenceNumber(Short eventReferenceNumber) {
        this.eventReferenceNumber = eventReferenceNumber;
    }

    private Short processReferenceNumber;

    @Basic
    @javax.persistence.Column(name = "Process reference number")
    public Short getProcessReferenceNumber() {
        return processReferenceNumber;
    }

    public void setProcessReferenceNumber(Short processReferenceNumber) {
        this.processReferenceNumber = processReferenceNumber;
    }

    private String externalReferenceId;

    @Basic
    @javax.persistence.Column(name = "External reference ID")
    public String getExternalReferenceId() {
        return externalReferenceId;
    }

    public void setExternalReferenceId(String externalReferenceId) {
        this.externalReferenceId = externalReferenceId;
    }

    private Short externalReferenceNumber;

    @Basic
    @javax.persistence.Column(name = "External reference number")
    public Short getExternalReferenceNumber() {
        return externalReferenceNumber;
    }

    public void setExternalReferenceNumber(Short externalReferenceNumber) {
        this.externalReferenceNumber = externalReferenceNumber;
    }

    private Short reasonCode;

    @Basic
    @javax.persistence.Column(name = "Reason code")
    public Short getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Short reasonCode) {
        this.reasonCode = reasonCode;
    }

    private BigDecimal transactionAmount;

    @Basic
    @javax.persistence.Column(name = "Transaction amount")
    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    private BigDecimal amountPayable;

    @Basic
    @javax.persistence.Column(name = "Amount payable")
    public BigDecimal getAmountPayable() {
        return amountPayable;
    }

    public void setAmountPayable(BigDecimal amountPayable) {
        this.amountPayable = amountPayable;
    }

    private BigDecimal amountInterimAdjustment;

    @Basic
    @javax.persistence.Column(name = "Amount interim adjustment")
    public BigDecimal getAmountInterimAdjustment() {
        return amountInterimAdjustment;
    }

    public void setAmountInterimAdjustment(BigDecimal amountInterimAdjustment) {
        this.amountInterimAdjustment = amountInterimAdjustment;
    }

    private BigDecimal amountUnapplied;

    @Basic
    @javax.persistence.Column(name = "Amount unapplied")
    public BigDecimal getAmountUnapplied() {
        return amountUnapplied;
    }

    public void setAmountUnapplied(BigDecimal amountUnapplied) {
        this.amountUnapplied = amountUnapplied;
    }

    private BigDecimal amountPrincipal;

    @Basic
    @javax.persistence.Column(name = "Amount principal")
    public BigDecimal getAmountPrincipal() {
        return amountPrincipal;
    }

    public void setAmountPrincipal(BigDecimal amountPrincipal) {
        this.amountPrincipal = amountPrincipal;
    }

    private BigDecimal amountInterest;

    @Basic
    @javax.persistence.Column(name = "Amount interest")
    public BigDecimal getAmountInterest() {
        return amountInterest;
    }

    public void setAmountInterest(BigDecimal amountInterest) {
        this.amountInterest = amountInterest;
    }

    private String eventCategory;

    @Basic
    @javax.persistence.Column(name = "Event category")
    public String getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
    }

    private String eventCategorySpecificData;

    @Basic
    @javax.persistence.Column(name = "Event category specific data")
    public String getEventCategorySpecificData() {
        return eventCategorySpecificData;
    }

    public void setEventCategorySpecificData(String eventCategorySpecificData) {
        this.eventCategorySpecificData = eventCategorySpecificData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpEvntNwEntity that = (PrpEvntNwEntity) o;

        if (pkPrpEventId != that.pkPrpEventId) return false;
        if (eventType != null ? !eventType.equals(that.eventType) : that.eventType != null) return false;
        if (eventOrigin != null ? !eventOrigin.equals(that.eventOrigin) : that.eventOrigin != null) return false;
        if (recordAddTimestamp != null ? !recordAddTimestamp.equals(that.recordAddTimestamp) : that.recordAddTimestamp != null)
            return false;
        if (recordAddUser != null ? !recordAddUser.equals(that.recordAddUser) : that.recordAddUser != null)
            return false;
        if (planSponsorIdent != null ? !planSponsorIdent.equals(that.planSponsorIdent) : that.planSponsorIdent != null)
            return false;
        if (applicationIdent != null ? !applicationIdent.equals(that.applicationIdent) : that.applicationIdent != null)
            return false;
        if (sequenceNumber != null ? !sequenceNumber.equals(that.sequenceNumber) : that.sequenceNumber != null)
            return false;
        if (cycleDate != null ? !cycleDate.equals(that.cycleDate) : that.cycleDate != null) return false;
        if (cycleNumber != null ? !cycleNumber.equals(that.cycleNumber) : that.cycleNumber != null) return false;
        if (eventReferenceNumber != null ? !eventReferenceNumber.equals(that.eventReferenceNumber) : that.eventReferenceNumber != null)
            return false;
        if (processReferenceNumber != null ? !processReferenceNumber.equals(that.processReferenceNumber) : that.processReferenceNumber != null)
            return false;
        if (externalReferenceId != null ? !externalReferenceId.equals(that.externalReferenceId) : that.externalReferenceId != null)
            return false;
        if (externalReferenceNumber != null ? !externalReferenceNumber.equals(that.externalReferenceNumber) : that.externalReferenceNumber != null)
            return false;
        if (reasonCode != null ? !reasonCode.equals(that.reasonCode) : that.reasonCode != null) return false;
        if (transactionAmount != null ? !transactionAmount.equals(that.transactionAmount) : that.transactionAmount != null)
            return false;
        if (amountPayable != null ? !amountPayable.equals(that.amountPayable) : that.amountPayable != null)
            return false;
        if (amountInterimAdjustment != null ? !amountInterimAdjustment.equals(that.amountInterimAdjustment) : that.amountInterimAdjustment != null)
            return false;
        if (amountUnapplied != null ? !amountUnapplied.equals(that.amountUnapplied) : that.amountUnapplied != null)
            return false;
        if (amountPrincipal != null ? !amountPrincipal.equals(that.amountPrincipal) : that.amountPrincipal != null)
            return false;
        if (amountInterest != null ? !amountInterest.equals(that.amountInterest) : that.amountInterest != null)
            return false;
        if (eventCategory != null ? !eventCategory.equals(that.eventCategory) : that.eventCategory != null)
            return false;
        if (eventCategorySpecificData != null ? !eventCategorySpecificData.equals(that.eventCategorySpecificData) : that.eventCategorySpecificData != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkPrpEventId;
        result = 31 * result + (eventType != null ? eventType.hashCode() : 0);
        result = 31 * result + (eventOrigin != null ? eventOrigin.hashCode() : 0);
        result = 31 * result + (recordAddTimestamp != null ? recordAddTimestamp.hashCode() : 0);
        result = 31 * result + (recordAddUser != null ? recordAddUser.hashCode() : 0);
        result = 31 * result + (planSponsorIdent != null ? planSponsorIdent.hashCode() : 0);
        result = 31 * result + (applicationIdent != null ? applicationIdent.hashCode() : 0);
        result = 31 * result + (sequenceNumber != null ? sequenceNumber.hashCode() : 0);
        result = 31 * result + (cycleDate != null ? cycleDate.hashCode() : 0);
        result = 31 * result + (cycleNumber != null ? cycleNumber.hashCode() : 0);
        result = 31 * result + (eventReferenceNumber != null ? eventReferenceNumber.hashCode() : 0);
        result = 31 * result + (processReferenceNumber != null ? processReferenceNumber.hashCode() : 0);
        result = 31 * result + (externalReferenceId != null ? externalReferenceId.hashCode() : 0);
        result = 31 * result + (externalReferenceNumber != null ? externalReferenceNumber.hashCode() : 0);
        result = 31 * result + (reasonCode != null ? reasonCode.hashCode() : 0);
        result = 31 * result + (transactionAmount != null ? transactionAmount.hashCode() : 0);
        result = 31 * result + (amountPayable != null ? amountPayable.hashCode() : 0);
        result = 31 * result + (amountInterimAdjustment != null ? amountInterimAdjustment.hashCode() : 0);
        result = 31 * result + (amountUnapplied != null ? amountUnapplied.hashCode() : 0);
        result = 31 * result + (amountPrincipal != null ? amountPrincipal.hashCode() : 0);
        result = 31 * result + (amountInterest != null ? amountInterest.hashCode() : 0);
        result = 31 * result + (eventCategory != null ? eventCategory.hashCode() : 0);
        result = 31 * result + (eventCategorySpecificData != null ? eventCategorySpecificData.hashCode() : 0);
        return result;
    }
}
