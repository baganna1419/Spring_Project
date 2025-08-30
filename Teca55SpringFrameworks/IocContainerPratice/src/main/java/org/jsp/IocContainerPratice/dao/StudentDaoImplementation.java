package org.jsp.IocContainerPratice.dao;

import java.util.ArrayList;
import java.util.List;

import org.jsp.IocContainerPratice.entity.Student;
import org.springframework.stereotype.Component;
@Component
public class StudentDaoImplementation implements StudentDao {
    List<Student> listStudents=new ArrayList<Student>();
	public void  storeStudent(Student student) {
		if(student!=null) {
			listStudents.add(student);
			System.out.println("Registration successfull..");
		}
		
	}
	public List<Student> getDetails() {
		return listStudents;
		
	}

}
