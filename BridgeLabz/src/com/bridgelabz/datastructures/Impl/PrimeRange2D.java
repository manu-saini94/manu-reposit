package com.bridgelabz.datastructures.Impl;



public class PrimeRange2D {

	public static int[] primeRange(int a,int b)
	{
		
		boolean flag=false;
		int[] arr= new int[30];
		int k=0;
		
			
		for(int x=a+1;x<b;x++)
		{
			if(x==2)
			{
				arr[k]=x;
				++k;
			}
			else
			{
			for(int i=2;i<x;i++)
			{
				flag=false;
				if((x%i)==0)
					break;
				else
					flag=true;
				}
			}
			if(flag==true)
			{
				arr[k]=x;
				++k;
			}
		 }
	     
		
		int[] arr_new=new int[k];
		for(int i=0;i<k;i++)
			arr_new[i]=arr[i];
	  return arr_new;
	}
	
	public static int[][] range2D()
	{
		int[][] arr2=new int[11][1001];
		for(int i=1;i<=10;i++)
		{
			int x=i*100;
			int y=x-100;
			System.out.print("Range "+(y)+" to "+x+" : ");
			int[] arr1=primeRange(y+1,x);
		   for(int k=0;k<arr1.length;k++)
		   {
				arr2[i][k]=arr1[k];
				System.out.print(arr2[i][k]+" ");
		   }
		   System.out.println();
		}
	
	return arr2;
	}
	
}
