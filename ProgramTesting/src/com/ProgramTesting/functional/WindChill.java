package com.ProgramTesting.functional;

public class WindChill {
	public static double windCal(double t,double v)
	{
		double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
		return w;
	}
	
    public static void main(String[] args) 
    {
    	double t=Double.parseDouble(args[0]);
    	double v=Double.parseDouble(args[1]);
	double temp=windCal(t,v);
	System.out.println("The wind chill is : "+temp);
    }
    
}
