package com.Input.RegistrationSystem;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Sicheng Zhu
 */
public class InsertActionTest {
    /**
     * Test of execute method, of class InsertAction.
     * Uncomment conn.close() in each method of DBConnection class
     * Mark argument validation check, and DBConnection classes's methods calls
     * as comment, and uncomment method calls with test data in FormAction class.
     */
    @Test
    public void testExecute() throws Exception {        
        FormAction executeTestInstance = new FormAction();
        String expResult = "insert_success";
        String actResult = executeTestInstance.insert();
        assertEquals(expResult, actResult);        
    }    
}
