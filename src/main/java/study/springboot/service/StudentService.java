package study.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.springboot.entity.Student;
import study.springboot.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository stuRepository;
	
	public List<Student> getStudents(){
		return stuRepository.findAll();
	}
}
