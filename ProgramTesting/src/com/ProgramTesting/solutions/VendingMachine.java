package com.ProgramTesting.solutions;

import java.util.LinkedHashMap;

import com.ProgramTesting.utility.ScannerUtility;

public class VendingMachine {

	public static LinkedHashMap calculate(int i,long amt,LinkedHashMap vals,long[] a,int count)
	{
		if(i!=8)
		{
		  if(amt>=a[i])
		  {
			  long y;
			  y=amt/a[i];
			 vals.put((Object)a[i],(Object)y);
		  amt=amt-(y*a[i]);  
		  count+=y;
		 }
		  else
		  {
		  long x=0;
			  vals.put(a[i],x);
		  }
			  ++i;
		  calculate(i,amt,vals,a,count);
		}
		 if(i==7)
			 System.out.println("Total count is : "+count);
		return vals;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.print("Enter the amount to be withdrawn : ");
	long amount=ScannerUtility.longScanner();
	LinkedHashMap map=new LinkedHashMap();
	LinkedHashMap vals=new LinkedHashMap();
	long[] a= {1000,500,100,50,10,5,2,1};
	int j=0;
	int c=0;
	map=calculate(j,amount,vals,a,c);
	System.out.println(map);
	}

}
