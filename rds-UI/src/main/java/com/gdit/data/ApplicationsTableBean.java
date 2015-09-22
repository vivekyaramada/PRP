package com.gdit.data;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;

import com.gdit.facade.RdsFacade;

@ManagedBean
@RequestScoped
public class ApplicationsTableBean {
    public ApplicationsTableBean() {
    }

    public ArrayList getApplications() {

        RdsFacade rdsFacade = new RdsFacade();
        return rdsFacade.getApplications();

    }
}
