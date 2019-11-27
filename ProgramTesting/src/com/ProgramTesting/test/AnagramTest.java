package com.ProgramTesting.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.ProgramTesting.utility.AnagramUtil;

class AnagramTest {

	@Nested
	@DisplayName("Testing Anagram")
	class TestAnag
	{
	@Test
	@DisplayName("Testing for Length")
	public void testLength() {
	assertEquals(false,AnagramUtil.isAnagram("abcd","acdca"));
	}
	@Test
	@DisplayName("Testing for True")
	public void testForTrue() {
		assertEquals(true,AnagramUtil.isAnagram("abcd","acdb"));
	}
	@Test
	@DisplayName("Testing for False")
	public void testForFalse() {
		assertEquals(false,AnagramUtil.isAnagram("abcd","adcc"));
	}

}
}
