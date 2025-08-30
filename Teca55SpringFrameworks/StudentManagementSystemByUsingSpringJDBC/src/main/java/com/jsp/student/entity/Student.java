package com.jsp.student.entity;

public class Student {

	private int studentid;
	private String studentname;
	private String studentstream;
	private String studentmobilenumber;
	private String studentemail;
	private String studentpassword;
	private String studentaddress;

	public Student() {

	}

	public Student(int studentid, String studentname, String studentstream, String studentmobilenumber,
			String studentemail, String studentpassword, String studentaddress) {
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentstream = studentstream;
		this.studentmobilenumber = studentmobilenumber;
		this.studentemail = studentemail;
		this.studentpassword = studentpassword;
		this.studentaddress = studentaddress;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public void setStudentstream(String studentstream) {
		this.studentstream = studentstream;
	}

	public void setStudentmobilenumber(String studentmobilenumber) {
		this.studentmobilenumber = studentmobilenumber;
	}

	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}

	public void setStudentpassword(String studentpassword) {
		this.studentpassword = studentpassword;
	}

	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}

	public int getStudentid() {
		return studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public String getStudentstream() {
		return studentstream;
	}

	public String getStudentmobilenumber() {
		return studentmobilenumber;
	}

	public String getStudentemail() {
		return studentemail;
	}

	public String getStudentpassword() {
		return studentpassword;
	}

	public String getStudentaddress() {
		return studentaddress;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentstream=" + studentstream
				+ ", studentmobilenumber=" + studentmobilenumber + ", studentemail=" + studentemail
				+ ", studentpassword=" + studentpassword + ", studentaddress=" + studentaddress + "]";
	}

	
}
