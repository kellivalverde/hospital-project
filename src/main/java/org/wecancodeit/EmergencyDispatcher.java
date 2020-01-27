package org.wecancodeit;

public class EmergencyDispatcher extends Receptionist implements MedicalDuties  {

	private boolean manageAmbulance;

	public boolean isManagingAmbulance() {
		return manageAmbulance;
	}
		

	public EmergencyDispatcher(String employeeNum, String employeeName, boolean isAnsweringPhone, boolean manageAmbulance) {
		super(employeeNum, employeeName, isAnsweringPhone);
		this.manageAmbulance = manageAmbulance;
		
	
	}

	
	@Override
	public void drawBlood(Patient patient) {
		
	}

	@Override
	public void administerCare(Patient patient) {
		
	}

}


