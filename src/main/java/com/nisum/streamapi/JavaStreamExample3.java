package com.nisum.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class JavaStreamExample3 {
	public static void main(String[] args) {
	List<Product> productsList = new ArrayList<>();  
    //Adding Products  
	//This is example for Filtering and Iterating Collection
    productsList.add(new Product(1,"HP Laptop",25000f));  
    productsList.add(new Product(2,"Dell Laptop",30000f));  
    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
    productsList.add(new Product(4,"Sony Laptop",28000f));  
    productsList.add(new Product(5,"Apple Laptop",90000f));  
    // This is more compact approach for filtering data  
    productsList.stream()  
                         .filter(product -> product.getPrice() == 30000)  
                         .forEach(product -> System.out.println(product.getName()));   
    
    
    //This is example for reduce() Method in Collection
    
    Float totalPrice = productsList.stream()  
            .map(product->product.getPrice())  
            .reduce(-20.0f,(y, x)->y+x-100);   // accumulating price  
System.out.println("Total Price "+totalPrice);  
// More precise code   
float totalPrice2 = productsList.stream()  
        .map(product->product.getPrice())  
        .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
System.out.println("total value by using reduce() :" +totalPrice2);  



//Using Collectors's method to sum the prices.  
double totalPrice3 = productsList.stream()  
                .collect(Collectors.summingDouble(product->product.getPrice()));  
System.out.println("Collectors's method to sum the prices: "+totalPrice3);  


/*//max() method to get max Product price   
Product productA = productsList.stream()  
                .max((product1, product2)->   
                product1.getPrice() > product2.getPrice() ? 1: -1).get();  
  
System.out.println("Maximum value is : "+productA.getPrice());  
// min() method to get min Product price  
Product productB = productsList.stream()  
        .max((product1, product2)->   
        product1.getPrice() < product2.getPrice() ? 1: -1).get();  
System.out.println("Minimum value is : "+productB.getPrice());  



//count number of products based on the filter  
long count = productsList.stream()  
            .filter(product->product.getPrice()<30000)  
            .count();  
System.out.println("Count of Product those are less than 30000"+count);  */
	}
}
