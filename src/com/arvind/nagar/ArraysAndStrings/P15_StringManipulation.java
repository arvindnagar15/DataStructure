package com.arvind.nagar.ArraysAndStrings;

import java.util.Arrays;

public class P15_StringManipulation {
	private static String space = "";

	public static void main(String[] args) {
		try {
			String [] strArray = {"ba", "ab", "cd", "abdc", "ca", "da", "ad", "abd"};
			char[] charArray = {'a', 'b', 'c', 'd'};
			String[] outputArray = checkargestString(strArray, charArray);
			//display output
			System.out.println("Outputs is :");
			for(String str: outputArray) {
				System.out.println(str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
		public static String[] checkargestString(String [] strArray, char[] charArray) {
			if(strArray == null || charArray == null || strArray.length <=1) {
				return strArray;
			}
			String[] stringHavingAllChars = new String[strArray.length];
			int stringHavingAllCharsCounter = 0;
			
			for(int i = 0; i<strArray.length; i++) {
				String longestString = strArray[i];
				
				for(char ch : charArray) {
					if(!longestString.contains(String.valueOf(ch))) {
						longestString = space;
						break;
					}
				}
				if(!longestString.equals(space)) {
					stringHavingAllChars[stringHavingAllCharsCounter] = longestString;
					stringHavingAllCharsCounter++;
				}
			}
			String[] output = Arrays.copyOfRange(stringHavingAllChars, 0, stringHavingAllCharsCounter);
			return output;
			
		}

}
