package com.sms.StudentManagementSystem;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Bean(name = "studentModelMapper")
	public ModelMapper studentModelMapper() {
		return new ModelMapper();
	}

	@Bean(name = "degreeProgramModelMapper")
	public ModelMapper degreeProgramModelMapper() {
		return new ModelMapper();
	}

	@Bean(name = "academicYearSemesterModelMapper")
	public ModelMapper academicYearSemesterModelMapper() {
		return new ModelMapper();
	}
}
