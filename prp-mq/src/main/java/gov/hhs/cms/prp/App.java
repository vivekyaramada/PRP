package gov.hhs.cms.prp;

import com.blackbear.flatworm.errors.FlatwormCreatorException;
import gov.hhs.cms.prp.mq.MQMessageConstants;
import gov.hhs.cms.prp.mq.sender.ApplicationMessageSender;
import gov.hhs.cms.prp.mq.to.ApplicationStatusTO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.ByteArrayOutputStream;
import java.util.*;

/**
 * Created by jarsen on 10/15/15.
 */
public class App {

    public static ClassPathXmlApplicationContext CONTEXT;

    static {
        CONTEXT = new ClassPathXmlApplicationContext("configuration/spring-config.xml");
    }

    public static void main(String[] args) {

        generateApplStatMessage();

        System.out.println("Message creation finished...");
        System.exit(0);
    }

    public static void generateApplStatMessage() {
        ApplicationStatusTO appStatusTO = new ApplicationStatusTO();
        appStatusTO.setSegmentId(MQMessageConstants.RLSR_SGMT_ID);
        appStatusTO.setApplicationIdentifier(342445);
        appStatusTO.setStatus("R");
        appStatusTO.setDate(new Date(System.currentTimeMillis()));
        appStatusTO.setTransmissionMethod("3");
        appStatusTO.setSubmitterId("A1011");
        appStatusTO.setSwsCopy("Y");
        String configFile = "configuration/application-flatworm-config.xml";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        List<ApplicationStatusTO> appStatusTOList = new ArrayList<ApplicationStatusTO>();
        appStatusTOList.add(appStatusTO);
        Iterator<ApplicationStatusTO> iterator = appStatusTOList.iterator();
        StringBuilder outputText = new StringBuilder();
        ApplicationMessageSender applicationMessageSender = (ApplicationMessageSender) CONTEXT.getBean("application_message_sender");
        Map<String, String> message = new HashMap<String, String>();

        try {
            SimpleExporter exporter = new SimpleExporter(iterator, configFile, outputStream);
            outputText.append(applicationMessageSender.getMessageHeader(MQMessageConstants.APPLSTAT_MSG_ID, 1));
            outputText.append(exporter.execute("rlsr"));
            message.put("message", outputText.toString());
            applicationMessageSender.send(message);
            System.out.println(message);
        } catch (FlatwormCreatorException e) {
            e.printStackTrace();
        } finally {
            CONTEXT.close();
        }

    }

}
