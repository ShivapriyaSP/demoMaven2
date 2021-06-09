package com.mindtree.DtoStudentApp.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
@Data
@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String dept;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new Date();
	
	public Student() {}

	public Student(int id, String name, String dept, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public Date getDate() {
		return date;
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

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
