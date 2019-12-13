package com.bridgelabz.addressbook.Utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.util.Scanner;

public class Util {
private static final  Scanner SC=new Scanner(System.in);
private static final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

public static int intScanner()
{
	return SC.nextInt();
}
public static float floatScanner()
{
	return SC.nextFloat();
}
public static String stringScanner() throws IOException
{
	return br.readLine();
}
public static String bufferScanner() throws IOException
{
	return br.readLine();
}
public static boolean booleanScanner()
{
	return SC.nextBoolean();
}
public static long longScanner()
{
	return SC.nextLong();
}
public static double doubleScanner()
{
	return SC.nextDouble();
}
public static char charScanner()
{
	return SC.next().charAt(0);
}


}
