package com.bridgelabz.datastructures.Impl;

import com.bridgelabz.algortihms.PrimeInRange;

public class PrimeAnagram {
	
	public static boolean match(int[] arr,int x)
	{
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i]==x)
					flag=false;
				else 
					flag=true;	
				if(flag==false)
			break;
			}
		return flag;
	}
	
public static int[] addPrimeAnagram()
{
	
	int[] arr1=PrimeInRange.primeRange(1,1000);
	int[] arr_new=new int[10000];
	int k=0;
	/*
	 for(int c:arr1)
	  {
		System.out.print(c+" ");
	  }
	  */
	 int n=arr1.length;
	  for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
		    {
			boolean b=PrimeAnagram2D.intAnagram(arr1[i],arr1[j]);	
			if(b==true)
			{
				
				if(k!=0 && match(arr_new,arr1[i]))
				{
				arr_new[k]=arr1[i];
				}
				else
					if(k==0)
					arr_new[k]=arr1[i];
				if(match(arr_new,arr1[j]))
				{
				arr_new[++k]=arr1[j];
				}
				++k;
			}
			
		    }
		}
	return arr_new;	
}
}
