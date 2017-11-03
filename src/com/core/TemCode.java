package com.core;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TemCode {

	public static <R> void main(String...strings){
		List<String> str = Arrays.asList(new String[]{"aa","vv","cc","dffd",null});
		
//		str
//		.stream()
//		.filter(s -> s.startsWith("c"))
//		.map(String::toUpperCase)
//		.sorted()
//		.forEach(System.out::println));
		
		List<String> lstString = str.stream()
								.filter(s -> s == null)
								.map(p -> {p="helloo";return p.toUpperCase();})
								.sorted()
								.collect(Collectors.toList());

		lstString.forEach(x->System.out.println(x.toString()));
		// or
		lstString.forEach(System.out::println);
		
		
		Stream<String> str1 = str
	    .stream() //object of stream
	    .filter(s -> s!=null && s.startsWith("c")) //Returns a stream consisting of the elements of this stream that match the given predicate.
	    .map(String::toUpperCase)
	    .sorted();
	    
		str1.forEach(System.out::println);
		
		
		

		
		
	}
}