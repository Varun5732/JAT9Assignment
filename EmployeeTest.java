package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee s = new Employee();
		s.setter(54, 45000, "Varun");
		
		s.printname();
		s.printsalary();
		
	}

}
