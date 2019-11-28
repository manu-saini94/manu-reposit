package com.ProgramTesting.utility;

public class BinaryUtil {
	public static int[] toBinary(int a)
	{
		int[] arr=new int[8];
		int[] temp=new int[8];

		int i=0;
		while(a>0)
		{
			arr[i++]=a%2;
			a=a/2;
		}
		for(int k:arr)
		{
		 temp[i]=k;
		 i--;
		}
	return temp;
	}
	
	public static int[] swap(int[] x)
	{
		int[] arr_new = new int[8]; 
		int p=0;
		int q=4; 
		for(int i=0;i<=7;i++)
		{
			if(i<=3)
			{
				arr_new[q]=x[i];
			q++;
			}
			else
			{
				arr_new[p]=x[i]; 
			p++;
			}
		}
		return arr_new;
	}
	public static int swappedDecimal(int[] y)
	{
		double num=0;
		int l=0;
		for(int i=7;i>=0;i--)
		{
			num=num+((y[i])*(Math.pow(2,l)));
		l++;
		}
		return (int)num;
	}
	public static boolean isPowerOf2(int num)
	{
		
		boolean flag=false;
		for(int i=1;i<=8;i++)
		{
		if(Math.pow(2, i)==num)
			flag=true;
			else
			flag=false;
		}
		return flag;
		
	}
}
