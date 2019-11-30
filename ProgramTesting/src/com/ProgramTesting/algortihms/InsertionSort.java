package com.ProgramTesting.algortihms;
import com.ProgramTesting.utility.ScannerUtility;
public class InsertionSort {
	public static String[] sort(String[] arr)
	{
		 for (int i = 1; i < arr.length; i++) {
		        for(int j=i;j>0;j--)
		        {
		        	if(arr[j-1].compareTo(arr[j])>0)
		        	{
		        		String st=arr[j];
		        		arr[j]=arr[j-1];
		        		arr[j-1]=st;
		        	}
		        
		        }
		        // at this point we've exited, so j is either -1
		        // or it's at the first element where current >= a[j]
		 }
		  return arr;       
		 
	}
	public static void display(String[] arr)
	{
		System.out.println("THe sorted array obtained as:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		
		System.out.println("Enter no. of  Elements:");
		int n=ScannerUtility.intScanner();
		String[] arr=new String[n];
		System.out.println("ENter the value of Strings:");
		for(int i=0;i<n;i++)
		{
			arr[i]=ScannerUtility.stringScanner();
		}
		String arr1[]=sort(arr);
		display(arr1);
	}
	
}
