package gov.hhs.cms.prp;

import com.blackbear.flatworm.ConfigurationReader;
import com.blackbear.flatworm.FileFormat;
import com.blackbear.flatworm.MatchedRecord;
import com.blackbear.flatworm.errors.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Created by jarsen on 10/15/15.
 */
public class App {

    public static ClassPathXmlApplicationContext CONTEXT;

    static {
        CONTEXT = new ClassPathXmlApplicationContext("configuration/spring-config.xml");
    }

    public static void main(String[] args) {

        String configFilePath = args[0];
        String messageString = args[1];

        System.out.println(args[1]);

        String[] segments = messageString.split("OPT2");

        System.out.println("Number of segments: " + segments.length);
        System.out.println("Segment 1: " + segments[0]);
        System.out.println("Segment 2: " + segments[1]);
        System.out.println("Segment 3: " + segments[2]);

        String segment;
        for (int i = 1; i < segments.length; i++) {
            segment = "OPT2" + segments[i];


            Object newObject = createObjectFromString(configFilePath, segment);

            if (null != newObject) {
                System.out.println(newObject.toString());
            } else {
                System.out.println("Returned object is null.");
            }
        }

        System.exit(0);
    }

    public static Object createObjectFromString(String configFilePath, String messageString) {
        Object newObject = null;


        ConfigurationReader parser = new ConfigurationReader();
        try {
            FileFormat ff = parser.loadConfigurationFile(configFilePath);
            InputStream stream = new ByteArrayInputStream(messageString.getBytes(StandardCharsets.UTF_8));
            BufferedReader bufIn = new BufferedReader(new InputStreamReader(stream));
            MatchedRecord results;
            while ((results = ff.getNextRecord(bufIn)) != null) {
                if (results.getRecordName().equals("application")) {
                    newObject = results.getBean("application");
                }

                if (results.getRecordName().equals("planOption")){
                    newObject = results.getBean("planOption");
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
