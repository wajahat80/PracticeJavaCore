package com.core.abstraction;

public class InheritAbstract extends TestAbstraction{

	public InheritAbstract() {
		System.out.println("Constructor: TestCore()");
	}

	public void printf(String str){
		System.out.println("Printing Inherited Class:"+str);
	}

	@Override
	void ecoString(String str) {
		printf("Using ecoString | "+str);
		
	}
}
