package com.ProgramTesting.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.ProgramTesting.algortihms.BinarySearch;

class BinarySearchTest {

	
	@Nested
	class TestingBinarySearch
	{
		
	
	@Test
	@DisplayName("Testing Element present ")
	public void testPresent() {
		
	String[] arr= {"manu","arun","hemant","harsh","nikhil","david"};
	int n=arr.length;
	assertEquals(2,BinarySearch.binarysearch(arr,0,n-1,"hemant"));
	}
	
	
	@Test
	@DisplayName("Testing Element Not present ")
	public void testNotPresent() {
		
		String[] arr= {"manu","arun","hemant","harsh","nikhil","david"};
		int n=arr.length;
		assertEquals(-1,BinarySearch.binarysearch(arr,0,n-1,"aman"));
	}
	}
}
