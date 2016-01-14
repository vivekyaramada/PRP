package gov.hhs.cms.prp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by VivekKumar.ReddyYara on 1/13/2016.
 */
public class PrpRetlisthistEntityPK implements Serializable {
    private String fileId;
    private int sequence;

    @Column(name = "FILE_ID")
    @Id
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Column(name = "SEQUENCE")
    @Id
    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpRetlisthistEntityPK that = (PrpRetlisthistEntityPK) o;

        if (sequence != that.sequence) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + sequence;
        return result;
    }
}
