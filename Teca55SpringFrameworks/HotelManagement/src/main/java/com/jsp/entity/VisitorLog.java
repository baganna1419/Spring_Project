package com.jsp.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class VisitorLog {
	@Id
	private int logId;
	private int studentId;
	private String visitorName;
	private String relationship;
	private String purpose;
	private Date checkInDateTime;
	private Date checkOutDateTime;
	
	public VisitorLog() {
		
	}

	public VisitorLog(int logId, int studentId, String visitorName, String relationship, String purpose,
			Date checkInDateTime, Date checkOutDateTime) {
	
		this.logId = logId;
		this.studentId = studentId;
		this.visitorName = visitorName;
		this.relationship = relationship;
		this.purpose = purpose;
		this.checkInDateTime = checkInDateTime;
		this.checkOutDateTime = checkOutDateTime;
	}

	public int getLogId() {
		return logId;
	}

	public void setLogId(int logId) {
		this.logId = logId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Date getCheckInDateTime() {
		return checkInDateTime;
	}

	public void setCheckInDateTime(Date checkInDateTime) {
		this.checkInDateTime = checkInDateTime;
	}

	public Date getCheckOutDateTime() {
		return checkOutDateTime;
	}

	public void setCheckOutDateTime(Date checkOutDateTime) {
		this.checkOutDateTime = checkOutDateTime;
	}

	@Override
	public String toString() {
		return "VisitorLog [logId=" + logId + ", studentId=" + studentId + ", visitorName=" + visitorName
				+ ", relationship=" + relationship + ", purpose=" + purpose + ", checkInDateTime=" + checkInDateTime
				+ ", checkOutDateTime=" + checkOutDateTime + "]";
	}
	
	
	

}
