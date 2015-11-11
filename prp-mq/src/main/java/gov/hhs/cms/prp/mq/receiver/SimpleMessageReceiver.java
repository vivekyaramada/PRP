package gov.hhs.cms.prp.mq.receiver;

import gov.hhs.cms.prp.mq.handler.SimpleMessageHandler;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by jarsen on 11/5/15.
 */
public class SimpleMessageReceiver extends MQMessageReceiver {

    private final static Logger LOGGER = Logger.getLogger(SimpleMessageReceiver.class.getName());

    public void processMessage(String message) {

        LOGGER.log(Level.INFO, "\nMessage Received: " + message);

        SimpleMessageHandler simpleHandler = new SimpleMessageHandler();
        String configPath = "configuration/simple-example.xml";
        Object newObject = simpleHandler.createObjectFromString(configPath, message);
        if (null != newObject) {
            LOGGER.log(Level.INFO, newObject.toString());
            System.out.println(newObject.toString());
        } else {
            LOGGER.log(Level.WARNING, "newObject is null");
            System.out.println("newObject is null");
        }
    }

}
