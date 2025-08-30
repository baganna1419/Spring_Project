package com.jsp.setterinjection;

import java.util.Date;

public class Customer {
	private String name;
	private Date dateOfBirth;
	private String mobile;
	private Address address;
	private Product product;
	private String email;
	private String userName;
	private String password;

	public Customer() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", dateOfBirth=" + dateOfBirth + ", mobile=" + mobile + ", address=" + address
				+ ", product=" + product + ", email=" + email + ", userName=" + userName + ", password=" + password
				+ "]";
	}

}
