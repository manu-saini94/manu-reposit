package com.bridgelabz.algortihms;

import java.util.Arrays;

import com.bridgelabz.utility.Util;

/**
 *  The {@code Anagram} data type is for measuring
 *  the time that elapses between the start and end of a
 *  programming task (wall-clock time).
 *
 *
 *  @author Manu saini
 */

public class Anagram {

	
	
	/**
	 * This method  is for comparing the 2 strings for anagram 
	 * @return true if the 2 Strings are Anagram
	 */ 
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
		boolean flag=false;
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
				flag=false;
			else 
				flag=true;
		}
		return flag;
	
	}
	
	
	
	
	/**
	 * Takes 2 inputs from user {@code s1} and {@code s2} and checks whether 
	 * the 2 strings are anagram or not.It prints to standard output if the 
	 * strings are anagram or not.
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.print("Enter the First String : ");
    String s1=Util.stringScanner();
    System.out.print("Enter the Second String :");
    String s2=Util.stringScanner();

    boolean b=areAnagram(s1,s2);
    if(b==true)	
    System.out.println("Are anagram");
    else
	System.out.println("Not anagram");
	}

}
