package gov.hhs.cms.prp.mq.handler;

import com.blackbear.flatworm.ConfigurationReader;
import com.blackbear.flatworm.FileFormat;
import com.blackbear.flatworm.MatchedRecord;
import com.blackbear.flatworm.errors.FlatwormException;
import gov.hhs.coms.prp.dao.factory.MySQLDAOFactory;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by jarsen on 11/5/15.
 */
public abstract class MQMessageHandler {

    private final static Logger LOGGER = Logger.getLogger(MQMessageHandler.class.getName());

    public static final int MESSAGE_ID_LENGTH = 8;
    public static final int MESSAGE_HEADER_LENGTH = 50;
    public static final int SEGMENT_ID_LENGTH = 4;

    protected static MySQLDAOFactory mySQLDAOFactory;

    protected FileFormat format;

    protected ConfigurationReader reader = new ConfigurationReader();
    protected abstract String getConfigFilePath();

    protected static MySQLDAOFactory getMySQLDAOFactory() {
        if (mySQLDAOFactory == null) {
            mySQLDAOFactory = new MySQLDAOFactory();
        }
        return mySQLDAOFactory;
    }

    public static String insertNewlineBetweenSegments(String messageBody, int segmentLength) {
        int nbrOfSegments = messageBody.length() / segmentLength;
        int position = 0;
        String lineFeed = "\n";
        StringBuilder builder = new StringBuilder(messageBody);

        for (int i = 1; i < nbrOfSegments; i++) {
            position = segmentLength * i;
            builder.insert(position + (i-1), lineFeed);
        }

        return builder.toString();
    }

    protected FileFormat getFileFormat() throws FlatwormException {
        return reader.loadConfigurationFile(getConfigFilePath());
    }


    public static List<Object> createObjectsFromString(FileFormat fileFormat, String message, String recordName, String beanName) throws Exception {
        Object entity = null;
        List<Object> entityList = new ArrayList<Object>();

        InputStream stream = new ByteArrayInputStream(message.getBytes(StandardCharsets.UTF_8));
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(stream));
        MatchedRecord results;
        while ((results = fileFormat.getNextRecord(bufIn)) != null) {
            if (results.getRecordName().equals(recordName)) {
                entity = (Object)results.getBean(beanName);
                entityList.add(entity);
            }
        }

        return entityList;
    }

}
