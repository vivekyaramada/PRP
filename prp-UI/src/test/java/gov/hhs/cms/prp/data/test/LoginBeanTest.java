package gov.hhs.cms.prp.data.test;

import org.junit.Test;

import static org.junit.Assert.*;

import gov.hhs.cms.prp.data.*;

/**
 * Created by VivekKumar.ReddyYara on 9/18/2015.
 */
public class LoginBeanTest {


    @Test
    public void testGetUsername() throws Exception {
        LoginBean loginBean = new LoginBean();
        loginBean.setUsername("vivek");
        assertEquals("vivek", loginBean.getUsername());

    }

    @Test
    public void testGetPassword() throws Exception {
        LoginBean loginBean = new LoginBean();
        loginBean.setPassword("password");
        assertEquals("password", loginBean.getPassword());
    }

  /*  @Test
    public void testCheckLogin() throws Exception {
        LoginBean loginBean = new LoginBean();
        loginBean.setUsername("vivek");
        loginBean.setPassword("password");
        assertEquals("success", loginBean.checkLogin());
    }*/
}