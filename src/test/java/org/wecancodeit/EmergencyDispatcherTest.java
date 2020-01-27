package org.wecancodeit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmergencyDispatcherTest {

	EmergencyDispatcher underTest = new EmergencyDispatcher("6", "Tina the first Responder", true, true);

	@Test
	public void isManagingAmbulance() {

		boolean check = underTest.isManagingAmbulance();
		assertTrue(check);
	}

	@Test
	public void shouldGetPaid45K() {
		String check = underTest.calculatePay();
		assertEquals(check, "45,000");

	}
}
