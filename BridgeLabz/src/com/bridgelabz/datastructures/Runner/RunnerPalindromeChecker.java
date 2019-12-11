package com.bridgelabz.datastructures.Runner;

import com.bridgelabz.datastructures.Impl.Deque;
import com.bridgelabz.utility.Util;
import com.bridgelabz.utility.UtilDs;

public class RunnerPalindromeChecker {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Deque<String> ob=new Deque<String>();
    System.out.println("Enter the String");
	String str=Util.stringScanner();
	String[] arr=str.split("");
	for(int i=0;i<arr.length;i++)
	{
		ob.addRear(arr[i]);
	}
    ob.displayForward();
	boolean b=ob.checkPalindrome();
	System.out.println();
	if(b==true)
		System.out.println("Is a Palindrome!");
	else
		System.out.println("Not a Palindrome!");
	}

}
