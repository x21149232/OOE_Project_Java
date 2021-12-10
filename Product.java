package AddingProductPharmacy;

import java.util.*;

public class Product {

	Collection<Sale> sales;
	Collection<Prescription> prescriptions;
	private Int productID;
	private Float productPrice;
	private Boolean prescriptionReq;
	private String productDesc;

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
  public int getProductID(){
      return productID;
  }

  public float getProductPrice(){
      return productPrice;
  }

  public String getProductDesc(){
      return productDesc;
  }

	public Boolean getPrescriptionReq() {
		return prescriptionReq;
	}

}
