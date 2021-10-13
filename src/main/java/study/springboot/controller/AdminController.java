package study.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import study.springboot.entity.Student;
import study.springboot.service.StudentService;

@RestController
@RequestMapping("api/admin/")
public class AdminController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student-list")
	public List<Student> getStudents(){
		return studentService.getStudents();
	}
}
