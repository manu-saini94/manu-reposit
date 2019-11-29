package com.ProgramTesting.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ProgramTesting.functional.WindChill;

class WindChillTest {

	@Test
	public void test() {
	assertEquals(-6.5774945039217485,WindChill.windCal(2,4));	
	}

}
