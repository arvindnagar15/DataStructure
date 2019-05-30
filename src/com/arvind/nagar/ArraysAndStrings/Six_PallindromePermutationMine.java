package com.arvind.nagar.ArraysAndStrings;

/**
 * Check a single string is Permutation Palindrome or not. 
 * Permutation Palindrome means, by making permutation combination of a string, can we make it palindrome or not.
 * 
 * @author Scorpio
 * Approach : 
 * Count, the occurance of letter appears
 * At-most, one odd count could be there (after replacing all non-characters)
 * 
 *Steps :
 * 1. First assume the String is of ASCII characters, s o the total Length would be 128
 * 2. Create an int array of 128 characters, to count the number of letter occurances
 * 3. Convert string into char Array
 * 4. Iterate charArry loop and count the number of letters appeared
 * 5. Check how many times, the oddCount appears, if it appears more than once, not a String palindrome. 
 *
 */
public class Six_PallindromePermutationMine {

	public static void main(String[] args) {
		try {
			String str = "gog  ##";
			 
			char[] sArray = str.toCharArray();
			int[] count = new int[128];
			for(char ch : sArray) {
				count[ch]++;
			}
			System.out.println(checkOddCount(count));
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean checkOddCount(int[] count) {
		boolean hasOnlyOneOdd = false;
		for(int ch : count) {
			if(ch > 0) {
				System.out.println("Ch : "+ch);
				if(ch % 2 == 1) {
					if(hasOnlyOneOdd) {
						return false;
					}
					hasOnlyOneOdd = true;
					
				}
			}
			
			
		}
		return true;
	}

}
