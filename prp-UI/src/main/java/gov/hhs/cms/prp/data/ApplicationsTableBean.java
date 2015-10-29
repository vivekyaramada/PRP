package gov.hhs.cms.prp.data;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Logger;

import gov.hhs.cms.prp.entity.SessionBean;
import gov.hhs.cms.prp.entity.UserDetails;
import gov.hhs.cms.prp.facade.prpFacade;
import sun.rmi.runtime.Log;

@ManagedBean
@RequestScoped
public class ApplicationsTableBean implements Serializable {

    private final static Logger LOGGER = java.util.logging.Logger.getLogger(ApplicationsTableBean.class.getName());

    public ApplicationsTableBean() {
    }

    private String keyword;


    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }

    public ArrayList getApplications() {
        HttpSession session = SessionBean.getSession();
        UserDetails userDetails = (UserDetails) session.getAttribute("userDetails");

        ArrayList applications = new ArrayList();


        if (null == keyword || "".equals(keyword)) {
            return applications;
        } else {
            prpFacade prpFacade = new prpFacade();

            return prpFacade.getApplications(keyword,userDetails);
        }
    }

    public void searchApplications() {
        getApplications();
    }
}
