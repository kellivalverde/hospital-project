package org.wecancodeit;

public class Surgeon extends Doctor{

	private String specialty;
	private boolean operatingOrNot;
	
	public String getSpecialty() {
		return specialty;
	}
	public boolean getOperatingOrNot() {
		return operatingOrNot;
	}
	
	
	public Surgeon(String employeeNum, String employeeName, String specialty, boolean operatingOrNot) {
		super(employeeNum, employeeName, specialty);
		this.employeeNum = employeeNum;
		this.employeeName = employeeName;
		this.specialty = specialty;
		this.operatingOrNot = operatingOrNot;
	
	}

	@Override
	public String calculatePay() {
		return "120,000";
	}
}
