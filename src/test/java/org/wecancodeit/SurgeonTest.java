package org.wecancodeit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SurgeonTest {

	// Arrange
	Surgeon underTest = new Surgeon("3", "Dr. Surgeon Name", "Surgery", true);
	Patient patient = new Patient();

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
		assertEquals(check, "3");

	}

	@SuppressWarnings("deprecation")
	@Test
	public void shouldReturnEmployeeName() {

		String check = underTest.getEmployeeName();
		assertEquals(check, "Dr. Surgeon Name");

	}

	@SuppressWarnings("deprecation")
	@Test
	public void shouldReturnEmployeeSpecialty() {

		String check = underTest.getSpecialty();
		assertEquals(check, "Surgery");

	}

	@Test
	public void shouldBeAbleToOperateOnPatient() {

		boolean check = underTest.getOperatingOrNot();
		assertEquals(check, true);
	}

	@Test
	public void shouldGetPaid120K() {

		String check = underTest.calculatePay();
		assertEquals(check, "120,000");

	}

}
