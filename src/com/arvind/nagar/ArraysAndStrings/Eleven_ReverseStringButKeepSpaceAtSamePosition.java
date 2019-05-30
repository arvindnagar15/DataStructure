package com.arvind.nagar.ArraysAndStrings;

/**
 * Reverse a string but make sure spaces should be at same positions like earlier
 * @author Scorpio
 *
 */
public class Eleven_ReverseStringButKeepSpaceAtSamePosition {

	public static void main(String[] args) {
		try {
			String s = "My name Hello";
			char[] charStr = s.toCharArray();
			int[] spaceCounter = new int[s.length()];
			String space = " ";
			
			for(int i = 0; i<charStr.length; i++) {
				if(String.valueOf(charStr[i]).equals(space)) {
					spaceCounter[i]++;
				}
			}
			StringBuilder builder = new StringBuilder();
			for(int i = 0; i<spaceCounter.length; ) {
				System.out.println("not comint");
				if(spaceCounter[i] == 0) {
					if(!String.valueOf(charStr[spaceCounter.length-1-i]).equals(space)) {
						builder.append(String.valueOf(charStr[spaceCounter.length-1-i]));
					}
					i++;
				}else {
					builder.append(space);
					spaceCounter[i]--;
				}
			}
			System.out.println("builder : "+builder.toString());
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
