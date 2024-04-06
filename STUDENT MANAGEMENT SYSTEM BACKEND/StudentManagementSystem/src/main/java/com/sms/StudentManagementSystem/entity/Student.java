package com.sms.StudentManagementSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String address;
    private String birthday;
    private String nicNumber;
    @ManyToOne
    @JoinColumn(name="degree_program_id")
    private DegreeProgram degreeProgram;

    @ManyToOne
    @JoinColumn(name = "academic_year_semester_id")
    private AcademicYearSemester academicYearSemester;


}
