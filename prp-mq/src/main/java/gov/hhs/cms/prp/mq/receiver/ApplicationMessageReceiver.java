package gov.hhs.cms.prp.mq.receiver;

import gov.hhs.cms.prp.mq.handler.ApplicationMessageHandler;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by jarsen on 11/5/15.
 */
public class ApplicationMessageReceiver extends MQMessageReceiver {

    private final static Logger LOGGER = Logger.getLogger(ApplicationMessageReceiver.class.getName());

    private final static String CONFIG_PATH = "configuration/application-flatworm-config.xml";

    public void processMessage(String message) {

        LOGGER.log(Level.INFO, "\nMessage Received: " + message);

        ApplicationMessageHandler handler = new ApplicationMessageHandler();
        // String configPath = "configuration/application-flatworm-config.xml";
        Object newObject = handler.createObjectFromString(CONFIG_PATH, message);
        if (null != newObject) {
            LOGGER.log(Level.INFO, newObject.toString());
        } else {
            LOGGER.log(Level.WARNING, "newObject is null");
        }
    }

}
