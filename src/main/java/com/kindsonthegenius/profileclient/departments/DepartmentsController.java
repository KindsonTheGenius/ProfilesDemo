package com.kindsonthegenius.profileclient.departments;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("departments")
public class DepartmentsController {


	@GetMapping("/departments")
	public String home() {
		return "Welcome to the Departments Service";
	}
}
