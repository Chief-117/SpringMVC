package com.noah.SpringMVC;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	// add ad initbinder to convert trim input
	// remove whitespace
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/show")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "studentForm";

	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
		System.out.println("Last Name: " + student.getLastName());
		if (bindingResult.hasErrors()) {
			return "studentForm";
		} else
			return "student-confirm";
	}
}
