package com.ProgramTesting.utility;

import java.util.ArrayList;

public class PrimeNoUtil {
	public static ArrayList primeFactors(int num)
	{
	ArrayList list=new ArrayList();
	int j=0;
	if(num>1)
	{
	for(int i=2;i<Math.sqrt(num);i++)
	{
		while(num%i==0)
		{
			list.add(i);
			num=num/i;
		}
	}
	if(num>2)
	{
		list.add(num);
	}
	return list;
	}
	else
		return list;
	}
	
}
