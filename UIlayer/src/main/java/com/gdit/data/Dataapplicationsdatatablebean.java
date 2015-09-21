package com.gdit.data;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;

import com.gdit.facade.MasterData;

@ManagedBean
@RequestScoped
public class Dataapplicationsdatatablebean {
    public Dataapplicationsdatatablebean() {
    }

    public ArrayList getApplications() {

        MasterData masterData = new MasterData();
        return masterData.getApplications();

    }
}
