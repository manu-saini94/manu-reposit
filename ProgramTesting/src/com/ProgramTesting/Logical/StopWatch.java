package com.ProgramTesting.Logical;

import java.io.IOException;

public class StopWatch {
	

	    private final long start;

	    
	    public StopWatch() {
	        start = System.currentTimeMillis();
	    } 


	   
	     
	    public double elapsedTime()
	    {
	        long now = System.currentTimeMillis();
	        return (now - start) / 1000.0;
	    }

	    
	    
	    public static void main(String[] args) throws IOException {
	        int n =100;
            System.out.println("Waiting for First click : ");
	        // sum of square roots of integers from 1 to n using Math.sqrt(x).
	        StopWatch timer1 = new StopWatch();
	        double sum1 = 0.0;
	        for (int i = 1; i <= n; i++) {
	            sum1 += Math.sqrt(i);
	        }
	        System.in.read();
	        double time1 = timer1.elapsedTime();
	       System.out.println(sum1);
	       System.out.println("The time eleapsed is: "+time1);

	       
	        // sum of square roots of integers from 1 to n using Math.pow(x, 0.5).
	        StopWatch timer2 = new StopWatch();
	        double sum2 = 0.0;
	        for (int i = 1; i <= n; i++) {
	            sum2 += Math.pow(i, 0.5);
	        }
	      
	        System.in.read();
	        double time2 = timer2.elapsedTime();
	        System.out.println(sum2);
	        System.out.println("The time eleapsed is: "+time2);
	    }
	} 

