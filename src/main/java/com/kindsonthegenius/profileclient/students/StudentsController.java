package com.kindsonthegenius.profileclient.students;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("students")
public class StudentsController {
	

	@GetMapping("/students")
	public String home() {
		return "Welcome to the Students Service";
	}

}
