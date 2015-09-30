package gov.hhs.cms.prp.data;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;

import gov.hhs.cms.prp.facade.prpFacade;

@ManagedBean
@RequestScoped
public class ApplicationsTableBean {
    public ApplicationsTableBean() {
    }

    public ArrayList getApplications() {

        prpFacade prpFacade = new prpFacade();
        return prpFacade.getApplications();

    }
}
