package gov.hhs.cms.prp.mq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

/**
 * Created by jarsen on 11/5/15.
 */
public class MQMessageContext {

    private final static Logger LOGGER = Logger.getLogger(MQMessageContext.class.getName());

    public static ClassPathXmlApplicationContext APPLICATION_CONTEXT;

    public static void init() {
        ClassPathXmlApplicationContext CONTEXT = new ClassPathXmlApplicationContext("configuration/spring-config.xml");
    }

}
