package com.bridgelabz.logical;

public class CouponGeneration {
	
	public static String generate(char[] ch,int n,int max)
	{
		int random=(int)(Math.random()*max);
	     StringBuffer sb=new StringBuffer();
	        
	     while(random>0)
	     {
	    	 int index=random % ch.length;
	    	 sb.append(ch[index]);
	    	 random/=ch.length;
	    	}
	     
	     String s=sb.toString();
	     return s;
	}

	public static void main(String[] args) {
		 String str="abcdefghijklmnopqrstuvwxyz0123456789";
		 char[] ch=str.toCharArray();
	     int n=ch.length;
	     int max=10000000;
	     String s=generate(ch,n,max);
	     System.out.println("The coupon generated is : "+s+" and length is "+s.length());
	     
	}
}
