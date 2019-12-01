package com.ProgramTesting.algortihms;

import com.ProgramTesting.utility.ScannerUtility;

public class FindYourNumber {

	public static int find(int[] arr,int l,int r,int num)
	{
		if(r>=l)
		{
		int mid=l+(r-l)/2;
		
		if(arr[mid]==num)
			return mid;
		
		System.out.println("Is the number between "+(l+1)+" and "+(mid+1));
		boolean b=ScannerUtility.booleanScanner();
		if(b==true)
		{
			return find(arr,l,mid-1,num);
		}
		else
		return find(arr,mid+1,r,num);
		}
		else
			return -1;
		
	}
	
	public static void main(String[] args) {
		
	int n=Integer.parseInt(args[0]);
	int l=0;
	int r=n-1;
	System.out.println("Please enter the value between 1 and "+n);
	int a=ScannerUtility.intScanner();
	while(a<1 && a>n)
	{
		System.out.println("Wrong Choice!! Please enter between 1 and "+n);
		a=ScannerUtility.intScanner();
	}
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=i+1;
	}
	int index=find(arr,l,r,a);
	System.out.println("The number is at "+index+" index");
	System.out.println(arr[index]);
	}
}
