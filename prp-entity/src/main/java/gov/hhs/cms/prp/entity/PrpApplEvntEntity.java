package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_appl_evnt", schema = "", catalog = "prp")
@IdClass(PrpApplEvntEntityPK.class)
public class PrpApplEvntEntity {
    private String applId;
    private Timestamp pstgTs;
    private String typeCd;
    private Date evntDt;
    private String pstgPgmName;
    private String val;

    @Id
    @Column(name = "APPL_ID")
    public String getApplId() {
        return applId;
    }

    public void setApplId(String applId) {
        this.applId = applId;
    }

    @Id
    @Column(name = "PSTG_TS")
    public Timestamp getPstgTs() {
        return pstgTs;
    }

    public void setPstgTs(Timestamp pstgTs) {
        this.pstgTs = pstgTs;
    }

    @Basic
    @Column(name = "TYPE_CD")
    public String getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd;
    }

    @Basic
    @Column(name = "EVNT_DT")
    public Date getEvntDt() {
        return evntDt;
    }

    public void setEvntDt(Date evntDt) {
        this.evntDt = evntDt;
    }

    @Basic
    @Column(name = "PSTG_PGM_NAME")
    public String getPstgPgmName() {
        return pstgPgmName;
    }

    public void setPstgPgmName(String pstgPgmName) {
        this.pstgPgmName = pstgPgmName;
    }

    @Basic
    @Column(name = "VAL")
    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpApplEvntEntity that = (PrpApplEvntEntity) o;

        if (applId != null ? !applId.equals(that.applId) : that.applId != null) return false;
        if (pstgTs != null ? !pstgTs.equals(that.pstgTs) : that.pstgTs != null) return false;
        if (typeCd != null ? !typeCd.equals(that.typeCd) : that.typeCd != null) return false;
        if (evntDt != null ? !evntDt.equals(that.evntDt) : that.evntDt != null) return false;
        if (pstgPgmName != null ? !pstgPgmName.equals(that.pstgPgmName) : that.pstgPgmName != null) return false;
        if (val != null ? !val.equals(that.val) : that.val != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = applId != null ? applId.hashCode() : 0;
        result = 31 * result + (pstgTs != null ? pstgTs.hashCode() : 0);
        result = 31 * result + (typeCd != null ? typeCd.hashCode() : 0);
        result = 31 * result + (evntDt != null ? evntDt.hashCode() : 0);
        result = 31 * result + (pstgPgmName != null ? pstgPgmName.hashCode() : 0);
        result = 31 * result + (val != null ? val.hashCode() : 0);
        return result;
    }
}
