package com.thakur.java8.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.function.Consumer;

//Java 8 New Feature
public class ForEach_Method {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
			list.add(random.nextInt(250));
		}

		ListIterator<Integer> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Java-8 Update
		System.out.println("Using java-8 update");
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
	}
}
