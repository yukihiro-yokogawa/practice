package com.example2.Controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	//DI applicationスコープ
	@Autowired
	public ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/result")
	public String result(String price1,String price2,String price3) {
		int product1 = Integer.parseInt(price1);
		int product2 = Integer.parseInt(price2);
		int product3 = Integer.parseInt(price3);
		double tax = 1.08;
		Integer taxtotal = (int)((product1 + product2 + product3)*tax);
		Integer total = product1 + product2 + product3;
		application.setAttribute("taxtotal",taxtotal);
		application.setAttribute("total",total);
		return "exam03-result";
	}
}
