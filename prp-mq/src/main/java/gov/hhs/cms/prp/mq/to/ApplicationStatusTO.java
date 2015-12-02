package gov.hhs.cms.prp.mq.to;

import java.util.Date;

/**
 * Created by jarsen on 12/1/15.
 */
public class ApplicationStatusTO {

    /*
     * Applies to all segments
     * Valid values: RLSR | EFTR | RRFM
     */
    private String segmentId;

    /*
     * Applies to all segments
     * Application Identification Number
     */
    private int applicationIdentifier;

    /*
     * Applies to RLSR and EFTR segments
     * Valid values: Y | N | R | U | S
     */
    private String status;

    /*
     * Applies to RLSR and RRFM segments
     * Valid values: 1 | 2 | 3
     */
    private String transmissionMethod;

    /*
     * Applies to RLSR and RRFM segments
     * For RLSR segment: field is named: "File Source"
     * For both segments:
     *   - If Trans Method = 1, value = "SWS"
     *   - If Trans Method = 2, value = plan sponsor or vendor id number
     *   - If Trans Method = 3, value = COBC number or MIR ID
     */
    private String submitterId;

    /*
     * Applies to RLSR and RRFM segments
     * For RRFM segment, field name is: "File Receipt Date"
     */
    private Date date;

    /*
     * Applies to RLSR segment only
     * Valid values: Y | N
     */
    private String swsCopy;


    public String getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    public int getApplicationIdentifier() {
        return applicationIdentifier;
    }

    public void setApplicationIdentifier(int applicationIdentifier) {
        this.applicationIdentifier = applicationIdentifier;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTransmissionMethod() {
        return transmissionMethod;
    }

    public void setTransmissionMethod(String transmissionMethod) {
        this.transmissionMethod = transmissionMethod;
    }

    public String getSwsCopy() {
        return swsCopy;
    }

    public void setSwsCopy(String swsCopy) {
        this.swsCopy = swsCopy;
    }

    public String getSubmitterId() {
        return submitterId;
    }

    public void setSubmitterId(String submitterId) {
        this.submitterId = submitterId;
    }
}
