package gov.hhs.cms.prp;

import gov.hhs.cms.prp.mq.PaymentMessageProducer;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

        import java.util.HashMap;
        import java.util.Scanner;

/**
 * Created by jarsen on 10/15/15.
 */
public class ListenerTest {

    public static ClassPathXmlApplicationContext CONTEXT;

    static {
        CONTEXT = new ClassPathXmlApplicationContext("configuration/spring-config.xml");
    }

    public static void main(String[] args) {

        Scanner keyScan = null;

        // ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("configuration/spring-config.xml");

        // send50TestMessages();

        try {
            System.out.println("Press ENTER to end program...");
            keyScan = new Scanner(System.in);
            while (!keyScan.nextLine().equals("")) ;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            keyScan.close();
        }

        CONTEXT.close();
        System.out.println("Message POC finished...");
        System.exit(0);
    }

    public static void send50TestMessages() {
        System.out.println("Starting TestJMSExample");
        System.out.println("Sending 50 messages to ActiveMQ using our Producer...");

        PaymentMessageProducer paymentProducer = (PaymentMessageProducer) CONTEXT.getBean("payment_producer");
        for (int i = 1; i <= 50; i++) {
            HashMap<String, String> message = new HashMap<String, String>();
            String text = String.format("MESSAGE #: %03d", i);
            message.put("message", text);
            paymentProducer.send(message);
        }
    }
}