package com.sms.StudentManagementSystem.service;

import com.sms.StudentManagementSystem.dto.StudentDTO;
import com.sms.StudentManagementSystem.entity.Student;
import com.sms.StudentManagementSystem.repo.StudentRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class StudentService {
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;
    @Autowired
    public StudentService(StudentRepository studentRepository,ModelMapper studentModelMapper){
        this.studentRepository=studentRepository;
        this.modelMapper=studentModelMapper;
    }
    public StudentDTO addStudent(StudentDTO studentDTO){
        Student student=modelMapper.map(studentDTO,Student.class);
        studentRepository.save(student);
        return modelMapper.map(student,StudentDTO.class);

    }

    public StudentDTO getStudentById(long id) {
        Student student = studentRepository.findStudentById(id);
        return modelMapper.map(student, StudentDTO.class);
    }

    public StudentDTO updateStudent(StudentDTO studentDTO){
        studentRepository.save(modelMapper.map(studentDTO,Student.class));
        return studentDTO;
    }

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }


}
