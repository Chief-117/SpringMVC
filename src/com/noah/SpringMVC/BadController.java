package com.noah.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BadController {
	@RequestMapping("/initial")
	public String Bad() {
		return "Bad";
	}
}
