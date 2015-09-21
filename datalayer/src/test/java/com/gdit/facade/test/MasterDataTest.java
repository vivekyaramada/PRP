package com.gdit.facade.test;

import org.junit.Test;

import static org.junit.Assert.*;

import com.gdit.facade.*;

import com.gdit.entity.DataloginEntity;

/**
 * Created by VivekKumar.ReddyYara on 9/18/2015.
 */
public class MasterDataTest {


    @Test
    public void testGetDataloginEntity() throws Exception {

    }

    @Test
    public void testSetDataloginEntity() throws Exception {

    }

    @Test
    public void testGetApplications() throws Exception {
        MasterData masterData = new MasterData();
        DataloginEntity dataloginEntity = new DataloginEntity();

        assertTrue(masterData.getApplications().size() == 12);
    }

    @Test
    public void testCheckLogin() throws Exception {
        DataloginEntity dataloginEntity = new DataloginEntity();
        MasterData masterData = new MasterData();
        dataloginEntity.setUsername("vivek");
        dataloginEntity.setPassword("password");
        assertEquals("success", masterData.checkLogin(dataloginEntity));

    }


}