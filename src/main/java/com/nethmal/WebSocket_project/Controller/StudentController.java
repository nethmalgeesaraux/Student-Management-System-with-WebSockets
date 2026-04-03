package com.nethmal.WebSocket_project.Controller;

import com.nethmal.WebSocket_project.Dto.StudentRequest;
import com.nethmal.WebSocket_project.Dto.StudentResponse;
import com.nethmal.WebSocket_project.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public StudentResponse addStudent(@RequestBody StudentRequest request) {
        return studentService.saveStudent(request);
    }

    @GetMapping
    List<StudentResponse> getAllStudents() {
        return studentService.getAllStudents();
    }
}
