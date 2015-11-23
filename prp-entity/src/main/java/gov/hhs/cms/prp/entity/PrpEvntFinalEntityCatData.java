package gov.hhs.cms.prp.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;

/**
 * Created by grussell99 on 11/12/2015.
 */
public class PrpEvntFinalEntityCatData extends PrpEvntFinalEntity {
    final static Logger lOGGER = Logger.getLogger(PrpEvntFinalEntityCatData.class.getName());
    public   PrpEvntFinalEntityCatData () { }

    public PrpEvntFinalEntity getFinalEntityByCategory() {
        String             category = getEvntCtgry();
        PrpEvntFinalEntityCatData eventCat;
        if      (category.equalsIgnoreCase("ach")) {
            eventCat = new PrpEvntFinalEntityAch();
        }
        else if (category.equalsIgnoreCase("bnk")) {
            eventCat = new PrpEvntFinalEntityBnk();
        }
        else if (category.equalsIgnoreCase("chk")) {
            eventCat = new PrpEvntFinalEntityChk();
        }
        else if (category.equalsIgnoreCase("cmt")) {
            eventCat = new PrpEvntFinalEntityCmt();
        }
        else if (category.equalsIgnoreCase("cyc")) {
            eventCat = new PrpEvntFinalEntityCyc();
        }
        else if (category.equalsIgnoreCase("det")) {
            eventCat = new PrpEvntFinalEntityDet();
        }
        else if (category.equalsIgnoreCase("req")) {
            eventCat = new PrpEvntFinalEntityReq();
        }
        else return this;
        eventCat.copyFrom(this);
        eventCat.setEvntCtgryData(this.getEvntCtgryData());
        return eventCat;
    }

    protected void copyFrom (PrpEvntFinalEntity source) {
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
            java.util.Date date = format.parse(data);
            return date;
        }
        catch (ParseException e) {
            return null;
        }
    }

    protected String        setDate       (Date data) {
        if (data == null) return "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String dateString = sdf.format(data);
        lOGGER.info("PrpEvntFinalEntityCatData.setDate(): " + dateString);
        return dateString;
    }

    protected BigDecimal getBigDecimal (String data) {
        if (data == null || data.equals("")) return BigDecimal.ZERO;
        try {
            return new BigDecimal(data);
        }
        catch (NumberFormatException e) {
            return BigDecimal.ZERO;
        }
    }

    protected String        setBigDecimal (BigDecimal data) {
        if (data == null) return "0.00";
        String amountString = data.toString();
        return amountString;
    }

    // -----------------------------------------------------------------------------------
}
