package com.vm.rest.students.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vm.rest.students.entity.Student;
import com.vm.rest.students.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	/*
	 * @RequestMapping("/") public List<Student> getStudents(){ //fetching all
	 * resources
	 * 
	 * return studentService.getStudents();
	 * 
	 * }
	 * 
	 * @RequestMapping("/students/{id}") public Student getStudent(@PathVariable int
	 * id) { //getting a particular resource return studentService.getStudent(id); }
	 * 
	 * @RequestMapping(method = RequestMethod.POST, value ="students") //create a
	 * resource public void addStudent(@RequestBody Student student) {
	 * System.out.println("controllers add student");
	 * studentService.addStudent(student); }
	 * 
	 * @RequestMapping(method = RequestMethod.DELETE, value = "students/{id}")
	 * public void deleteStudent(@PathVariable int id, Student student) {
	 * studentService.updateStudent(student, id); }
	 */
	@GetMapping("/")
	public String home() {
		return ("<h1>home</h1>");
	}
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>user</h1>");
	}
	@GetMapping("/user")
	public String user() {
		return ("<h1>admin</h1>");
	}


	}
	


