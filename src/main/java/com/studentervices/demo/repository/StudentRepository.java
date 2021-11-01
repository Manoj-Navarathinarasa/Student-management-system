package com.studentervices.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentervices.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
