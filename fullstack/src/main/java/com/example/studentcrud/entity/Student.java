package com.example.studentcrud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private String email;
public Student() {
	// TODO Auto-generated constructor stub
}
public Student(String name,String email) {
	this.name=name;
	this.email=email;
	// TODO Auto-generated constructor stub
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
