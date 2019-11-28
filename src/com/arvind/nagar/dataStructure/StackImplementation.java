package com.arvind.nagar.dataStructure;

import java.util.Scanner;

/**
 * 
 * @author Scorpio Stack - First in Last Out
 * 
 * Three ways to read java input
 * 1. Using Buffer reader class
 * 2. Using Console class
 * 3. Using Scanner class - we are using scanner class here.
 */
public class StackImplementation {

	int MAX = 0;
	int top = -1;
	int a[] = null;

	public StackImplementation(int maxLength) {
		this.MAX = maxLength;
		a = new int[MAX];
	}

	boolean isEmpty() {
		return (top < 0);
	}

	boolean push(int x) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
		}
	}

	int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a[top--];
			return x;
		}
	}

	int peek() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a[top];
			return x;
		}
	}
}

// Driver code
class Main {
	public static void main(String args[]) {
		
		System.out.println("You entered maxLength : ");
		Scanner scanner = new Scanner(System.in);
		int maxLength = Integer.valueOf(scanner.nextLine());
		scanner.close();
		System.out.println("You entered maxLength : " + maxLength);

		StackImplementation s = new StackImplementation(maxLength);
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.peek() + " Current value of stack");
		System.out.println(s.pop() + " Popped from stack");
	}
}
