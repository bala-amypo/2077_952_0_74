package com. example.demo.controller;
import org. springframework.web.bind.annotation.PostMapping;
import org. springframework.web.bind.annotation.RestController;
import com.examppl
@RestController
public class StudentController {
   @PostMapping("/addStudent")
   public Student addStudent(@RequestBody Student st){

   }
}