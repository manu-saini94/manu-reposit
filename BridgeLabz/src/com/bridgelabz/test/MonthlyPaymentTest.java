package com.bridgelabz.test;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import com.bridgelabz.utility.Util;

class MonthlyPaymentTest {

	@Test
	@DisplayName("Payment test")
	public void testPay() {
	assertEquals(168.4777345682066,Util.monthlyPay(2000,1,2));
	}

}
