package com.java.core.practice;

public class FunctionVariableArguments {

	public static void main(String... a){
		int i1[] = {1,3,4};
		int i2[] = {1,3,5,4,2};
		
		FunctionVariableArguments t = new FunctionVariableArguments();
		
		// Calling same method with different number of arguments
		t.testVariableArguments_Array(i1);
		t.testVariableArguments_Array(i1, i2);
		
		t.testVariableArguments_String("i1");
		t.testVariableArguments_String("i1", "i2", "i3");
		
		
	}

	// int[] is the type of argument
	public void testVariableArguments_Array(int[]... arg){
		System.out.println("Argument Size: "+arg.length);
	} 
	
	// String is the type of argument
	public void testVariableArguments_String(String... arg){
		System.out.println("Argument Size: "+arg.length);
	}
}
