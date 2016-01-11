package gov.hhs.cms.prp.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_key_tbl", schema = "", catalog = "prp")
public class PrpKeyTblEntity {
    private String keyTypeCd;
    private Integer lastSeqNum;
    private String updtPgmId;
    private Timestamp updtTs;

    @Id
    @Column(name = "KEY_TYPE_CD")
    public String getKeyTypeCd() {
        return keyTypeCd;
    }

    public void setKeyTypeCd(String keyTypeCd) {
        this.keyTypeCd = keyTypeCd;
    }

    @Basic
    @Column(name = "LAST_SEQ_NUM")
    public Integer getLastSeqNum() {
        return lastSeqNum;
    }

    public void setLastSeqNum(Integer lastSeqNum) {
        this.lastSeqNum = lastSeqNum;
    }

    @Basic
    @Column(name = "UPDT_PGM_ID")
    public String getUpdtPgmId() {
        return updtPgmId;
    }

    public void setUpdtPgmId(String updtPgmId) {
        this.updtPgmId = updtPgmId;
    }

    @Basic
    @Column(name = "UPDT_TS")
    public Timestamp getUpdtTs() {
        return updtTs;
    }

    public void setUpdtTs(Timestamp updtTs) {
        this.updtTs = updtTs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpKeyTblEntity that = (PrpKeyTblEntity) o;

        if (keyTypeCd != null ? !keyTypeCd.equals(that.keyTypeCd) : that.keyTypeCd != null) return false;
        if (lastSeqNum != null ? !lastSeqNum.equals(that.lastSeqNum) : that.lastSeqNum != null) return false;
        if (updtPgmId != null ? !updtPgmId.equals(that.updtPgmId) : that.updtPgmId != null) return false;
        if (updtTs != null ? !updtTs.equals(that.updtTs) : that.updtTs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = keyTypeCd != null ? keyTypeCd.hashCode() : 0;
        result = 31 * result + (lastSeqNum != null ? lastSeqNum.hashCode() : 0);
        result = 31 * result + (updtPgmId != null ? updtPgmId.hashCode() : 0);
        result = 31 * result + (updtTs != null ? updtTs.hashCode() : 0);
        return result;
    }
}
