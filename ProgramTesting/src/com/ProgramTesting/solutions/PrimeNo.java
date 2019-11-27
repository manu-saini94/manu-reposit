package com.ProgramTesting.solutions;

import java.util.ArrayList;
import java.util.List;

import com.ProgramTesting.utility.PrimeNoUtil;
import com.ProgramTesting.utility.ScannerUtility;

public class PrimeNo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("Enter the number to find the prime factors : ");
int number=ScannerUtility.intScanner();
ArrayList l=new ArrayList();
if(number>1)
{
   l=PrimeNoUtil.primeFactors(number);
   for(Object arr:l)
{
	System.out.print(arr+" ");
}
}
else 
{
	l=PrimeNoUtil.primeFactors(number);
System.out.println("Number entered is negative or 0 ");
}
}


	}


