package com.core.java8.lamda;

public class MyLamda {
	
	interface IMyLamda{
		
		int getLength(String s);
	}
	

	/*public void printLengthOfString(String s){
		
		IMyLamda imylamda = new IMyLamda() {
			
			@Override
			public int getLength(String s) {
				return s.length();
			}
		};
		
		System.out.println("len is "+len);
		
	}*/
	
	public static void main(String[] args){
		
		IMyLamda iml = s -> s.length();
		System.out.println("Length Is ..."+iml.getLength("Heelllloo"));
		
		
		IMyLamda iml2 = s -> s.indexOf('h');
		System.out.println("Index Is ..."+iml2.getLength("Heellhlloo"));
		
		
		
	}

	

	
}
