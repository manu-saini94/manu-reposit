package com.ProgramTesting.Logical;

import java.util.Random;

import com.ProgramTesting.utility.ScannerUtility;

public class TicTacToe
{
	
	public static void game()
	{
		String[][] z=new String[3][3];		
			Random ran=new Random();
		int k=0;
		for(int i=0;i<3;i++)
		{
			if(z[0][0]=="X" && z[1][1]=="X" && z[2][2]=="X" || z[0][2]=="X" && z[1][1]=="X" && z[2][0]=="X" || z[0][0]=="X" && z[1][0]=="X" && z[2][0]=="X"
				    || z[0][1]=="X" && z[1][1]=="X" && z[2][1]=="X" || z[0][2]=="X" && z[1][2]=="X" && z[2][2]=="X" 
				    || z[0][0]=="X" && z[0][1]=="X" && z[0][2]=="X" || z[1][0]=="X" && z[1][1]=="X" && z[1][2]=="X" || z[2][0]=="X" && z[2][1]=="X" && z[2][2]=="X")
				{
					System.out.println("You win!!");
					System.exit(0);
				}
				else
					if(z[0][0]=="Y" && z[1][1]=="Y" && z[2][2]=="Y" || z[0][2]=="Y" && z[1][1]=="Y" && z[2][0]=="Y" || z[0][0]=="Y" && z[1][0]=="Y" && z[2][0]=="Y"
				       || z[0][1]=="Y" && z[1][1]=="Y" && z[2][1]=="Y" || z[0][2]=="Y" && z[1][2]=="Y" && z[2][2]=="Y" 
				       || z[0][0]=="Y" && z[0][1]=="Y" && z[0][2]=="Y" || z[1][0]=="Y" && z[1][1]=="Y" && z[1][2]=="Y" || z[2][0]=="Y" && z[2][1]=="Y" && z[2][2]=="Y")	
				{
						System.out.println("Computer wins!!");
						System.exit(0);
				}
			for(int j=0;j<3;j++)
			{
				if(z[0][0]=="X" && z[1][1]=="X" && z[2][2]=="X" || z[0][2]=="X" && z[1][1]=="X" && z[2][0]=="X" || z[0][0]=="X" && z[1][0]=="X" && z[2][0]=="X"
					    || z[0][1]=="X" && z[1][1]=="X" && z[2][1]=="X" || z[0][2]=="X" && z[1][2]=="X" && z[2][2]=="X" 
					    || z[0][0]=="X" && z[0][1]=="X" && z[0][2]=="X" || z[1][0]=="X" && z[1][1]=="X" && z[1][2]=="X" || z[2][0]=="X" && z[2][1]=="X" && z[2][2]=="X")
					{
						System.out.println("You win!!");
						System.exit(0);
					}
					else
						if(z[0][0]=="Y" && z[1][1]=="Y" && z[2][2]=="Y" || z[0][2]=="Y" && z[1][1]=="Y" && z[2][0]=="Y" || z[0][0]=="Y" && z[1][0]=="Y" && z[2][0]=="Y"
					       || z[0][1]=="Y" && z[1][1]=="Y" && z[2][1]=="Y" || z[0][2]=="Y" && z[1][2]=="Y" && z[2][2]=="Y" 
					       || z[0][0]=="Y" && z[0][1]=="Y" && z[0][2]=="Y" || z[1][0]=="Y" && z[1][1]=="Y" && z[1][2]=="Y" || z[2][0]=="Y" && z[2][1]=="Y" && z[2][2]=="Y")	
					{
							System.out.println("Computer wins!!");
							System.exit(0);
					}
				if(k%2==0)
				{
					System.out.println("Your Turn");
					
					System.out.print("Enter the row index : ");
					int r=ScannerUtility.intScanner();
					System.out.print("Enter the coulumn index : ");
					int c=ScannerUtility.intScanner();
					while(r<0 || r>2 || c<0 || c>2)
					{
						System.out.println("Wrong choice !!");
						System.out.print("Enter the row index(0,2): ");
						int x=ScannerUtility.intScanner();
						r=x;
						System.out.print("Enter the coulumn index(0,2): ");
						int y=ScannerUtility.intScanner();
						c=y;
						if(z[r][c]!=null)
							continue;
					}
					while(z[r][c]==null || z[r][c]!="X")
					{
						boolean flag=false;
						
						z[r][c]="X";
						if(z[r][c]!="X")
						{
							System.out.println("Wrong Entry");
							flag=true;
						}
						if(flag==true)
							continue;
					}
					for(int b=0;b<3;b++)
					{
						for(int m=0;m<3;m++)
						{	if(z[b][m]==null)
							System.out.print("  ");
						else
							System.out.print(z[b][m]+" ");
						}
						System.out.println();
						
					}
					System.out.println();
					++k;
				}
				else
				{
					if(z[0][0]=="X" && z[1][1]=="X" && z[2][2]=="X" || z[0][2]=="X" && z[1][1]=="X" && z[2][0]=="X" || z[0][0]=="X" && z[1][0]=="X" && z[2][0]=="X"
						    || z[0][1]=="X" && z[1][1]=="X" && z[2][1]=="X" || z[0][2]=="X" && z[1][2]=="X" && z[2][2]=="X" 
						    || z[0][0]=="X" && z[0][1]=="X" && z[0][2]=="X" || z[1][0]=="X" && z[1][1]=="X" && z[1][2]=="X" || z[2][0]=="X" && z[2][1]=="X" && z[2][2]=="X")
						{
							System.out.println("You win!!");
							System.exit(0);
						}
						else
							if(z[0][0]=="Y" && z[1][1]=="Y" && z[2][2]=="Y" || z[0][2]=="Y" && z[1][1]=="Y" && z[2][0]=="Y" || z[0][0]=="Y" && z[1][0]=="Y" && z[2][0]=="Y"
						       || z[0][1]=="Y" && z[1][1]=="Y" && z[2][1]=="Y" || z[0][2]=="Y" && z[1][2]=="Y" && z[2][2]=="Y" 
						       || z[0][0]=="Y" && z[0][1]=="Y" && z[0][2]=="Y" || z[1][0]=="Y" && z[1][1]=="Y" && z[1][2]=="Y" || z[2][0]=="Y" && z[2][1]=="Y" && z[2][2]=="Y")	
						{
								System.out.println("Computer wins!!");
								System.exit(0);
						}
							
					System.out.println("Computer's Turn");
					int r=ran.nextInt(3);
					int c=ran.nextInt(3);
					while(z[r][c]==null || z[r][c]!="O")
					{
						System.out.println(r+" "+c);
						boolean flag=false;
						z[r][c]="O";
						
					}
					System.out.println();
					for(int d=0;d<3;d++)
					{
						for(int e=0;e<3;e++)
						{if(z[d][e]==null)
							System.out.print("  ");
						else
							System.out.print(z[d][e]+" ");
						}
						System.out.println();
						
						
					}
					System.out.println();
					k++;
				}
			}
			}
		
	  }
	
public static void main(String[] args) {
	game();
}
	
}
