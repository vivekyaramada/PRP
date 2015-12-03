package gov.hhs.cms.prp.servlet;

import gov.hhs.cms.prp.mq.MQMessageConstants;
import gov.hhs.cms.prp.mq.sender.MQMessageSender;
import gov.hhs.cms.prp.mq.to.ApplicationStatusTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jarsen on 12/2/15.
 */
public class MessagingTestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Hello World! And Joe!");
        // App.generateApplStatMessage();
        testSendAppStatusMessage();
    }

    private void testSendAppStatusMessage() {
        List<ApplicationStatusTO> list = new ArrayList<ApplicationStatusTO>();
        ApplicationStatusTO appStatusTO = new ApplicationStatusTO();
        appStatusTO.setSegmentId(MQMessageConstants.RLSR_SGMT_ID);
        appStatusTO.setApplicationIdentifier(342445);
        appStatusTO.setStatus("R");
        appStatusTO.setDate(new Date(System.currentTimeMillis()));
        appStatusTO.setTransmissionMethod("3");
        appStatusTO.setSubmitterId("A1011");
        appStatusTO.setSwsCopy("Y");
        list.add(appStatusTO);

        MQMessageSender.sendMessage(MQMessageConstants.APPLSTAT_MSG_ID, list);



    }
}
