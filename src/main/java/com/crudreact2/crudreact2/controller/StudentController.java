package com.crudreact2.crudreact2.controller;

import com.crudreact2.crudreact2.model.Student;
import com.crudreact2.crudreact2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "New student created";
    }

    @GetMapping("/all")
    public List<Student> getStudents() {
        return studentService.getAll();
    }

}
