package gov.hhs.cms.prp.entity;

import javax.persistence.*;

/**
 * Created by VivekKumar.ReddyYara on 1/11/2016.
 */
@Entity
@Table(name = "prp_fl_type_ref", schema = "", catalog = "prp")
public class PrpFlTypeRefEntity {
    private String fileTypeCd;
    private String descTxt;

    @Id
    @Column(name = "FILE_TYPE_CD")
    public String getFileTypeCd() {
        return fileTypeCd;
    }

    public void setFileTypeCd(String fileTypeCd) {
        this.fileTypeCd = fileTypeCd;
    }

    @Basic
    @Column(name = "DESC_TXT")
    public String getDescTxt() {
        return descTxt;
    }

    public void setDescTxt(String descTxt) {
        this.descTxt = descTxt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrpFlTypeRefEntity that = (PrpFlTypeRefEntity) o;

        if (fileTypeCd != null ? !fileTypeCd.equals(that.fileTypeCd) : that.fileTypeCd != null) return false;
        if (descTxt != null ? !descTxt.equals(that.descTxt) : that.descTxt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileTypeCd != null ? fileTypeCd.hashCode() : 0;
        result = 31 * result + (descTxt != null ? descTxt.hashCode() : 0);
        return result;
    }
}
