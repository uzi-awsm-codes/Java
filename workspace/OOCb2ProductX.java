/*
2.Create a class Product with attributes 
productCode -int
productName-String
price-double
Include getters and setters.
In main class, create an array to store product objects. The program should have options to add a new product,search for a particular product and display the product details. Develop this as a menu driven application.*/

package com.ooc;

class Product{
	int productCode;
	String productName;
	double price;
	
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	}

public class OOCb2ProductX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array to store product objects
		Product[] p = new Product[3];
		//add new product set
		//search
		//display product details get
	}

}
