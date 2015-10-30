package gov.hhs.cms.prp.dao;


import gov.hhs.cms.prp.entity.UserDetails;

/**
 * Created by VivekKumar.ReddyYara on 10/21/2015.
 */
public interface ApplicationServiceDAO {

    public String getMsg(int applPsId);
    public String getEvents(int applId);
    public void addchecks(String applPsId);
}
