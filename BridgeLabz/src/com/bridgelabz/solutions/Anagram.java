package com.bridgelabz.solutions;


import com.bridgelabz.utility.Util;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcd";
		String s2="acdc";
		boolean b=Util.isAnagram(s1,s2);
		if(b==true)	
		System.out.println("Are anagram");
		else
			System.out.println("Not anagram");
	}

}
