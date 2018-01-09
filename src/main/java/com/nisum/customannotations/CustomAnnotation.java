package com.nisum.customannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/*
Method should not have any throws clauses
Method should return one of the following: primitive data types, String, Class, enum or array of these data types.
Method should not have any parameter.
We should attach @ just before interface keyword to define annotation.
It may assign a default value to the method.*/
@interface MarkerAnnotation{
	
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface SingleValueAnnotation{
	int add() ;
}
@interface MultiValueAnnotation{
	int add();
	int sub();
}
class MyAnnotation{
	@SingleValueAnnotation(add=10)
	public void sayHello(){
		System.out.println("hello annotation");
	}  
}
public class CustomAnnotation {
	public static void main(String[] args) {
		MyAnnotation h=new MyAnnotation();  
		Method m=null;
		try {
			m = h.getClass().getMethod("sayHello");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		  
		SingleValueAnnotation manno=m.getAnnotation(SingleValueAnnotation.class);  
		System.out.println("value is: "+manno.add());  
	}
}

