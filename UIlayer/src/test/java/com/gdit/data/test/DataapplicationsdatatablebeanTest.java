package com.gdit.data.test;

import org.junit.Test;

import static org.junit.Assert.*;

import com.gdit.data.*;

/**
 * Created by VivekKumar.ReddyYara on 9/18/2015.
 */
public class DataapplicationsdatatablebeanTest {

    @Test
    public void testGetApplications() throws Exception {

        Dataapplicationsdatatablebean dataapplicationsdatatablebean = new Dataapplicationsdatatablebean();

        assertTrue(dataapplicationsdatatablebean.getApplications().size() == 12);
    }
}