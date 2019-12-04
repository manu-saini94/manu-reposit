package com.bridgelabz.logical;

import java.io.IOException;


/**
 *  The {@code StopWatch} data type is for measuring
 *  the time that elapses between the start and end of a
 *  programming task (wall-clock time).
 *
 *
 *  @author Manu Saini
 */
public class StopWatch {
	

	    private final long start;


	    /**
	     * Initializes a new StopWatch.
	     */
	    public StopWatch() {
	        start = System.currentTimeMillis();
	    } 

	    
       /**
	    * @return elapsed CPU time (in seconds) since the StopWatch was created
	    */ 
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

	  
	      
	    }
	} 

