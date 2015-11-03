package gov.hhs.cms.prp.data;

import gov.hhs.cms.prp.entity.*;
import gov.hhs.cms.prp.facade.prpFacade;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import  org.apache.log4j.Logger;
import javax.servlet.http.HttpSession;

@ManagedBean
@RequestScoped
public class LoginBean implements Serializable {

    private final static Logger LOGGER = Logger.getLogger(LoginBean.class.getName());

    private String username;
    private String password;


    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String checkLogin() {
        prpFacade prpFacade = new prpFacade();
        LoginEntity loginEntity = new LoginEntity();
        loginEntity.setUsername(this.username);
        loginEntity.setPassword(this.password);
        // for UserBean
        HttpSession session = SessionBean.getSession();

        UserDetails userDetails = new UserDetails();
        userDetails.setUsername(this.username);
        userDetails.setPassword(this.password);
        session.setAttribute("userDetails", userDetails);

        return prpFacade.checkLogin(loginEntity,userDetails);
    }
}

