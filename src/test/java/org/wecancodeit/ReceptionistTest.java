package org.wecancodeit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReceptionistTest {

	Receptionist underTest = new Receptionist("4", "Receptionist Name", true);

	
// Don't need to test employee name or number because they are built into the parent class, Employee	
	
//	@Test
//	public void shouldReturnEmployeeNumber() {
//
//		String check = underTest.getEmployeeNumber();
//		assertEquals(check, "4");
//	}
//
//	@Test
//	public void shouldReturnEmployeeName() {
//
//		String check = underTest.getEmployeeName();
//		assertEquals(check, "Receptionist Name");
//
//	}

	@Test
	public void isOnPhone() {

		boolean check = underTest.isOnPhone();
		assertTrue(check);
	}

	@Test
	public void shouldGetPaid45K() {
		String check = underTest.calculatePay();
		assertEquals(check, "45,000");

	}

}
