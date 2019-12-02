package com.bridgelabz.test;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import com.bridgelabz.utility.Util;

class SqrtTest {

	@Test
	@DisplayName("Square root test for +ve no.")
	public void testSqrtPos() {
	assertEquals(6.000000005333189,Util.sqrt(36));
	}
	@Test
	@DisplayName("Square root test for -ve no.")
	public void testSqrtNeg() {
		assertEquals(-1,Util.sqrt(-8));
	}

}
