package com.core;

/*
 * A string is a Palindrome if it remains unchanged when reversed, 
 * for example mom, dad, madam, radar, paap
 */
public class Palindrome {

	public static void main(String[] args) {
		System.out.println(Palindrome.checkPalindrome("r"));
		System.out.println(Palindrome.checkPalindrome2("raxdar"));
	}

	/*
	 * Logic # 1: check each character from start by end This function will take
	 * String argument and print whether it is a Palindrome or not
	 */
	static boolean checkPalindrome(String inp) {
		boolean outcome = false;

		if (inp != null && inp.length() > 0) {
			char[] inpArr = inp.toCharArray();

			for (int i = 0; i < inpArr.length / 2; i++) {
				System.out.println(">" + inpArr[i] + " <" + inpArr[inpArr.length - (i + 1)]);
				if (inpArr[i] != inpArr[inpArr.length - (i + 1)])
					return false;

			}
			return true;
		} else {
			System.out.println("Invalid input String");
		}
		return outcome;
	}

	/*
	 * Logic # 2: Reverse the String and compare to check if they are equal This
	 * function will take String argument and print whether it is a Palindrome
	 * or not
	 */
	static boolean checkPalindrome2(String inp) {
		boolean outcome = false;

		String reverse = "";

		for (int i = inp.length() - 1; i >= 0; i--)
			reverse += inp.charAt(i);

		if (inp.equals(reverse))
			return true;

		return outcome;
	}
}
