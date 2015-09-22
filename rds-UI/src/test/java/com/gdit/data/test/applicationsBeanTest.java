package com.gdit.data.test;

import org.junit.Test;

import static org.junit.Assert.*;

import com.gdit.data.*;

/**
 * Created by VivekKumar.ReddyYara on 9/18/2015.
 */
public class applicationsBeanTest {


    @Test
    public void testGetSponsor() throws Exception {
        ApplicationsBean applicationsBeanTest = new ApplicationsBean("SYSTEM1", "PAYMENT1", "", "1.00", "01/01/2009", "12/12/2009");
        assertTrue(applicationsBeanTest.getSponsor().equals("SYSTEM1"));
    }

    @Test
    public void testGetAppid() throws Exception {
        ApplicationsBean applicationsBeanTest = new ApplicationsBean("SYSTEM1", "PAYMENT1", "", "1.00", "01/01/2009", "12/12/2009");
        assertTrue(applicationsBeanTest.getAppid().equals("PAYMENT1"));

    }
}