package org.wecancodeit;

public class Receptionist extends Employee {

	private boolean isAnsweringPhone;

	public boolean isOnPhone() {
		return isAnsweringPhone;
	}

	public Receptionist(String employeeNum, String employeeName, boolean isAnsweringPhone) {
		super(employeeNum,employeeName);
		
//		this.employeeNum = employeeNum;
//		this.employeeName = employeeName;
		this.isAnsweringPhone = isAnsweringPhone;

	}

	@Override
	public String calculatePay() {
		return "45,000";
	}

}
