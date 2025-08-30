package com.jsp.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Complaints {
	@Id
	private int complaintId;
	private int studentId;
	private int roomId;
	private String description;
	private String status;
	private Date dateFiled;
	
	public Complaints() {

	}

	public Complaints(int complaintId, int studentId, int roomId, String description, String status, Date dateFiled) {
	
		this.complaintId = complaintId;
		this.studentId = studentId;
		this.roomId = roomId;
		this.description = description;
		this.status = status;
		this.dateFiled = dateFiled;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateFiled() {
		return dateFiled;
	}

	public void setDateFiled(Date dateFiled) {
		this.dateFiled = dateFiled;
	}

	@Override
	public String toString() {
		return "Complaints [complaintId=" + complaintId + ", studentId=" + studentId + ", roomId=" + roomId
				+ ", description=" + description + ", status=" + status + ", dateFiled=" + dateFiled + "]";
	}
   
	
	
}
