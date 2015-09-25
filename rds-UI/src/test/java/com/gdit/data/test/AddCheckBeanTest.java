package com.gdit.data.test;

import org.junit.Test;

import static org.junit.Assert.*;

import com.gdit.data.*;

/**
 * Created by VivekKumar.ReddyYara on 9/18/2015.
 */
public class AddCheckBeanTest {


  /*  @Test
    public void testGetCheckAmount() throws Exception {
        AddCheckBean addCheckBean = new AddCheckBean();
        addCheckBean.setCheckAmount(0.10);
        assertEquals("Vivek", addCheckBean.getCheckAmount());
    }*/

    @Test
    public void testGetSponsor() throws Exception {
        AddCheckBean addCheckBean = new AddCheckBean();
        addCheckBean.setSponsor("Vivek");
        assertEquals("Vivek", addCheckBean.getSponsor());
    }
}