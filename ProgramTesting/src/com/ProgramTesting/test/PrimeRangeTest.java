package com.ProgramTesting.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ProgramTesting.algortihms.PrimeInRange;

class PrimeRangeTest {

	@Test
	@DisplayName("Testing primeRange()")
	public void test() {
		int[] expected= {2,3,5,7,11,13,17,19};
		assertArrayEquals(expected,PrimeInRange.primeRange(1,20));
	}

}
