package org.jsp.personandproduct.entity;

import java.io.Serializable;

public class Person implements Serializable {

	private String personName;
	private int personAge;
	private String personAddress;
	private String personEmailId;
	private Product product;
	
	public Person() {
	}
	
	public Person(String personName, int personAge, String personAddress, String personEmailId, Product product) {
		this.personName = personName;
		this.personAge = personAge;
		this.personAddress = personAddress;
		this.personEmailId = personEmailId;
		this.product = product;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public String getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}

	public String getPersonEmailId() {
		return personEmailId;
	}

	public void setPersonEmailId(String personEmailId) {
		this.personEmailId = personEmailId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return " Person Name : "+personName+" "
			  +"\n Person Age :  "+personAge+" "
			  +"\n Person EmailId : "+personEmailId+" "
			  +"\n Person Address :"+personAddress+" "
			  +"\n Product Details :"+product+"\n*********************************************";
	}
	
	
	
	
	
}
