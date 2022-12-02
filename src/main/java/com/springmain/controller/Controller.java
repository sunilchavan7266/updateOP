package com.springmain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmain.entity.Student;
import com.springmain.serviceImpl.ServiceImpl;

@RestController
@RequestMapping("/student")
public class Controller {
	
	
	@Autowired
	private ServiceImpl impl;
	
	@PutMapping("/update")
	public Student updatestd(@RequestBody Student std) {
		return impl.updateStd(std);
		
	}
	
	@PatchMapping("/updateAll")
	public Iterable<Student> updateAllcity(@RequestBody Student student){
		
		Iterable<Student> itr=impl.saveAllcity(student);
		
		return itr;
		
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteStd(@PathVariable Integer id) {
		impl.deleteStdById(id);
		return "Deleted Object having id="+id;
	}
	
	@PutMapping("/updateStudent/{id }")
	public ResponseEntity<Student> updateStudent(@PathVariable Integer id, @RequestBody Student student){
		Student student2= impl.updateStudent(student,id);
		return ResponseEntity.ok().body(student2);
	}

}
