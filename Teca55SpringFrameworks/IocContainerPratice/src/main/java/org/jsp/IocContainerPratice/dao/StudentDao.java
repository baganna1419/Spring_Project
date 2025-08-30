package org.jsp.IocContainerPratice.dao;

import java.util.List;

import org.jsp.IocContainerPratice.entity.Student;

public interface StudentDao {
  void storeStudent(Student student);
  List<Student> getDetails();

}
