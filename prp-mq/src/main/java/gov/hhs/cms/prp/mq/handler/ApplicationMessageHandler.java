package gov.hhs.cms.prp.mq.handler;

import com.blackbear.flatworm.ConfigurationReader;
import com.blackbear.flatworm.FileFormat;
import com.blackbear.flatworm.MatchedRecord;
import gov.hhs.cms.prp.dao.bean.PrpAplctnDAOBean;
import gov.hhs.cms.prp.entity.PrpAplctnEntity;
import gov.hhs.cms.prp.entity.PrpPlanoptionsEntity;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
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
            entityList = createObjectFromString(configFilePath, messageBody, "planOption", "planOption");
            savePlanoptionEntities(entityList);
        } else {
            entityList = createObjectFromString(configFilePath, messageBody, "application", "application");
            saveAplctnEntity(entityList);
        }

        LOGGER.log(Level.INFO, entityList.toString());


    }

    public List<Object> createObjectFromString(String configFilePath, String messageString, String recordName, String beanName) throws Exception {
        LOGGER.log(Level.INFO, "Entering createObjectFromString");
        Object entity = null;
        List<Object> entityList = new ArrayList<Object>();

        ConfigurationReader parser = new ConfigurationReader();

        // TODO Load the configuration file at startup and store the FileFormat object in a Map with the ones for the other message types.
        FileFormat ff = parser.loadConfigurationFile(configFilePath);
        InputStream stream = new ByteArrayInputStream(messageString.getBytes(StandardCharsets.UTF_8));
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(stream));
        MatchedRecord results;
        while ((results = ff.getNextRecord(bufIn)) != null) {
            LOGGER.log(Level.INFO, results.toString());
            if (results.getRecordName().equals(recordName)) {
                entity = (Object)results.getBean(beanName);
                LOGGER.log(Level.INFO, entity.toString());
                entityList.add(entity);
            }
        }

        LOGGER.log(Level.INFO, entityList.toString());
        LOGGER.log(Level.INFO, "Exiting createObjectFromString");
        return entityList;

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
