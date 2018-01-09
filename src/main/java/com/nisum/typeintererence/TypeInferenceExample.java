package com.nisum.typeintererence;

class GenericClass<T> {  
    T name;  
  public void setName(T name){  
      this.name = name;  
    }  
  public T getName(){  
      return name;  
    }  
  public String genericMethod(GenericClass<String> x){  
      x.setName("John");  
      return x.name;  
    }  
}  

public class TypeInferenceExample {  
  public static void main(String[] args) {  
	  
	// An old approach(prior to Java 7) to create a list  
      //List<Integer> list1 = new ArrayList<Integer>();  
	  // Java 7    
    //  List<Integer> list2 = new ArrayList<>(); // You can left it blank, compiler can infer type  
    
      GenericClass<String> genericClass = new GenericClass<String>();  
      genericClass.setName("Peter");  
      System.out.println(genericClass.getName());  
        
      GenericClass<Integer> genericClass2 = new GenericClass<>();  
      genericClass2.setName(10);  
      System.out.println(genericClass2.getName());  
    
      // New improved type inference  
      System.out.println(genericClass2.genericMethod(new GenericClass<>()));  
  }  
}  