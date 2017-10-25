package com.core.java8.lamda;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

public class CollectionIterationWithStream {

	
	
	
	public static void main(String[] args){
	
		List<Person> people = Arrays.asList(new Person("Raja", "Ali", 36),
				new Person("Jawwad", "Ali", 32),
				new Person("Saad", "Khan", 27),
				new Person("Wajeeha", "Mushtaque", 22),
				new Person("Mushtaque", "Ahmed", 55)
				);
	
	
		
		System.out.println("... Iteration through Java 8 stream");
		
		people.stream().forEach(p -> System.out.println(p.getFirstname()));
		
		System.out.println("... Java 8 stream: Filters");
		people.stream(). // Convert collection to Stream
		filter(p -> p.getLastname().startsWith("A")).
		forEach(p -> System.out.println(p));
	
		long i = people.stream().
		filter(p -> p.getLastname().startsWith("A")).
		count();
		
		System.out.println("... Count of people "+i);
		
		List<String> listofNames = people.stream() // Convert collection to Stream
		.filter(person -> person.getAge()>30)
		.map(Person :: getFirstname) // <== Same as==> person -> person.getFirstname()
		.map(String :: toUpperCase) // <== Same as ==> name -> name.toUpperCase()
		.collect(toList());
		
		System.out.println(listofNames);
		
	}

	
	
}
