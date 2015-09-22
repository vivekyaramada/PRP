package com.gdit.data;

import com.gdit.entity.LoginEntity;
import com.gdit.facade.RdsFacade;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class LoginBean implements Serializable {

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

        RdsFacade rdsFacade = new RdsFacade();
        LoginEntity loginEntity = new LoginEntity();
        loginEntity.setUsername(this.username);
        loginEntity.setPassword(this.password);
        return rdsFacade.checkLogin(loginEntity);

    }

}

