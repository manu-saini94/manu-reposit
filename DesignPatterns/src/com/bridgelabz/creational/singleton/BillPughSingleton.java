package com.bridgelabz.creational.singleton;

public class BillPughSingleton {
	 private BillPughSingleton(){}
	    
	    private static class SingletonHelper{
	        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	    }
	    
	    public static BillPughSingleton getInstance(){
	    	System.out.println("Instance");
	        return SingletonHelper.INSTANCE;
	    }
	    public static void main(String[] args) {
			getInstance();
		}
}
