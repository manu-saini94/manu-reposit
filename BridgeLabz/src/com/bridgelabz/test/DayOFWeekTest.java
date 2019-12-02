package com.bridgelabz.test;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import com.bridgelabz.utility.Util;

class DayOFWeekTest {

	
	@Test
	@DisplayName("Testing DayOfWeek")
	public void test() {
		
	assertEquals(4,Util.dayOfWeek(11,28,2019));
	}

}
