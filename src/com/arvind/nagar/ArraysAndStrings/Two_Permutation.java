package com.arvind.nagar.ArraysAndStrings;

import java.util.Arrays;

/**
 * check two strings are permutation of each other or not eg . --> GOD and DOG are
 * permutation of each other (means all are having similar number of elements with similar appearance 
 *  means  say G comes once, O comes once and so on)
 * 
 * @author Scorpio Steps : 1. First check the length of both strings if not
 *         same, not palindrome 2. convert string into array and sort 3. compare
 *         both strings
 */
public class Two_Permutation {

	public static void main(String[] args) {
		try {
			String s1 = "Arvind";
			String s2 = "vindrA";
			System.out.println("Pallindrome outut data: " + isPalindrome(s1, s2));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static boolean isPalindrome(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		return sort(s1).equals(sort(s2));
	}

	public static String sort(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

}
