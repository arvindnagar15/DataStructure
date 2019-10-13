package com.arvind.nagar.ArraysAndStrings;

import java.util.Arrays;

/**
 * check largest string contains all attributes of other string
 * 
 *
 */
public class N14_StringManipulation {

	public static void main(String[] args) {
		try {
			String [] strArray = {"ba", "ab", "cd", "abdc", "ca", "da", "ad", "abd"};
			System.out.println("Largest Array : "+checkargestString(strArray));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String checkargestString(String [] strArray) {
		if(strArray == null || strArray.length <=1) {
			return strArray.toString();
		}
		String longestString= null;
		for(int i = 0; i<strArray.length; i++) {
			char[] subStrig = strArray[i].toCharArray();
			longestString = new String(subStrig);
			
			for(int j = 0; j<strArray.length; j++) {
				if(i != j) {
					char[] subStrig2 = strArray[j].toCharArray();
					for(char ch : subStrig2) {
						if(!longestString.contains(String.valueOf(ch))) {
							longestString = "";
							break;
						}
					}
					
				}
			}
			if(!longestString.equals("")) {
				return longestString;
			}
		}
		
		return longestString;
		
	}
}
