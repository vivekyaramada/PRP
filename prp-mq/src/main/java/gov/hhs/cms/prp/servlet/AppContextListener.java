package gov.hhs.cms.prp.servlet;

import gov.hhs.cms.prp.mq.MQMessageContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by jarsen on 11/5/15.
 */
public class AppContextListener implements ServletContextListener {
    private final static Logger LOGGER = Logger.getLogger(ServletContextListener.class.getName());

    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO remove the connections to ActiveMQ
        LOGGER.log(Level.INFO, "prp-mq servlet has been shut down");
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        MQMessageContext.init();
        LOGGER.log(Level.INFO, "prp-mq servlet has been started");
    }
}
