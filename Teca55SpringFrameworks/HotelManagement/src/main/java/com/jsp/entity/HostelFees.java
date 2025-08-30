package com.jsp.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class HostelFees {
	@Id
	private int feeId;
	private int studentId;
	private int roomId;
	private double totalFees;
	private String paymentStatus;
	private Date paymentdate;
	
	
	public HostelFees() {
	}


	public HostelFees(int feeId, int studentId, int roomId, double totalFees, String paymentStatus, Date paymentdate) {
		this.feeId = feeId;
		this.studentId = studentId;
		this.roomId = roomId;
		this.totalFees = totalFees;
		this.paymentStatus = paymentStatus;
		this.paymentdate = paymentdate;
		
	}


	public int getFeeId() {
		return feeId;
	}


	public void setFeeId(int feeId) {
		this.feeId = feeId;
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


	public double getTotalFees() {
		return totalFees;
	}


	public void setTotalFees(double totalFees) {
		this.totalFees = totalFees;
	}


	public String getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	public Date getPaymentdate() {
		return paymentdate;
	}


	public void setPaymentdate(Date paymentdate) {
		this.paymentdate = paymentdate;
	}


	@Override
	public String toString() {
		return "HostelFees [feeId=" + feeId + ", studentId=" + studentId + ", roomId=" + roomId + ", totalFees="
				+ totalFees + ", paymentStatus=" + paymentStatus + ", paymentdate=" + paymentdate + "]";
	}
	
	
	
	

}
