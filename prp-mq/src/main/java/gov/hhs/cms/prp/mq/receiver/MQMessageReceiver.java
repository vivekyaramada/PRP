package gov.hhs.cms.prp.mq.receiver;

import java.util.logging.Logger;

/**
 * Created by jarsen on 11/5/15.
 */
public abstract class MQMessageReceiver {

    private final static Logger LOGGER = Logger.getLogger(MQMessageReceiver.class.getName());

    public abstract void processMessage(String message);

    }
