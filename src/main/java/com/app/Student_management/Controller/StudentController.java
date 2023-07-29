package com.app.Student_management.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Student_management.Model.Student;
import com.app.Student_management.Service.StudentServiceImpl;

 @RestController
 public class StudentController
{
	@Autowired
	 StudentServiceImpl service;
	
	@GetMapping("/students")
	public List<Student> getAllStudent()
	{
		
		  return this.service.getAllStudent();
	}
	
	
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable("id")Long id)
	{
		return this.service.getStudentById(id);
	}
	
	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student stud)
	{
		return this.service.saveStudent(stud);
	}
	
	@DeleteMapping("/students/{id}")
	public void DeleteStudent(@PathVariable("id") Long id)
	{
		this.service.DeleteStudent(id);
	}
	
	@PutMapping("/students")
	public Student UpdateStudent(@RequestBody Student student)
	{
		return this.service.UpdateStudent(student);
		
	}
	

}
