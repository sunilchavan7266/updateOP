package com.springmain.service;

import java.util.List;

import com.springmain.entity.Student;

public interface ServiceInt {
	
	public Student updateStd(Student std);
	
	
	public void deleteStdById(Integer id);
	
	public Iterable<Student> saveAllcity(Student student);
	
	public Student updateStudent(Student student, Integer id);
}
