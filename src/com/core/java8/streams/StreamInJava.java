package com.core.java8.streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamInJava {
	
	public static void main(String[] args){
		
		List<String> myList =
			    Arrays.asList("a1", "a2", "b1", "c2", "c1", "c0");

			myList
			    .stream() //object of stream
			    .filter(s -> s.startsWith("c")) //Returns a stream consisting of the elements of this stream that match the given predicate.
			    .map(String::toUpperCase)
			    .sorted()
			    .forEach(System.out::println);
			
			
			Stream.of(1.0, 2.0, 3.0)
		    .mapToInt(Double::intValue)
		    .mapToObj(i -> "a" + i)
		    .forEach(System.out::println);
	}

}
