package com.nethmal.WebSocket_project.Service;

import com.nethmal.WebSocket_project.Dto.StudentRequest;
import com.nethmal.WebSocket_project.Dto.StudentResponse;
import com.nethmal.WebSocket_project.Entity.StudentEntity;

import java.util.List;

public interface StudentService {

   StudentResponse saveStudent(StudentRequest studentRequest);
    List<StudentResponse> getAllStudents();
}
