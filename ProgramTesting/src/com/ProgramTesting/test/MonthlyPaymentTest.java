package com.ProgramTesting.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ProgramTesting.utility.MonthlyPayUtil;

class MonthlyPaymentTest {

	@Test
	@DisplayName("Payment test")
	public void testPay() {
	assertEquals(168.4777345682066,MonthlyPayUtil.monthlyPay(2000,1,2));
	}

}
