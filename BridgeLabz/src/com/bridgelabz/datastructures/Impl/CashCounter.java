package com.bridgelabz.datastructures.Impl;

public class CashCounter {

	public static double amt_updation(double amt1,String s,double amt2)
	{
		if(s.equals("W"))
			amt1=amt1-amt2;
		else
			if(s.equals("D"))
			amt1=amt1+amt2;
			else
				amt1=amt1+0.0;
		return amt1;
	}
}
