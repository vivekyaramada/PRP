package com.gdit.facade.test;

import org.junit.Test;

import static org.junit.Assert.*;

import com.gdit.facade.*;
import com.gdit.entity.DataloginEntity;

/**
 * Created by VivekKumar.ReddyYara on 9/18/2015.
 */
public class DataValidationTest {

    @Test
    public void testCheckLogin() throws Exception {

        DataloginEntity dataloginEntity = new DataloginEntity();
        DataValidation dataValidation = new DataValidation();
        dataloginEntity.setUsername("vivek");
        dataloginEntity.setPassword("password");
        assertEquals("success", dataValidation.checkLogin(dataloginEntity));
    }

    @Test
    public void testWriteData() throws Exception {

    }
}