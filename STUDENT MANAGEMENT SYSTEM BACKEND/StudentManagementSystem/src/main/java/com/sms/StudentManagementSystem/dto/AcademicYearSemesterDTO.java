package com.sms.StudentManagementSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcademicYearSemesterDTO {
    private Long academicYearSemesterId;
    private String academicYear;
    private String semester;
}
