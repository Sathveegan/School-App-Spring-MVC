package com.my_school.service;

import java.util.List;

import com.my_school.model.Student;

public interface StudentService {
	
	public void addStudent(Student s);
	public List<Student> getAllStudents();
	public int deleteStudent(int id);
	public Student getStudentById(int id);
	public void editStudent(Student s);
}
