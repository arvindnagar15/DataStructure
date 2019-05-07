package com.arvind.nagar.ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

/**
 * 
 * @author Scorpio
 *	Steps : 
 *  1. If the number of characters are even (after removing non letters), then each character should have even count characters..
 *  2. If the number of characters are odd (after removing non letters), then one character should have odd count character.
 *  eg : Taco tac --> after removing space :  
 *  	total count - 7 (odd) where t -2, a -2, c -2 and o count is one means this is permutation palindrome.
 *  eg 2:tactcoapapa, Now after removing space (if any) 
 *     Total count - 11, t - 2, a - 4, c - 2, o - 1, p - 2
 *  
 *   Character.getNumericValue('a') --> 10 and 
 *   Character.getNumericValue('z') --> 35
 *	 Character.getNumericValue('@') --> -1 // any special character	
 *
 *	Implementation - 
 *	First count how mant times characters are appearing	
 *	Iterate and check which there is any odd number for character except once, if yes, not permutation palindrome else permutation palindrome.
 * PS : getNumericValue() will convert characters that actually represent numbers 
 * 		(like the "normal" digits 0-9, but also numerals in other scripts) to their numeric value
 * 		If the character does not have a numeric value, then -1 is returned.
 */
public class Six_PallindromePermutation {

	public static void main(String[] args) {
		try {
			int val = Character.getNumericValue('!');
			System.out.println(val);
			String str = "taco tac";
			int[] tab = countNumberOfElementsOccurence(str);
			System.out.println("PalindromePermutation : "+checkMaxOddCount(tab));
			System.out.println(tab);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	/**
	 * check max odd count
	 * @param table
	 * @return
	 */
	public static boolean checkMaxOddCount(int[] table) {
		boolean isOddFount = false;
		for(int count : table) {
			if(count % 2 == 1) {
				if(isOddFount) {
					return false;
				}
				isOddFount = true;
			}
		}
		return true;
	}
	/**
	 * check how many times numbers are appearing
	 * @param str
	 * @return
	 */
	public  static int[] countNumberOfElementsOccurence(String str) {
		char[] sArray = str.toCharArray();
		int endLength = Character.getNumericValue('z');
		int startLength = Character.getNumericValue('a');
		int[] newTable = new int[endLength - startLength + 1];
		//Map<Character, Integer> countMap = new HashMap<>();
		int count = 0;
		for(char ch : sArray) {

			
			int x = getCharNumber(ch);
			if(x != -1) {
				newTable[x]++;
			}
		}
		return newTable;
	}
	
	/**
	 * get the character number value
	 * @param ch
	 * @return
	 */
	public static int getCharNumber(Character ch) {
		int value = Character.getNumericValue(ch);
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		
		if(a <= value && value <= z) {
			return value - a;
		}else {
			return -1;
		}
		
				
	}

}
