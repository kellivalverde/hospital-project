package org.wecancodeit;

public abstract class Employee {
//superclass


	protected String employeeNum;
	protected String employeeName;
	
	// accessors
	public String getEmployeeNumber() {
		return employeeNum;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	// default constructor - every employee needs this
	public Employee(String employeeNum, String employeeName){
		this.employeeNum = employeeNum;
		this.employeeName = employeeName;
	}

	public abstract String calculatePay();

	@Override
	public String toString() {
		return employeeName;
	}
	
}