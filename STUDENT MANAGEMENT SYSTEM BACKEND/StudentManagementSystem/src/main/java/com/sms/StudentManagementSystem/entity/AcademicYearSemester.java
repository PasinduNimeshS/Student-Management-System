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
@Table(name = "academic_year_semesters")

public class AcademicYearSemester {
        @Id
        @Column(name = "academic_year_semester_id")
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long academicYearSemesterId;

        private String academicYear;
        private String semester;

        @OneToMany(mappedBy = "academicYearSemester")
        private List<Student> students;

//        public Long getAcademic_year_semester_id() {
//                return academicYearSemesterId;
//        }
//
//        public void setAcademic_year_semester_id(Long academic_year_semester_id) {
//                this.academicYearSemesterId = academic_year_semester_id;
//        }
}


