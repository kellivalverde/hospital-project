package org.wecancodeit;

public class HospitalApp {

	public static void main(String[] args) {

		
		Hospital hospital = new Hospital();
		
		Doctor phil = new Doctor("111", "Phil", "Brain");
		Surgeon harry = new Surgeon("222", "Harry", "Heart", true);
		Nurse jackie = new Nurse("333", "Jackie", 5);
		Receptionist janine = new Receptionist("444", "Janine", true);
		Janitor rosie = new Janitor("555", "Rosie", true);
		
		hospital.addEmployee(phil);
		hospital.addEmployee(harry);
		hospital.addEmployee(jackie);
		hospital.addEmployee(janine);
		hospital.addEmployee(rosie);
		
		System.out.println("Here are the salary rates:");
		hospital.showPayRates();
		
		System.out.println("Here are Medical Personnel:"); //need a toString to get names
		hospital.showAllMedicalPersonnel();
	}

}
