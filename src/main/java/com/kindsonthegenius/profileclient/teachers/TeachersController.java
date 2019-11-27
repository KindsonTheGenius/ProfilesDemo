package com.kindsonthegenius.profileclient.teachers;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("teachers")
public class TeachersController {


	@GetMapping("/teachers")
	public String home() {
		return "Welcome to the Teachers Service";
	}
}
