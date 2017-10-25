package com.core.java8.lamda;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionIteration {

	public static void main(String[] args){
	
		List<Person> people = Arrays.asList(new Person("Raja", "Ali", 36),
				new Person("Jawwad", "Ali", 32),
				new Person("Saad", "Khan", 27),
				new Person("Wajeeha", "Mushtaque", 22),
				new Person("Mushtaque", "Ahmed", 55)
				);
	
	
		System.out.println("... Iteration through for loop");
		for (Person p : people) {
			System.out.println(p);
		}
	
		System.out.println("... Iteration through Java 8 foreach");
		people.forEach(p -> System.out.println(p));
		
		//or
		
		System.out.println("... Iteration through Java 8 foreach, Concised way");
		people.forEach(System.out::println);
	}

	
	
}
