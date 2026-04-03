package com.nethmal.WebSocket_project.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StudentResponse {

    private Long id;
    private String name;
    private String email;
}
