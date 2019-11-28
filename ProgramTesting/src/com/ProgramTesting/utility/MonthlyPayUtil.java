package com.ProgramTesting.utility;

public class MonthlyPayUtil {
	
    public static double monthlyPay(double principal,double year,double rate)
    {
    	double n=12*year;
    	double r=rate/(12*100);
	    double payment=(principal*r)/(1-Math.pow(1+r,-n));
        return payment;
    }
    
    
}
