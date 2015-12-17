package gov.hhs.cms.prp;

import com.blackbear.flatworm.errors.FlatwormCreatorException;
import gov.hhs.cms.prp.mq.MQMessageConstants;
import gov.hhs.cms.prp.mq.handler.RetireeMessageHandler;
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

        // generateApplStatMessage();

        // System.out.println("Message creation finished...");

        handleRetireeListMessage();

        System.out.println("Message handled...");

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

    public static void handleRetireeListMessage() {

        String message = "RETLIST 201512171520470123000100000000004Y        RETH12015_GENERAL_MOTORS_RETIREE_FILE.CSV|0000025100|0000103460|RETLIST                                                                                                                                                                                             00000002  RLST0000103460GMRET123            2015010120151231ROBERT                        PARMSTRONG                               123456789A123456789DC19500815101   201512150000025100      RLST0000103460GMRET123            2015010120151231LUDMILLA                      GIVANOVA                                 234567890S234567890BT19490215203   201512150000025100      RETT12015_GENERAL_MOTORS_RETIREE_FILE.CSV|0000025100|0000103460|RETLIST                                                                                                                                                                                             00000002  ";

        RetireeMessageHandler handler = new RetireeMessageHandler();
        try {
            handler.handleMessage(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
