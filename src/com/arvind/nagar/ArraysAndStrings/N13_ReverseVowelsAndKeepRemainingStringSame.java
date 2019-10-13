package com.arvind.nagar.ArraysAndStrings;

import java.util.Deque;
import java.util.LinkedList;

public class N13_ReverseVowelsAndKeepRemainingStringSame {

	public static void main(String[] args) {
		try {
			String s = "Hello friends";
			System.out.println("Input : "+s);
			System.out.println("Result : "+reverseVowel(s));
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	private static String reverseVowel(String s) {
		if(s == null || s.length() <=1) {
			System.out.println("String is null or having single element");
			return s;
		}
		char[] input = s.toCharArray();
		Deque<Character> characters = new LinkedList<>();
		char[] result = new char[input.length];
		
		for(char ch : input) {
			if(isVowels(ch)) {
				characters.push(ch);
			}
		}
		
		/*for(int i = input.length-1; i>=0; i--) {
			char ch = input[i];
			if(isVowels(ch)) {
				ch = characters.pollLast();
			}
			result[i] = ch;
		}*/
		
		for(int i = 0; i<input.length; i++) {
			char ch = input[i];
			if(isVowels(ch)) {
				ch = characters.pollFirst();
			}
			result[i] = ch;
		}
		
		return new String(result);
	}
	private static boolean isVowels(char ch) {
		switch(ch) {
		case 'a':
			return true;
		case 'e':
			return true;
		case 'i':
			return true;
		case 'o':
			return true;
		case 'u':
			return true;
		}
		return false;
	}

}
