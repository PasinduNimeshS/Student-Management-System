package com.sms.StudentManagementSystem.controller;

import com.sms.StudentManagementSystem.dto.AcademicYearSemesterDTO;
import com.sms.StudentManagementSystem.dto.DegreeProgramDTO;
import com.sms.StudentManagementSystem.service.AcademicYearSemesterService;
import com.sms.StudentManagementSystem.service.DegreeProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sms/degreeprogram")
@CrossOrigin
public class AcademicYearSemesterController {
    private final AcademicYearSemesterService academicYearSemesterService;

    @Autowired
    public AcademicYearSemesterController(AcademicYearSemesterService academicYearSemesterService){
        this.academicYearSemesterService=academicYearSemesterService;
    }
    @GetMapping("/getAcademicYearSemesterById/{id}")
    public ResponseEntity<AcademicYearSemesterDTO> getAcademicYearSemesterById(@PathVariable Long id){
        AcademicYearSemesterDTO academicYearSemesterDTO=academicYearSemesterService.getAcademicYearSemesterById(id);
        if (academicYearSemesterDTO != null) {
            return ResponseEntity.ok(academicYearSemesterDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
