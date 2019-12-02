package com.bridgelabz.solutions;

import com.bridgelabz.utility.Util;

public class Quadratic {

	public static double deltaCalc(int a,int b,int c)
	{
		double sub=b*b-4*a*c;
		if(sub<0)
		return -1;
		else
		return Math.sqrt(sub);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.print("Enter the value of a :");
	int a=Util.intScanner();
	System.out.print("Enter the value of b:");
	int b=Util.intScanner();
	System.out.print("Enter the value of c :");
	int c=Util.intScanner();
	double delta=deltaCalc(a,b,c);
	System.out.println("Delta = "+delta);
	if(delta>=0)
	{
	double x1=(-b+delta)/2*a;
	double x2=(-b-delta)/2*a;
	System.out.println("Root 1 is : "+x1);
	System.out.print("Root 2 is : "+x2);
	}
	else
	{
		System.out.println("Value of delta is Negative");
	}
	}

}
