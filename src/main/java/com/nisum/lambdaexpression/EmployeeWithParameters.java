package com.nisum.lambdaexpression;
interface InterfaceWithtwoPM{
	//String working(String employeerName,String projectName);
	//String working(String employeerName);
	String working();
}

public class EmployeeWithParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		InterfaceWithtwoPM s=(e,p) -> {
//			return "Employee working in "+e+" and assigned to a project "+p;
//		};
		//System.out.println(s.working("Nisum", "macy's"));
		/*
		InterfaceWithtwoPM s2=(e) -> {
			return "Employee working in "+e+" and assigned to a project Foundation Core";
		};*/
	//	System.out.println(s.working("Nisum");
		InterfaceWithtwoPM s2=() -> {
			return "Employee working in Nisum and assigned to a project Foundation Core";
		};
		
		
		System.out.println(s2.working());
	}

}
