package com.gdit.facade.test;

import org.junit.Test;
import static org.junit.Assert.*;

import com.gdit.facade.*;
import com.gdit.entity.LoginEntity;

/**
 * Created by VivekKumar.ReddyYara on 9/18/2015.
 */
public class RdsValidationTest {

    @Test
    public void testCheckLogin() throws Exception {

        LoginEntity loginEntity = new LoginEntity();
        RdsValidation rdsValidation = new RdsValidation();
        loginEntity.setUsername("vivek");
        loginEntity.setPassword("password");
        assertEquals("success", rdsValidation.checkLogin(loginEntity));
    }

    @Test
    public void testWriteData() throws Exception {

    }
}