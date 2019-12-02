package com.bridgelabz.solutions;

import com.bridgelabz.utility.Util;

public class Temperature {

	public static void main(String[] args) {
		System.out.print("Enter the Temperature :");
		double temp=Util.doubleScanner();
		System.out.print("Enter the Unit(F/C) :");
		char ch=Util.charScanner();
	double val=Util.temperatureConversion(temp,ch);
	if(val==-1)
		System.out.println("Wrong unit entered");
	else
	if(ch=='C')
		System.out.println("Temperature in Farenhite is : "+val);
	else
		if(ch=='F')
			System.out.println("Temperature in Celcius is : "+val);
    }
}
