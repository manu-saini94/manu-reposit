package com.ProgramTesting.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.ProgramTesting.solutions.Distance;

class DistanceTest {

	private static Distance d;
	
	@BeforeAll
	public static void getObj()
	{
	d=new Distance();
	}
	
	
	@Nested
	@DisplayName("Distance Testing")
	class TestInner
	{
		
	@Test
	@DisplayName("x and y both positive")
	public void testBothPos() {
	double expected=5;
    assertEquals(expected,d.calcDistance(4,3));
	}
	@Test
	@DisplayName("x and y both Negative")
	public void testBothNeg() {
		double expected=10;
		assertEquals(expected,d.calcDistance(-6,-8));
	}
	@Test
	@DisplayName("x is positive and y is Negative")
	public void testPosNeg() {
		double expected=6.708203932499369;
		assertEquals(expected,d.calcDistance(6,-3));
	}
	}
}
