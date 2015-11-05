package gov.hhs.cms.prp.mq;

import gov.hhs.cms.prp.messaging.PaymentMessageHelper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PaymentMessageConsumer {
    private final static Logger LOGGER = Logger.getLogger(PaymentMessageConsumer.class.getName());


    public static ClassPathXmlApplicationContext CONTEXT;

    public static void init() {
        ClassPathXmlApplicationContext CONTEXT = new ClassPathXmlApplicationContext("configuration/spring-config.xml");
    }

	public void processMessage(String message) {

        LOGGER.log(Level.INFO, "\nMessage Received: " + message);

        PaymentMessageHelper simple = new PaymentMessageHelper();
        String configPath = "configuration/simple-example.xml";
        Object newObject = simple.createObjectFromString(configPath, message);
        if (null != newObject) {
            LOGGER.log(Level.INFO, newObject.toString());
        } else {
            LOGGER.log(Level.WARNING, "newObject is null");
        }
    }

	public void processMessage(HashMap<String,String> message) {
        LOGGER.log(Level.INFO, "{processPaymentMessage} HashMap Received: " + message.get("message"));
	}

}
