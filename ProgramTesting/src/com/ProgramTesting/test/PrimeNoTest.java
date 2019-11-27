package com.ProgramTesting.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.ProgramTesting.solutions.PrimeNo;
import com.ProgramTesting.utility.PrimeNoUtil;

class PrimeNoTest {
private static PrimeNo p;
	
   
 
    @Test
    @DisplayName("When number <= 1")
    public void testPrimeSmEq1() {
    	ArrayList<Integer> expected=new ArrayList<Integer>();
    	Assert.assertEquals(expected,PrimeNoUtil.primeFactors(0));    	
    	Assert.assertEquals(expected,PrimeNoUtil.primeFactors(-1));
    	Assert.assertEquals(expected,PrimeNoUtil.primeFactors(1));
    	
    }
    
    
    @Nested
    @DisplayName("When number > 1")
    class TestPrime{
    
    	@Test
        @DisplayName("When number 2 digit")
        public void testPrimeGrt1_2digit() {
        ArrayList<Integer> expected1=new ArrayList<Integer>();
    	expected1.add(2);
    	expected1.add(29);
    	Assert.assertEquals(expected1,PrimeNoUtil.primeFactors(58));
    	}	
    	@Test
    	@DisplayName("when number 3 digit")
    	public void testPrimeGrt1_3digit() {
    	ArrayList<Integer> expected2=new ArrayList<Integer>();
    	expected2.add(3);
    	expected2.add(3);
    	expected2.add(3);
    	expected2.add(3);
    	expected2.add(3);
    	expected2.add(3);
    	Assert.assertEquals(expected2,PrimeNoUtil.primeFactors(729));
    	}
    
    }
}
