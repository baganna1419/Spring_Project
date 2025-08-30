package com.jsp.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hostels database table.
 * 
 */
@Entity
@Table(name="hostels")
@NamedQuery(name="Hostel.findAll", query="SELECT h FROM Hostel h")
public class Hostel implements Serializable {
	private static final long serialVersionUID = 1L;

	private String address;

	private String contact_Number;

	private String email;

	private String hostel_Name;
    @Id
	private int hostelid;

	private String location;

	public Hostel() {
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact_Number() {
		return this.contact_Number;
	}

	public void setContact_Number(String contact_Number) {
		this.contact_Number = contact_Number;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHostel_Name() {
		return this.hostel_Name;
	}

	public void setHostel_Name(String hostel_Name) {
		this.hostel_Name = hostel_Name;
	}

	public int getHostelid() {
		return this.hostelid;
	}

	public void setHostelid(int hostelid) {
		this.hostelid = hostelid;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Hostel [address=" + address + ", contact_Number=" + contact_Number + ", email=" + email
				+ ", hostel_Name=" + hostel_Name + ", hostelid=" + hostelid + ", location=" + location + "]";
	}
	

}