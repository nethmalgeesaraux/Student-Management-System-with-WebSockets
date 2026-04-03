package com.nethmal.WebSocket_project.Controller;

import com.nethmal.WebSocket_project.Dto.StudentRequest;
import com.nethmal.WebSocket_project.Dto.StudentResponse;
import com.nethmal.WebSocket_project.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class StudentWebSocketController {

    private final StudentService studentService;
    private final SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/student.add")
    public void addStudent(StudentRequest request) {

        StudentResponse response = studentService.saveStudent(request);

        messagingTemplate.convertAndSend("/topic/students", response);
    }
}
