package com.arvind.nagar.ArraysAndStrings;

public class OneAway {

	public static void main(String[] args) {
		try {
			String s1 = "pple";
			String s2 = "Apple";
		
			System.out.println(isAwayInsert(s1, s2)); // insertion
			System.out.println(isAwayInsert(s1, s2)); // deletion
			char[] ch = s1.toCharArray();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean isAwayInsert(String s1, String s2) {
		
		int index1 = 0, index2 = 0;
		
		while(index2 < s2.length() && index1<s1.length() ) {
			
			if(s1.charAt(index1) != s2.charAt(index2)) {
				if(index1 != index2) {
					return false;
				}
				index2++;
			}else {
				index1++;
				index2++;
			}
			
		}
		
		return true;
	}

}
