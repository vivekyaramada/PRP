package gov.hhs.cms.prp.mq.handler;

import com.blackbear.flatworm.ConfigurationReader;
import com.blackbear.flatworm.FileFormat;
import com.blackbear.flatworm.MatchedRecord;
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


    protected static MySQLDAOFactory mySQLDAOFactory;

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

    public static List<Object> createObjectsFromString(String configFilePath, String messageString, String recordName, String beanName) throws Exception {
        LOGGER.log(Level.INFO, "Entering createObjectsFromString");
        Object entity = null;
        List<Object> entityList = new ArrayList<Object>();

        ConfigurationReader parser = new ConfigurationReader();

        // TODO Load the configuration file at startup and store the FileFormat object in a Map with the ones for the other message types.
        FileFormat ff = parser.loadConfigurationFile(configFilePath);
        InputStream stream = new ByteArrayInputStream(messageString.getBytes(StandardCharsets.UTF_8));
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(stream));
        MatchedRecord results;
        while ((results = ff.getNextRecord(bufIn)) != null) {
            LOGGER.log(Level.INFO, results.toString());
            if (results.getRecordName().equals(recordName)) {
                entity = (Object)results.getBean(beanName);
                LOGGER.log(Level.INFO, entity.toString());
                entityList.add(entity);
            }
        }

        LOGGER.log(Level.INFO, entityList.toString());
        LOGGER.log(Level.INFO, "Exiting createObjectsFromString");
        return entityList;

    }

}
