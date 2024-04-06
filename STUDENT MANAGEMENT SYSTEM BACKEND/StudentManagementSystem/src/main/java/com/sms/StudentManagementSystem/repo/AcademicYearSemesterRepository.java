package com.sms.StudentManagementSystem.repo;

import com.sms.StudentManagementSystem.entity.AcademicYearSemester;
import com.sms.StudentManagementSystem.entity.DegreeProgram;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcademicYearSemesterRepository extends JpaRepository<AcademicYearSemester,Long> {
}
