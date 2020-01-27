package org.wecancodeit;

public class Janitor extends Employee {

	private boolean sweepingOrNot;

	public boolean isSweeping() {
		return sweepingOrNot;
	}
	public Janitor(String employeeNum, String employeeName, boolean sweepingOrNot) {
		super(employeeNum, employeeName);
		this.sweepingOrNot = sweepingOrNot;
	}
	@Override
	public String calculatePay() {
		return "40,000";
	}
}
