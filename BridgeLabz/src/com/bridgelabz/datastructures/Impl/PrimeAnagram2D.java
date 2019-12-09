package com.bridgelabz.datastructures.Impl;

public class PrimeAnagram2D {
	public static void updateFreq(int n, int [] freq) 
    {   
        while (n > 0) 
        { 
            int digit = n % 10;        
            freq[digit]++; 
            n /= 10; 
        } 
    } 
	public static boolean intAnagram(int a,int b)
	{
		  int [] freqA = new int[10]; 
	      int [] freqB = new int[10]; 
	      
	
	        updateFreq(a, freqA); 
	        updateFreq(b, freqB); 
	      	       
	        for (int i = 0; i < 10; i++)  
	        {
	            if (freqA[i] != freqB[i]) 
	                return false; 
	        } 
	        return true; 
		
	}
	public static boolean match(int[][] arr,int x)
	{
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length && arr[i][j]!=0;j++)
			{
				if(arr[i][j]==x)
					flag=false;
				else 
					flag=true;	
				if(flag==false)
			break;
			}
			if(flag==false)
				break;
		}
		return flag;
	}
}
