package com.gdit.entity.test;

import com.gdit.entity.dataapplicationsEntity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.gdit.entity.DataapplicationsdatatablebeanEntity;

import static org.junit.Assert.*;

/**
 * Created by VivekKumar.ReddyYara on 9/17/2015.
 */
public class DataapplicationsdatatablebeanEntityTest {

    @Test
    public void testGetApplications() throws Exception {
        DataapplicationsdatatablebeanEntity dataapplicationsdatatablebeanEntity = new DataapplicationsdatatablebeanEntity();
        System.out.println(dataapplicationsdatatablebeanEntity.getApplications().size());
        assertTrue(dataapplicationsdatatablebeanEntity.getApplications().size()==12);
    }
}