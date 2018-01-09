package com.nisum.methodref;

public class Employee {
	
	public static void main(String[] args) {
		/**
		 * we can provide implementation to functional interface method in 3 ways
		 * 1.Direct using lambda {}
		 * 2.Implement the as annonymous inner class
		 * 3.We can map to a different method
		 */
			EmployeeInterface e5=()->	System.out.println("It is a Simple Lamdba Expression");
		EmployeeInterface e = new EmployeeInterface() {

			@Override
			public void work() {
				System.out.println("Employee doing his work very well...........");
			}
		};
		e.work();
		EmployeeInterface e3=()->	workEmployee();
		e3.work();
		e3.running();
		e3.runnings();
		EmployeeInterface.walkinbg();
		EmployeeInterface e1 = Employee::workEmployee;
		e1.work();
		
///		EmployeeInterface e2 = Employee::new;
//		System.out.println("e2");
//		e2.work("Message");
//		System.out.println("e2 end");		
//		
		Thread t1 = new Thread(Employee::threadExample);
		t1.start();
		// Using Object and non static
		t1 = new Thread(new Employee("Test Thread")::workOnNonStatic);
		t1.start();
		
	}
	Employee(String message){
		System.out.println(message);
	}
	public static void threadExample() {
		System.out.println("It is a method reference to start a thread");
	}
	public static void workEmployee() {
		System.out.println("It is a method reference");
	}
	public  void workOnNonStatic() {
		System.out.println("It is a non static method reference");
	}
}
