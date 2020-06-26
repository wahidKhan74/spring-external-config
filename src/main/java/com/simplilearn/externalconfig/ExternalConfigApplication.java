package com.simplilearn.externalconfig;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExternalConfigApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ExternalConfigApplication.class, args);
		
		MyAppConfig  appConfig  = ctx.getBean("myAppConfig",MyAppConfig.class);
		System.out.println("---------------------------------------");
		System.out.println(appConfig.getAppName());
		System.out.println(appConfig.getAppDesc());
		System.out.println(appConfig.getEmail());
		System.out.println(appConfig.toString());
		
	}

}
