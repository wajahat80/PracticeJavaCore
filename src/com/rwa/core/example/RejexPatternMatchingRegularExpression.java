package com.rwa.core.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Regex start with "^" and end with "$"
 */
public class RejexPatternMatchingRegularExpression {

	public static void main(String[] args) {

		String emailCheck = "#abc@yhh.com";

		System.out.println(emailCheck(emailCheck));
	}

	/*
	 * 1) A-Z characters allowed 2) a-z characters allowed 3) 0-9 numbers allowed 4)
	 * Additionally email may contain only dot(.), dash(-) and underscore(_) 5) Rest
	 * all characters are not allowed
	 */
	static boolean emailCheck(String arg) {
		String regex = "^[A-Za-z0-9#_.-]+@(.+)$"; 	// Step # 1: Define expression
		Pattern p = Pattern.compile(regex);			// Step # 2: Compile Pattern
		Matcher matcher = p.matcher(arg);			// Step # 3: Match pattern
		return matcher.matches();					
	}

}
