package com.jsp.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Students {
	@Id
	private int studentId;
	private String name;
	private String gender;
	private Date dateOfBirth;
	private String contactNumber;
	private String email;
	private String address;
	private int roomId;
	
	public Students() {
	
	}

	public Students(int studentId, String name, String gender, Date dateOfBirth, String contactNumber, String email,
			String address, int roomId) {
		this.studentId = studentId;
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.contactNumber = contactNumber;
		this.email = email;
		this.address = address;
		this.roomId = roomId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", name=" + name + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + ", contactNumber=" + contactNumber + ", email=" + email + ", address=" + address
				+ ", roomId=" + roomId + "]";
	}
	
	
	
	
	
}
