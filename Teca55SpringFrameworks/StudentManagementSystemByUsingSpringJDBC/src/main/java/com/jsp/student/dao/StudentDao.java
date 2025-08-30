package com.jsp.student.dao;

import java.util.List;

import com.jsp.student.entity.Student;

public interface StudentDao {

	int insertStudentData(Student student);

	boolean checkStudentId(int studentId);

	List<Student> displayStudentDetails();

	int updateStreamByStudentId(String stream,int studentId);

	int deleteStudentDetailsByStudentId(int studentId);

}
