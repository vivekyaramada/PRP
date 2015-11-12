package gov.hhs.cms.prp.dao;


import gov.hhs.cms.prp.entity.UserDetails;

/**
 * Created by VivekKumar.ReddyYara on 10/21/2015.
 */
public interface ApplicationServiceDAO {

    public String getMsg(int applPsId);
    public String getEvents(Integer keyPsid, Integer keyApplId);
    public void addchecks(String applPsId);
    public String checkLogin(String username);
}
