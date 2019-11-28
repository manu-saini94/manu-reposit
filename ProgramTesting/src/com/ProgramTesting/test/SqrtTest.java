package com.ProgramTesting.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ProgramTesting.utility.SqrtUtil;

class SqrtTest {

	@Test
	@DisplayName("Square root test for +ve no.")
	public void testSqrtPos() {
	assertEquals(6.000000005333189,SqrtUtil.sqrt(36));
	}
	@Test
	@DisplayName("Square root test for -ve no.")
	public void testSqrtNeg() {
		assertEquals(-1,SqrtUtil.sqrt(-8));
	}

}
