/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasjunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Emilio
 */
public class metodosTest {
    
    public metodosTest() {
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
     * Test of suma method, of class metodos.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int x = 1;
        int y = 1;
        int z = 1;
        int expResult = 3;
        int result = metodos.suma(x, y, z);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of resta method, of class metodos.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int x = 4;
        int y = 1;
        int z = 2;
        int expResult = 1;
        int result = metodos.resta(x, y, z);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of multiplicacion method, of class metodos.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        int x = 0;
        int y = 0;
        int z = 0;
        int expResult = 0;
        int result = metodos.multiplicacion(x, y, z);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of division method, of class metodos.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int x = 5;
        int y = 5;
        int z = 0;
        int expResult = 1;
        int result = metodos.division(x, y, z);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
