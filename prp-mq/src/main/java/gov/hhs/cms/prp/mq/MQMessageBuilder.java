package gov.hhs.cms.prp.mq;

import com.blackbear.flatworm.FileCreator;
import com.blackbear.flatworm.errors.FlatwormCreatorException;
import gov.hhs.cms.prp.mq.to.ApplicationStatusTO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by jarsen on 12/3/15.
 */
public class MQMessageBuilder {
    FileCreator fileCreator;
    Iterator<ApplicationStatusTO> iterator;
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    ApplicationStatusTO appStatusTO;
    String messageId;
    String configFilePath;

    public MQMessageBuilder(
            Iterator<ApplicationStatusTO> iterator,
            final String configFile,
            final ByteArrayOutputStream outputStream)
            throws FlatwormCreatorException {
        this.iterator = iterator;
        // TODO Can we cache the configFiles or even the MQMessageBuilder instances?
        InputStream config = Thread.currentThread().
                getContextClassLoader().
                getResourceAsStream(configFile);
        this.outputStream = outputStream;
        fileCreator = new FileCreator(config, outputStream);
    }

    public MQMessageBuilder(
            final String messageId,
            ApplicationStatusTO appStatusTO,
            final String configFilePath)
        throws FlatwormCreatorException {

        this.messageId = messageId;
        this.appStatusTO = appStatusTO;
        this.configFilePath = configFilePath;
        this.outputStream = outputStream;
        this.fileCreator = new FileCreator(configFilePath, outputStream);
    }


    public String execute(String recordName) {
        try {
            // fileCreator.setRecordSeperator("\r\n");
            fileCreator.open();
            ApplicationStatusTO appStatusTO;
            while (iterator.hasNext()) {
                appStatusTO = iterator.next();
                fileCreator.setBean("appStatusTO", appStatusTO);
                fileCreator.write(recordName);
            }
            fileCreator.close();
        } catch (IOException ex) {
            Logger.getLogger(MQMessageBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FlatwormCreatorException ex) {
            Logger.getLogger(MQMessageBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return outputStream.toString();
    }

    public String execute(String recordName, String beanName) {
        try {
            // fileCreator.setRecordSeperator("\r\n");
            fileCreator.open();
            ApplicationStatusTO appStatusTO;
            fileCreator.setBean(beanName, this.appStatusTO);
            fileCreator.write(recordName);
            fileCreator.close();
        } catch (IOException ex) {
            Logger.getLogger(MQMessageBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FlatwormCreatorException ex) {
            Logger.getLogger(MQMessageBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return outputStream.toString();
    }

}
