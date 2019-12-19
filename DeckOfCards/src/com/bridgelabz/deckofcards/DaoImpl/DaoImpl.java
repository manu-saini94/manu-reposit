package com.bridgelabz.deckofcards.DaoImpl;

import java.util.Random;

import com.bridgelabz.deckofcards.Dao.Dao;

public class DaoImpl implements Dao {

	@Override
	public String[] addCards() {
    String[] suit= {"clubs","diamonds","hearts","spades"};
    String[] rank= {"jack","queen","king","ace","2","3","4","5","6","7","8","9","10"};
    int k=0;
    String[] deck=new String[52];
    for(int i=0;i<suit.length;i++)
    {
    	for(int j=0;j<rank.length;j++)
    	{
    		String str=suit[i]+"-"+rank[j];
    		deck[k]=str;
    		k++;
    	}
    }
	return deck;
	
	}
	
	public boolean match(int[] ar,int x)
	{
		boolean flag=false;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==x)
				flag=true;
			else
				flag=false;
			if(flag==true)
				break;
		}
	return flag;
	}
	
	@Override
	public String[][] distribute(String[] deck) {
		// TODO Auto-generated method stub
		Random r=new Random();
		String[][] arr=new String[4][36];
		int k=0;
		
		int[] a=new int[52];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<9;j++)
			{
				boolean c=true;
				while(c)
				{
				int x=r.nextInt(52);
				
				boolean b=match(a,x);
				if(b==false)
				{
				a[k]=x;
				k++;
				arr[i][j]=deck[x];
				c=false;
				}
				else
					c=true;
				}
			 }
		}
		
		return arr;
	}


	@Override
	public void print(String[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++)
		{
			System.out.println();
			System.out.print("Player - "+(i+1)+" ->");
			for(int j=0;j<9;j++)
			{
				System.out.print(arr[i][j]+",");
			}
		}
	}

	

}
