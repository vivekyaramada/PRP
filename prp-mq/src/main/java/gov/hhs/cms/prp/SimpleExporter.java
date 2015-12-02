package gov.hhs.cms.prp;

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
 * Created by jarsen on 12/1/15.
 */
public class SimpleExporter {

    FileCreator fileCreator;
    Iterator<ApplicationStatusTO> iterator;
    ByteArrayOutputStream outputStream;

    public SimpleExporter(
            Iterator<ApplicationStatusTO> iterator,
            final String configFile,
            final ByteArrayOutputStream outputStream)
            throws FlatwormCreatorException {
        this.iterator = iterator;
        InputStream config = Thread.currentThread().
                getContextClassLoader().
                getResourceAsStream(configFile);
        this.outputStream = outputStream;
        fileCreator = new FileCreator(config, outputStream);
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
            Logger.getLogger(SimpleExporter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FlatwormCreatorException ex) {
            Logger.getLogger(SimpleExporter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return outputStream.toString();
    }
}