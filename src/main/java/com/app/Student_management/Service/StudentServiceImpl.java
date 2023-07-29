package com.app.Student_management.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Student_management.Model.Student;
import com.app.Student_management.Repository.StudentRepository;



@Service
public class StudentServiceImpl implements StudentService 
{

	@Autowired
    StudentRepository repository;

	    public List<Student> getAllStudent() {
		List<Student> stud = new ArrayList<Student>();
		repository.findAll().forEach(stud1 -> stud.add(stud1));
		return stud;
	}	
//		public List<User> getAllUsers() {
//			List<User> users = new ArrayList<User>();  
//			userRepo.findAll().forEach(users1 -> users.add(users1));  
//			return users;
	

	public Student getStudentById(Long id) {

		return this.repository.findById(id).get();
	}

	public Student saveStudent(Student stud) {
		
		return this.repository.save(stud);
	}

	public void DeleteStudent(Long id) {
		this.repository.deleteById(id);
		
	}

	public Student UpdateStudent(Student student) {
		return this.repository.save(student);
		
	}
	

	
	}



