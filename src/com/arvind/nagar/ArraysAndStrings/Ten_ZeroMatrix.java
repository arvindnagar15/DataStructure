package com.arvind.nagar.ArraysAndStrings;

public class Ten_ZeroMatrix {

	public static void main(String[] args) {
		try {
			String s = "vindar";
			String s2 = "arvindnagar";
			if(s2.contains(s)) {
				System.out.println("s"+s);
			}
			int [][] matrix = {
								{1, 2, 3, 0},
								{4, 5, 6, 7},
								{0, 8, 9, 10},
								{11, 12, 13, 14}
							};
			
			boolean [] rowCounter = new boolean[matrix.length];
			boolean [] columnCounter = new boolean[matrix[0].length];
			
			System.out.println("RowLength :"+matrix.length
					+" : column Counter : "+matrix[0].length);
			
			for(int row = 0; row < matrix.length; row++) {
				System.out.println();
				for(int column = 0; column < matrix[0].length; column++) {
					System.out.print(matrix[row][column]+",");
					if(matrix[row][column] == 0) {
						rowCounter[row] = true;
						columnCounter[column] = true;
					}
				}
			}
			
			for(int i = 0; i<rowCounter.length; i++) {
				if(rowCounter[i]) {
					nullifyRow(matrix, i);
				}
			}
			for(int i = 0; i<columnCounter.length; i++) {
				if(columnCounter[i]) {
					nullifyColumn(matrix, i);
				}
			}
			System.out.println("**********************After**********");
			
			for(int row = 0; row < matrix.length; row++) {
				System.out.println();
				for(int column = 0; column < matrix.length; column++) {
					System.out.print(matrix[row][column]+",");
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void nullifyRow(int [][] matrix, int row) {
		for(int rowCount = 0; rowCount< matrix[0].length; rowCount++) {
			matrix[row][rowCount] = 0;
		}
	}
	
	public static void nullifyColumn(int [][] matrix, int column) {
		for(int columnCounter = 0; columnCounter < matrix.length; columnCounter++) {
			matrix[columnCounter][column] = 0;
		}
	}
}
