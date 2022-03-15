package com.noah.SpringMVC;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//need a controller to show initial form
	@RequestMapping("/initial")
	public String initialForm() {
		return "initial";
	}
	
	@RequestMapping("/process")
	public String processForm() {
		return "process";
	}
	//read form data and add the data to the model
	//Model 是攜帶資料的
	@RequestMapping("/processVer2")
	public String processForm2(HttpServletRequest request , Model model) {
		
		String value = request.getParameter("info");
				
		value = "Hey," + value.toUpperCase();
		
		System.out.println(value);
		
		model.addAttribute("NameValueToUppercase" , value);
		
		return "processVer2";
	}
	
	@RequestMapping("/processVer3")
	public String processForm3(@RequestParam("info") String Name , Model model) {
		
		Name = Name.toUpperCase();
		
		model.addAttribute("NameValueToUppercase",Name);
		
		return "processVer3";
	}
	
	@RequestMapping("/testSpring")
	public String TestSpring() {
		return "TestSpring";
	}
	//need a controller to process the form
	
}
