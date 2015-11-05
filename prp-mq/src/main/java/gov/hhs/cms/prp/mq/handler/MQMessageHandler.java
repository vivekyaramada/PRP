package gov.hhs.cms.prp.mq.handler;

/**
 * Created by jarsen on 11/5/15.
 */
public abstract class MQMessageHandler {

    public abstract Object createObjectFromString(String configFilePath, String messageString);

}
