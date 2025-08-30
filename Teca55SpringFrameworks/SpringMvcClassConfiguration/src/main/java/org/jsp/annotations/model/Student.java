package org.jsp.annotations.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@Column(unique = true, nullable = false)
	private Integer studentid;
	@Column(unique = false, nullable = false)
	private String studentname;
	@Column(unique = false, nullable = false)
	private String studentstream;
	@Column(unique = true, nullable = false)
	private String studentemail;
	@Column(unique = false, nullable = false)
	private Double studentpercentage;
	@Column(unique = true, nullable = false)
	private String studentmobilenumber;
	@Column(nullable = false)
	private Date date;

	public Student() {

	}

	public Student(Integer studentid, String studentname, String studentstream, String studentemail,
			Double studentpercentage, String studentmobilenumber, Date date) {
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentstream = studentstream;
		this.studentemail = studentemail;
		this.studentpercentage = studentpercentage;
		this.studentmobilenumber = studentmobilenumber;
		this.date = date;
	}

	public Integer getStudentid() {
		return studentid;
	}

	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentstream() {
		return studentstream;
	}

	public void setStudentstream(String studentstream) {
		this.studentstream = studentstream;
	}

	public String getStudentemail() {
		return studentemail;
	}

	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}

	public Double getStudentpercentage() {
		return studentpercentage;
	}

	public void setStudentpercentage(Double studentpercentage) {
		this.studentpercentage = studentpercentage;
	}

	public String getStudentmobilenumber() {
		return studentmobilenumber;
	}

	public void setStudentmobilenumber(String studentmobilenumber) {
		this.studentmobilenumber = studentmobilenumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentstream=" + studentstream
				+ ", studentemail=" + studentemail + ", studentpercentage=" + studentpercentage
				+ ", studentmobilenumber=" + studentmobilenumber + ", date=" + date + "]";
	}

}
