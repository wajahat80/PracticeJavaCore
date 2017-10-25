package com.java.core.practice;

public class Test {

	public static void main(String[] a){
		int i1[] = {1,3,4};
		int i2[] = {1,3,5,4,2};
		
		Test t = new Test();

		
		
		
		
		t.test("Hello!");

	}


	public void test(String arg){
		System.out.println("Input Argument is: "+arg);
		
	}
	
	public class B{
		
		public void test(String arg){
			System.out.println("Input Argument is: "+arg);
			
		}
		
		
	}
}
