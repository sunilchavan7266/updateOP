package com.springmain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.springmain.entity.Student;


public interface Repository extends CrudRepository<Student, Integer> {
	
//@Query(value = "update student set city=?1", nativeQuery = true)	
//public Iterable<Student> updateAllCity(Student std);

}
