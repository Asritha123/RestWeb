package com.vm.rest.students.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.vm.rest.students.entity.Student;

@Service
public class StudentService {


	List<Student> students = new ArrayList<>();


	public void createStudents() {

		students.add(new Student(1035, "asritha", 1, 35));
		students.add(new Student(1033, "neha", 2, 33));
		students.add(new Student(1025, "pallavi",3, 25));
		students.add(new Student(1902, "sree", 4, 20));
	}

	public List<Student> getStudents(){
		createStudents();
		return students;
	}

	public Student getStudent(int id) {
		/*
		 * // TODO Auto-generated method stub for(Student s : students) {
		 * if(s.getId()==id) { return s; } }
		 */
		
			Student student=  students.stream().filter(s -> s.getId() == id ).findFirst().get();
			return student;
		}
	public void addStudent(Student student) {
		System.out.println("controllers add student");
		students.add(student);
	}
	public void updateStudent(Student student, int id) {
		for(int i = 0; i< students.size(); i++) {
			Student s = students.get(1);
			if(s.getId() == id) {
				students.set(id, student);
				return;
			}
		}
	}
		
		
	}
	
	
