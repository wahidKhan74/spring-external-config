package com.simplilearn.externalconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
	
	@Value("${app.name}")
	private String appName;
	
	@Value("${app.message}")
	private String appMessage;
	
	@Value("${app.description}")
	private String appDesc;
	
	@GetMapping("")
	public String showAppName() {
		return appName;
	}
	
	@GetMapping("/message")
	public String showMessage() {
		return appMessage;
	}
	

	@GetMapping("/desc")
	public String showDescription() {
		return appDesc;
	}
}
