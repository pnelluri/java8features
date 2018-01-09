package com.nisum.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productsList = new ArrayList<>();  
        //Adding Products  
		Product prod = new Product(5,"Apple Laptop",90000f);
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(prod);  
        productsList.add(prod);
        
        List<Product> productsListNew =  new ArrayList<>();
        		productsListNew.add(prod);
        
        Predicate<Product> p1 = p->p.getPrice()>30000;
        System.out.println(productsList.stream().allMatch(p1));
        System.out.println(productsList.stream().anyMatch(p1));
        System.out.println(productsList.stream().noneMatch(p1));
        
        p1 = p->p.getPrice()>2000;
        System.out.println(productsList.stream().allMatch(p1));
        System.out.println(productsList.stream().anyMatch(p1));
        System.out.println(productsList.stream().noneMatch(p1));
        

        p1 = p->p.getPrice()>200000;
        System.out.println(productsList.stream().allMatch(p1));
        System.out.println(productsList.stream().anyMatch(p1));
        System.out.println(productsList.stream().noneMatch(p1));
        

        System.out.println(productsList.stream().count());
        System.out.println(productsList.stream().distinct().count());
        

        Predicate<Product> newPr = b->b.getId()>0;
        
        List<Product> products = productsList.stream().filter(newPr).collect(Collectors.toList());
        System.out.println(productsList.stream().filter(p1));
        
	}
}
