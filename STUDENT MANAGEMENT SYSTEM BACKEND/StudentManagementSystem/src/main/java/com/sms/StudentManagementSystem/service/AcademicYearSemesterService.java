package com.sms.StudentManagementSystem.service;

import com.sms.StudentManagementSystem.dto.AcademicYearSemesterDTO;
import com.sms.StudentManagementSystem.dto.DegreeProgramDTO;
import com.sms.StudentManagementSystem.entity.AcademicYearSemester;
import com.sms.StudentManagementSystem.entity.DegreeProgram;
import com.sms.StudentManagementSystem.repo.AcademicYearSemesterRepository;
import com.sms.StudentManagementSystem.repo.DegreeProgramRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AcademicYearSemesterService {
    private final AcademicYearSemesterRepository academicYearSemesterRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public AcademicYearSemesterService(AcademicYearSemesterRepository academicYearSemesterRepository,@Qualifier("academicYearSemesterModelMapper") ModelMapper modelMapper) {
        this.academicYearSemesterRepository = academicYearSemesterRepository;
        this.modelMapper = modelMapper;
    }
    public AcademicYearSemesterDTO getAcademicYearSemesterById(Long id) {
        AcademicYearSemester academicYearSemester = academicYearSemesterRepository.findById(id)
                .orElse(null);
        if (academicYearSemester != null) {
            return modelMapper.map(academicYearSemester, AcademicYearSemesterDTO.class);
        }
        return null;
    }
}
