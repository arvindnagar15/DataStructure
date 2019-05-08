package com.arvind.nagar.ArraysAndStrings;

/**
 * 
 * This is used to find string is having all unique characters or not - 
 *
 */
public class One_FindStringIsUniqueOrNot {

	public static void main(String[] args) {
		try {
			String str = "Arvinda12";
			System.out.println("Unique String : "+isUnique(str));

			//System.out.println(Arrays.toString(ch));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isUnique(String str) {
		boolean [] ch = new boolean[128];
		for(short i = 0; i<str.length(); i++) {
			int value = str.charAt(i);
			System.out.println("value : "+value);
			if(ch[value]) {

				System.out.println("This is Not Unique");

				return false;
			}
			ch[value] = true;
		}
		return true;
	}

}
