package gov.hhs.cms.prp.entity.test;

import org.junit.Test;
import gov.hhs.cms.prp.entity.ApplicationTableEntity;

import static org.junit.Assert.*;

/**
 * Created by VivekKumar.ReddyYara on 9/17/2015.
 */
public class ApplicationTableEntityTest {

    @Test
    public void testGetApplications() throws Exception {
        ApplicationTableEntity applicationTableEntity = new ApplicationTableEntity();
        System.out.println(applicationTableEntity.getApplications().size());
        assertTrue(applicationTableEntity.getApplications().size()==12);
    }
}