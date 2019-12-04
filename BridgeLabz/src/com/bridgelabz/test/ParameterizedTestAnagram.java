package com.bridgelabz.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.bridgelabz.algortihms.Anagram;

@RunWith(Parameterized.class)
public class ParameterizedTestAnagram {

	private String s1;
	private String s2;
	private Boolean expected;
	private Anagram a;
	
	@Before
	public void initialize()
	{
		a=new Anagram();
	}
	
	public ParameterizedTestAnagram(String s1,String s2,Boolean expected)
	{
		this.s1=s1;
		this.s2=s2;
		this.expected=expected;
		
	}
	
	@Parameterized.Parameters
	public static Collection anagrams()
	{
		return Arrays.asList(new Object[][] {
	         {"earth","heart",true},
	         {"manu","unam", true },
	         {"magic","magcv" ,false },
	         {"ankit","anlki", false }
	      });
	
	}
	
	@Test
	   public void testPrimeNumberChecker() {
	      System.out.println("First String is : " +s1);
	      System.out.println("First String is : " +s2);
	      assertEquals(expected, 
	      a.areAnagram(s1,s2));
	   }

}
