package com.arvind.nagar.sorting.bubbleSort;

import java.util.Arrays;

/**
 * 
 * @author Scorpio
 * Bubble sort - Compare first element with its adjacent element with  
 */
public class BubbleSortExample {

	public static void main(String[] args) {
	try {
		int [] arr = {5, 4, 3, 2, 1};
		int length = arr.length;
		for(int i = 0; i< length-1; i++) {
			for(int j = 0; j < length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				System.out.println("Inner Iteration : : "+" : "+j+" : "+Arrays.toString(arr));
			}
			System.out.println("***********************");
			System.out.println("Outer Iteration : : "+" : "+i+" : "+Arrays.toString(arr));
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
