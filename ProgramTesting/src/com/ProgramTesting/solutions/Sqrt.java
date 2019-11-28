package com.ProgramTesting.solutions;

import com.ProgramTesting.utility.ScannerUtility;
import com.ProgramTesting.utility.SqrtUtil;

public class Sqrt {

	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		double c=ScannerUtility.doubleScanner();
		double val=SqrtUtil.sqrt(c);
		if(val==-1)
		{
			System.out.println("The number is negative! Hence cannot find root ");
		}
		else
		System.out.println("The root is : "+val);

	}
	
	
	
}
