package gov.hhs.cms.prp.mq.receiver;

import gov.hhs.cms.prp.mq.handler.ApplicationMessageHandler;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by jarsen on 11/5/15.
 */
public class ApplicationMessageReceiver extends MQMessageReceiver {

    private final static Logger LOGGER = Logger.getLogger(ApplicationMessageReceiver.class.getName());


    public void processMessage(String message) {

        LOGGER.log(Level.INFO, "\nMessage Received: " + message);

        ApplicationMessageHandler handler = new ApplicationMessageHandler();
        try {
            handler.handleMessage(message);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error occurred: " + e.getMessage());
            LOGGER.log(Level.SEVERE, "Error cause: " + e.getCause());
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        }
    }
}
