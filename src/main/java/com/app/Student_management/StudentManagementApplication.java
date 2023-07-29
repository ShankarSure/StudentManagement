package com.app.Student_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.app.Student_management.*" })
public class StudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

}
