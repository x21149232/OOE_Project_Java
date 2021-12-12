/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package product;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author colincumings
 */
public class ColinProductTest {
    Product testProduct;

    public ColinProductTest() {
    }

    @Before
    public void setUp() {
        testProduct = new Product();
    }
    
    @After
    public void tearDown() {
        testProduct = null;
    }


    @Test
    public void testGetPrescriptionReq(){
        boolean prescriptionReq;
        testProduct.setPrescriptionReq(true);
        prescriptionReq = testProduct.getPrescriptionReq();
        assertFalse(prescriptionReq);
    }

}
