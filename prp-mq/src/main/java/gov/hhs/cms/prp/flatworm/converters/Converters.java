package gov.hhs.cms.prp.flatworm.converters;

import com.blackbear.flatworm.ConversionOption;
import com.blackbear.flatworm.errors.FlatwormConversionException;

import java.util.Date;
import java.util.Map;

/**
 * Created by jarsen on 11/10/15.
 */
public class Converters {

    private final static com.blackbear.flatworm.converters.CoreConverters flatwormConverters = new com.blackbear.flatworm.converters.CoreConverters();

    public Date convertSqlDate(String str, Map<String, ConversionOption> options) throws FlatwormConversionException {

        java.sql.Date sqlDate = null;

        java.util.Date utilDate = flatwormConverters.convertDate(str, options);

        if (null == utilDate) {
            return null;
        } else {
            return new java.sql.Date(utilDate.getTime());
        }

    }

}
