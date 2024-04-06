package com.sms.StudentManagementSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String birthday;
    private String nicNumber;
    private Long degreeProgramId;
    private Long academicYearSemesterId;
}
