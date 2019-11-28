package com.ProgramTesting.utility;

public class TemperatureUtil {

	
	public static double temperatureConversion(double temp,char ch)
   {
		if(ch=='C')
		{
			double val=(temp*9/5)+32;
			return val;
		}
		else
			if(ch=='F')
			{
				double val=(temp -32)*5/9;
			return val;
			}
			else
				return -1;
   }
}
