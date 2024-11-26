package com.example.asyncmethod;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
	
	private String name;
	private String blog;
	
	public String getBlog() {
		return blog;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBlog(String blog) {
		this.blog = blog;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", blog=" + blog + "]";
	}
}
