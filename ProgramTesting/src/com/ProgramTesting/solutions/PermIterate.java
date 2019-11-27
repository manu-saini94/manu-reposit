package com.ProgramTesting.solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class PermIterate {
public static LinkedList input(char[] a)
{

int n=a.length;
char[] ch=new char[n];
char temp;
int i=0;
int count=0;
LinkedList list=new LinkedList();
while(i<n)
{
	count=0;
	for(int j=0;j<n-1;j++)
	{
		if(count>0)
		{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		
		}
	for(int k=0;k<n;k++)
	{
	ch[k]=a[k];
	count=1;
	}
	String s=new String(ch);
list.add(s);
	}

temp=a[0];
a[0]=a[1];
a[1]=temp; 

i++;
}
return list;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter the String : ");
String s=sc.next();
char[] c=s.toCharArray();
LinkedList list=new LinkedList();
list=input(c);
System.out.println(list);


}

}
