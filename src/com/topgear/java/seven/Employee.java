package com.topgear.java.seven;

import java.util.ArrayList;

public class Employee {
	
	private int id;
	private String name;
	private long sal;
	private String address;
	public Employee(int id, String name, String address, long sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.address=address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal
				+ ", address=" + address + "]";
	}

	
/*	public void addEmployee(int id[], String name[], String address[], long salary[]) {
		ArrayList<Employee> list = new ArrayList<>();
		for (int i = 0; i < id.length; i++) {
			list.add(new Employee(id[i], name[i], address[i], salary[i]));
		}
	
	}*/
	
}
