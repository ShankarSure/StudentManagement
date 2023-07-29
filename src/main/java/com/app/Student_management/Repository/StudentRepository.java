package com.app.Student_management.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Student_management.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> 
{

	Student save(Student stud);

	Optional<Student> findById(Long id);

	void deleteById(Long id);

}
