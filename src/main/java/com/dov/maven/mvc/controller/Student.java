package com.dov.maven.mvc.controller;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	
	private String firstName;
	
	@NotNull(message="LastName is Required")
	@Size(min = 2, max = 14)
	private String lastName;
	
	
	private String country;
	
	private String gender;
	
    private String[] operatingSystems;

	private LinkedHashMap<String,String> hm;
	
	private LinkedHashMap<String,String> os;
	
	public Student() {
		hm=new LinkedHashMap<String, String>();
		hm.put("IND", "India");
		hm.put("THB", "ThaiLand");
		hm.put("KRN", "Korea");
		
		os=new LinkedHashMap<String,String>();
		os.put("MAC","Mac OS");
		os.put("Windows","Windows OS");
		os.put("Linux","Ubuntu");
		
		
		
	}
	
	
    
	
	public LinkedHashMap<String, String> getOs() {
		return os;
	}




	public String[] getOperatingSystems() {
		return operatingSystems;
	}




	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}




	public LinkedHashMap<String, String> getHm() {
		return hm;
	}
	
	
	
	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getFirstName() {
		return firstName;
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
