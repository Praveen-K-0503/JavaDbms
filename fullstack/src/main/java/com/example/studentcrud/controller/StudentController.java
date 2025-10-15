package com.example.studentcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.StudentRepository;
import com.example.studentcrud.entity.Student;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/students")
public class StudentController {
@Autowired
private StudentRepository studentRepository;
@PostMapping
public Student CreateStudent(@RequestBody Student student)
{
	return studentRepository.save(student);
}

@GetMapping
public List<Student>getAllstudents()
{
	return studentRepository.findAll();
	
}
@GetMapping("/{id}")
public Student getStudentBuId(@PathVariable Long id)
{
	return StudentRepository.findById(id).orElse(null);
}
@PutMapping("/{id}")
public Student updateStudents(@PathVariable Long id,@RequestBody Student updatestudent)
{
	Student student = studentRepository.findById(id).orElse(null);
	if(student!=null)
	{
		student.setName(updatestudent.getName());
		student.setEmail(updatestudent.getEmail());
		return studentRepository.save(student);
	}
	return null;
}
@DeleteMapping("/{id}")
public String deleteStudent(@PathVariable Long id) {
	studentRepository.deleteById(id);
	return "Student deleted successfully!";
	
}

}
