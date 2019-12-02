package com.bridgelabz.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Util;

class AnagramTest {

	@Nested
	@DisplayName("Testing Anagram")
	class TestAnag
	{
	@Test
	@DisplayName("Testing for Length")
	public void testLength() {
	assertEquals(false,Util.isAnagram("abcd","acdca"));
	}
	@Test
	@DisplayName("Testing for True")
	public void testForTrue() {
		assertEquals(true,Util.isAnagram("abcd","acdb"));
	}
	@Test
	@DisplayName("Testing for False")
	public void testForFalse() {
		assertEquals(false,Util.isAnagram("abcd","adcc"));
	}

}
}
