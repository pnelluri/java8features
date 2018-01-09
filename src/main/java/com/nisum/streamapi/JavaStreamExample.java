package com.nisum.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class JavaStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productsList = new ArrayList<>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        //Applying filter and taking price records to list
        List<Float> productsList2 = productsList.stream().filter(p->p.getPrice()<30000).map(p->p.getPrice())
        .collect(Collectors.toList());
        
        productsList2 = productsList.stream().filter(p->p.getPrice()<30000).map(Product::getPrice)
                .collect(Collectors.toList());
        
        System.out.println(productsList2);
      //Not Applying filter and taking price records to list
        productsList2 = productsList.stream().map(p->p.getPrice())
                .collect(Collectors.toList());
                System.out.println("productsList2"+productsList2);
                //Not Applying filter and taking price records to stream
           Stream<Float>     productsLis1 = productsList.stream().map(p->p.getPrice());
           System.out.println(productsLis1);
          // productsLis1.forEach(p->System.out.println("Stream"+p));
           System.out.println(productsLis1);
           Set<Float> map = productsLis1.collect(Collectors.toSet());
           System.out.println(map+"map");
           map.forEach(p->System.out.println(p));
        List<Product> productsList1 = productsList.stream().filter(p->p.getPrice()<30000).map(p->p)
                .collect(Collectors.toList());
        productsList1.forEach(p->System.out.println(p.getName()));

        productsList1 = productsList.stream().filter(p->p.getPrice()<30000).limit(2).map(p->p)
                .collect(Collectors.toList());
        productsList1.forEach(p->System.out.println(p.getName()));
	}

}
