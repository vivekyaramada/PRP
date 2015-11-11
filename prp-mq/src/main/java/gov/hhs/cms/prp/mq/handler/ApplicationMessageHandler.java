package gov.hhs.cms.prp.mq.handler;

import com.blackbear.flatworm.ConfigurationReader;
import com.blackbear.flatworm.FileFormat;
import com.blackbear.flatworm.MatchedRecord;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by jarsen on 11/5/15.
 */
public class ApplicationMessageHandler extends MQMessageHandler {

    private final static Logger LOGGER = Logger.getLogger(ApplicationMessageHandler.class.getName());

    public Object handleMessage(String configFilePath, String messageString) throws Exception {

        String messageHeader = messageString.substring(0, 49);
        String messageBody = messageString.substring(50);
        String segmentType = messageBody.substring(0, 3);

        if (messageHeader.equals("APPLICAT")) {
            throw new Exception("Wrong message type.");
        }

        if (segmentType.equals("OPT2") && (messageBody.length() > 70)) {
            messageBody = insertNewlineBetweenSegments(messageBody, 70);
        }

        Object newObject = createObjectFromString(configFilePath, messageString);

        return newObject;
    }

    public Object createObjectFromString(String configFilePath, String messageString) {
        Object newObject = null;

        ConfigurationReader parser = new ConfigurationReader();
        try {
            // TODO Load the configuration file at startup and store the FileFormat object in a Map with the ones for the other message types.
            FileFormat ff = parser.loadConfigurationFile(configFilePath);
            InputStream stream = new ByteArrayInputStream(messageString.getBytes(StandardCharsets.UTF_8));
            BufferedReader bufIn = new BufferedReader(new InputStreamReader(stream));
            MatchedRecord results;
            while ((results = ff.getNextRecord(bufIn)) != null) {
                if (results.getRecordName().equals("application")) {
                    newObject = results.getBean("application");
                }
            }
        } catch (Exception e) {
            LOGGER.log(Level.INFO, e.getMessage());
        }

        return newObject;

    }

}
