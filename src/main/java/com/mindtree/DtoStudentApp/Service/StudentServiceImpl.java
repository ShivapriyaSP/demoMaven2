package com.mindtree.DtoStudentApp.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.DtoStudentApp.Dto.StudentDto;
import com.mindtree.DtoStudentApp.Entity.Student;
import com.mindtree.DtoStudentApp.Repository.StudentRepository;

import javassist.bytecode.Descriptor.Iterator;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentrepository; 
	
	static ModelMapper mapper = new ModelMapper();
	
	@Override
	public void addStudent(StudentDto studentdto) {
		Student st = null;
		Student stR = null;
		StudentDto stdto = null;
		st = mapper.map(studentdto, Student.class);
		st.setDate(new Date());
		stR = studentrepository.save(st);
		stdto = mapper.map(stR, StudentDto.class);
		System.out.println("auto build test in jenkins");
	}

	@Override
	public List<StudentDto> getStudents() {
		// TODO Auto-generated method stub
		List<StudentDto> studentdtoList = new ArrayList<StudentDto>();
		List<Student> students;
		students = studentrepository.findAll();
		ListIterator<Student> it = students.listIterator();
		while(it.hasNext())
		{
			Student st = it.next();
			
			StudentDto stdto = mapper.map(st, StudentDto.class);
			studentdtoList.add(stdto);
		}
		
		
		return studentdtoList;
	}

}
