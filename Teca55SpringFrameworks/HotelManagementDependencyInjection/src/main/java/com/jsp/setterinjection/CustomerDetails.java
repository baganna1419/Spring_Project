package com.jsp.setterinjection;

public class CustomerDetails implements Customer {
	private String name;
	private int age;
	private String gender;
	private String mobileNum;
	private String address;

	public CustomerDetails() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

	@Override
	public String toString() {
		return "CustomerDetails [name=" + name + ", age=" + age + ", gender=" + gender + ", mobileNum=" + mobileNum
				+ ", address=" + address + "]";
	}

	public void getInfo() {
		toString();

	}

}
