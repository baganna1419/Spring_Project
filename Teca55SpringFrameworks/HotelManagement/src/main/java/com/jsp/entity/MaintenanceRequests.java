package com.jsp.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class MaintenanceRequests {
	@Id
	private int requestId;
	private int roomId;
	private String description;
	private String status;
	private Date dateRequested;
	
	
	public MaintenanceRequests() {
	}

	public MaintenanceRequests(int requestId, int roomId, String description, String status, Date dateRequested) {
	
		this.requestId = requestId;
		this.roomId = roomId;
		this.description = description;
		this.status = status;
		this.dateRequested = dateRequested;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
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

	public Date getDateRequested() {
		return dateRequested;
	}

	public void setDateRequested(Date dateRequested) {
		this.dateRequested = dateRequested;
	}

	@Override
	public String toString() {
		return "MaintenanceRequests [requestId=" + requestId + ", roomId=" + roomId + ", description=" + description
				+ ", status=" + status + ", dateRequested=" + dateRequested + "]";
	}
	
	

}
