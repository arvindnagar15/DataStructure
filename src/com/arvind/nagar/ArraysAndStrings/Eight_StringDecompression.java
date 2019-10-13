package com.arvind.nagar.ArraysAndStrings;

public class Eight_StringDecompression {

	public static void main(String[] args) {
		try {
			String s1 = "a3b2c2d3ef3";
			
			//split("(?=\\d)(?<!\\d)")
			//String[] splitter = s.split("(?=\\d)(?<!\\d)");
			
			
			StringBuilder builder = new StringBuilder();
			int repeatedCounts = 0;
			
			System.out.println(s1);
			
			char[] s = s1.toCharArray();
			
			
			
			for(int i = 0; i<s.length; i++) {
				int value = s[i]; 
				System.out.println("s[] : "+s[i] + " : "+value);
				if(i > 0) {
					

					if(s[i] >= 0 || s[i] <= 9 ) {
						for(int count = 0; count < s[i]; count++) {
							builder.append(s[i-1]);
						}
					}else {
						
						builder.append(s[i]);
					}
				}else {
					builder.append(s[i]);
				}
				
			}

			
			/*for(int i = 0; i<s.length(); i++) {
				
				repeatedCounts++;
				if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {
					
					builder.append(s.charAt(i));
					if(repeatedCounts > 1) {
						builder.append(repeatedCounts);
					}
					repeatedCounts = 0;
				}
			}*/
			System.out.println(builder.toString());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
