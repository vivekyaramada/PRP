package gov.hhs.cms.prp.entity.test;

import org.junit.Test;
import gov.hhs.cms.prp.entity.*;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by VivekKumar.ReddyYara on 9/17/2015.
 */
public class AddCheckEntityTest {


    @Test
    public void testGetSponsor() throws Exception {
        AddCheckEntity addCheckEntity = new AddCheckEntity("SYSTEM1", 0.10,"" ,"1.00","01/01/2009","12/12/2009",new Date());
        assertEquals("SYSTEM1", addCheckEntity.getSponsor() );
    }


    @Test
    public void testGetNote() throws Exception {
        AddCheckEntity addCheckEntity = new AddCheckEntity("SYSTEM1", 0.10,"" ,"1.00","01/01/2009","12/12/2009",new Date());
        assertEquals("12/12/2009", addCheckEntity.getNote() );
    }
}