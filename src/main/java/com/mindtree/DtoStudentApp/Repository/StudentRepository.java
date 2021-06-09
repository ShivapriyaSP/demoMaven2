package com.mindtree.DtoStudentApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.DtoStudentApp.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
