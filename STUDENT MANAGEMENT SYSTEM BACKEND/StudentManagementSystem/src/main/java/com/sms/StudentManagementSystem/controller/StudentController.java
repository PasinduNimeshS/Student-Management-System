package com.sms.StudentManagementSystem.controller;

import com.sms.StudentManagementSystem.dto.StudentDTO;
import com.sms.StudentManagementSystem.entity.Student;
import com.sms.StudentManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/sms")
@CrossOrigin
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }
    @PostMapping("/addStudent")
    public ResponseEntity<StudentDTO>addStudent(@RequestBody StudentDTO studentDTO){
        StudentDTO addedStudent =studentService.addStudent(studentDTO);
        return new ResponseEntity<>(addedStudent, HttpStatus.CREATED);
    }


    @GetMapping("/getStudentById/{id}")
    public ResponseEntity<StudentDTO>getStudentById(@PathVariable Long id){
        StudentDTO studentDTO=studentService.getStudentById(id);
        if (studentDTO != null) {
            return ResponseEntity.ok(studentDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<Void> deleteStudentById(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/updateStudent")
    public StudentDTO updateStudent(@RequestBody StudentDTO studentDTO){
        return studentService.updateStudent(studentDTO);
    }



}
