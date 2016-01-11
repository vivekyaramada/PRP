package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_blk_xref", schema = "", catalog = "prp")
@IdClass(PrpBlkXrefEntityPK.class)
public class PrpBlkXrefEntity {
    private String crntLinkKey;
    private String newLinkKey;
    private Integer beneId;
    private String pstgPgmId;
    private Timestamp pstgTs;

    @Id
    @Column(name = "CRNT_LINK_KEY")
    public String getCrntLinkKey() {
        return crntLinkKey;
    }

    public void setCrntLinkKey(String crntLinkKey) {
        this.crntLinkKey = crntLinkKey;
    }

    @Id
    @Column(name = "NEW_LINK_KEY")
    public String getNewLinkKey() {
        return newLinkKey;
    }

    public void setNewLinkKey(String newLinkKey) {
        this.newLinkKey = newLinkKey;
    }

    @Basic
    @Column(name = "BENE_ID")
    public Integer getBeneId() {
        return beneId;
    }

    public void setBeneId(Integer beneId) {
        this.beneId = beneId;
    }

    @Basic
    @Column(name = "PSTG_PGM_ID")
    public String getPstgPgmId() {
        return pstgPgmId;
    }

    public void setPstgPgmId(String pstgPgmId) {
        this.pstgPgmId = pstgPgmId;
    }

    @Basic
    @Column(name = "PSTG_TS")
    public Timestamp getPstgTs() {
        return pstgTs;
    }

    public void setPstgTs(Timestamp pstgTs) {
        this.pstgTs = pstgTs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpBlkXrefEntity that = (PrpBlkXrefEntity) o;

        if (crntLinkKey != null ? !crntLinkKey.equals(that.crntLinkKey) : that.crntLinkKey != null) return false;
        if (newLinkKey != null ? !newLinkKey.equals(that.newLinkKey) : that.newLinkKey != null) return false;
        if (beneId != null ? !beneId.equals(that.beneId) : that.beneId != null) return false;
        if (pstgPgmId != null ? !pstgPgmId.equals(that.pstgPgmId) : that.pstgPgmId != null) return false;
        if (pstgTs != null ? !pstgTs.equals(that.pstgTs) : that.pstgTs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = crntLinkKey != null ? crntLinkKey.hashCode() : 0;
        result = 31 * result + (newLinkKey != null ? newLinkKey.hashCode() : 0);
        result = 31 * result + (beneId != null ? beneId.hashCode() : 0);
        result = 31 * result + (pstgPgmId != null ? pstgPgmId.hashCode() : 0);
        result = 31 * result + (pstgTs != null ? pstgTs.hashCode() : 0);
        return result;
    }
}
