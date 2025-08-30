package org.jsp.annotations.service;

import org.jsp.annotations.model.Student;

public interface StudentService {
	public String addStudent(Student student);
	public String selectStudent(Integer sid);

}
