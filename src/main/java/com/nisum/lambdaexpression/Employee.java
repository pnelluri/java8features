package com.nisum.lambdaexpression;

public class Employee {
	
	public static void main(String[] args) {
		/**
		 * we can provide implementation to functional interface method in 3 ways
		 * 1.Direct using lambda {}
		 * 2.Implement the as annonymous inner class
		 * 3.We can map to a different method
		 */
			EmployeeInterface e=()->	System.out.println("It is a Simple Lamdba Expression");
			e.work();
//		EmployeeInterface e = new EmployeeInterface() {
//
//			@Override
//			public void work() {
//				System.out.println("Employee doing his work very well...........");
//			}
//		};
//		e.work();
	/*	EmployeeInterface e=()->	workEmployee();
		e.work();
		e.running();
		e.runnings();
		EmployeeInterface.walkinbg();
		EmployeeInterface e1 = Employee::workEmployee;
		e1.work();*/
	}
	
	public static void workEmployee() {
		System.out.println("It is a Simple Lamdba Expression");
	}
}
