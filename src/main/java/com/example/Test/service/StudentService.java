package com.example.Test.service;

import java.util.List;

import com.example.Test.entity.Student;

public interface StudentService {

	public Student saveStudent(Student student);

	public List<Student> fetchStuents();

	public Student fetchStudentById(Long studentId);

	public String deleteStudentById(Long studentId);

	public Student updateStudentById(Long studentId, Student student);

	public List<Student> fetchStudnetByBranch(String branch);
}