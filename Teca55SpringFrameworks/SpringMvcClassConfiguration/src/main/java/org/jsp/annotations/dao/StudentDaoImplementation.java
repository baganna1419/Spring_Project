package org.jsp.annotations.dao;

import org.jsp.annotations.model.Student;
import org.jsp.annotations.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImplementation implements StudentDao {

	@Autowired
	private StudentRepository repository;

	@Override
	public Student insertStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public Student selectStudent(Integer sid) {
		try {
			return repository.getById(sid);
		} catch (Exception e) {
			return null;
		}
	}

}
