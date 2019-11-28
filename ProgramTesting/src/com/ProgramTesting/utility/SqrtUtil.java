package com.ProgramTesting.utility;

public class SqrtUtil {

	public static double sqrt(double c)
	{
    if(c>=0)
    {
	double t=c;
	double epsilon=Math.exp(-15);
	while(Math.abs(t-c/t)>epsilon*t)
	{
		t=(c/t+t)/2;
	}
	return t;
    }
    else
    	return -1;
	}
}
