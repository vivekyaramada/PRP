/**
 * Created by grussell99 on 10/23/2015.
 */
package gov.hhs.cms.prp.data;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Logger;

import gov.hhs.cms.prp.facade.prpFacade;
import sun.rmi.runtime.Log;

@ManagedBean
@RequestScoped
public class EventListBean implements Serializable {

    private final static Logger LOGGER = java.util.logging.Logger.getLogger(EventListBean.class.getName());

    public EventListBean() { }

    private String keyword;

    public void setKeyword(String keyword) {
        if (isInteger(keyword)) this.keyword = keyword;
        else                    this.keyword = "";
    }

    public String getKeyword() {
        return keyword;
    }

    public ArrayList getEvents() {
        ArrayList events = new ArrayList();
        if (null == keyword || "".equals(keyword)) {
            return events;
        } else {
            prpFacade prpFacade = new prpFacade();
            return prpFacade.getEvents(keyword);
        }
    }

    public void searchEvents() {
        getEvents();
    }

    private  boolean  isInteger (String inString) {
        try {
            Integer.parseInt(inString);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

}