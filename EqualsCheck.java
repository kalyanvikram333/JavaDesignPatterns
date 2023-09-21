package com.ds.finals;

class Employee{
	int id;
	String name;
	
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
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public boolean equals(Employee o) {
		return this.id== o.id;
		
	}
}

public class EqualsCheck {

	public static void main(String[] args) {

		
		Employee e1=new Employee(1,"kalyan");
		Employee e2=new Employee(2, "kalyan");
		System.out.println(e1.equals(e2));
		
	}

}
