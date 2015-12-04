package gov.hhs.cms.prp.mq.handler;

import gov.hhs.cms.prp.dao.bean.PrpAplctnDAOBean;
import gov.hhs.cms.prp.entity.PrpAplctnEntity;
import gov.hhs.cms.prp.entity.PrpPlanoptionsEntity;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by jarsen on 11/5/15.
 */
public class ApplicationMessageHandler extends MQMessageHandler {

    private final static Logger LOGGER = Logger.getLogger(ApplicationMessageHandler.class.getName());

    public void handleMessage(String configFilePath, String messageString) throws Exception {

        String messageId = messageString.substring(0, 8).trim();
        LOGGER.log(Level.INFO, "messageId: " + messageId);
        String messageHeader = messageString.substring(0, 49);
        LOGGER.log(Level.INFO, "messageHeader: " + messageHeader);
        String messageBody = messageString.substring(50);
        LOGGER.log(Level.INFO, "messageBody: " + messageBody);
        String segmentType = messageBody.substring(0, 4);
        LOGGER.log(Level.INFO, "segmentType: " + segmentType);

        if (!messageId.equals("APPLICAT")) {
            throw new Exception("Wrong message type.");
        }

        List<Object> entityList;
        if (segmentType.equals("OPT2")) {
            if (messageBody.length() > 70) {
                messageBody = insertNewlineBetweenSegments(messageBody, 70);
            }
            entityList = createObjectsFromString(configFilePath, messageBody, "planOption", "planOption");
            savePlanoptionEntities(entityList);
        } else {
            entityList = createObjectsFromString(configFilePath, messageBody, "application", "application");
            saveAplctnEntity(entityList);
        }

        LOGGER.log(Level.INFO, entityList.toString());


    }

    private void saveAplctnEntity(List<Object> entityList) {
        PrpAplctnDAOBean prpAplctnDAOBean = (PrpAplctnDAOBean) getMySQLDAOFactory().getBean("saveaplctndaobean");

        for (Object entity : entityList) {
            // prpAplctnDAOBean.persistAplctn(entity);
            prpAplctnDAOBean.mergeAplctn((PrpAplctnEntity) entity);
        }
    }

    private void savePlanoptionEntities(List<Object> entityList) {
        PrpAplctnDAOBean prpAplctnDAOBean = (PrpAplctnDAOBean) getMySQLDAOFactory().getBean("saveaplctndaobean");

        for (Object entity : entityList) {
            // prpAplctnDAOBean.persistAplctn(entity);
            prpAplctnDAOBean.mergePlanoption((PrpPlanoptionsEntity) entity);
        }
    }

}
