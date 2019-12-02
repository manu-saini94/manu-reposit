package com.bridgelabz.solutions;

import com.bridgelabz.utility.Util;

public class Sqrt {

	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		double c=Util.doubleScanner();
		double val=Util.sqrt(c);
		if(val==-1)
		{
			System.out.println("The number is negative! Hence cannot find root ");
		}
		else
		System.out.println("The root is : "+val);

	}
	
	
	
}
