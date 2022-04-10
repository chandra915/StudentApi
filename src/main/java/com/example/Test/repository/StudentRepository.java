package com.example.Test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Test.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	public List<Student> findByBranch(String branch);
}