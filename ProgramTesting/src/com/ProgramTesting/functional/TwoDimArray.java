package com.ProgramTesting.functional;

import com.ProgramTesting.utility.ScannerUtility;

public class TwoDimArray {

	public static boolean[][] printArrayBoolean(int m,int n)
	{
		boolean[][] array=new boolean[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				array[i][j]=ScannerUtility.booleanScanner();
			}
		}
		return array;
	}
	
	public static int[][] printArrayInteger(int m,int n)
	{
		int[][] array=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				array[i][j]=ScannerUtility.intScanner();
			}
		}
		return array;
	}
	
	public static double[][] printArrayDouble(int m,int n)
	{
		double[][] array=new double[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				array[i][j]=ScannerUtility.doubleScanner();
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the number of rows : ");
	int m=ScannerUtility.intScanner();
	System.out.print("Enter the number of columns : ");
	int n=ScannerUtility.intScanner();
	System.out.println();
	System.out.println("Enter the values for boolean 2D array");
	boolean[][] arr1=printArrayBoolean(m,n);
	System.out.println("The boolean array is : ");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(arr1[i][j]+" ");
		}
	System.out.println();
	}
	System.out.println("Enter the values for integer 2D array");
	int[][] arr2=printArrayInteger(m,n);
	System.out.println("The Integer Array is : ");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(arr2[i][j]+" ");
		}
	System.out.println();
	}
	System.out.println("Enter the values for double 2D array");
	double[][] arr3=printArrayDouble(m,n);
	System.out.println("The double array is : ");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(arr3[i][j]+" ");
		}
		System.out.println();
	}
	}
}
