package com.example.demo.service;
import java.util.List;
import java.util.Optional;
import com.example.demo.entity.Student;

public interface StudentService{
    Student poststudent (Student st);
    List<Student> getAl1Students();
    Optional<Student> getById(Long id);
}