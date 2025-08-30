package org.jsp.annotations.service;

import org.jsp.annotations.dao.StudentDao;
import org.jsp.annotations.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplementation implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public String addStudent(Student student) {
		Student student1 = studentDao.insertStudent(student);
		if (student1 != null) {
			return "Admission Succesfull";
		} else {
			return "Admission Failed";
		}
	}

	@Override
	public String selectStudent(Integer sid) {
		Student student = studentDao.selectStudent(sid);
		if (student!=null) {
			return "Student login successful..!!!";
		}
		else
		{
			return "Invald Student details..!!!";
		}
	}
	

}
