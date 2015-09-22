package com.gdit.data.test;

import org.junit.Test;

import static org.junit.Assert.*;

import com.gdit.data.*;

/**
 * Created by VivekKumar.ReddyYara on 9/18/2015.
 */
public class ApplicationsTableBeanTest {

    @Test
    public void testGetApplications() throws Exception {

        ApplicationsTableBean applicationsTableBean = new ApplicationsTableBean();

        assertTrue(applicationsTableBean.getApplications().size() == 12);
    }
}