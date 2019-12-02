package com.bridgelabz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.bridgelabz.functional.SumOfThree;

class SumOfThreeTest {

	
	
	@Nested
	class TestSumOfThree
	{

	@Test
	@DisplayName("Testing for SumOfThree()")
	public void test() {
		int[] arr= {1,2,-3,-2,-1,5,-5,-2,-3,-1,-1,2,1,2,-2,-1,0,4,-4,-1};
	    assertEquals(95,SumOfThree.triplets(arr));
	}
	}
}
