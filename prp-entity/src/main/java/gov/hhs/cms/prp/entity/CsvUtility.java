package gov.hhs.cms.prp.entity;

import java.util.ArrayList;
//import java.util.logging.Logger;

/**
 * Created by grussell99 on 11/2/2015.
 */
public class CsvUtility {
    //private final static Logger LOGGER                = Logger.getLogger(CsvUtility.class.getName());
    private final static int    QUAL_NOT_STARTED      = 0;
    private final static int    QUAL_TERMINATED       = 1;
    private final static int    QUAL_STARTED          = 2;
    private final static int    QUAL_TERM_PENDING     = 3;
    private final static char   SEPARATOR             = ',';
    private final static String SEPARATOR_STRING      = Character.toString(SEPARATOR);
    private final static char   QUALIFIER             = '\'';   // single-quote
    private final static String QUALIFIER_STRING      = Character.toString(QUALIFIER);

    public   CsvUtility () {
        return;
    }

    public   ArrayList<String> parseCsvString (String csv, int minEntries) {
        ArrayList<String> result = new ArrayList<String>();
        boolean fieldEscaped    = false;
        int     qualState       = QUAL_NOT_STARTED;
        int     start           = -1;
        int     end             = -2;
        int     maxLgth         = csv.length();

        for (int suba=0; suba < maxLgth; suba++) {
            char xdata = csv.charAt(suba);
            if (qualState == QUAL_TERM_PENDING) {
                if (xdata == QUALIFIER) {
                    fieldEscaped = true;
                    qualState    = QUAL_STARTED;
                    if (start < 0) start = suba - 1;
                    end          = suba;
                    continue;
                }
                else qualState = QUAL_TERMINATED;
            }
            if (qualState == QUAL_STARTED) {
                if (xdata == QUALIFIER) {
                    qualState = QUAL_TERM_PENDING;
                    continue;
                }
                if (start == -1) start = suba; // first char after qual
                end = suba;
                continue;
            }
            if (xdata == SEPARATOR) {
                result.add(getFldEntry(csv, start, end, fieldEscaped));
                fieldEscaped = false;
                qualState    = QUAL_NOT_STARTED;
                start = -1;
                end   = -2;
                continue;
            }
            if (xdata == QUALIFIER) {
                qualState = QUAL_STARTED;
                start     = -1;
                end       = -2;
                continue;
            }
            if (qualState > QUAL_NOT_STARTED) continue;
            if (xdata     < 0x21)             continue;
            end = suba;
            if (start == -1) start = suba;
        }
        if (end >= start) result.add(getFldEntry(csv, start, end, fieldEscaped));
        int ctr = result.size();
        for (int a=ctr; a<minEntries; a++) {
            result.add("");
        }
        return result;
    }

    private String getFldEntry(String csv, int inStart, int inEnd, boolean fieldEscaped) {
        if (inEnd < inStart)     return "";
        if (!fieldEscaped)       return csv.substring(inStart, inEnd+1);

        StringBuffer sb = new StringBuffer();
        sb.append(csv.substring(inStart, inEnd+1));
        int end = inEnd - inStart;   // thru next to last byte
        for (int a=0; a < end; a++) {
            if (sb.charAt(a) == QUALIFIER && sb.charAt(a+1) == QUALIFIER) {
                for (int c=a+1; c < end; c++) {
                    sb.setCharAt(c, sb.charAt(c+1));
                }
                end--;
            }
        }
        return sb.substring(0, ++end);
    }

    public  String buildCsvString (String...         inFields) {
        int nbrStrings = inFields.length;
        ArrayList<String> fields = new ArrayList<String>(nbrStrings);
        for (int a=0; a<nbrStrings;a++) {
            fields.add(inFields[a]);
        }
        return buildCsvString(fields);
    }

    public  String buildCsvString (ArrayList<String> inFields) {
        StringBuffer sb = new StringBuffer();
        int total = inFields.size();
        if (total == 0) return "";

        for (int a=0; a<total; a++) {
            String fld = inFields.get(a);
            if (a > 0) sb.append(SEPARATOR);
            if (fld == null) continue;
            if (fld.contains(QUALIFIER_STRING)) {
                fld   = escapeQualifier(fld);
                sb.append(QUALIFIER);
                sb.append(fld);
                sb.append(QUALIFIER);
                continue;
            }
            if (fld.contains(SEPARATOR_STRING)) {
                sb.append(QUALIFIER);
                sb.append(fld);
                sb.append(QUALIFIER);
                continue;
            }
            sb.append(fld);
        }
        return sb.toString();
    }

    private String escapeQualifier (String field) {
        int    fldLength = field.length();
        StringBuffer sb = new StringBuffer();
        for (int a=0; a<fldLength; a++) {
            sb.append(field.charAt(a));
            if (field.charAt(a) == QUALIFIER) {
                sb.append(field.charAt(a));
            }
        }
        return sb.toString();
    }
}
