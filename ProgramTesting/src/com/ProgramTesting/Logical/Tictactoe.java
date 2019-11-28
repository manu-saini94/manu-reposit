package com.ProgramTesting.Logical;

import java.util.Random;

import com.ProgramTesting.utility.ScannerUtility;

public class Tictactoe {

	public static void ticTac()
	{
		char[] ch=new char[9];
		Random r=new Random();
		int i=0;
		boolean flag=false;
		while(i<=8 && flag==false)
		{
			
		if((ch[0]=='X' && ch[4]=='X' && ch[8]=='X') || (ch[0]=='Y' && ch[4]=='Y' && ch[8]=='Y'))
		{
			flag=true;
			if(ch[0]=='X')
			{
			System.out.println("You Win ! congrats");	
			}
			else
				System.out.println("Computer Wins! Better Luck next time!");
		}
		else
			
		if((ch[2]=='X' && ch[4]=='X' && ch[6]=='X') || (ch[2]=='Y' && ch[4]=='Y' && ch[6]=='Y'))
		{
			flag=true;
			if(ch[2]=='X')
			{
				System.out.println("You Win ! congrats");	
			}
			else
				System.out.println("Computer Wins! Better Luck next time!");
		}
		else
			
		if((ch[0]=='X' && ch[3]=='X' && ch[6]=='X') || (ch[0]=='Y' && ch[3]=='Y' && ch[6]=='Y'))
		{
			flag=true;
			if(ch[0]=='X')
			{
				System.out.println("You Win ! congrats");	
			}
			else
				System.out.println("Computer Wins! Better Luck next time!");
		}
		else		
		if((ch[1]=='X' && ch[4]=='X' && ch[7]=='X') || (ch[1]=='Y' && ch[4]=='Y' && ch[7]=='Y'))
		{
			flag=true;
			if(ch[1]=='X')
			{
				System.out.println("You Win ! congrats");	
			}
			else
				System.out.println("Computer Wins! Better Luck next time!");
		}
		else		
		if((ch[2]=='X' && ch[5]=='X' && ch[8]=='X') || (ch[2]=='Y' && ch[5]=='Y' && ch[8]=='Y'))
		{
			flag=true;
			if(ch[2]=='X')
			{
				System.out.println("You Win ! congrats");	
			}
			else
				System.out.println("Computer Wins! Better Luck next time!");
		}
		
		else		
			if((ch[0]=='X' && ch[1]=='X' && ch[2]=='X') || (ch[0]=='Y' && ch[1]=='Y' && ch[2]=='Y'))
			{
				flag=true;
				if(ch[0]=='X')
				{
					System.out.println("You Win ! congrats");	
				}
				else
					System.out.println("Computer Wins! Better Luck next time!");
			}
		
			else		
				if((ch[3]=='X' && ch[4]=='X' && ch[5]=='X') || (ch[3]=='Y' && ch[4]=='Y' && ch[5]=='Y'))
				{
					flag=true;
					if(ch[3]=='X')
					{
						System.out.println("You Win ! congrats");	
					}
					else
						System.out.println("Computer Wins! Better Luck next time!");
				}
		
				else		
					if((ch[6]=='X' && ch[7]=='X' && ch[8]=='X') || (ch[6]=='Y' && ch[7]=='Y' && ch[8]=='Y'))
					{
						flag=true;
						if(ch[6]=='X')
						{
							System.out.println("You Win ! congrats");	
						}
						else
							System.out.println("Computer Wins! Better Luck next time!");
					}
		
		else
		if(i%2==0 && flag==false)
		{
			int x=r.nextInt(9);
			while(ch[x]=='O'|| ch[x]=='X')
			{
				
				x=r.nextInt(9);
			}
			ch[x]='O';
		System.out.println("computer : "+x);
		}
		else
			if(i%2!=0 && flag==false)
		{
			int n=ScannerUtility.intScanner();
			while(ch[n]=='O'|| ch[n]=='X')
			{
				System.out.println("Wrong input or Already taken!!! Please enter again ");
				n=r.nextInt(9);
			}
			ch[n]='X';
			System.out.println("you entered : "+n);
		}
		i++;
		if(i==9 && flag==false)
		{
			System.out.println("The game is drawn");
		}
		}
	}
public static void main(String[] args) {
	ticTac();
}
}
