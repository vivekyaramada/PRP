package gov.hhs.cms.prp.mq.handler;

import gov.hhs.cms.prp.dao.bean.PrpAplctnDAOBean;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by jarsen on 11/5/15.
 */
public class RetireeMessageHandler extends MQMessageHandler {

    private final static Logger LOGGER = Logger.getLogger(RetireeMessageHandler.class.getName());

    private final static String CONFIG_PATH = "configuration/application-flatworm-config.xml";

    public final static String APPLICATION_BEAN_NAME = "application";
    public final static String APPLICATION_RECORD_NAME = "application";
    public final static String APPLICATION_DAO_NAME = "saveaplctndaobean";
    public final static String PLAN_OPTION_BEAN_NAME = "planOption";
    public final static String PLAN_OPTION_RECORD_NAME = "planOption";
    public final static int OPT2_SEGMENT_LENGTH = 70;

    public void handleMessage(String message) throws Exception {

        String messageId = message.substring(0, MESSAGE_ID_LENGTH).trim();
        LOGGER.log(Level.INFO, "messageId: " + messageId);
        String messageHeader = message.substring(0, MESSAGE_HEADER_LENGTH);
        LOGGER.log(Level.INFO, "messageHeader: " + messageHeader);
        String messageBody = message.substring(MESSAGE_HEADER_LENGTH);
        LOGGER.log(Level.INFO, "messageBody: " + messageBody);
        String segmentType = messageBody.substring(0, SEGMENT_ID_LENGTH);
        LOGGER.log(Level.INFO, "segmentType: " + segmentType);

        if (!messageId.equals("APPLICAT")) {
            throw new Exception("Wrong message type.");
        }

        List<Object> entityList;
        if (segmentType.equals("OPT2")) {
            if (messageBody.length() > OPT2_SEGMENT_LENGTH) {
                messageBody = insertNewlineBetweenSegments(messageBody, OPT2_SEGMENT_LENGTH);
            }
            entityList = createObjectsFromString(getFileFormat(), messageBody, PLAN_OPTION_RECORD_NAME, PLAN_OPTION_BEAN_NAME);
            saveEntities(entityList);
        } else {
            entityList = createObjectsFromString(getFileFormat(), messageBody, APPLICATION_RECORD_NAME, APPLICATION_BEAN_NAME);
            saveEntities(entityList);
        }

        LOGGER.log(Level.INFO, entityList.toString());
    }

    private void saveEntities(List<Object> entityList) {
        PrpAplctnDAOBean prpAplctnDAOBean = (PrpAplctnDAOBean) getMySQLDAOFactory().getBean(APPLICATION_DAO_NAME);

        for (Object entity : entityList) {
            prpAplctnDAOBean.mergeEntity(entity);
        }
    }

    @Override
    protected String getConfigFilePath() {
        return CONFIG_PATH;
    }
}
