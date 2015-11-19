package gov.hhs.cms.prp.data.test;

import gov.hhs.cms.prp.entity.AddCheckEntity;
import org.junit.Test;

import static org.junit.Assert.*;

import gov.hhs.cms.prp.data.*;

import java.util.Date;

/**
 * Created by VivekKumar.ReddyYara on 9/18/2015.
 */
public class AddCheckBeanTest {

    @Test
    public void testGetSponsor() throws Exception {
        AddCheckBean addCheckBean = new AddCheckBean();
        addCheckBean.setSponsor("Vivek");
        assertEquals("Vivek", addCheckBean.getSponsor());
    }

   /* @Test

    public  void testwriteData() throws Exception {
        AddCheckBean addCheckBean = new AddCheckBean();
        addCheckBean.setSponsor("100");
        addCheckBean.setCheckAmount(123.00);
        addCheckBean.setCheckName("testcheck");
        addCheckBean.setCheckNumber("789");
        addCheckBean.setRsn("rsn");
        addCheckBean.setNote("note");
        addCheckBean.setCheckDate(new Date());
        assertEquals("success",addCheckBean.writeData());
    }
*/

}