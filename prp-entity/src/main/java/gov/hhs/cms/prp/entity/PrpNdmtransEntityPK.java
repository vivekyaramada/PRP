package gov.hhs.cms.prp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by VivekKumar.ReddyYara on 1/13/2016.
 */
public class PrpNdmtransEntityPK implements Serializable {
    private String originId;
    private String tranType;

    @Column(name = "ORIGIN_ID")
    @Id
    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    @Column(name = "TRAN_TYPE")
    @Id
    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpNdmtransEntityPK that = (PrpNdmtransEntityPK) o;

        if (originId != null ? !originId.equals(that.originId) : that.originId != null) return false;
        if (tranType != null ? !tranType.equals(that.tranType) : that.tranType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = originId != null ? originId.hashCode() : 0;
        result = 31 * result + (tranType != null ? tranType.hashCode() : 0);
        return result;
    }
}
