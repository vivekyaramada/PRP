package gov.hhs.coms.prp.dao.factory;


import gov.hhs.cms.prp.dao.bean.AddChecksDAOBean;
import gov.hhs.cms.prp.dao.bean.CheckLoginDAOBean;
import gov.hhs.cms.prp.dao.bean.GetMsgDAOBean;
import gov.hhs.cms.prp.dao.bean.PrpAplctnDAOBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by VivekKumar.ReddyYara on 10/23/2015.
 */
public class MySQLDAOFactory extends DAOFactory {

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

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        if (beanname!=null && beanname.equals("getmsgdaobean")) {
            return (GetMsgDAOBean) context.getBean("getmsgdaobean");
        } else if (beanname!=null && beanname.equals("checklogindaobean")) {
            return (CheckLoginDAOBean) context.getBean("checklogindaobean");

        } else if (beanname!=null &&  beanname.equals("addchecksdaobean")) {
            return (AddChecksDAOBean) context.getBean("addchecksdaobean");

        } else if (beanname != null && beanname.equals("saveaplctndaobean")) {
            return (PrpAplctnDAOBean) context.getBean("saveaplctndaobean");
        }
            return null;
    }
}


