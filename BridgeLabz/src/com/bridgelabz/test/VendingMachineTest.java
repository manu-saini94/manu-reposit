package com.bridgelabz.test;

import java.util.LinkedHashMap;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.bridgelabz.solutions.Quadratic;
import com.bridgelabz.solutions.VendingMachine;

class VendingMachineTest {

	private static VendingMachine vm;
	@BeforeAll
	public static void getObj()
	{
	vm=new VendingMachine();
	}
	
	
	@Nested
	@DisplayName("Vanding Machine Testing")
	class TestCurrency
	{
		
	@Test
	@DisplayName("Testing for amount=4889")
	public void test() {
		LinkedHashMap vals=new LinkedHashMap();
		LinkedHashMap expected=new LinkedHashMap();
		expected.put(1000,4);
		expected.put(500,1);
		expected.put(100,3);
		expected.put(50,1);
		expected.put(10,3);
		expected.put(5,1);
		expected.put(2,1);
		expected.put(1,1);
		long[] a= {1000,500,100,50,10,5,2,1};
		Assert.assertEquals(expected,vm.calculate(0,4888,vals,a,0));

	}
	}
}
