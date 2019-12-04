package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Util {
private static final  Scanner SC=new Scanner(System.in);

public static int intScanner()
{
	return SC.nextInt();
}
public static float floatScanner()
{
	return SC.nextFloat();
}
public static String stringScanner()
{
	return SC.nextLine();
}
public static boolean booleanScanner()
{
	return SC.nextBoolean();
}
public static long longScanner()
{
	return SC.nextLong();
}
public static double doubleScanner()
{
	return SC.nextDouble();
}
public static char charScanner()
{
	return SC.next().charAt(0);
}


public static boolean isAnagram(String s1,String s2)
{
	
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		int n1=ch1.length;
		int n2=ch2.length;
		if(n1!=n2)
			return false;
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean flag=false;
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
				flag=false;
			else
				flag=true;
		}
		return flag;
	
}


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



public static int dayOfWeek(int m,int d,int y)
{
	int d1,y1,m1,x;
	y1=y-(14-m)/12;
	x=y1+(y1/4)-(y1/100)+(y1/400);
	m1=m+12*((14-m)/12)-2;
	d1=(d+x+(31*m1)/12)%7;
	return d1;
}



public static double monthlyPay(double principal,double year,double rate)
{
	double n=12*year;
	double r=rate/(12*100);
    double payment=(principal*r)/(1-Math.pow(1+r,-n));
    return payment;
}



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



public static double temperatureConversion(double temp,char ch)
{
		if(ch=='C')
		{
			double val=(temp*9/5)+32;
			return val;
		}
		else
		if(ch=='F')
		{
		 double val=(temp -32)*5/9;
		 return val;
		}
		else
		 return -1;
}


}
