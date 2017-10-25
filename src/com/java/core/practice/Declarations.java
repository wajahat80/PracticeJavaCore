package com.java.core.practice;

public class Declarations {
	
	

	char c;
	byte b;
	int i;
	float f;
	long l;
	double d;
	
	void defaultValues(){
		System.out.println("char>"+c+"<"); // This will print a Space as default value
		System.out.println("byte>"+b+"<"); // This will print a 0 as default value
		System.out.println("int>"+i+"<"); // This will print a 0 as default value
		System.out.println("float>"+f+"<"); // This will print a 0.0 as default value
		System.out.println("long>"+l+"<"); // This will print a 0 as default value
		System.out.println("double>"+d+"<"); // This will print a 0.0 as default value
	}
	
	public static void main(String[] args) {
		Declarations d = new Declarations();
		d.defaultValues();
		
		
	}

}
