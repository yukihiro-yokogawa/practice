package com.example2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam1")
public class Exam01Controller {

	@RequestMapping("")
	public String index() {
		return "exam01";
	}
	
}
