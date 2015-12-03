package gov.hhs.cms.prp.mq.sender;

import gov.hhs.cms.prp.mq.MQMessageBuilder;
import gov.hhs.cms.prp.mq.MQMessageConstants;
import gov.hhs.cms.prp.mq.to.ApplicationStatusTO;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by jarsen on 12/1/15.
 */
public class ApplicationMessageSender extends MQMessageSender {

    private final static Logger LOGGER = Logger.getLogger(ApplicationMessageSender.class.getName());



    private StringBuilder message = new StringBuilder();

    @Override
    public void send(String messageId, Object payload) {
        if (MQMessageConstants.APPLSTAT_MSG_ID.equals(messageId)) {
            sendAppStatusMessage(payload);
        } else {
            LOGGER.log(Level.INFO, "Unexpected messageId value: " + messageId);
        }
    }

    @Override
    protected String getConfigFilePath() {
        return "configuration/application-flatworm-config.xml";
    }

    private void sendAppStatusMessage(Object payload) {
        List<ApplicationStatusTO> list;
        ApplicationStatusTO appStatusTO;
        String message;
        String messageBody;
        try {
            list = (List<ApplicationStatusTO>) payload;
            appStatusTO = (ApplicationStatusTO) list.get(0);
            message = getMessageHeader(MQMessageConstants.APPLSTAT_MSG_ID, list.size());
            MQMessageBuilder builder = new MQMessageBuilder(MQMessageConstants.APPLSTAT_MSG_ID, appStatusTO, getConfigFilePath());
            messageBody = builder.execute("rlsr", "appStatusTO");
            message += messageBody;
            send(message);

            LOGGER.log(Level.INFO, appStatusTO.toString());
            LOGGER.log(Level.INFO, "Message: " + message);


        } catch (ClassCastException ex) {
            LOGGER.log(Level.INFO, "Expected a list of ApplicationStatusTO objects." + ex.getMessage());
        } catch (IndexOutOfBoundsException ex) {
            LOGGER.log(Level.INFO, "Expected a list containing one ApplicationStatusTO object." + ex.getMessage());
        } catch (Exception ex) {
            LOGGER.log(Level.INFO, "What fresh hell is this?" + ex.getMessage());
        }


    }




/*
    public void sendMessage(String messageId, List<ApplicationStatusTO> applicationStatusTOList) {

    }
*/

    // Construct the message


    // Build the message text
}
