package com.gdit.data.test;

import org.junit.Test;

import static org.junit.Assert.*;

import com.gdit.data.*;

/**
 * Created by VivekKumar.ReddyYara on 9/18/2015.
 */
public class DataloginTest {


    @Test
    public void testGetUsername() throws Exception {
        Datalogin datalogin = new Datalogin();
        datalogin.setUsername("vivek");
        assertEquals("vivek", datalogin.getUsername());

    }

    @Test
    public void testGetPassword() throws Exception {
        Datalogin datalogin = new Datalogin();
        datalogin.setPassword("password");
        assertEquals("password", datalogin.getPassword());
    }

    @Test
    public void testCheckLogin() throws Exception {
        Datalogin datalogin = new Datalogin();
        datalogin.setUsername("vivek");
        datalogin.setPassword("password");
        assertEquals("success", datalogin.checkLogin());
    }
}