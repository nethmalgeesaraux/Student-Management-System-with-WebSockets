package com.nethmal.WebSocket_project.Service.Impl;

import com.nethmal.WebSocket_project.Dto.StudentRequest;
import com.nethmal.WebSocket_project.Dto.StudentResponse;
import com.nethmal.WebSocket_project.Entity.StudentEntity;
import com.nethmal.WebSocket_project.Repository.StudentRepository;
import com.nethmal.WebSocket_project.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public StudentResponse saveStudent(StudentRequest studentRequest) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(studentRequest.getName());
        studentEntity.setEmail(studentRequest.getEmail());

        StudentEntity save = studentRepository.save(studentEntity);

        return new StudentResponse(
                save.getId(),
                save.getName(),
                save.getEmail());
    }

    @Override
    public List<StudentResponse> getAllStudents() {
        return studentRepository.findAll().stream()
                .map(studentEntity -> new StudentResponse(
                        studentEntity.getId(),
                        studentEntity.getName(),
                        studentEntity.getEmail()
                )).toList();
    }
}
