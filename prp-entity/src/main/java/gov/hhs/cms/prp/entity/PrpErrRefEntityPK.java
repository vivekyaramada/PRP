package gov.hhs.cms.prp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
public class PrpErrRefEntityPK implements Serializable {
    private String errCd;
    private String errCtgryCd;

    @Column(name = "ERR_CD")
    @Id
    public String getErrCd() {
        return errCd;
    }

    public void setErrCd(String errCd) {
        this.errCd = errCd;
    }

    @Column(name = "ERR_CTGRY_CD")
    @Id
    public String getErrCtgryCd() {
        return errCtgryCd;
    }

    public void setErrCtgryCd(String errCtgryCd) {
        this.errCtgryCd = errCtgryCd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpErrRefEntityPK that = (PrpErrRefEntityPK) o;

        if (errCd != null ? !errCd.equals(that.errCd) : that.errCd != null) return false;
        if (errCtgryCd != null ? !errCtgryCd.equals(that.errCtgryCd) : that.errCtgryCd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = errCd != null ? errCd.hashCode() : 0;
        result = 31 * result + (errCtgryCd != null ? errCtgryCd.hashCode() : 0);
        return result;
    }
}
