package com.thakur.java8.lambda;

public class Demo {

	public static void main(String str[]) {
		Runnable runnable = () -> {
			System.out.println("Hello Java");
		};
		runnable.run();
	}
}
