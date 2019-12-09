package com.bridgelabz.datastructures.Runner;

import com.bridgelabz.algortihms.PrimeInRange;
import com.bridgelabz.datastructures.Impl.PrimeAnagram2D;

public class RunnerPrimeAnagram2D extends PrimeAnagram2D{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	    int[] arr=PrimeInRange.primeRange(1,1000);
	    int n=arr.length;
	    
	    for(int i=0;i<n;i++)
	    {
	    System.out.print(arr[i]+" ");
	    }
	    System.out.println();
	    int k=0;
	    int l=0;
	    int[][] arr_new=new int[2][100000];
	    for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
	    	{
			boolean b=PrimeAnagram2D.intAnagram(arr[i],arr[j]);	
			if(b==true)
			{
				if(k!=0 && PrimeAnagram2D.match(arr_new,arr[i]))
				{
				arr_new[0][k]=arr[i];
				}
				else
					if(k==0)
					arr_new[0][k]=arr[i];
				if(match(arr_new,arr[j]))
				{
				arr_new[0][++k]=arr[j];
				}
				++k;
			}
			else
			if(b==false)
			{
				if(l!=0 && PrimeAnagram2D.match(arr_new,arr[i]))
				{
					int temp=arr[i];
				arr_new[1][l]=temp;
				}
				else
			    if(l==0)
				{
				int temp=arr[i];
				arr_new[1][l]=temp;
				}
				if(PrimeAnagram2D.match(arr_new,arr[j]))
				{
				int temp=arr[j];
				arr_new[1][++l]=temp;
				}
				++l;
			}
	    	}
		}
	    
	    for(int i=0;i<2;i++)
	    {
	    	for(int j=0;j<k;j++)
	    	{
	    		System.out.print(arr_new[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	}

}
