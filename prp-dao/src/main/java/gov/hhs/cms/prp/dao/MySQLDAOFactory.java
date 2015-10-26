package gov.hhs.cms.prp.dao;

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
    public ApplicationServiceDAO getApplicationServiceDAO() {
        // CloudscapeCustomerDAO implements CustomerDAO
        return new MysqlApplicationServiceDAO();
    }
}
