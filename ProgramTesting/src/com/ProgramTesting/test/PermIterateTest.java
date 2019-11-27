package com.ProgramTesting.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ProgramTesting.solutions.PermIterate;

class PermIterateTest {

	private static PermIterate p;
	
	@BeforeAll
	public static void getObj()
	{
		p=new PermIterate();
	}
	@Test
	@DisplayName("Testing for Permutations")
	public void test() {
		char[] ch= {'A','B','C'};
		LinkedList expected=new LinkedList(Arrays.asList("ABC","ACB","CAB","CBA","BCA","BAC"));
		assertEquals(expected,p.input(ch));
	}

}
