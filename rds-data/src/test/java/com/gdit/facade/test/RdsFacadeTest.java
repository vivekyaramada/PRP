package com.gdit.facade.test;

import org.junit.Test;

import static org.junit.Assert.*;

import com.gdit.facade.*;

import com.gdit.entity.LoginEntity;

/**
 * Created by VivekKumar.ReddyYara on 9/18/2015.
 */
public class RdsFacadeTest {


    @Test
    public void testGetDataloginEntity() throws Exception {

    }

    @Test
    public void testSetDataloginEntity() throws Exception {

    }

    @Test
    public void testGetApplications() throws Exception {
        RdsFacade rdsFacade = new RdsFacade();
        LoginEntity loginEntity = new LoginEntity();

        assertTrue(rdsFacade.getApplications().size() == 12);
    }

    @Test
    public void testCheckLogin() throws Exception {
        LoginEntity loginEntity = new LoginEntity();
        RdsFacade rdsFacade = new RdsFacade();
        loginEntity.setUsername("vivek");
        loginEntity.setPassword("password");
        assertEquals("success", rdsFacade.checkLogin(loginEntity));

    }


}