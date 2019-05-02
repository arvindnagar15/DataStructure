package com.arvind.nagar.ArraysAndStrings;

/**
 * 
 * Check Two Strings are having Identical Characters
 * Steps : 
 * 1. check the length of both string, if not match return.
 * 2. Create an int array for 128 characters, assuming its ASCII string, the default value of each index is 0;
 * 3. convert one string into charArray 
 * 4. Iterate array and increment the intArray count, for instance - letters['A'] means 65 (ASCII value) index of letter array, initial value is 0   
 * 5. Increment the letter['A'] --> the value become 1
 * 
 * 6. Iterate another array till the length
 * 7. get the ascii value of character
 * 8. decrement the value by 1
 * 9. check if value is lesser than 0, means not both string are not having similar character count.
 */
public class Five_CheckTwoStringsHaveIdenticalCharactersCount {

	public static void main(String[] args) {
		try {
			String s1 = "Arvind";
			String s2 = "vvindA";
			System.out.println("Identical : "+hasBothStringIdentical(s1, s2));
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	public static boolean hasBothStringIdentical(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		int[] letters = new int[128];
		
		char[] s1Array = s1.toCharArray();
		for(char ch : s1Array) {
			System.out.println("ch : "+ch+" : letters[ch] : "+letters[ch]);
			letters[ch]++;
		}
		for(int i = 0; i<s2.length(); i++) {
			int val = (int) s2.charAt(i);
			letters[val]--;
			if(letters[val] < 0) {
				return false;
			}
		}
		return true;
	}
}
