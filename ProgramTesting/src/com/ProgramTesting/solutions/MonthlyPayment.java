package com.ProgramTesting.solutions;

import com.ProgramTesting.utility.MonthlyPayUtil;

public class MonthlyPayment {
 
	public static void main(String[] args) {
	
		double p=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		double r=Double.parseDouble(args[2]);
		double payment=MonthlyPayUtil.monthlyPay(p,y,r);
		System.out.println("The monthly Payment = "+payment);
    }
}
