package com.bridgelabz.creational.singleton;

public class LazySingleton {
private static LazySingleton instance;
private LazySingleton()
{}
public static LazySingleton getInstance()
{
	if(instance==null)
	{
		instance=new LazySingleton();
	}
	return instance;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LazySingleton s=getInstance();
System.out.println(s);
	}

}
