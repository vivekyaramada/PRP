package gov.hhs.cms.prp.facade.test;

import gov.hhs.cms.prp.entity.UserDetails;
import org.junit.Test;

import static org.junit.Assert.*;

import gov.hhs.cms.prp.facade.*;

import gov.hhs.cms.prp.entity.LoginEntity;

/**
 * Created by VivekKumar.ReddyYara on 9/18/2015.
 */
public class prpFacadeTest {




/*    @Test
    public void testGetApplications() throws Exception {
        prpFacade prpFacade = new prpFacade();
        UserDetails userDetails = new UserDetails();
        userDetails.setUsername("vivek");
        assertTrue(prpFacade.getApplications("100", userDetails).size() == 12);
    }*/

   /* @Test
    public void testCheckLogin() throws Exception {
        LoginEntity loginEntity = new LoginEntity();
        prpFacade prpFacade = new prpFacade();
        loginEntity.setUsername("vivek");
        loginEntity.setPassword("password");
        UserDetails userDetails = new UserDetails();
        userDetails.setUsername("vivek");
        assertEquals("success", prpFacade.checkLogin(loginEntity,userDetails));

    }*/


}