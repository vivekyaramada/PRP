/**
 * Created by grussell99 on 10/23/2015.
 */
package gov.hhs.cms.prp.data;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Logger;

import gov.hhs.cms.prp.entity.PrpEvntFinalEntity;
import gov.hhs.cms.prp.entity.SessionBean;
import gov.hhs.cms.prp.entity.UserDetails;
import gov.hhs.cms.prp.facade.prpFacade;
import sun.rmi.runtime.Log;

@ManagedBean
@SessionScoped
public class EventListBean implements Serializable {

    private final static Logger LOGGER = java.util.logging.Logger.getLogger(EventListBean.class.getName());

    public EventListBean() { }

    private Integer    keyPsid         = 0;
    private Integer    keyApplid       = 0;
    private int        selectEventNbr  = 0;

    private ArrayList<PrpEvntFinalEntity> events = null;

    public void     setKeyApplid(Integer keyApplid) {
        this.keyApplid = keyApplid;
    }

    public Integer  getKeyApplid() {
        if (keyApplid != null && keyApplid.equals(0)) return null;
        return keyApplid;
    }

    public void     setKeyPsid(Integer keyPsid) {
        this.keyPsid   = keyPsid;
    }

    public Integer  getKeyPsid  () {
        if (keyPsid != null && keyPsid.equals(0)) return null;
        return keyPsid;
    }

    public ArrayList getEvents() {
        HttpSession session = SessionBean.getSession();
        UserDetails userDetails = (UserDetails) session.getAttribute("userDetails");

        prpFacade prpFacade = new prpFacade();
        events = prpFacade.getEvents(keyPsid, keyApplid, userDetails);

        if (events != null && events.size() > 0) {
            PrpEvntFinalEntity event = events.get(0);
            if (event != null) {
                keyPsid   = event.getPlanSpnsrIdent();
                keyApplid = event.getAplctnIdent();
            }
        }

        return events;
    }

    public void searchEvents() {
        getEvents();
    }

    private  boolean  isInteger (String inString) {
        try {
            Integer.parseInt(inString);
            return true;
        }
        catch (NumberFormatException e) { return false; }
    }

    public PrpEvntFinalEntity getEvent() {
        if (events == null)                 return null;
        if (selectEventNbr < 1)             return null;
        if (selectEventNbr > events.size()) return null;
        return events.get(selectEventNbr-1);
    }

    public void    eventToSelectIs (int selectEventInt) {
        this.selectEventNbr = selectEventInt;
        LOGGER.info("setSelectEventNbr: " + this.selectEventNbr);
    }

    public int     getSelectEventNbr () {
        return selectEventNbr;
    }

    public boolean isDetailSelected () {
        if (selectEventNbr > 0) {
            LOGGER.info("isDetailSelected = true ");
            return true;
        }
        LOGGER.info("isDetailSelected = false ");
        return false;
    }

    public boolean isCategory (String category) {
        if (events == null) {
            LOGGER.info("isCategory = false, events == null ");
            return false;
        }
        if (selectEventNbr < 1) {
            LOGGER.info("isCategory = false, selectEventNbr < 1 ");
            return false;
        }
        if (selectEventNbr > events.size()) {
            LOGGER.info("isCategory = false, selectEventNbr > events.size() ");
            return false;
        }
        if (events.get(selectEventNbr-1).getEvntCtgry().equalsIgnoreCase(category)) {
            LOGGER.info("isCategory = true ");
            return true;
        }
        LOGGER.info("isCategory = false, fallthru ");
        return false;
    }

}