package com.dov.maven.mvc.controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	@NotNull(message="First Name is required")
	@Size(min=1,message="Minimum 1 character must be there")
	private String firstName;
	
	@NotNull(message="Last Name is required")
	@Size(min=1,message="Minimum 1 character must be there")
	private String lastName;
	
	@NotNull(message="Age is required")
	@Min(value=1,message="Min age must be 1")
	@Max(value=100,message="Max age must be 100")
	private Integer age;
	

	public String getFirstName() {
		return firstName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
