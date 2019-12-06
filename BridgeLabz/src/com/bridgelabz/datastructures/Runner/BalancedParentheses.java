package com.bridgelabz.datastructures.Runner;

import com.bridgelabz.datastructures.Impl.Stack;

public class BalancedParentheses {

	public static boolean isBalanced(char ch1,char ch2)
	{
		if(ch1=='}' && ch2=='{')
		  return true;
		else if(ch1==')' && ch2=='(')
		  return true;
		else if(ch1==']' && ch2=='[')
	      return true;
		else 
	      return false;
	}
	
	public static void main(String[] args) {
		
	Stack<Character> s=new Stack<Character>();

	String str="(5+6)?(7+8)/(4+3)(5+6)?(7+8)/(4+3)";
	char[] ch=str.toCharArray();
	int n=ch.length;
	boolean flag=false;
	for(int i=0;i<n;i++)
	{
		if(ch[i]=='{' || ch[i]=='(' || ch[i]=='[')
		{	
			s.push(ch[i]);
		}
		else if(ch[i]=='}' || ch[i]==')' || ch[i]==']')
	     {
			char c=s.pop();
			if(c=='\u0000')
				flag=true;
			else
			if(!isBalanced(ch[i],c))	 
	 	        flag=true;
	   	 }
		if(flag==true)
			break;
	}
	if(flag==true)
		System.out.println("Unbalnaced");
	else
		System.out.println("Balanced");
	
	
	}
	
}

