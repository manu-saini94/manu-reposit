package com.bridgelabz.functional;

import com.bridgelabz.utility.Util;

public class SumOfThree {
	
	public static int triplets(int[] arr)
	{
		int count=0;
		int n=arr.length;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					int sum=arr[i]+arr[j]+arr[k];
				if(sum==0)
				{
					System.out.println("The triplet is : ["+arr[i]+","+arr[j]+","+arr[k]+"]");
                    count++;
				}
				}
			}
		}
	return count;
	}
	
public static void main(String[] args) 
{
	System.out.print("Enter the value of n : ");
	int n=Util.intScanner();
	int[] arr=new int[n];
	System.out.println("Enter the values in array");
	for(int i=0;i<n;i++)
	{
		arr[i]=Util.intScanner();
	}
	int count=triplets(arr);
	System.out.println("The no. of triplets = "+count);
}
}
