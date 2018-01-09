package com.nisum.strjoiner;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner joinNames = new StringJoiner(",","(",")");
		System.out.println("Nothing to return :"+joinNames.length());
		StringJoiner joinNames1 = new StringJoiner(",","","");
		
		joinNames1.add("Honda");
		joinNames1.add("Hero");
		joinNames1.add("Yamaha");
		joinNames1.add("Bajaj");
		joinNames1.add("Tvs");
		/*System.out.println("Two wheeler Vehicle Company Names................");
		System.out.println(joinNames1);*/
		StringJoiner joinNames2=new StringJoiner(",","0,",",1");
		joinNames2.add("Maruthi");
		joinNames2.add("Mahindra");
		joinNames2.add("Nissan");
		
		System.out.println("List of four wheeler Vehicle company names...........");
		System.out.println(joinNames2+" Length of that is:"+joinNames2.length());
		
		//Merging two StringJoiner
		StringJoiner merge = joinNames1.merge(joinNames2);
		System.out.println("List of two wheeler and four wheeler company's are.......");
		System.out.println(merge);
		
		StringJoiner merge2 = joinNames2.merge(joinNames);
		System.out.println(merge2);
	}

}
