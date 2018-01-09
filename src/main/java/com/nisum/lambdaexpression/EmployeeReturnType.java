package com.nisum.lambdaexpression;
interface dividable{
	double divide(int a,int b);
}

public class EmployeeReturnType {
	public static void main(String[] args) {
		// Lambda Expression with out return type
		dividable d1=(x,y)-> (x/y);
		double i= d1.divide(10, 5);
		System.out.println(i);
		//Lambda Expression with return type
		//for return "{ }" curly brasses is mandatory 
		dividable d2=(s,t) -> {
			s=s+t;
			s=s/t;
			return s/t;
		};
		System.out.println(d2.divide(50, 5));
	}
}
