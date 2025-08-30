package org.jsp.annotations.controller;

import java.sql.Date;

import org.jsp.annotations.model.Student;
import org.jsp.annotations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	@RequestMapping("/login")
	public String showLogin() {
		return "Login";
	}

	@RequestMapping("/loginCheck")
	public String checkLogin(Integer sid, Model model) {
		String msg = service.selectStudent(sid);
		model.addAttribute("msg", msg);
		return "Login";
	}

	@RequestMapping("/showregister")
	public String showRegister() {
		return "Register";
	}

	@RequestMapping("/admission")
	public String takeAdmission(Student std, @RequestParam("sjdate") String date, Model model) {
		std.setDate(Date.valueOf(date));
		String msg = service.addStudent(std);
		if (msg == null) {
			return "redirect:/login";

		} else {
			model.addAttribute("msg", msg);
			model.addAttribute("status", false);
		}
		return "Register";
	}

}
