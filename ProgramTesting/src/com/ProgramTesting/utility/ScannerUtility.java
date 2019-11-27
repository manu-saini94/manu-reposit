package com.ProgramTesting.utility;

import java.util.Scanner;

public class ScannerUtility {
private static final  Scanner SC=new Scanner(System.in);

public static int intScanner()
{
	return SC.nextInt();
}
public static float floatScanner()
{
	return SC.nextFloat();
}
public static String stringScanner()
{
	return SC.next();
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
}
