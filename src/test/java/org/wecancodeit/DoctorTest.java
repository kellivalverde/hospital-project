package org.wecancodeit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class DoctorTest {

	/*
	 * Not all employees in the hospital have the same capabilities. Only certain
	 * staff members can implement MedicalDuties such as drawBlood() and
	 * careForPatient()
	 */

	// Arrange
	Doctor underTest = new Doctor("1", "Dr. Name", "Specialty");
	Patient patient = new Patient();

	// test on state verification (variables) - want to show the the bloodLevel
	// variable decreases after this method is done

	@SuppressWarnings("deprecation")
	@Test
	public void shouldBeAbleToDrawBlood() {

		// act
		int bloodLevelBefore = patient.getBloodLevel();
		underTest.drawBlood(patient);
		int bloodLevelAfter = patient.getBloodLevel();

		// assert
		assertThat(bloodLevelBefore - bloodLevelAfter, is(5));

	}

	@SuppressWarnings("deprecation")
	@Test
	public void shouldBeAbleToIncreasePatientHealthWithCare() {

		int healthLevelBefore = patient.getHealthLevel();
		underTest.administerCare(patient);
		int healthLevelAfter = patient.getHealthLevel();
		assertThat(healthLevelAfter - healthLevelBefore, is(5));

	}

	@SuppressWarnings("deprecation")
	@Test
	public void shouldReturnEmployeeNumber() {

		String check = underTest.getEmployeeNumber();
		assertEquals(check, "1");

	}

	@SuppressWarnings("deprecation")
	@Test
	public void shouldReturnEmployeeName() {

		String check = underTest.getEmployeeName();
		assertEquals(check, "Dr. Name");

	}

	@SuppressWarnings("deprecation")
	@Test
	public void shouldReturnEmployeeSpecialty() {

		String check = underTest.getSpecialty();
		assertEquals(check, "Specialty");

	}

	@Test
	public void shouldGetPaid90K() {

		String check = underTest.calculatePay();
		assertEquals(check, "90,000");

	}

}
