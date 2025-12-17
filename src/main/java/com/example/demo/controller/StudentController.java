package com. example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org. springframework.web.bind.annotation.PostMapping;
import org. springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
@Autowired
StudentService stdser;
@RestController
public class StudentController {
   @PostMapping("/addStudent")
   public Student addStudent(@RequestBody Student st){
    return stdser.poststudent(st);

   }
}