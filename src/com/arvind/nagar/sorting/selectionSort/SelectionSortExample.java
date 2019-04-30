package com.arvind.nagar.sorting.selectionSort;

import java.util.Arrays;

/**
 * 
 * Selection Sort - 
 * Steps : 
 * 1. Here we have two list, sorted and unsorted list, initially, sorted list will be empty and unsorted list be full.
 * 2. consider first element as smallest element
 * 2. Compare smallest element with all array and if any any smaller number found swap the numbers
 * 3. Now the sorted list will have numbers in asc order. 
 *
 */
public class SelectionSortExample {

	public static void main(String[] args) {
		try {
			int [] arr = {5,4,3,2,1};
			int length = arr.length;
			for(int i = 0; i < length - 1; i++) {
				int minIndex = i;
				for(int j = i+1; j< length; j++) {
					if(arr[i] > arr[j]) {
						minIndex = j;
					}
				}
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;

			}
			System.out.println("********************************");

			System.out.println("Outer Iteration  : "+Arrays.toString(arr));
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
