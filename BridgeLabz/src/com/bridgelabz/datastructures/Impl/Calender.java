package com.bridgelabz.datastructures.Impl;

import com.bridgelabz.solutions.LeapYear;
import com.bridgelabz.utility.Util;

public class Calender {
	
	public static void monthCalender(int m,int y,LeapYear ob)
	{
		if( m==2 && ob.isLeapYear(y))
		{
			System.out.println(" S   M   T   W   T   F   S");
			for(int i=1;i<=29;i++)
			{
			int x=Util.dayOfWeek(m,i,y);
			if(i==1 && x==6)
			{
				for(int j=0;j<x;j++)
				{
					System.out.print("    ");
				}
				System.out.println(" "+i);
			}
			else
			if(i==1 && x<6)
			{
				for(int j=0;j<x;j++)
				{
					System.out.print("    ");
				}
				System.out.print(" "+i+"  ");	
			}
			else
				if(x==6)
				{
					if(i<10)
						System.out.println(" "+i);
					else
					System.out.println(i);
				}
				else
				{
					if(i<10)
					System.out.print(" "+i+"  ");
					else
					System.out.print(i+"  ");
				}
			}
		}
		else
		if( m==2 && !ob.isLeapYear(y) )
        {
			System.out.println(" S   M   T   W   T   F   S");
			for(int i=1;i<=28;i++)
			{
				int x=Util.dayOfWeek(m,i,y);
				if(i==1 && x==6)
				{
					for(int j=0;j<x;j++)
					{
						System.out.print("    ");
					}
					System.out.println(" "+i);
				}
				else
				if(i==1 && x!=6)
				{
					for(int j=0;j<x;j++)
					{
						System.out.print("    ");
					}
					System.out.print(" "+i+"  ");	
				}
				else
					if(x==6)
					{
						if(i<10)
							System.out.println(" "+i);
						else
						System.out.println(i);
					}
					else
					{
						if(i<10)
						System.out.print(" "+i+"  ");
						else
						System.out.print(i+"  ");
					}
        }
        }
        else
		if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12 )
		{
			System.out.println(" S   M   T   W   T   F   S");
			for(int i=1;i<=31;i++)
			{
				int x=Util.dayOfWeek(m,i,y);
				if(i==1 && x==6)
				{
					for(int j=0;j<x;j++)
					{
						System.out.print("    ");
					}
					System.out.println(" "+i);
				}
				else
				if(i==1 && x!=6)
				{
					for(int j=0;j<x;j++)
					{
						System.out.print("    ");
					}
					System.out.print(" "+i+"  ");	
				}
				else
					if(x==6)
					{
						if(i<10)
							System.out.println(" "+i);
						else
						System.out.println(i);
					}
					else
					{
						if(i<10)
						System.out.print(" "+i+"  ");
						else
						System.out.print(i+"  ");
					}
		}
		}
		else
		{
			System.out.println(" S   M   T   W   T   F   S");
			for(int i=1;i<=30;i++)
			{
				int x=Util.dayOfWeek(m,i,y);
				if(i==1 && x==6)
				{
					for(int j=0;j<x;j++)
					{
						System.out.print("  ");
					}
					System.out.println(" "+i);
				}
				else
				if(i==1 && x!=6)
				{
					for(int j=0;j<x;j++)
					{
						System.out.print("  ");
					}
					System.out.print(" "+i+"  ");	
				}
				else
					if(x==6)
					{
						if(i<10)
							System.out.println("  "+i);
						else
						System.out.println(i);
					}
					else
					{
						if(i<10)
						System.out.print(" "+i+"  ");
						else
						System.out.print(i+"  ");
					}
		}
	}
}
}