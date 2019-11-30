/**
 * 
 */
package com.arvind.nagar.dataStructure;

import java.util.Arrays;

/**
 * @author Scorpio
 * Implementation - 
 * Add Method - return type is boolean, it will always returns true in case of ArrayList, 
 *  but not in case of all collection like in case of Set, if value is duplicate it will return false.
 *  Steps : 
 *  1. Consider an array of default size 2
 *  2. Take an actual Counter of values, which keep increase/decrease based on add/remove functionality.
 *  3. Insert all elements into array, but before adding, check if the size of actualIndex is 
 *     greater or equal to arrayLength/2, then increment the length of array by twice.  
 */
public class ArrayListImplementionUsingArray<E> {

	private final int defaultSize = 2;
	private int actualSize = 0;
	private Object[] myArray = new Object[defaultSize];
	
	public static void main(String[] args) {

		ArrayListImplementionUsingArray arrayList = new ArrayListImplementionUsingArray<>();
		
		for(int i=0; i<5; i++) {
			arrayList.add(i);
		}
		System.out.println(arrayList);
		System.out.println("Get : "+arrayList.get(4));
		arrayList.remove(2);
		System.out.println(arrayList);
	}
	
	/**
	 * Add the element at the last of string
	 * @param data
	 * @return
	 */
	public boolean add(E data) {
		
		if(actualSize>= myArray.length/2) {
			increaseSize();
		}
		myArray[actualSize++]=data;
		
		return true;
	}

	private void increaseSize() {
		myArray = Arrays.copyOf(myArray, myArray.length*2);
	}
	
	public E get(int index) {
		if(index >= myArray.length) {
			throw new IndexOutOfBoundsException();
		}
		return (E) myArray[index];
	}
	public boolean remove(int index) {
		if(index >= myArray.length) {
			throw new IndexOutOfBoundsException();
		}
		if(index == 0) {
			myArray = Arrays.copyOfRange(myArray, index+1, myArray.length-1);
			//return (E) myArray;
		}else if(index == myArray.length-1) {
			myArray = Arrays.copyOfRange(myArray, 0, myArray.length-2);
			//return (E) myArray;
		}else {
			Object[] myArray1 = new Object[myArray.length-1];
			
			int counter = 0;
			
			for(int i = 0; i<myArray.length-1; i++) {
				if(i != index) {
					myArray[counter++] = myArray[i];
				}
			}
			//return (E) myArray;
			
		}
		return true;
	}

	@Override
	public String toString() {
		return "P16_ImplementingArrayListUsingArray [myArray=" + Arrays.toString(myArray) + "]";
	}
	
	

}
