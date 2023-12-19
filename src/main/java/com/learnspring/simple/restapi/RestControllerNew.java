package com.learnspring.simple.restapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerNew {
	
	@Autowired
	AppConfiguration appconfiguration;
	
	@RequestMapping("/phones")
	public List<Phones> retriveAllPhones(){
		return Arrays.asList(new Phones("iPhone",78000,"Apple"),
				new Phones("S23", 90000, "Samsung"),
				new Phones("Phone 1", 40000, "Nothing"),
				new Phones("Poco F1", 20000, "Xiaomi"),
				new Phones("Poco x3", 24000, "Xiaomi"));
		/*
		<!-- this dependency is for devtools we get features such as automatically-->
	   <!-- restart server on changes-->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
		</dependency>
		 */
	}
	
	@RequestMapping("/configs")
	public AppConfiguration getAppConfig() {
		return appconfiguration;
	}

}
