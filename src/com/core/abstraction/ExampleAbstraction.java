package com.core.abstraction;

public class ExampleAbstraction {

	public ExampleAbstraction() {
		System.out.println("Constructor: ExampleAbstraction()");
	}

	public static void main(String args[]){
		ExampleAbstraction ea = new ExampleAbstraction();
		
		
		InheritAbstract ia = new InheritAbstract();
		ia.ecoString("lallaa");
	}
}
