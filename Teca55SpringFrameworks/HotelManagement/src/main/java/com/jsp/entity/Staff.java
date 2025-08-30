package com.jsp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {
	@Id
	private int staffId;
	private String name;
	private String position;
	private String contactNumber;
	private String email;
	private int hostelId;
	
	
	public Staff() {
	
	}

	public Staff(int staffId, String name, String position, String contactNumber, String email, int hostelId) {

		this.staffId = staffId;
		this.name = name;
		this.position = position;
		this.contactNumber = contactNumber;
		this.email = email;
		this.hostelId = hostelId;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getHostelId() {
		return hostelId;
	}

	public void setHostelId(int hostelId) {
		this.hostelId = hostelId;
	}

	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", name=" + name + ", position=" + position + ", contactNumber="
				+ contactNumber + ", email=" + email + ", hostelId=" + hostelId + "]";
	}
	 
	
	
	

}
