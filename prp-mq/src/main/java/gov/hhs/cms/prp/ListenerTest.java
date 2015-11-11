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

        String messageBody = "OPT200001036400000025100POS Gold 1500       1BBA101123456789          OPT200001036400000025100POS Gold 1500       1BBA101123456789          OPT200001036400000025100POS Gold 1500       1BBA101123456789          OPT200001036400000025100POS Gold 1500       1BBA101123456789          OPT200001036400000025100POS Gold 1500       1BBA101123456789          ";
        int segmentLength = 70;

        createMultiline(messageBody, segmentLength);

//        try {
//            System.out.println("Press ENTER to end program...");
//            keyScan = new Scanner(System.in);
//            while (!keyScan.nextLine().equals("")) ;
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        } finally {
//            keyScan.close();
//        }
//
//        CONTEXT.close();
//        System.out.println("Message POC finished...");
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

    public static String createMultiline(String messageBody, int segmentLength) {

        int nbrOfSegments = messageBody.length() / segmentLength;
        int position = 0;
        String lineFeed = "\n";
        StringBuilder builder = new StringBuilder(messageBody);

        for (int i = 1; i < nbrOfSegments; i++) {

            position = segmentLength * i;
            builder.insert(position + (i-1), lineFeed);

            System.out.println("i = " + i + lineFeed);
            System.out.println("messageBody = " + lineFeed + builder.toString() + lineFeed + lineFeed);

        }

        return builder.toString();

    }
}