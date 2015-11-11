package gov.hhs.cms.prp.mq.handler;

import com.blackbear.flatworm.ConfigurationReader;
import com.blackbear.flatworm.FileFormat;
import com.blackbear.flatworm.MatchedRecord;
import com.blackbear.flatworm.errors.*;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Created by jarsen on 11/5/15.
 */
public class ApplicationMessageHandler extends MQMessageHandler {

    public Object createObjectFromString(String configFilePath, String messageString) {
        Object newObject = null;

        ConfigurationReader parser = new ConfigurationReader();
        try {
            FileFormat ff = parser.loadConfigurationFile(configFilePath);
            InputStream stream = new ByteArrayInputStream(messageString.getBytes(StandardCharsets.UTF_8));
            BufferedReader bufIn = new BufferedReader(new InputStreamReader(stream));
            MatchedRecord results;
            while ((results = ff.getNextRecord(bufIn)) != null) {
                if (results.getRecordName().equals("newhire")) {
                    newObject = results.getBean("employee");
                }
            }
        } catch (FlatwormUnsetFieldValueException e) {
            e.printStackTrace();
        } catch (FlatwormConfigurationValueException e) {
            e.printStackTrace();
        } catch (FlatwormInvalidRecordException e) {
            e.printStackTrace();
        } catch (FlatwormInputLineLengthException e) {
            e.printStackTrace();
        } catch (FlatwormCreatorException e) {
            e.printStackTrace();
        } catch (FlatwormConversionException e) {
            e.printStackTrace();
        }

        return newObject;

    }

}
