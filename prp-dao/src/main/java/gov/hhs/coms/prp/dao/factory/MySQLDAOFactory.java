package gov.hhs.coms.prp.dao.factory;


import gov.hhs.cms.prp.dao.bean.AddChecksDAOBean;
import gov.hhs.cms.prp.dao.bean.CheckLoginDAOBean;
import gov.hhs.cms.prp.dao.bean.GetMsgDAOBean;
import java.util.logging.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import gov.hhs.cms.prp.dao.bean.ConstantsDAOBean;
import gov.hhs.coms.prp.dao.factory.DAOFactory;

/**
 * Created by VivekKumar.ReddyYara on 10/23/2015.
 */
public class MySQLDAOFactory extends DAOFactory {
    private final static Logger LOGGER = Logger.getLogger(MySQLDAOFactory.class.getName());

 /*   public static final String DRIVER=
            "COM.cloudscape.core.RmiJdbcDriver";
    public static final String DBURL=
            "jdbc:cloudscape:rmi://localhost:1099/CoreJ2EEDB";*/

  /*  // method to create Cloudscape connections
    public static Connection createConnection() {
        // Use DRIVER and DBURL to create a connection
        // Recommend connection pool implementation/usage
    }*/


    public Object getBean(String beanname) {
        try {
            LOGGER.info("Calling getBean Method from SQLDAOFactory>>>>>>>>>>>>>");
            ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

            if (beanname != null && beanname.equals("getmsgdaobean")) {
                return (GetMsgDAOBean) context.getBean("getmsgdaobean");
            } else if (beanname != null && beanname.equals("checklogindaobean")) {
                return (CheckLoginDAOBean) context.getBean("checklogindaobean");

            } else if (beanname != null && beanname.equals("addchecksdaobean")) {
                return (AddChecksDAOBean) context.getBean("addchecksdaobean");

            } else if (beanname != null && beanname.equals("constantsdaobean")) {
                return (ConstantsDAOBean) context.getBean("constantsdaobean");
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


