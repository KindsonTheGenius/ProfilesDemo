package com.kindsonthegenius.profileclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProfileclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileclientApplication.class, args);
	}

}
