package gov.hhs.cms.prp.entity.test;


import org.junit.Test;
import gov.hhs.cms.prp.entity.*;
import static org.junit.Assert.*;

/**
 * Created by VivekKumar.ReddyYara on 9/17/2015.
 */
public class LoginEntityTest {
    @Test
    public void testGetUsername() throws Exception {
        LoginEntity loginEntity = new LoginEntity();
        loginEntity.setUsername("Vivek");
        assertTrue(loginEntity.getUsername().equals("Vivek"));
    }

    @Test
    public void testGetPassword() throws Exception {
        LoginEntity loginEntity = new LoginEntity();
        loginEntity.setPassword("Vivek2");
        assertTrue(loginEntity.getPassword().equals("Vivek2"));

    }
}