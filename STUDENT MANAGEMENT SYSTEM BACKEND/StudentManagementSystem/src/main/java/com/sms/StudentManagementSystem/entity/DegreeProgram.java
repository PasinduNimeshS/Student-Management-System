package com.sms.StudentManagementSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "degree_programs")
public class DegreeProgram {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "degree_program_id")
    private Long degreeProgramId;

    private String programName;

    @OneToMany(mappedBy = "degreeProgram")
    private List<Student> students;

}
