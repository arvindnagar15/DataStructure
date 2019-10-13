package com.arvind.nagar.core.java.basics;

//@FunctionalInterface
public interface DefaultInterfaceExample {

	public void sayHello();
	public void sayHello2();
	public default void sayHi1() {
		System.out.println("Hi1");
	}
	public default void sayHi2() {
		System.out.println("Hi2");
	}
	public default void sayHi3() {
		System.out.println("Hi3");
	}
	public static void sayHi4() {
		System.out.println("Hi4");
	}
}
