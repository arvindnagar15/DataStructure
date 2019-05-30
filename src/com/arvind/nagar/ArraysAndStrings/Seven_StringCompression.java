package com.arvind.nagar.ArraysAndStrings;

/**
 * String s = "aaabbccdddefff";
 * O/P - a3b2c2d3ef3
 * @author Scorpio
 *
 */
public class Seven_StringCompression {

	public static void main(String[] args) {
		try {
			String s = "2122222aaabbccdddefff";
			StringBuilder builder = new StringBuilder();
			int repeatedCounts = 0;
			
			System.out.println(s);

			
			for(int i = 0; i<s.length(); i++) {
				repeatedCounts++;
				if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {
					
					builder.append(s.charAt(i));
					if(repeatedCounts > 1) {
						builder.append(repeatedCounts);
					}
					repeatedCounts = 0;
				}
			}
			System.out.println(builder.toString());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
