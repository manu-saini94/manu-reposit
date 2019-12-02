package com.bridgelabz.solutions;

public class Distance {

	public static double calcDistance(int x,int y)
	{
		double dist=Math.sqrt(x*x+y*y);
		return dist;
	}
	public static void main(String[] args) {
	int x=Integer.parseInt(args[0]);
	int y=Integer.parseInt(args[1]);
	
	double dist=calcDistance(x,y);
	System.out.println("Distance = "+dist);

	}
}
