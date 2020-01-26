package org.wecancodeit;

public class Nurse extends Employee implements MedicalDuties {

	private int numPatients;

	// accessors - employeeName and employeeNumber were not needed after we made the Employee superclass

	public int getNumPatients() {
		return numPatients;
	}

	// Nurse constructor
	public Nurse(String employeeNum, String employeeName, int numPatients) {
		this.employeeNum = employeeNum;
		this.employeeName = employeeName;
		this.numPatients = numPatients;

	}

	public void drawBlood(Patient patient) {
		patient.removeBlood(5);

	}

	@Override
	public void administerCare(Patient patient) {
		patient.receiveHealth(3);

	}

	@Override
	public String calculatePay() {
		// TODO Auto-generated method stub
		return "50,000";
	}


}
