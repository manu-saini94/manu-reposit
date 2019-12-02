package com.bridgelabz.test;



import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import com.bridgelabz.utility.Util;

class BinaryTest {

	@Nested
	class TestingBinary
	{
		
		@Test
		@DisplayName("Tesing toBinary() ")
		public void testBinary()
		{
			int[] a= {0,1,1,0,1,0,0,1};
			assertArrayEquals(a,Util.toBinary(105));
			
		}
		
		@Test
		@DisplayName("Testing swap()")
		public void testSwap()
		{
			int[] b= {1,0,0,1,0,1,1,0};
			int[] a= {0,1,1,0,1,0,0,1};
			assertArrayEquals(b,Util.swap(a));	
		}
		
		@Test
		@DisplayName("Testing swappedDecimal()")
		public void testSwappedDecimal()
		{
			int[] b= {1,0,0,1,0,1,1,0};
			assertEquals(150,Util.swappedDecimal(b));
		}
		
		@Test
		@DisplayName("Testing isPowerOf2()")
		public void testPowerOf2()
		{
			int num=150;
			assertEquals(false,Util.isPowerOf2(num));
		}
	}
	
	

}
