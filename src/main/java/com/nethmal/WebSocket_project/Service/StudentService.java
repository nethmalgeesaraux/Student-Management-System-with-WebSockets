package com.nethmal.WebSocket_project.Service;

import com.nethmal.WebSocket_project.Entity.StudentEntity;

import java.util.List;

public interface StudentService {

    StudentEntity saveStudent(StudentEntity student);
    List<StudentEntity> getAllStudents();
}
