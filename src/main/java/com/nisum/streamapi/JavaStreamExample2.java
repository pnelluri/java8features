package com.nisum.streamapi;

import java.util.stream.Stream;

public class JavaStreamExample2 {
	    public static void main(String[] args){  
	    	//we are iterating, filtering and passed a limit to fix the iteration
	    		Stream.iterate(1, element->element+1)  
	        .filter(element->element%5==0)  
	        .limit(5)  
	        .forEach(System.out::println);  
	}  
}
