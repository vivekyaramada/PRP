package gov.hhs.cms.prp.mq.handler;

/**
 * Created by jarsen on 11/5/15.
 */
public abstract class MQMessageHandler {

    public abstract Object createObjectFromString(String configFilePath, String messageString, String recordName, String beanName) throws Exception;



    public static String insertNewlineBetweenSegments(String messageBody, int segmentLength) {
        int nbrOfSegments = messageBody.length() / segmentLength;
        int position = 0;
        String lineFeed = "\n";
        StringBuilder builder = new StringBuilder(messageBody);

        for (int i = 1; i < nbrOfSegments; i++) {
            position = segmentLength * i;
            builder.insert(position + (i-1), lineFeed);
        }

        return builder.toString();
    }
}
