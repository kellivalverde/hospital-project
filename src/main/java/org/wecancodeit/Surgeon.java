package org.wecancodeit;

public class Surgeon extends Doctor {

//	private String specialty; <-- brought in by Doctor
	private boolean operating;

//	public String getSpecialty() {
//		return specialty;
//	}
	public boolean isOperating() {
		return operating;
	}

	public Surgeon(String employeeNum, String employeeName, String specialty, boolean operatingOrNot) {
		super(employeeNum, employeeName, specialty);
		this.operating = operatingOrNot;
	}

	@Override
	public String calculatePay() {
		return "120,000";
	}
}
