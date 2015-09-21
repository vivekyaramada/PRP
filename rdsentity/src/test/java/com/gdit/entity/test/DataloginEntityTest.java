package com.gdit.entity.test;


import org.junit.Test;
import com.gdit.entity.*;
import static org.junit.Assert.*;

/**
 * Created by VivekKumar.ReddyYara on 9/17/2015.
 */
public class DataloginEntityTest {
    @Test
    public void testGetUsername() throws Exception {
        DataloginEntity dataloginEntity = new DataloginEntity();
        dataloginEntity.setUsername("Vivek");
        assertTrue(dataloginEntity.getUsername().equals("Vivek"));
    }

    @Test
    public void testGetPassword() throws Exception {
        DataloginEntity dataloginEntity = new DataloginEntity();
        dataloginEntity.setPassword("Vivek2");
        assertTrue(dataloginEntity.getPassword().equals("Vivek2"));

    }
}