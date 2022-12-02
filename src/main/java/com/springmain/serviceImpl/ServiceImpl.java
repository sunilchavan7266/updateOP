package com.springmain.serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmain.entity.Student;
import com.springmain.repository.Repository;
import com.springmain.service.ServiceInt;

@Service
public class ServiceImpl implements ServiceInt {

	@Autowired
	private Repository repository;

	@Override
	public Student updateStd(Student std) {
		Integer id = std.getStdid();
		Student std2 = repository.findById(id).get();

		std2.setName(std.getName());
		// std2.setCity(std.getCity());

		return repository.save(std2);
	}

	@Override
	public void deleteStdById(Integer id) {

		repository.deleteById(id);
	}

	@Override
	public Iterable<Student> saveAllcity(Student student) {
		Iterable<Student> itr = repository.findAll();
//	Student std2=new Student();
//	
//		for(int x=1;x<=3;x++) {
//			Student std=repository.findById(x).get();
//			std.setCity(student.getCity());
//			
//		 std2=repository.save(std);
//			
//		}
//		
//	return repository.findAll();
		Iterator<Student> itr2 = itr.iterator();
		if (itr2.hasNext()) {
			Student s = itr2.next();
			s.setCity(student.getCity());
			repository.save(s);
			
		}
		return repository.findAll();

	}

	@Override
	public Student updateStudent(Student student, Integer id) {
		Student std1=repository.findById(id).get();
		std1.setName(student.getName());
		return repository.save(std1);
	}
	
	

}
