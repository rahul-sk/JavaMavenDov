package com.dov.maven.mvc.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	@RequestMapping("/showCustomer")
    public String showCustomerForm(Model m) {
    	m.addAttribute("customer", new Customer());
    	
		return "customerForm";
    }
    
	@RequestMapping("/processCustomer")
    public String processCustomerForm(@Valid @ModelAttribute("customer") Customer c,BindingResult bd) {
		System.out.println("Binding Result Yo "+bd);
System.out.println("\n\n\n\n\n");
		if(bd.hasErrors()) {
			return "customerForm";
		}
		else {
    	return "customerConfirmation";
		}
    }
	
	@InitBinder
	public void initBinder(WebDataBinder db) {
		StringTrimmerEditor edt=new StringTrimmerEditor(true);
		db.registerCustomEditor(String.class, edt);
	}

}
