package com.example.studentservice.controller;

import com.example.studentservice.model.Student;
import com.example.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @GetMapping("/get")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/getByCourseId/{id}")
    public List<Student> getStudentsByCourseId(@PathVariable Long id){
        return studentService.getStudentsByCourseId(id);
    }



}
