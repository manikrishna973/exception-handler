package com.example.exceptionhandler.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.exceptionhandler.ApiRequestException;
import com.example.exceptionhandler.domain.Student;

@RestController
@RequestMapping("students")
public class StudentController {

	@GetMapping
	public List<Student> getAllStudents() {
		throw new ApiRequestException("STUDENTS NOT FOUND");

		// return null;
	}
}
