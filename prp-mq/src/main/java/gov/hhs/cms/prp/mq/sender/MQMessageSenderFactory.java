package gov.hhs.cms.prp.mq.sender;

import gov.hhs.cms.prp.mq.MQMessageConstants;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jarsen on 12/3/15.
 */
public class MQMessageSenderFactory {

    public static ClassPathXmlApplicationContext CONTEXT;

    static {
        CONTEXT = new ClassPathXmlApplicationContext("configuration/spring-config.xml");
    }

    // TODO implement this as a legitimate factory method
    public static MQMessageSender getMessageSender(String messageId) {

        MQMessageSender messageSender = null;

        if (MQMessageConstants.APPLSTAT_MSG_ID.equals(messageId)) {
            messageSender = (MQMessageSender) CONTEXT.getBean("application_message_sender");
        }

        return messageSender;
    }
}
