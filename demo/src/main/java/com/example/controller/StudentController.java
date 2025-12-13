package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

@Controller
@RequestMapping("/org")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student stud)
	{
		return new ResponseEntity<>(studentRepository.save(stud),HttpStatus.CREATED);
	}
}
