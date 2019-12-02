package com.bridgelabz.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Util;

class TemperatureTest {

	@Nested
	class TestingTemp
	{
	@Test
	@DisplayName("Testing for wrong choice")
	public void testChoice() {
		assertEquals(-1,Util.temperatureConversion(98.7,'D'));
		
	}
    @Test
    @DisplayName("Testing for Farhenite")
    public void testFarhenite() {
	   assertEquals(99.86,Util.temperatureConversion(37.7,'C'));
	}
	@Test
	@DisplayName("Testing for Celcius")
	public void test() {
	   assertEquals(37.05555555555556,Util.temperatureConversion(98.7,'F'));
	}
}
}
