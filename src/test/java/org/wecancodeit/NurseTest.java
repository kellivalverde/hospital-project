package org.wecancodeit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {

	Nurse underTest = new Nurse("2", "Nurse Name", 4);
	Patient patient = new Patient();

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
		assertThat(healthLevelAfter - healthLevelBefore, is(3));
	}

	@Test
	public void shouldReturnEmployeeNumber() {

		String check = underTest.getEmployeeNumber();
		assertEquals(check, "2");
	}

	@Test
	public void shouldReturnEmployeeName() {

		String check = underTest.getEmployeeName();
		assertEquals(check, "Nurse Name");

	}

	@Test
	public void shouldReturnNumPatients() {

		int check = underTest.getNumPatients();
		assertEquals(check, 4);

	}

	@Test
	public void shouldGetPaid50K() {

		String check = underTest.calculatePay();
		assertEquals(check, "50,000");

	}

}
