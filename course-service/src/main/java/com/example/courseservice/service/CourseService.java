package com.example.courseservice.service;


import com.example.courseservice.model.Course;
import com.example.courseservice.repository.CourseRepository;
import com.example.courseservice.student.StudentResponse;
import com.example.courseservice.student.StudentRestClient;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;


    StudentRestClient studentRestClient;


    public List<Course> getCourses(){
        return courseRepository.findAll();

    }

    public void addCourse(Course course){

        courseRepository.save(course);
    }

    public void deleteCourse(Long id){
        courseRepository.deleteById(id);
    }

    public List<StudentResponse> getCourseStudents(Long id){
        return studentRestClient.getStudentByCourseId(id);
    }

}
