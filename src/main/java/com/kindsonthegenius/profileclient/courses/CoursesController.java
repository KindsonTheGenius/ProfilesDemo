package com.kindsonthegenius.profileclient.courses;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("courses")
public class CoursesController {

	@GetMapping("/courses")
	public String home() {
		return "Welcome to the Course Service";
	}
}
