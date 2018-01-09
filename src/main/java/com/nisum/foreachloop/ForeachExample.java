package com.nisum.foreachloop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForeachExample {
	public static void main(String[] args) {
		List<Integer> myList=new ArrayList<>();
		myList.forEach(i->System.out.println(i));
		List<Integer> myList2=new ArrayList<>();
		for(int i=0;i<80;i++)
			myList.add(i);
		
		/**
		 * Using ForEach applying conditions and adding to list
		 */
		myList.forEach(i->{if(i>5) myList2.add(i);});
		
		/**
		 * Print the list using forEach
		 */
	//	myList2.forEach(i->System.out.println(i));
	//	myList2.forEach(System.out::println);
		myList2.stream().parallel().forEachOrdered(System.out::println);
		//myList2.stream().parallel().forEach(System.out::println);
		/**
		 * Print using Internal implementation of forEach
		 */
//		myList2.forEach(new Consumer<Integer>() {
//			public void accept(Integer t) {
//				System.out.println("forEach anonymous class Value ::"+t);
//			}
//		});
	}
}
