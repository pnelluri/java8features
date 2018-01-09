package com.nisum.streamapi;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTest {
public static void main(String[] args) {
	Hashtable<String, String> map = new Hashtable<>();
	map.put("prashant", "prashant");
	
	Iterator<String>itr=map.keySet().iterator();
	
	while(itr.hasNext()) {
		
		System.out.println(map.get(itr.next()));
		map.put("123","123");
	}
		
itr=map.keySet().iterator();
	
	while(itr.hasNext()) {
		
		System.out.println(map.get(itr.next()));
		map.put("Naidu", "Naidu");
	}
	
	
//	for(Map.Entry<String, String> map2 : map.entrySet()) {
//		System.out.println(map2.getKey()+"and "+ map2.getValue());
//		map.put("Naisu", "Naidu");
//	}
}
}
