package com.nethmal.WebSocket_project.Service.Impl;

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
    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }
}
