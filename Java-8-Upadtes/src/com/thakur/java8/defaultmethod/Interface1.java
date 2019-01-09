package com.thakur.java8.defaultmethod;

@FunctionalInterface
public interface Interface1 {

	void method1(String str);

	default void log(String msg) {
		System.out.println("I1 logging : " + msg);
	}

	static void print(String str) {
		System.out.println("Printing : " + str);
	}

	// trying to override Object method gives compile time error as
	// "A default method cannot override a method from java.lang.Object"

	// default String toString(){
	// return "i1";
	// }
}
