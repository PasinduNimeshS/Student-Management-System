package com.sms.StudentManagementSystem.repo;

import com.sms.StudentManagementSystem.entity.DegreeProgram;
import com.sms.StudentManagementSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DegreeProgramRepository extends JpaRepository<DegreeProgram,Long> {
//    @Query(value = "SELECT * FROM degree_program WHERE id=?1", nativeQuery = true)
//    Student findDegreeProgramById(Long id);
}
