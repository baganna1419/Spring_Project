package org.jsp.IocContainerPratice.entity;

public class Student {
	private int studentId;
	private String studentName;
	private String studentMobileNumber;
	private String address;
	public Student() {
	
	}
	public Student(int studentId, String studentName, String studentMobileNumber, String address) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMobileNumber = studentMobileNumber;
		this.address = address;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentMobileNumber() {
		return studentMobileNumber;
	}
	public void setStudentMobileNumber(String studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMobileNumber="
				+ studentMobileNumber + ", address=" + address + "]";
	}
	
	
	
	
	
	

}
