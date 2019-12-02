package com.bridgelabz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.bridgelabz.solutions.Distance;
import com.bridgelabz.solutions.Quadratic;

class QuadraticTest {

private static Quadratic q;
	
	@BeforeAll
	public static void getObj()
	{
	q=new Quadratic();
	}
	
	@Nested
	class TestingDelta
	{
	@Test
	@DisplayName("when delta is Negative")
	public void testDeltaNeg() {
		
		double expected=-1;
		assertEquals(expected,q.deltaCalc(2,4,3));
	}
	@Test
	@DisplayName("when delta >= 0")
	public void testDeltaPos() {
		
		double expected=4.47213595499958;
		assertEquals(expected,q.deltaCalc(2,6,2));
	}

	
   }
}
