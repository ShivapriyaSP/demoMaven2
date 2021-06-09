package com.mindtree.DtoStudentApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.DtoStudentApp.Dto.StudentDto;
import com.mindtree.DtoStudentApp.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/addStudent")
	public void addStudent(@RequestBody StudentDto studentdto)
	{
		service.addStudent(studentdto);
	}
	
	@RequestMapping("/getAllStudents")
	public List<StudentDto> getStudents()
	{
		List<StudentDto> studentsdto = service.getStudents();
		return studentsdto;
	}
}
