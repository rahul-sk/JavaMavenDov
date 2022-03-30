package com.dov.maven.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloWorldController {

	@RequestMapping(value="/showForm")
	public String showPage() {
		return "homepage";
	}
	
	
	@RequestMapping(value="/processFormOne")
	public String processFormOne() {
		return "helloworld";
	}
	
	@RequestMapping(value="/processFormTwo")
	public String shoutForm(HttpServletRequest req,Model m) {
		String name=req.getParameter("studentName");
		name="Yo! Bro "+name.toUpperCase();
		m.addAttribute("studentName", name);
		
		
		return "helloworld";
		
	}
	
	@RequestMapping(value="/processFormThree")
	public String processFormThree(@RequestParam("studentName") String name,Model m) {
		name="This is third version "+name.toUpperCase();
		m.addAttribute("studentName", name);
		
		
		return "helloworld";
		
	}
}
