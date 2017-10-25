package com.core.abstraction;

public abstract class TestAbstraction {

	public TestAbstraction() {
		System.out.println("Constructor: TestCore()");
	}

	public void printf(String str){
		System.out.println("Printing :"+str);
	}
	
	abstract void ecoString(String str);
}
