package com.ProgramTesting.algortihms;


public class PrimeAnagramPallindrome extends PrimeInRange{
   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    int[] arr=new int[10];
	String[] str=new String[170];
    int i=0;
    arr=primeRange(1,1000);
    for(int j=0;j<arr.length;j++)
    {
	str[i]=String.valueOf(arr[j]);
    System.out.print(str[i]+" ");
    ++i;
    }
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
}
}