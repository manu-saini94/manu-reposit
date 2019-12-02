package com.bridgelabz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.bridgelabz.solutions.StringTemplate;

class StringTemplateTest {

	
	@Test
	@DisplayName("Testing Template")
	public void test() {
		String str1="Hello <<UserName>>,How are you?";
		String str2="Hello manu,How are you?";
		assertEquals(str2,StringTemplate.template(str1));
	}

}
