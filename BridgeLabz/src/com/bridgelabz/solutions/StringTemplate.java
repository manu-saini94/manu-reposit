package com.bridgelabz.solutions;

import com.bridgelabz.utility.Util;

public class StringTemplate {

	public static String template(String str)
	{
		System.out.print("Enter the user-name : ");
		String uname=Util.stringScanner();
		String str2=str.replace("<<UserName>>",uname);
		return str2;
	}
    public static void main(String[] args) 
    {
	String str1="Hello <<UserName>>,How are you?";
	System.out.println(str1);
	String str2=template(str1);
	System.out.println(str2);
    }
}
