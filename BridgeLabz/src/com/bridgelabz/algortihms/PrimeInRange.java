package com.bridgelabz.algortihms;

public class PrimeInRange {

	public static int[] primeRange(int a,int b)
	{
		
		boolean flag=false;
		int[] arr= new int[170];
		int k=0;
		
		if(a>=1 && a<=1000)
		{
			
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
		}
		
		int[] arr_new=new int[k];
		for(int i=0;i<k;i++)
			arr_new[i]=arr[i];
	  return arr_new;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr=new int[10];
   arr=primeRange(1,1000);
   System.out.println("Prime in Range(1 to 1000) is : ");
   for(int c:arr)
  {
	System.out.print(c+" ");
  }
}
	
}