package com.bridgelabz.solutions;
import com.bridgelabz.utility.Util;

public class DayOfWeek {
	
	public static void main(String[] args) {
		int m=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
	    int x=Util.dayOfWeek(m,d,y);
	    if(x==0)
	    System.out.println("sunday");
	    if(x==1)
	    	System.out.println("monday");
	    if(x==2)
	    	System.out.println("tuesday");
	    if(x==3)
	    	System.out.println("wednesday");
	    if(x==4)
	    	System.out.println("thursday");
	    if(x==5)
	    	System.out.println("friday");
	    if(x==6)
	    	System.out.println("saturday");
	}
}
