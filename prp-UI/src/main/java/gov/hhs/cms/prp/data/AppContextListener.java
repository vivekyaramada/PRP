package gov.hhs.cms.prp.data;



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
        LOGGER.log(Level.INFO, "context Detroyed");
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        LOGGER.log(Level.INFO, "contextInitialized");
        LoginBean loginBean = new LoginBean();
        loginBean.getConstants();

    }
}


