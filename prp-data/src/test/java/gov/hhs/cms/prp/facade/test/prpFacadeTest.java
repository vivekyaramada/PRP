package gov.hhs.cms.prp.facade.test;

import org.junit.Test;

import static org.junit.Assert.*;

import gov.hhs.cms.prp.facade.*;

import gov.hhs.cms.prp.entity.LoginEntity;

/**
 * Created by VivekKumar.ReddyYara on 9/18/2015.
 */
public class prpFacadeTest {


    @Test
    public void testGetDataloginEntity() throws Exception {

    }

    @Test
    public void testSetDataloginEntity() throws Exception {

    }

    @Test
    public void testGetApplications() throws Exception {
       /* prpFacade prpFacade = new prpFacade();
        LoginEntity loginEntity = new LoginEntity();

        assertTrue(prpFacade.getApplications().size() == 12);*/
    }

    @Test
    public void testCheckLogin() throws Exception {
        LoginEntity loginEntity = new LoginEntity();
        prpFacade prpFacade = new prpFacade();
        loginEntity.setUsername("vivek");
        loginEntity.setPassword("password");
        assertEquals("success", prpFacade.checkLogin(loginEntity));

    }


}