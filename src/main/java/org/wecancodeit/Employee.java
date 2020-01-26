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

	// default constructor - not needed after made abstract
//	public Employee() {
//		super();
//	}

	public abstract String calculatePay();

}