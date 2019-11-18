package com.topgear.java.seven;

import java.util.ArrayList;
import java.util.Iterator;

/*7.	Create an ArrayList of Employee( id,name,address,sal) objects
 *  and search for particular Employee object based on id number and name.*/

public class EmployeeSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> e = new ArrayList<>();
		addAllEmployee(e);
		printAll(e);
		System.out.println("\n Searching for employees");
		
		Employee eResById=searchById(e, 5);
		if(eResById==null){
			System.out.println("Employee with this id does not exist");
		}else{
			System.out.println(eResById);
		}
		Employee eResByName=searchByName(e, "Hitesh");
		if(eResByName==null){
			System.out.println("Employee with this id does not exist");
		}else{
			System.out.println(eResByName);
		}
//		System.out.println(eResByName);

	}

	private static Employee searchById(ArrayList<Employee> e, int i) {
		// TODO Auto-generated method stub
		for (Employee emp : e) {
			if(emp.getId()==i){
				return emp;
			}
		}
		return null;

	}

	private static Employee searchByName(ArrayList<Employee> e, String name) {
		// TODO Auto-generated method stub
		for (Employee emp : e) {
			if(emp.getName()==name){
				return emp;
			}
		}
		return null;
		
	}

	private static void addAllEmployee(ArrayList<Employee> e) {
		// TODO Auto-generated method stub
		int id[] = { 1, 2, 3, 4 };
		String name[] = { "Suraj", "Sharukh", "Hitesh", "Bhawesh" };
		String address[] = { "add1", "add2", "add3", "add4" };
		long salary[] = { 8762, 87623L, 876235, 876 };
		for (int i = 0; i < id.length; i++) {
			e.add(new Employee(id[i], name[i], address[i], salary[i]));
		}
	}

	private static void printAll(ArrayList<Employee> e) {
		// TODO Auto-generated method stub
		for (Employee emp : e) {
			System.out.println(emp);
		}
		
	}
}
