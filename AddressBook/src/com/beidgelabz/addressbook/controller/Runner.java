package com.beidgelabz.addressbook.controller;

import java.io.IOException;

import org.json.JSONException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.addressbook.DaoImpl.MyAddressBookImpl;
import com.bridgelabz.addressbook.Utility.Util;

public class Runner {

	public static void main(String[] args) throws IOException, ParseException, JSONException {
		// TODO Auto-generated method stub
        
		String a=null;
	    MyAddressBookImpl obj=new MyAddressBookImpl();
	   
        do
        {
        int ch;
        System.out.println("********Menu**********");
        System.out.println("1. Add a new Address Book");
        System.out.println("2. Open an existing Address Book");
        System.out.println("3. Exit");
        System.out.print("Enter your choice : ");
        ch=Util.intScanner();
		switch(ch)
	  	{
		case 1: try
		        { 
			     obj.addRecord();			     
		         obj.printRecord();
		        }
	        	catch(Exception e)
		        {
			     e.printStackTrace();
				}
			     
		         break;
		case 2:  System.out.print("Enter the First Name :");
		         String fname=Util.stringScanner();
		         boolean b=obj.match(fname);
		         if(b==false)
		         {
		        	 System.out.println("Record does not exist");
		         }
		         else
			     if(b==true)
			     {
			     System.out.println("The Record exists");
			     obj.printRecord();
			     System.out.println("********Menu**********");
			     System.out.println("1. For Deleting the Record");
			     System.out.println("2. For Updating the Record");
			     System.out.println("Enter your choice");
			     int choice=Util.intScanner();
			     switch(choice)
			     {
			     
			     case 1: obj.deleteRecord(fname);
			             System.out.println("The Record has been deleted");
			             break;
			             
			     case 2: obj.updateRecord(fname);
			             System.out.println("The Record has been updated");
			             break;
			             
			     default:System.out.println("Wrong Choice entered");
			              
			     }
			     }
			     else
			     {
			       System.out.println("Record does not exist");
			     }
			     break;
		case 3: System.exit(0);
		        break;
		default: System.out.println("Wrong Choice!!");
		       System.out.println("Do you wish to continue(y/n)");
		     a=Util.stringScanner();
		       
	  	}
       }
       while(a!="n");
	}
}