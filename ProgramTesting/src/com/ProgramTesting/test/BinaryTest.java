package com.ProgramTesting.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.ProgramTesting.utility.BinaryUtil;

class BinaryTest {

	@Nested
	class TestingBinary
	{
		
		@Test
		@DisplayName("Tesing toBinary() ")
		public void testBinary()
		{
			int[] a= {0,1,1,0,1,0,0,1};
			assertArrayEquals(a,BinaryUtil.toBinary(105));
			
		}
		
		@Test
		@DisplayName("Testing swap()")
		public void testSwap()
		{
			int[] b= {1,0,0,1,0,1,1,0};
			int[] a= {0,1,1,0,1,0,0,1};
			assertArrayEquals(b,BinaryUtil.swap(a));	
		}
		
		@Test
		@DisplayName("Testing swappedDecimal()")
		public void testSwappedDecimal()
		{
			int[] b= {1,0,0,1,0,1,1,0};
			assertEquals(150,BinaryUtil.swappedDecimal(b));
		}
		
		@Test
		@DisplayName("Testing isPowerOf2()")
		public void testPowerOf2()
		{
			int num=150;
			assertEquals(false,BinaryUtil.isPowerOf2(num));
		}
	}
	
	

}
