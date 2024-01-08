package com.example.courseservice.controller;

import com.example.courseservice.model.Course;
import com.example.courseservice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;


    @GetMapping("/get")
    public ResponseEntity<List<Course>> getCourses(){
        return ResponseEntity.ok(courseService.getCourses());
    }
    @PostMapping("/add")
    public ResponseEntity<String> addCourse(Course course){
         courseService.addCourse(course);
         return ResponseEntity.ok("Student added successfully");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable Long id){
         courseService.deleteCourse(id);
        return ResponseEntity.ok("Student deleted successfully");

    }


}
