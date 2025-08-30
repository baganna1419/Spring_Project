package org.jsp.annotations.repository;

import org.jsp.annotations.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
