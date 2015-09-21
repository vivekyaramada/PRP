package com.gdit.data;

import com.gdit.entity.DataloginEntity;
import com.gdit.facade.MasterData;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean(name = "datalogin", eager = true)
@RequestScoped
public class Datalogin implements Serializable {

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

        System.out.println("vivek this method is reached>>>>>");

        MasterData masterData = new MasterData();
        DataloginEntity dataloginEntity = new DataloginEntity();
        dataloginEntity.setUsername(this.username);
        dataloginEntity.setPassword(this.password);
        return masterData.checkLogin(dataloginEntity);

    }

}

