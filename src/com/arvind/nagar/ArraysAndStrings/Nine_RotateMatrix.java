package com.arvind.nagar.ArraysAndStrings;

public class Nine_RotateMatrix {

	public static void main(String[] args) {
		try {
			
			int [][] matrix = {
								{1, 2 ,3 ,4}, 
								{5, 6, 7, 8},
								{9, 10, 11, 12},
								{13, 14, 15, 16}
							};
			
			for(int row = 0; row<matrix.length; row++) {
				System.out.println();
				for(int column = 0; column < matrix.length; column++) {
					System.out.print(matrix[row][column]+",");
				}
				
			}
			System.out.println("****************After Rotation***********************");

			rotate(matrix);
			
			for(int row = 0; row<matrix.length; row++) {
				System.out.println();
				for(int column = 0; column < matrix.length; column++) {
					System.out.print(matrix[row][column]+",");
				}
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean rotate(int [][] matrix) {
		if(matrix.length == 0 || matrix.length != matrix[0].length) {
			return false; // Not a aquare matrix
		}
		int n = matrix.length;
		for(int layer = 0; layer < n/2; layer++) {
			
			int first = layer;
			int last = n-1-layer;
			
			for(int i = first; i<last; i++) {
				int offset = i-first;
				int top = matrix[first][i];
				
				matrix[first][i] = matrix[last-offset][first]; //left to top
				
				matrix[last-offset][first] = matrix[last][last-offset]; 
				
				matrix[last][last-offset]  = matrix[i][last];
				
				matrix[i][last] = top;
				
				
			}
			
		}
		return true;
	}
}
