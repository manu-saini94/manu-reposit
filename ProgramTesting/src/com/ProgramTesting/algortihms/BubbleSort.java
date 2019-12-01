package com.ProgramTesting.algortihms;
import java.util.Scanner;

import com.ProgramTesting.utility.ScannerUtility;


public class BubbleSort {

	public static int[] sort(int[] arr)
	{
		int temp=0;
		int n=arr.length;
		boolean sorted=false;
			while(!sorted)
			{
				sorted=true;
				for(int i=0;i<n-1;i++)
				{
		        if(arr[i]>arr[i+1])			
		        {	
		        	sorted=false;	
		         	temp=arr[i];        
		            arr[i]=arr[i+1];
				    arr[i+1]=temp;
				}
				}
			}	
			return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the no. of elements");

int n=ScannerUtility.intScanner();
int[] arr=new int[n];
System.out.println("Enter the "+n+" elements");
for(int i=0;i<n;i++)
{
arr[i]=ScannerUtility.intScanner();	
}
int[] arr_sort=sort(arr);
for(int i=0;i<n;i++)
{
System.out.println(arr_sort[i]);
}
	}
}
