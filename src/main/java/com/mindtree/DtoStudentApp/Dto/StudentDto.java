package com.mindtree.DtoStudentApp.Dto;

import lombok.Data;

@Data
public class StudentDto {

	private int id;
	private String name;
	private String dept;
	
	public StudentDto(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public StudentDto() {}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
