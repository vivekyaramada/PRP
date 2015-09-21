package com.gdit.data.test;

import org.junit.Test;

import static org.junit.Assert.*;

import com.gdit.data.*;

/**
 * Created by VivekKumar.ReddyYara on 9/18/2015.
 */
public class DatachecksTest {


    @Test
    public void testGetCheckAmount() throws Exception {
        Datachecks datachecks = new Datachecks();
        datachecks.setCheckAmount("Vivek");
        assertEquals("Vivek", datachecks.getCheckAmount());
    }

    @Test
    public void testGetSponsor() throws Exception {
        Datachecks datachecks = new Datachecks();
        datachecks.setSponsor("Vivek");
        assertEquals("Vivek", datachecks.getSponsor());
    }
}