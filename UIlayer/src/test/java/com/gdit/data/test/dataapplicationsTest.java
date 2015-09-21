package com.gdit.data.test;

import org.junit.Test;

import static org.junit.Assert.*;

import com.gdit.data.*;

/**
 * Created by VivekKumar.ReddyYara on 9/18/2015.
 */
public class dataapplicationsTest {


    @Test
    public void testGetSponsor() throws Exception {
        dataapplications dataapplicationsTest = new dataapplications("SYSTEM1", "PAYMENT1", "", "1.00", "01/01/2009", "12/12/2009");
        assertTrue(dataapplicationsTest.getSponsor().equals("SYSTEM1"));
    }

    @Test
    public void testGetAppid() throws Exception {
        dataapplications dataapplicationsTest = new dataapplications("SYSTEM1", "PAYMENT1", "", "1.00", "01/01/2009", "12/12/2009");
        assertTrue(dataapplicationsTest.getAppid().equals("PAYMENT1"));

    }
}