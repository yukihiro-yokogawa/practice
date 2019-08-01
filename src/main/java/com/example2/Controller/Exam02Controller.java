package com.example2.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example2.Form.Exam02Form;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

	// DI(sessionスコープ)
	@Autowired
	public HttpSession session;

	// 入力用Viewに遷移
	@RequestMapping("")
	public String index() {
		return "exam02";
	}

	// Formより数値を受け取り結果のViewに送信
	@RequestMapping("/result")
	public String result(Exam02Form form) {
		session.setAttribute("num1", form.getNum1());
		session.setAttribute("num2", form.getNum2());
		session.setAttribute("result", form.getNum1() + form.getNum2());
		return "exam02-result01";
	}

	@RequestMapping("/toPage01")
	public String output1() {
		return "exam02-result01";
	}

	@RequestMapping("/toPage02")
	public String output2() {
		return "exam02-result02";
	}

}
