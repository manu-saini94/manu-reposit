package com.bridgelabz.datastructures.Runner;

import java.io.IOException;

import com.bridgelabz.datastructures.Impl.CashCounter;
import com.bridgelabz.datastructures.Impl.Queue;
import com.bridgelabz.utility.Util;

public class RunnerCashCounter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    Queue<String> ob=new Queue<String>();
    double amt1=10000.0;
    System.out.println("Enter the number of users : ");
    int n=Util.intScanner();   
    double amt2=0.0;
    String s1=null;
    for(int i=0;i<n;i++)
    {
    	System.out.println();
       System.out.print("You want to withdraw or deposit (W/D):");
       String s2=Util.bufferScanner();
       switch(s2)
       {
       case "W": System.out.print("Enter your name: "); 
                 s1=Util.bufferScanner();
                 ob.enqueue(s1);
                 System.out.print("Enter the amount : ");
                 amt2=Util.doubleScanner();
                 amt1=CashCounter.amt_updation(amt1,s2,amt2);
                 System.out.print("The total cash balance is : "+amt1);
                 break;
       case "D": System.out.print("Enter your name: "); 
                 s1=Util.bufferScanner();
                 ob.enqueue(s1);
                 System.out.print("Enter the amount : ");
                 amt2=Util.doubleScanner();
                 amt1=CashCounter.amt_updation(amt1,s2,amt2);
                 System.out.print("The total cash balance is : "+amt1);
                 break;
       default : System.out.println("Wrong choice");
                  	
       }
       }
       System.out.println(); 
        ob.show();
       System.out.println();
    for(int i=0;i<n;i++)
    {
    	String str=ob.dequeue();
    	System.out.println(str+" is deleted");
    }
	}

}
