package com.crudreact2.crudreact2.service;

import com.crudreact2.crudreact2.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAll();

}
