package com.noah.SpringMVC;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
	
	@Value("#{countryOption2}")
	private Map<String, String> countryOption2;
	
	@RequestMapping("/show")
	public String showForm(Model model) {
		//create a teacher object 
		Teacher theTeacher = new Teacher();
		
		model.addAttribute("teacher",theTeacher);
		
		model.addAttribute("countryOption2",countryOption2);
		
		//add teacher object to the model
		return "teacherForm";
	}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("teacher") Teacher theTeacher) {
		System.out.println("theTeacher: "+ theTeacher.getFirstName());
		return "teacher-confirm";
	}
}
