/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import jenkinstest.JenkinsTest;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author olek
 */
public class FooTest {
    
    public FooTest() {
    }
    
    @Test
    public void simpleFooTest() {
        assertEquals(-5, JenkinsTest.foo(5));
    }

    @Test
    public void negativeFooTest() {
        assertEquals(13, JenkinsTest.foo(-13));
    }

    
}
