/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package product;
/**
 * @author colincumings
 */
public class ColinProduct {

    private int productID;
    private float productPrice;
    private String productDesc;
    private boolean prescriptionReq;

    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void modifyProduct() {
	// TODO - implement Product.modifyProduct
	throw new UnsupportedOperationException();
    }

    public void deleteProduct() {
	// TODO - implement Product.deleteProduct
	throw new UnsupportedOperationException();
    }

    // Setter
    public void setPrescriptionReq(boolean prescriptionReq){
        this.prescriptionReq = prescriptionReq;
    }
    //Getters

    public boolean getPrescriptionReq() {
	return prescriptionReq;
    }

    public int getProductID(){
        return productID;
    }

    public float getProductPrice(){
        return productPrice;
    }

    public String getProductDesc(){
        return productDesc;
    }

}
