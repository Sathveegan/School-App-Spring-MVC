package com.my_school.dao;

import java.util.List;

import com.my_school.model.Student;

public interface StudentDAO {
	public int addStudent(Student s);
	public List<Student> getAllStudents();
	public int deleteStudent(int id);
	public Student getStudentById(int id);
	public int editStudent(Student s);
}
