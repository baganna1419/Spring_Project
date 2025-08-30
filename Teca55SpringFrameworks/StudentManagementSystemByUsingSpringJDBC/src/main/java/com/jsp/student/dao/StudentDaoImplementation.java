package com.jsp.student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jsp.student.entity.Student;

@Repository
public class StudentDaoImplementation implements StudentDao {

	@Autowired
	private JdbcTemplate template;

	private RowMapper<Student> mapper = new BeanPropertyRowMapper<Student>(Student.class);

	public int insertStudentData(Student student) {
		String insertQuery = "insert into student(studentname, studentstream, studentmobilenumber, studentemailid, studentpassword, studentaddress)values(?,?,?,?,?,?)";
		return template.update(insertQuery, student.getStudentname(), student.getStudentstream(),
				student.getStudentmobilenumber(), student.getStudentemail(), student.getStudentpassword(),
				student.getStudentaddress());

	}

	public boolean checkStudentId(int studentId) {
		List<Student> studentDetails = displayStudentDetails();
		if (!studentDetails.isEmpty()) {
			for (Student student : studentDetails) {
				if (student.getStudentid() == studentId) {
					return true;
				}

			}
		}
		return false;

	}

	public List<Student> displayStudentDetails() {
		String read = "select * from student";
		List<Student> list = template.query(read, mapper);
		return list;

	}

	public int updateStreamByStudentId(String stream, int studentId) {
		String update = "update student set studentstream=? where studentid=?";
		return template.update(update, stream, studentId);

	}

	public int deleteStudentDetailsByStudentId(int studentId) {
		String delete = "delete from student where studentid=?";
       return template.update(delete,studentId);
	}

}
