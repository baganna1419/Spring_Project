package com.jsp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Floors {
	@Id
	private int floorId;
	private int floorNumber;
	private int hostelId;

	public Floors() {

	}

	public Floors(int floorId, int floorNumber, int hostelId) {
		this.floorId = floorId;
		this.floorNumber = floorNumber;
		this.hostelId = hostelId;
	}

	public int getFloorId() {
		return floorId;
	}

	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public int getHostelId() {
		return hostelId;
	}

	public void setHostelId(int hostelId) {
		this.hostelId = hostelId;
	}

	@Override
	public String toString() {
		return "Floors [floorId=" + floorId + ", floorNumber=" + floorNumber + ", hostelId=" + hostelId + "]";
	}

}
