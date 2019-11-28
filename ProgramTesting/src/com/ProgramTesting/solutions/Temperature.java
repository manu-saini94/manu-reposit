package com.ProgramTesting.solutions;

import com.ProgramTesting.utility.ScannerUtility;
import com.ProgramTesting.utility.TemperatureUtil;

public class Temperature {

	public static void main(String[] args) {
		System.out.print("Enter the Temperature :");
		double temp=ScannerUtility.doubleScanner();
		System.out.print("Enter the Unit(F/C) :");
		char ch=ScannerUtility.charScanner();
	double val=TemperatureUtil.temperatureConversion(temp,ch);
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
