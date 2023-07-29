package com.app.Student_management.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long Id;
@Column
 private String name;
@Column
 private String address;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(Long id, String name, String address) {
	super();
	Id = id;
	this.name = name;
	this.address = address;
}
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
 
 
}
