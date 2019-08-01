package com.example2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {


	// 入力viewに遷移
	@RequestMapping("")
	public String index() {
		return "exam01";
	}

	@RequestMapping("/result")
	public String output(String name, Model model) {
		//リクエストスコープに格納
		model.addAttribute("name",name);
		return "exam01-result";
	}

}
