package com.arvind.nagar.ArraysAndStrings;

import java.util.Arrays;

/**
 * 
 * @author Scorpio
 *	
 *Reverse vowels, but keep string same - 
 *
 */
public class Twelve_ReverseVowelsAndKeepRemainingStringSame {

	public static void main(String[] args) {
		try {
			String s = "Hello friends";
			char[] vowelArray = new char[s.length()];
			char[] strToCharArray = s.toCharArray();
			
			if(s == null || s.equals(" ") || s.length() <= 1) {
				System.out.println("Strning is empty or having just one element");
				return;
			}
			int numberOfVowels = 0;
			for(int i = 0; i< strToCharArray.length; i++) {
				if(isVowels(String.valueOf(strToCharArray[i]))) {
					vowelArray[numberOfVowels] = strToCharArray[i];
					numberOfVowels++;
				}
			}
			char[] newVowelArray = Arrays.copyOfRange(vowelArray, 0, numberOfVowels);
			if(numberOfVowels <= 1) {
				System.out.println("Number of vowels are : "+numberOfVowels);
				return;
			}
			if(numberOfVowels > 1) { // do nothing if no of vowels not greater than 1
				
				StringBuilder builder = new StringBuilder();
				int counter = 0;
				for(int i = 0; i< strToCharArray.length; i++) {
					if(isVowels(String.valueOf(strToCharArray[i]))) {
						builder.append(String.valueOf(newVowelArray[newVowelArray.length -1 - counter]));
						counter++;
					}else {
						builder.append(String.valueOf(strToCharArray[i]));
					}
				}
				System.out.println(builder.toString());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	private static boolean isVowels(String s) {
		switch(s) {
		case "a":
			return true;
		case "e":
			return true;
		case "i":
			return true;
		case "o":
			return true;
		case "u":
			return true;
		}
		return false;
	}

}
