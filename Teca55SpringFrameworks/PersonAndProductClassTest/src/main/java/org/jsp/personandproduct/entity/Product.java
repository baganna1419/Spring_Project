package org.jsp.personandproduct.entity;

import java.io.Serializable;

public class Product implements Serializable{
	private int productId;
	private String productName;
	private String productBrand;
	private double productPrice;
	
	public Product() {
	}

	public Product(int productId, String productName, String productBrand, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productBrand = productBrand;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product Id : "+productId+" "
				  +"\n Product Name :  "+productName+" "
				  +"\n Product Brand   "+productBrand+" "
				  +"\n Product Price   "+productPrice+" ";
	}
	
	
	

}
