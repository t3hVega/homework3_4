package com.homework.homework34.repository;

import com.homework.homework34.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByAge(Integer age);
    List<Student> findByAgeBetween(Integer min, Integer max);

}
