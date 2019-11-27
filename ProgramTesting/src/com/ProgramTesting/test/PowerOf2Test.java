package com.ProgramTesting.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ProgramTesting.solutions.PowerOf2;

class PowerOf2Test {

	private static PowerOf2 p;

	@BeforeEach
	public void getObj() {
		p = new PowerOf2();
	}

	@Test
	@DisplayName("When Number >31")
	public void testGreaterthan31() {
		int[] expected = {};
		assertArrayEquals(expected, p.powersOf2(33));
	}

	@Test
	@DisplayName("When Number <1")
	public void testSmallerthan1() {
		int[] expected = {};
		assertArrayEquals(expected, p.powersOf2(-1));
	}

	@Test
	@DisplayName("When Number between 0 and 32")
	public void testBetween() {
		int[] expected = { 2, 4, 8, 16, 32, 64 };
		assertArrayEquals(expected, p.powersOf2(6));
	}
}
