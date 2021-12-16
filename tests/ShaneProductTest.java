/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shane
 */
public class ShaneProductTest {
    ShaneProduct testProduct;

    public ShaneProductTest() {
    }

    @Before
    public void setUp() {
    testProduct = new ShaneProduct();
    testProduct.setProductPrice(13.55f);
    testProduct.setProductDesc("Paracetamol");
    testProduct.setProductID(52);
    testProduct.setPrescriptionReq(true);
    }

    @After
    public void tearDown() {
    testProduct = null;
    }

    //Test


    //PASS tests
    /**
    @Test
    public void testGetProductPrice() {
        float medicineCost = 13.55f, priceComparison;
        priceComparison = testProduct.getProductPrice();
        assertEquals(medicineCost, priceComparison, 0.01);
    }
    @Test
    public void testGetProductDesc() {
        String medicineDesc = "Paracetamol", descComparison;
        descComparison = testProduct.getProductDesc();
        assertEquals(medicineDesc, descComparison);
    }
    @Test
    public void testGetProductID() {
        int medicineID = 52, IDComparison;
        IDComparison = testProduct.getProductID();
        assertEquals(medicineID, IDComparison);
    }
    @Test
    public void testGetPrescriptionReq() {
        boolean prescriptionReq;
        prescriptionReq = testProduct.getPrescriptionReq();
        assertTrue(prescriptionReq);
    }
    */
    // FAIL tests
    @Test
    public void testGetProductPrice() {
        float medicineCost = 27.34f, priceComparison;
        priceComparison = testProduct.getProductPrice();
        assertEquals(medicineCost, priceComparison, 0.01);
    }
    @Test
    public void testGetProductDesc() {
        String medicineDesc = "Paraceta", descComparison;
        descComparison = testProduct.getProductDesc();
        assertEquals(medicineDesc, descComparison);
    }
    @Test
    public void testGetProductID() {
        int medicineID = 17, IDComparison;
        IDComparison = testProduct.getProductID();
        assertEquals(medicineID, IDComparison);
    }
    @Test
    public void testGetPrescriptionReq() {
        boolean prescriptionReq;
        testProduct.setPrescriptionReq(true);
        prescriptionReq = testProduct.getPrescriptionReq();
        assertFalse(prescriptionReq);
    }

}
