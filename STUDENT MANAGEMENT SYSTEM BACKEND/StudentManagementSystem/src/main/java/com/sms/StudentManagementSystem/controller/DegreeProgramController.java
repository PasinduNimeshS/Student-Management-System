package com.sms.StudentManagementSystem.controller;

import com.sms.StudentManagementSystem.dto.DegreeProgramDTO;
import com.sms.StudentManagementSystem.dto.StudentDTO;
import com.sms.StudentManagementSystem.service.DegreeProgramService;
import com.sms.StudentManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sms/degreeprogram")
@CrossOrigin
public class DegreeProgramController {
    private final DegreeProgramService degreeProgramService;
    @Autowired
    public DegreeProgramController(DegreeProgramService degreeProgramService){
        this.degreeProgramService=degreeProgramService;
    }
    @GetMapping("/getDegreeProgramById/{id}")
    public ResponseEntity<DegreeProgramDTO> getDegreeProgramById(@PathVariable Long id){
        DegreeProgramDTO degreeProgramDTO=degreeProgramService.getDegreeProgramById(id);
        if (degreeProgramDTO != null) {
            return ResponseEntity.ok(degreeProgramDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
