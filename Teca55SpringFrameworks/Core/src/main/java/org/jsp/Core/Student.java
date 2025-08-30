package org.jsp.Core;

public class Student {
	private int studentId;
	private String studentName;
	private double percentage;
	private String mail;
	
	public Student() {
	}
	
	public Student(int studentId, String studentName, double percentage, String mail) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.percentage = percentage;
		this.mail = mail;
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

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	

	public void details() {
		System.out.println("Student Name    : Baganna Sania");
		System.out.println("Student College : GuruKrupa ");
		System.out.println("Branch          : MPC");
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", percentage=" + percentage
				+ ", mail=" + mail + "]";
	}

}
