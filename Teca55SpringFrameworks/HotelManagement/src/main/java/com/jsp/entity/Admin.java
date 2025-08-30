package com.jsp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	private int adminId;
	private String adminRoll;
	private String adminEmail;
	private String adminPassword;
	
	public Admin() {
		
	}

	public Admin(int adminId, String adminRoll, String adminEmail, String adminPassword) {
		this.adminId = adminId;
		this.adminRoll = adminRoll;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminRoll() {
		return adminRoll;
	}

	public void setAdminRoll(String adminRoll) {
		this.adminRoll = adminRoll;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminRoll=" + adminRoll + ", adminEmail=" + adminEmail
				+ ", adminPassword=" + adminPassword + "]";
	}
	
	
	
	
	
	
	

}
