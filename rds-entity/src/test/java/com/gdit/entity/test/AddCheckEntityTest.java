package com.gdit.entity.test;

import org.junit.Test;
import com.gdit.entity.*;
import static org.junit.Assert.*;

/**
 * Created by VivekKumar.ReddyYara on 9/17/2015.
 */
public class AddCheckEntityTest {

    @Test
    public void testGetSponsor() throws Exception {
        AddCheckEntity addCheckEntity = new AddCheckEntity("SYSTEM1", "PAYMENT1","" ,"1.00","01/01/2009","12/12/2009","vivek" );
        assertEquals("SYSTEM1", addCheckEntity.getSponsor() );
    }

    @Test
    public void testGetCheckAmount() throws Exception {
        AddCheckEntity addCheckEntity = new AddCheckEntity("SYSTEM1", "PAYMENT1","" ,"1.00","01/01/2009","12/12/2009","vivek" );
        assertEquals("PAYMENT1", addCheckEntity.getCheckAmount() );

    }
}