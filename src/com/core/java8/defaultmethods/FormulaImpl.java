package com.core.java8.defaultmethods;

public class FormulaImpl implements Formula {

	@Override
	public double calculate(int a) {
		return sqrt(a * 100);
	}

	public static void main(String[] args){
		FormulaImpl formula = new FormulaImpl();
		System.out.println(formula.calculate(100));
		System.out.println(formula.calculate(16));
		
	}
}
