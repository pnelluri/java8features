package com.nisum.lambdaexpression;

import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;  
public class ComparatorWithLamda {
 
	    public static void main(String[] args) {  
	        List<Product> list=new ArrayList<Product>();  
	          
	        //Adding Products  
	        list.add(new Product(1,"HP Laptop",250));  
	        list.add(new Product(3,"Keyboard",50));  
	        list.add(new Product(2,"Dell Mouse",150f));  
	          
	        System.out.println("Sorting on the basis of name...");  
	  
	        // implementing lambda expression  
	        Collections.sort(list,(p1,p2)->{  
	        	return p1.name.compareTo(p2.name);  
	        });  
	        for(Product p:list){  
	            System.out.println(p.id+" "+p.name+" "+p.price);  
	        }
	        Collections.sort(list,(p1,p2)->{  
	        	double diff = p1.price-p2.price;
	        	if(diff>0) {
	        		return 1;
	        	}
	        	if(diff<0) {
	        		return -1;
	        	}
	        	if(diff==0) {
	        		return 0;
	        	}return 0;
	        });  
	        for(Product p:list){  
	            System.out.println(p.id+" "+p.name+" "+p.price);  
	        }  
	  
	    }  
}
