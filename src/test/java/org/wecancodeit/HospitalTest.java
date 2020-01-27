package org.wecancodeit;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

public class HospitalTest {

	Hospital hospital = new Hospital();

	@SuppressWarnings("deprecation")
	@Test
	public void shouldBeAbleToAddEmployee() {
		Doctor doctor = new Doctor("", "", "");
		hospital.addEmployee(doctor);
		Collection<Employee> check = hospital.getAllEmployees();
		assertThat(check, contains(doctor));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void shouldBeAbleToAdd2DifferentEmployees() {
		Doctor doctor = new Doctor("1", "", ""); //keys(employeeNum) must be unique
		Nurse nurse = new Nurse("2","", 1);
		hospital.addEmployee(doctor);
		hospital.addEmployee(nurse);

		Collection<Employee> check = hospital.getAllEmployees();
		assertThat(check, containsInAnyOrder(doctor, nurse));
	}

}
