package com.nisum.lambdaexpression;
@FunctionalInterface
public interface EmployeeInterface {
	void	 work();
	default void running() {
		System.out.println("Hey, this is default method don't give compile time error");
	}
	static void walkinbg() {
		System.out.println("Hey, this is static method don't give compile time error");
	}
	default void runnings() {
		System.out.println("Hey, this is default method don't give compile time error");
	}
}
