package com.bridgelabz.solutions;

import com.bridgelabz.utility.Util;

public class Harmonic {

	public static double harmonic(int n)
	{
		double sum=0;
		if(n==0)
		{
			return -1;
		}
		else
		{
			for(double i=1;i<=n;i++)
			{
			sum=(1/i+sum);
			}
		return sum;
  	    }
	}
	
	public static void main(String[] args)
	{
    System.out.print("Enter the value of N : ");
	int n=Util.intScanner();
	double d=harmonic(n);
	if(d==-1)
	System.out.println("The value of N should not be 0");
	else
	System.out.println("The Harmonic value is : "+d);
	}
}
