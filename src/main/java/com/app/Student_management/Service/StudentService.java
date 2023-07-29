package com.app.Student_management.Service;

import java.util.List;

import com.app.Student_management.Model.Student;

public interface StudentService 
{
	public List<Student> getAllStudent();
	public Student getStudentById(Long id);
	public Student saveStudent(Student stud);
	public void DeleteStudent(Long id);
	public Student UpdateStudent(Student student);
}
