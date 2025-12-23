package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    // Constructor Injection
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    // Create/Save student
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    // Get All Students
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    // Get Student byId
    public Student getStudentById(Long id){
        Optional<Student> student = studentRepository.findById(id);
        return student.orElse(null);
    }

    // Update Student
    public Student updateStudent(Long id, Student updateStudent){
        Student existingStudent = studentRepository.findById(id).orElse(null);

        if(existingStudent != null){
            existingStudent.setName(updateStudent.getName());
            existingStudent.setEmail(updateStudent.getEmail());
            existingStudent.setAge(updateStudent.getAge());
            existingStudent.setCourse(updateStudent.getCourse());

            return studentRepository.save(existingStudent);
        }
        return null;
    }

    // Delete Student
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}
