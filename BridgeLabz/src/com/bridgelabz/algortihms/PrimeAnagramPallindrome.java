package com.bridgelabz.algortihms;

public class PrimeAnagramPallindrome extends PrimeInRange{
   
	static void updateFreq(int n, int [] freq) 
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    
    int[] arr=primeRange(1,1000);
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
		boolean b=intAnagram(arr[i],arr[j]);	
		if(b==true)
		{
			if(k!=0 && match(arr_new,arr[i]))
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
			if(l!=0 && match(arr_new,arr[i]))
			{
			arr_new[1][l]=arr[i];
			}
			else
				if(l==0)
				arr_new[1][l]=arr[i];
			if(match(arr_new,arr[j]))
			{
			arr_new[1][++l]=arr[j];
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
    
    
    
    /*
      
     
    for(int k=0;k<arr.length-1;k++)
    {
    	for(int m=k+1;m<arr.length;m++)
    	{
      
	     boolean b=Anagram.areAnagram(str[k],str[m]);
        if(b==true)
        {
        	
        	System.out.println("["+str[k]+","+str[m]+"]");
        
        }
    	}
	
    	for(int l=0;l<arr.length;l++)
        {	
    	char[] ch1=str[l].toCharArray();
    	char[] ch2=new char[str[l].length()];
    	int n=str[l].length()-1;
    	for(int b=0;b<ch1.length;b++) 
    	{
    		ch2[n]=ch1[b];
    		n--;
    	}
    	String s2=new String(ch2);
    	if(str[l].equals(s2))
    	{
    		System.out.println(str[l]+" is a Palindrome");
    	}
    	else
    		{
    		System.out.println(str[l]+" is not a Palindrome");
    	}	
        
        }
	}
	*/
}
}