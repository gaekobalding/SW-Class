package com.example.app;

import com.example.calculator.Calculator;

public class App {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(23, 7);
		System.out.println(calc.add(23, 7));
	}

}
