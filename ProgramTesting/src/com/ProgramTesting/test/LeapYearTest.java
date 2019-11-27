package com.ProgramTesting.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.ProgramTesting.solutions.LeapYear;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LeapYearTest {
	
	
	private static LeapYear ob;
	@BeforeAll
	public void setObj()
	{
		ob=new LeapYear();
	}
	
	@Test
	@DisplayName("Testing Leap Year")
    public void testLeapYear() {	
	  assertAll(
			()->assertEquals(true,ob.isLeapYear(2020)),
            () ->assertEquals(false,ob.isLeapYear(100)),
	        () ->assertEquals(false,ob.isLeapYear(400)),
	        () ->assertEquals(false,ob.isLeapYear(4))
	        );
	}

}
