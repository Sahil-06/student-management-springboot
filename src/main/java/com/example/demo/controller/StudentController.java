package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/students")

public class StudentController {
    private final StudentService studentService;

    // Constructor Injection
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    // Create Student
    @PostMapping
    public Student createStudent(@Valid @RequestBody Student student){
        return studentService.saveStudent(student);
    }

    // Get All Students
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    // Get Student By ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    // Update Student
    @PutMapping("/{id}")
    public Student updateStudent(
            @PathVariable Long id,
            @Valid @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }

    // Delete Student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}
