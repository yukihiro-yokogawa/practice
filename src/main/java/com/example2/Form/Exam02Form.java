package com.example2.Form;

public class Exam02Form {
	
	//足し算の数値1
	private String num1;
	//足し算の数値2
	private String num2;

	public Integer getNum1() {
		return Integer.valueOf(num1);
	}

	public void setNum1(String num1) {
		this.num1 = num1;
	}

	public Integer getNum2() {
		return Integer.valueOf(num2);
	}

	public void setNum2(String num2) {
		this.num2 = num2;
	}

}
