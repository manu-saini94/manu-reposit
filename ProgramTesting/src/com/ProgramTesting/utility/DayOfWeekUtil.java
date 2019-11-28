package com.ProgramTesting.utility;

public class DayOfWeekUtil {
	public static int dayOfWeek(int m,int d,int y)
	{
		int d1,y1,m1,x;
		y1=y-(14-m)/12;
		x=y1+(y1/4)-(y1/100)+(y1/400);
		m1=m+12*((14-m)/12)-2;
		d1=(d+x+(31*m1)/12)%7;
		return d1;
	}
}
