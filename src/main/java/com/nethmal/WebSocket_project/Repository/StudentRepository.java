package com.nethmal.WebSocket_project.Repository;

import com.nethmal.WebSocket_project.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}
