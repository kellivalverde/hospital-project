package org.wecancodeit;

import static org.junit.Assert.*;

import org.junit.Test;

public class JanitorTest {

	Janitor underTest = new Janitor("5", "Janitor Name", true);

	
	@Test
	public void shouldBeSweeping() {

		boolean check = underTest.isSweeping();
		assertTrue(check);
	}

	@Test
	public void shouldGetPaid40K() {
		String check = underTest.calculatePay();
		assertEquals(check, "40,000");

	}

}