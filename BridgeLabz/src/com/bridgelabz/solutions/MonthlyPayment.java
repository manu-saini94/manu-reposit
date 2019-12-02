package com.bridgelabz.solutions;
import com.bridgelabz.utility.Util;

public class MonthlyPayment {
 
	public static void main(String[] args) {
	
		double p=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		double r=Double.parseDouble(args[2]);
		double payment=Util.monthlyPay(p,y,r);
		System.out.println("The monthly Payment = "+payment);
    }
}
