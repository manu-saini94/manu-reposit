package com.bridgelabz.solutions;


import java.util.ArrayList;
import java.util.List;


import com.bridgelabz.utility.Util;

public class PrimeNo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("Enter the number to find the prime factors : ");
int number=Util.intScanner();
ArrayList l=new ArrayList();
if(number>1)
{
   l=Util.primeFactors(number);
   for(Object arr:l)
{
	System.out.print(arr+" ");
}
}
else 
{
	l=Util.primeFactors(number);
System.out.println("Number entered is negative or 0 ");
}
}


	}


