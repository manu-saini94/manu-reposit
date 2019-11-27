package com.ProgramTesting.solutions;

import com.ProgramTesting.utility.AnagramUtil;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcd";
		String s2="acdc";
		boolean b=AnagramUtil.isAnagram(s1,s2);
		if(b==true)	
		System.out.println("Are anagram");
		else
			System.out.println("Not anagram");
	}

}
