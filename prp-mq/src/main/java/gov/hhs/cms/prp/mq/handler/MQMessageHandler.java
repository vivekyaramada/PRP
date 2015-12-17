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
import java.util.logging.Level;
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
    protected String messageId;
    protected String messageHeader;
    protected String messageBody;

    protected ConfigurationReader reader = new ConfigurationReader();
    protected abstract String getConfigFilePath();

    protected static MySQLDAOFactory getMySQLDAOFactory() {
        if (mySQLDAOFactory == null) {
            mySQLDAOFactory = new MySQLDAOFactory();
        }
        return mySQLDAOFactory;
    }

    public void handleMessage(String message) throws Exception {

        messageId = message.substring(0, MESSAGE_ID_LENGTH).trim();
        LOGGER.log(Level.INFO, "messageId: " + messageId);
        messageHeader = message.substring(0, MESSAGE_HEADER_LENGTH);
        LOGGER.log(Level.INFO, "messageHeader: " + messageHeader);
        messageBody = message.substring(MESSAGE_HEADER_LENGTH);
        LOGGER.log(Level.INFO, "messageBody: " + messageBody);
    }

    /*
     * Insert newline character between segments for messages where all of the segments
     * are the same (like APPLICAT messageBody with OPT2 segments)
     */
    public static String insertNewLineBetweenSegments(String messageBody, int segmentLength) {
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

    /*
     * Insert newline character between segments for messages like RETLIST that have
     * a header, a footer, and an arbitrary number of repeating segments between them.
     */
    public static String insertNewLineBetweenSegments(String messageBody, int headerLength, int segmentLength, int trailerLength) {

        String header = "";
        String trailer = "";
        String detail = "";
        StringBuilder builder = new StringBuilder();
        String newLine = "\n";

        if (headerLength > 0) {
            header = messageBody.substring(0, headerLength);
        }

        if (trailerLength > 0) {
            trailer = messageBody.substring(messageBody.length() - trailerLength);
        }

        if (messageBody.length() > (headerLength + trailerLength)) {
            detail = messageBody.substring(headerLength, (messageBody.length() - trailerLength ));
            detail = insertNewLineBetweenSegments(detail, segmentLength);
        }

        if (header.length() > 0) {
            builder.append(header);
            builder.append(newLine);
        }

        if (detail.length() > 0) {
            builder.append(detail);
        }

        if (trailer.length() > 0) {
            builder.append(newLine);
            builder.append(trailer);
        }

        return builder.toString();
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
