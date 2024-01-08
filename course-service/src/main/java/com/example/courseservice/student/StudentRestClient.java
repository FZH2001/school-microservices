package com.example.courseservice.student;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name ="student-service")

public interface StudentRestClient {
    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/students/getByCourseId/{id}")
    List<StudentResponse> getStudentByCourseId(@PathVariable("id") Long agentId);
}
