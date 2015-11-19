package gov.hhs.cms.prp.ws.test;
import org.junit.Test;

import static org.junit.Assert.*;


import gov.hhs.cms.prp.ws.*;

/**
 * Created by VivekKumar.ReddyYara on 11/4/2015.
 */
public class PrpApplicationServiceTest {


    @Test
    public void testgetMsg() throws Exception {
        PrpApplicationService prpApplicationService = new PrpApplicationService();

        assertTrue(prpApplicationService.getMsg(100, "vivek") != null);
        }
/*
@Test
    public void testcheckLogin() throws Exception {
    PrpApplicationService prpApplicationService = new PrpApplicationService();
    assertTrue(prpApplicationService.checkLogin("vivek", "vivek")!=null);
}
*/

    @Test
    public void testaddchecks() throws Exception {

        PrpApplicationService prpApplicationService = new PrpApplicationService();
        prpApplicationService.addchecks("100", "vivek");
        assertTrue(true);
    }




}
