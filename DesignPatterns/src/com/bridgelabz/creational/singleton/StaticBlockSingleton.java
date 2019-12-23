package com.bridgelabz.creational.singleton;

public class StaticBlockSingleton {
private static StaticBlockSingleton instance;
private StaticBlockSingleton()
{}
static
{
	try
	{
		System.out.println("Static block");
	instance=new StaticBlockSingleton();	
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public static StaticBlockSingleton getInstance()
{
	System.out.println("getInstance()");
	return instance;
}

	public static void main(String[] args) {
	
		StaticBlockSingleton s=getInstance();
	}

}
