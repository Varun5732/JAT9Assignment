package com.example.hr;

public class Employee {
	
	int id;
	double salary;
	String name;
	
	public void printname() {
		System.out.println("Name : " + name);
		}
	public void printsalary() {
		System.out.println("Salary :" + salary);
		}
	public void setter(int i, double s, String n) {
		id = i;
		salary = s;
		name = n;				
	}
}
