package org.wecancodeit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Hospital {

	// map employees
	Map<String, Employee> employees = new HashMap<>();

	public void addEmployee(Employee employee) {
		employees.put(employee.getEmployeeNumber(), employee);
	}

		
	public Collection<Employee> getAllEmployees() {
		return employees.values();
	}

	public void showPayRates() {
		for (Employee employee : employees.values()) {
			System.out.println(employee.getEmployeeName() + "\t makes \t $" + employee.calculatePay());
		}
	}

	public void showAllMedicalPersonnel() {
		for(Employee employee : employees.values()) {
			if(employee instanceof MedicalDuties)  {
				System.out.println(employee);
			}
		}
	}


	public void showAllEmployees() {
		
		ArrayList<Employee>employeesList = new ArrayList<>(employees.values());
		Collections.sort(employeesList);
		
		for(Employee employee : employeesList) {
			System.out.println(employee.getEmployeeName() + "\t " + employee.getEmployeeNumber());
		} //prints alphabetically and if 2 are the same, then by employeeNum
		
		
		
		
//		for(Employee employee : employees.values()) {
//			System.out.println(employee.getEmployeeName() + "\t " + employee.getEmployeeNumber());
//		}
//	}

//	public void fireEmployee(Hospital employeeToRemove) {
//		employees.remove(employee.getEmployeeNumber(), employee);
//		}

	}
}




