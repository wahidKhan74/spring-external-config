package com.simplilearn.externalconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
	
	@Value("${myprofile.message}")
	private String message;
	
	@Value("${myprofile.username}")
	private String userName;
	
	@Value("${myprofile.password}")
	private String password;
	
	
	
	@GetMapping("profile")
	public String showProfile() {
		return message + "     "+userName +"    "+password;
	}
}
