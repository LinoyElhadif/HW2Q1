package QA_HW2_Q1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Submitted by:
 * Linoy Elhadif - 313536815
 * Carolina Erlih - 314776741
 */
public class AppTest {
    App appTester = new App();
    
    @Test
    public void TC1(){
        int a = 5;
        int b = 7;
        int c = 7;
        String expected ="Imaginary roots";
        String result = appTester.checkRoots(a,b,c);
        assertEquals(expected, result.toString());
    }
    @Test
    public void TC2(){
        int a = 6;
        int b = 7;
        int c = 7;
        String expected ="Imaginary roots";
        String result = appTester.checkRoots(a,b,c);
        assertEquals(expected, result.toString());
    }
    @Test
    public void TC3(){
        int a = 200;
        int b = 7;
        int c = 7;
        String expected ="Imaginary roots";
        String result = appTester.checkRoots(a,b,c);
        assertEquals(expected, result.toString());
    }
    @Test
    public void TC4(){
        int a = 199;
        int b = 7;
        int c = 7;
        String expected ="Imaginary roots";
        String result = appTester.checkRoots(a,b,c);
        assertEquals(expected, result.toString());
    }
    @Test
    public void TC5(){
        int a = 7;
        int b = 5;
        int c = 7;
        String expected ="Imaginary roots";
        String result = appTester.checkRoots(a,b,c);
        assertEquals(expected, result.toString());
    }
    @Test
    public void TC6(){
        int a = 7;
        int b = 6;
        int c = 7;
        String expected ="Imaginary roots";
        String result = appTester.checkRoots(a,b,c);
        assertEquals(expected, result.toString());
    }
    @Test
    public void TC7(){
        int a = 7;
        int b = 199;
        int c = 7;
        String expected ="Real roots";
        String result = appTester.checkRoots(a,b,c);
        assertEquals(expected, result.toString());
    }
    @Test
    public void TC8(){
        int a = 7;
        int b = 200;
        int c = 7;
        String expected ="Real roots";
        String result = appTester.checkRoots(a,b,c);
        assertEquals(expected, result.toString());
    }
    @Test
    public void TC9(){
        int a = 7;
        int b = 7;
        int c = 5;
        String expected ="Imaginary roots";
        String result = appTester.checkRoots(a,b,c);
        assertEquals(expected, result.toString());
    }
    @Test
    public void TC10(){
        int a = 7;
        int b = 7;
        int c = 6;
        String expected ="Imaginary roots";
        String result = appTester.checkRoots(a,b,c);
        assertEquals(expected, result.toString());
    }
    @Test
    public void TC11(){
        int a = 7;
        int b = 7;
        int c = 199;
        String expected ="Imaginary roots";
        String result = appTester.checkRoots(a,b,c);
        assertEquals(expected, result.toString());
    }
    @Test
    public void TC12(){
        int a = 7;
        int b = 7;
        int c = 200;
        String expected ="Imaginary roots";
        String result = appTester.checkRoots(a,b,c);
        assertEquals(expected, result.toString());
    }
    @Test
    public void TC13(){
        int a = 10;
        int b = 40;
        int c = 40;
        String expected ="Equal roots";
        String result = appTester.checkRoots(a,b,c);
        assertEquals(expected, result.toString());
    }
}
