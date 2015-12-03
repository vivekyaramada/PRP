package gov.hhs.cms.prp.mq.sender;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jms.core.JmsTemplate;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by jarsen on 12/1/15.
 */
public abstract class MQMessageSender {

    private JmsTemplate jmsTemplate;

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void send(final Object Object) {
        jmsTemplate.convertAndSend(Object);
    }

    public abstract void send(String messageId, Object payload);

    protected abstract String getConfigFilePath();

    public static void sendMessage(String messageId, Object payload) {
        MQMessageSender messageSender = MQMessageSenderFactory.getMessageSender(messageId);
        messageSender.send(messageId, payload);
    }

    public String getMessageHeader(String messageId, int numberOfSegments) {
        // Message ID
        StringBuilder header = new StringBuilder(StringUtils.rightPad(messageId, 8, " "));
        // Unique group identifier
        header.append(getUniqueGroupIdentifier());
        // Sequence number within group - always 0001
        header.append("0001");
        // Sub-sequence number - always 0000 in MQ, needed on mainframe
        header.append("0000");
        // Number of segments in message
        header.append(StringUtils.leftPad(String.valueOf(numberOfSegments), 7, "0"));
        // Last message of group - always "Y"
        header.append("Y");
        // 8 bytes of filler to make up 50 bytes
        header.append("        ");

        return header.toString();
    }

    protected String getUniqueGroupIdentifier() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss0SSS");
        Calendar calendar = Calendar.getInstance();
        String identifier = sdf.format(calendar.getTime());
        return identifier;
    }
}
