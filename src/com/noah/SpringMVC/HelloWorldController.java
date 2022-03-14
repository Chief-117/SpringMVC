package com.noah.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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
	
	//need a controller to process the form
	
}
