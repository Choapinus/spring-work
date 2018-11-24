/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arqui.core.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cristian
 */
public class MyControllerTest {
    
    public MyControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMethod method, of class MyController.
     */
    @Test
    public void testGetMethod() {
        System.out.println("getMethod");
        MyController instance = new MyController();
        String expResult = "get method!";
        String result = instance.getMethod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!expResult.equals(result)){
        fail("The test case is a prototype.");
        }
    }
    /**
     * Test of postMethod method, of class MyController.
     */
    @Test
    public void testPostMethod() {
        System.out.println("postMethod");
        MyController instance = new MyController();
        String expResult = "post method!";
        String result = instance.postMethod();
        assertEquals(expResult, result);
        if(!expResult.equals(result)){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of putMethod method, of class MyController.
     */
    @Test
    public void testPutMethod() {
        System.out.println("putMethod");
        MyController instance = new MyController();
        String expResult = "put method!";
        String result = instance.putMethod();
        assertEquals(expResult, result);
        if(!expResult.equals(result)){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of deleteMethod method, of class MyController.
     */
    @Test
    public void testDeleteMethod() {
        System.out.println("deleteMethod");
        MyController instance = new MyController();
        String expResult = "delete method!";
        String result = instance.deleteMethod();
        assertEquals(expResult, result);
        if(!expResult.equals(result)){
        fail("The test case is a prototype.");
        }
    }
    
}
