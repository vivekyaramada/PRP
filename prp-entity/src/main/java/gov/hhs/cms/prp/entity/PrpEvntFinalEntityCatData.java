package gov.hhs.cms.prp.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by grussell99 on 11/12/2015.
 */
public class PrpEvntFinalEntityCatData extends PrpEvntFinalEntity {

    public   PrpEvntFinalEntityCatData (PrpEvntFinalEntity source) {
        copyFrom(source);
    }

    private void copyFrom (PrpEvntFinalEntity source) {
        setPkPrpEventId      (source.getPkPrpEventId());
        setEvntTypeCd        (source.getEvntTypeCd());
        setEvntOrgnCd        (source.getEvntOrgnCd());
        setProcTs            (source.getProcTs());
        setUserName          (source.getUserName());
        setPlanSpnsrIdent    (source.getPlanSpnsrIdent());
        setAplctnIdent       (source.getAplctnIdent());
        setEvntNum           (source.getEvntNum());
        setCycDt             (source.getCycDt());
        setCycNum            (source.getCycNum());
        setEvntRfrncNum      (source.getEvntRfrncNum());
        setProcRfrncNum      (source.getProcRfrncNum());
        setExtrnlRfrncAplctn (source.getExtrnlRfrncAplctn());
        setExtrnlRfrncNum    (source.getExtrnlRfrncNum());
        setRsnCd             (source.getRsnCd());
        setTransAmt          (source.getTransAmt());
        setPyblAmt           (source.getPyblAmt());
        setIntrmAdjstmtAmt   (source.getIntrmAdjstmtAmt());
        setUnapldCashAmt     (source.getUnapldCashAmt());
        setRcvblPrncpalAmt   (source.getRcvblPrncpalAmt());
        setRcvblIntrstAmt    (source.getRcvblIntrstAmt());
        setEvntCtgry         (source.getEvntCtgry());
    }

    // -----------------------------------------------------------------------------------


    protected int           getInteger    (String data) {
        return Integer.getInteger(data, 0);
    }

    protected String        setInteger    (int    data) {
        return Integer.toString(data);
    }

    protected Date getDate       (String data) {
        if (data == null || data.equals("") || data.length() != 8) return null;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        try {
            java.util.Date temp = format.parse(data);
            java.sql.Date  date = new Date(temp.getTime());
            return date;
        }
        catch (ParseException e) {
            return null;
        }
    }

    protected String        setDate       (Date data) {
        if (data == null) return "";
        return "";
    }

    protected BigDecimal getBigDecimal (String data) {
        if (data == null || data.equals("")) return BigDecimal.ZERO;;
        try {
            return new BigDecimal(data);
        }
        catch (NumberFormatException e) {
            return BigDecimal.ZERO;
        }
    }

    protected String        setBigDecimal (BigDecimal data) {
        if (data == null) return "";
        return "";
    }

    // -----------------------------------------------------------------------------------
}
