package org.wecancodeit;

public abstract class Employee implements Comparable<Employee> {
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
	public Employee(String employeeNum, String employeeName) {
		this.employeeNum = employeeNum;
		this.employeeName = employeeName;
	}

	public abstract String calculatePay();

	@Override
	public String toString() {
		return employeeName;
	}

	@Override
	public int compareTo(Employee employee) {
		if (this.getEmployeeName().compareTo(employee.getEmployeeName()) < 0) {
			return -1; // current object should be first
		} else if (this.getEmployeeName().compareTo(employee.getEmployeeName()) > 0) {
			return 1; // current object comes after
		} else {
			return 0; //means they are the same
		}

	}

}