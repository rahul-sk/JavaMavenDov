package com.dov.maven.mvc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import java.util.*;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
//	@Value("#{countryProps}")
//	private Map<String,String> hm;

	@RequestMapping("/showStudent")
	public String showForm(Model m) {
		m.addAttribute("student", new Student());
//		m.addAttribute("props", hm);
		return "studentForm";
	}
	
	@RequestMapping("/processStudent")
	public String processForm(@Valid @ModelAttribute("student") Student s, BindingResult bd)
	{
		if(bd.hasErrors()) {
			return "studentForm";
		}
		System.out.println(s.getFirstName());
		System.out.println(s.getLastName());
		return "studentConfirmation";
		
	}
}
