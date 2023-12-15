package com.learnspring.simple.restapi;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "tcs-service")
/*
 * this annotation's work is to map all config with the prefix to the 
 * members of this class
 */
@Component
public class AppConfiguration {

	private String username;
	private String pass;
	private String join;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getJoin() {
		return join;
	}
	public void setJoin(String join) {
		this.join = join;
	}
	
	
}
