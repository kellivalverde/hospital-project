package org.wecancodeit;

import java.util.Collection;
import java.util.Scanner;

public class HospitalApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Hospital hospital = new Hospital();
		
		Doctor phil = new Doctor("111", "Phil", "Brain");
		Surgeon harry = new Surgeon("222", "Harry", "Heart", true);
		Nurse jackie = new Nurse("333", "Jackie", 5);
		Receptionist janine = new Receptionist("444", "Janine", true);
		Janitor rosie = new Janitor("555", "Rosie", true);
		EmergencyDispatcher tina = new EmergencyDispatcher("666", "Tina", true, true);
		
		hospital.addEmployee(phil);
		hospital.addEmployee(harry);
		hospital.addEmployee(jackie);
		hospital.addEmployee(janine);
		hospital.addEmployee(rosie);
		hospital.addEmployee(tina);
		
		System.out.println("Here are the salary rates:");
		hospital.showPayRates();
		
		System.out.println("Here are Medical Personnel:"); //need a toString to get names
		hospital.showAllMedicalPersonnel();
		
		
//		System.out.println("Would you like to remove an employee?");
//		
//				Collection<Employee> allEmployees = hospital.getAllEmployees();
//		String firedEmployee = input.nextLine();
//		Hospital employeeToRemove = hospital.findEmployee(firedEmployee);
//		System.out.println("Thank you for adopting " + firedEmployee + ".");
//		hospital.fireEmployee(employeeToRemove);
		
		
	}

}
