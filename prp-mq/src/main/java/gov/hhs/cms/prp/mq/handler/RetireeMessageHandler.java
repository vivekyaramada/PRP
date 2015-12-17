package gov.hhs.cms.prp.mq.handler;

import com.blackbear.flatworm.MatchedRecord;
import gov.hhs.cms.prp.mq.to.RetireeListHeaderTrailerTO;
import gov.hhs.cms.prp.mq.to.RetireeListTO;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by jarsen on 11/5/15.
 */
public class RetireeMessageHandler extends MQMessageHandler {

    private final static Logger LOGGER = Logger.getLogger(RetireeMessageHandler.class.getName());

    private final static String CONFIG_PATH = "configuration/retiree-flatworm-config.xml";

    public final static String RETLIST_HDR_RECORD_NAME = "retireeListHeader";
    public final static String RETLIST_DTL_RECORD_NAME = "retireeListDetail";
    public final static String RETLIST_TRL_RECORD_NAME = "retireeListTrailer";

    public final static String RETLIST_HDR_BEAN_NAME = "retireeListHeader";
    public final static String RETLIST_DTL_BEAN_NAME = "retireeListDetail";
    public final static String RETLIST_TRL_BEAN_NAME = "retireeListTrailer";

    public final static int RETLIST_HDR_SEGMENT_LENGTH = 270;
    public final static int RETLIST_DTL_SEGMENT_LENGTH = 180;
    public final static int RETLIST_TRL_SEGMENT_LENGTH = 270;

    public void handleMessage(String message) throws Exception {

        // Extract messageId, messageHeader, and messageBody from message
        super.handleMessage(message);

        if (!messageId.equals("RETLIST")) {
            throw new Exception("Wrong message type.");
        }

        // Add line feed character between each segment to make the message body
        // look like a multiline file so Flatworm will process it.
        messageBody = insertNewLineBetweenSegments(messageBody, RETLIST_HDR_SEGMENT_LENGTH,
                RETLIST_DTL_SEGMENT_LENGTH, RETLIST_TRL_SEGMENT_LENGTH);

        Object entity = null;
        RetireeListTO retireeListTO = new RetireeListTO();

        InputStream stream = new ByteArrayInputStream(messageBody.getBytes(StandardCharsets.UTF_8));
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(stream));
        MatchedRecord results;
        while ((results = getFileFormat().getNextRecord(bufIn)) != null) {
            if (results.getRecordName().equals(RETLIST_DTL_RECORD_NAME)) {
                entity = (Object) results.getBean(RETLIST_DTL_BEAN_NAME);
                retireeListTO.addDetailRecord(entity);
            } else if (results.getRecordName().equals(RETLIST_HDR_RECORD_NAME)) {
                entity = (Object) results.getBean(RETLIST_HDR_BEAN_NAME);
                retireeListTO.setHeader((RetireeListHeaderTrailerTO) entity);
            } else if (results.getRecordName().equals(RETLIST_TRL_RECORD_NAME)) {
                entity = (Object) results.getBean(RETLIST_TRL_BEAN_NAME);
                retireeListTO.setTrailer((RetireeListHeaderTrailerTO) entity);
            } else {
                throw new Exception("Unknown record name.");
            }
        }

        LOGGER.log(Level.INFO, "retireeListTO: " + retireeListTO.toString());


        // Create a new Retiree file in the same format as the ones that
        // are submitted by vendors and plans sponsors using NDM
        // TODO create a new method and call it

        // Store the new Retiree file in the appropriate location on
        // the file system
        // TODO store the Retiree file on the file system


    }



    @Override
    protected String getConfigFilePath() {
        return CONFIG_PATH;
    }
}
