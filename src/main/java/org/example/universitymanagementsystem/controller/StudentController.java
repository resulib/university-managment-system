package org.example.universitymanagementsystem.controller;

import lombok.RequiredArgsConstructor;
import org.example.universitymanagementsystem.dto.CreateStudentDTO;
import org.example.universitymanagementsystem.dto.StudentDTO;
import org.example.universitymanagementsystem.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentDTO>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(studentService.findAll());
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody CreateStudentDTO  createStudentDTO){
        studentService.create(createStudentDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
