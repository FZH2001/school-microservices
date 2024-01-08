package com.example.studentservice.service;

import com.example.studentservice.model.Student;
import com.example.studentservice.repository.StudentRepository;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public List<Student> getStudentsByCourseId(Long id) {

         List<Student> students = new ArrayList<>();
        for (Student student: studentRepository.findAll()) {
            if(student.getCourseIds().contains(id)){
                students.add(student);

            }

        }
        return  students;
    }
}
