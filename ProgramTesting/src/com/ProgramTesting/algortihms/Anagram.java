package com.ProgramTesting.algortihms;

import java.util.Arrays;

import com.ProgramTesting.utility.ScannerUtility;

public class Anagram {

	public static boolean areAnagram(String s1,String s2)
	{
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		int n1=ch1.length;
		int n2=ch2.length;
		if(n1!=n2)
			return false;
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.print("Enter the First String : ");
    String s1=ScannerUtility.stringScanner();
    System.out.print("Enter the Second String :");
    String s2=ScannerUtility.stringScanner();

    boolean b=areAnagram(s1,s2);
    if(b==true)	
    System.out.println("Are anagram");
    else
	System.out.println("Not anagram");
	}

}
