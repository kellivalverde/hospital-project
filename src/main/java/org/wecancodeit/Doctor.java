package org.wecancodeit;

public class Doctor extends Employee implements MedicalDuties { // wants to use the methods that are now in
																// MedicalDuties
	// extracted a superclass for shared methods

	private String specialty;

	public String getSpecialty() {
		return specialty;
	}

	// constructor
	public Doctor(String employeeNum, String employeeName, String specialty) {
		// Employee Number, Employee Name, Specialty Area (Heart, Brain, Foot, etc…)
		this.employeeNum = employeeNum;
		this.employeeName = employeeName;
		this.specialty = specialty;

	}

	// methods of behavior
	// @see org.wecancodeit.MedicalDuties

	@Override
	public void drawBlood(Patient patient) {
		patient.removeBlood(5);
	}

	@Override
	public void administerCare(Patient patient) {
		patient.receiveHealth(5);
	}

	@Override
	public String calculatePay() {
		return "90,000";
	}
}
