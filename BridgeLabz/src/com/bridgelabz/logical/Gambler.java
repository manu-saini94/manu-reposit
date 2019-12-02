package com.bridgelabz.logical;

import com.bridgelabz.utility.Util;

public class Gambler {
	
	public static int gamble(int stake,int goal,int n)
	{
		int wins=0;
		int bets=0;
		for(int i=0;i<n;i++)
		{
			int amt=stake;
			
			while(amt>0 && amt<goal)
			{
				bets++;
			if(Math.random()>0.5)
			{
				amt++;
			}
			else
				amt--;
			}
			
			if(amt==goal)
			{
				wins++;
			}
		}	
		System.out.println("The no. of bets is : "+bets);
		return wins;
	}
	
	public static double winsPercent(int wins,int n)
	{
		double winper;
		winper=(double)(wins*100)/n;
		return winper;
	}
	public static double lossPercent(int wins,int n)
	{
		double lossper;
		lossper=(double)((n-wins)*100/n);
		return lossper;
	}
	
    public static void main(String[] args) 
    {
    	
	System.out.print("Enter the Stake : ");
	int stake=Util.intScanner();
    System.out.print("Enter the Goal : ");
    int goal=Util.intScanner();
    System.out.print("Enter the number of times to play : ");
    int n=Util.intScanner();
    int wins=gamble(stake,goal,n);
    System.out.println("The gambler has won "+wins+" times");
    double winper=winsPercent(wins,n);
    System.out.println("The wins % is : "+winper);
    double lossper=lossPercent(wins,n);
    System.out.println("The loss % is : "+lossper);

    }
  }
