package com.bridgelabz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.bridgelabz.solutions.Harmonic;

class HarmonicTest {

	@Test
	@DisplayName("Testing Harmonic ")
	public void test() {
		 assertAll(
					()->assertEquals(-1,Harmonic.harmonic(0)),
		            ()->assertEquals(2.083333333333333,Harmonic.harmonic(4))
		            );
	}

}
