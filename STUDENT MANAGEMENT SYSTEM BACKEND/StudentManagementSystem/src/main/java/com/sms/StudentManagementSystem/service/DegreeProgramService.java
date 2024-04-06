package com.sms.StudentManagementSystem.service;

import com.sms.StudentManagementSystem.dto.DegreeProgramDTO;
import com.sms.StudentManagementSystem.dto.StudentDTO;
import com.sms.StudentManagementSystem.entity.DegreeProgram;
import com.sms.StudentManagementSystem.entity.Student;
import com.sms.StudentManagementSystem.repo.DegreeProgramRepository;
import com.sms.StudentManagementSystem.repo.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class DegreeProgramService {
    private final DegreeProgramRepository degreeProgramRepository;
    private final ModelMapper modelMapper;
    @Autowired
    public DegreeProgramService(DegreeProgramRepository degreeProgramRepository, ModelMapper degreeProgramModelMapper){
        this.degreeProgramRepository=degreeProgramRepository;
        this.modelMapper=degreeProgramModelMapper;
    }
    public DegreeProgramDTO getDegreeProgramById(Long id) {
        DegreeProgram degreeProgram = degreeProgramRepository.findById(id)
                .orElse(null);
        if (degreeProgram != null) {
            return modelMapper.map(degreeProgram, DegreeProgramDTO.class);
        }
        return null;
    }

}
