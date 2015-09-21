package com.gdit.entity.test;

import org.junit.Test;
import com.gdit.entity.*;

import static org.junit.Assert.*;

/**
 * Created by VivekKumar.ReddyYara on 9/17/2015.
 */
public class dataapplicationsEntityTest {

    @Test
    public void testGetSponsor() throws Exception {
        dataapplicationsEntity dataapplicationsTest = new dataapplicationsEntity("SYSTEM1", "PAYMENT1","" ,"1.00","01/01/2009","12/12/2009");
        assertTrue(dataapplicationsTest.getSponsor().equals("SYSTEM1"));

    }

    @Test
    public void testGetAppid() throws Exception {
        dataapplicationsEntity dataapplicationsTest = new dataapplicationsEntity("SYSTEM1", "PAYMENT1","" ,"1.00","01/01/2009","12/12/2009");
        assertTrue(dataapplicationsTest.getAppid().equals("PAYMENT1"));
    }
}