package com.bridgelabz.inventory.Controller;

import java.io.File;

import com.bridgelabs.inventory.service.MyInventoryDao;
import com.bridgelabs.inventory.service.MyInventoryDaoImpl;
import com.bridgelabz.inventory.Utility.Util;

public class Runner {

	    public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String a=null;
	    MyInventoryDao obj=new MyInventoryDaoImpl();
	   
        do
        {
        int ch;
        System.out.println("********Menu**********");
        System.out.println("1. Open a new Inventory");
        System.out.println("2. Add items to the inventory");
        System.out.println("3. Exit");
        System.out.print("Enter your choice : ");
        ch=Util.intScanner();
		switch(ch)
	  	{
		case 1: System.out.print("Please give the Inventory Name: "); 
		        String s1=Util.stringScanner();
			    obj.createFile(s1); 
			   
			    System.out.println("New Inventory "+s1+" is opened");		
			    break;
		
		case 2: System.out.println("Enter the Inventory name in which you want to add items");
		        String s2=Util.stringScanner();
		        File f2=new File(s2);
		        obj.addItems(f2);
		        System.out.println("The items have been added");
		        
	   default: System.out.println("Wrong Choice!!");
		        System.out.println("Do you wish to continue(y/n)");
		        a=Util.stringScanner();
		       
	  	}
       }
       while(a!="n");
	}

}
