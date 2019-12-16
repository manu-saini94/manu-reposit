package com.bridgelabz.stock.Controller;

import java.io.File;
import java.io.IOException;

import org.json.JSONException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.stock.DaoImpl.StockDaoImpl;
import com.bridgelabz.stock.Utility.Util;

public class Runner {

	public static void main(String[] args) throws IOException, JSONException, ParseException {
		// TODO Auto-generated method stub
	      
		String a=null;
	    StockDaoImpl obj=new StockDaoImpl();
		    do
	        {
	        int ch;
	        System.out.println("********Menu**********");
	        System.out.println("1. Open a new Stock Portfolio");
	        System.out.println("2. Add items to the Stock Portfolio");
	        System.out.println("3. Exit");
	        System.out.print("Enter your choice : ");
	        ch=Util.intScanner();
			switch(ch)
		  	{
			case 1: System.out.print("Please give the Stock Portfolio Name: "); 
			        String s1=Util.stringScanner();
				    obj.createFile(s1); 
				   
				    System.out.println("New Portfolio "+s1+" is opened");		
				    break;
			
			case 2: System.out.println("Enter the Stock Portfolio name in which you want to add items");
			        String s2=Util.stringScanner();
			        File f2=new File(s2);
			        obj.addStock(f2);
			        System.out.println("The items have been added");
			        obj.calcTotal(f2);
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
