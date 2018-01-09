package com.nisum.optionalclass;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str=new String[10];
		//str[5]="NISUM CONSULTING PVT LTD"; 
		//Setting value for 5th Index
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if(checkNull.isPresent()) { //It Checks value is present or not
			String lowerCaseString = str[5].toLowerCase();
			System.out.println(lowerCaseString);
		}
		else
			System.out.println("String value is not present");
		
		
		
		
		
		/*checkNull.ifPresent(System.out::println);   // printing value by using method reference  
        System.out.println(checkNull.get());    // printing value by using get method  
        System.out.println(str[5].toLowerCase());  */
	}

}
