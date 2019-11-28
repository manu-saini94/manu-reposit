package com.ProgramTesting.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ProgramTesting.utility.DayOfWeekUtil;

class DayOFWeekTest {

	
	@Test
	@DisplayName("Testing DayOfWeek")
	public void test() {
		
	assertEquals(4,DayOfWeekUtil.dayOfWeek(11,28,2019));
	}

}
