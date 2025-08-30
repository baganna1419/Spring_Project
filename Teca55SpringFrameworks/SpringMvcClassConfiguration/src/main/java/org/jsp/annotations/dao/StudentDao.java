package org.jsp.annotations.dao;

import org.jsp.annotations.model.Student;

public interface StudentDao {
	public Student insertStudent(Student student);

	public Student selectStudent(Integer sid);

}
