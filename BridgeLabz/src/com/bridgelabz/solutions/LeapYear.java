package com.bridgelabz.solutions;

import com.bridgelabz.utility.Util;

public class LeapYear
{
	public boolean isLeapYear(int year)
	{
		if(year>=1582)
		{
		if(year%400==0)
		{
		return true;
		}else
			if(year%100==0)
				{return false;
				}else
				if(year%4==0)
					{return true;
					}
		}
		return false;
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("Enter the year : ");
	int year=Util.intScanner();
	LeapYear ob=new LeapYear();
	boolean b=ob.isLeapYear(year);
	if(b==true)
	{
		System.out.println("Year is a Leap Year");
	}
	else
	{
		System.out.println("Year is not a Leap Year");
	}
	}

}
