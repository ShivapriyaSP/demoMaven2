package com.mindtree.DtoStudentApp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.DtoStudentApp.Dto.StudentDto;


public interface StudentService {

	void addStudent(StudentDto studentdto);

	List<StudentDto> getStudents();

}
