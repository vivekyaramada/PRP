package gov.hhs.cms.prp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
public class PrpBlkXrefEntityPK implements Serializable {
    private String crntLinkKey;
    private String newLinkKey;

    @Column(name = "CRNT_LINK_KEY")
    @Id
    public String getCrntLinkKey() {
        return crntLinkKey;
    }

    public void setCrntLinkKey(String crntLinkKey) {
        this.crntLinkKey = crntLinkKey;
    }

    @Column(name = "NEW_LINK_KEY")
    @Id
    public String getNewLinkKey() {
        return newLinkKey;
    }

    public void setNewLinkKey(String newLinkKey) {
        this.newLinkKey = newLinkKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpBlkXrefEntityPK that = (PrpBlkXrefEntityPK) o;

        if (crntLinkKey != null ? !crntLinkKey.equals(that.crntLinkKey) : that.crntLinkKey != null) return false;
        if (newLinkKey != null ? !newLinkKey.equals(that.newLinkKey) : that.newLinkKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = crntLinkKey != null ? crntLinkKey.hashCode() : 0;
        result = 31 * result + (newLinkKey != null ? newLinkKey.hashCode() : 0);
        return result;
    }
}
