package com.bridgelabz.stockaccount.Runner;

import java.io.File;
import java.io.IOException;

import org.json.JSONException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.stockaccount.DaoImpl.StockAccount;
import com.bridgelabz.stockaccount.Utility.Util;



public class Runner {

	public static void main(String[] args) throws IOException, JSONException, ParseException {
		// TODO Auto-generated method stub

		String a=null;
	    StockAccount obj1=new StockAccount();
	    StockAccount obj2=new StockAccount();
	    StockAccount obj3=new StockAccount();
		    do
	        {
	        int cho;
	        System.out.println("********Menu**********");
	        System.out.println("1. Customer Info File");
	        System.out.println("2. Company Shares File");
	        System.out.println("3. Buy or Sell Shares");
	        System.out.println("4. Exit");
	        System.out.print("Enter your choice : ");
	        cho=Util.intScanner();
			switch(cho)
		  	{
			case 1:	System.out.println("Enter the Customer File name you want to create");
				    String s1=Util.stringScanner();
				    File f1=new File(s1);
				    System.out.println("File "+s1+" has been created");
				    obj1.addCustomer(f1);
			        break;
			             
			case 2:
				    System.out.println("Enter the Company Shares File name you want to create");
			        String s2=Util.stringScanner();
			        File f2=new File(s2);
			        obj2.addShares(f2);
			        System.out.println("The Shares have been added");
			       
		            break;
				 
			case 3: System.out.print("Enter the customer name : ");
			        String name=Util.stringScanner();
				    System.out.println("1. BUY");   
				    System.out.println("2. SELL");
				    System.out.print("Enter your Choice :");
				    int n=Util.intScanner();
				    switch(n)
				    {
				    case 1: System.out.print("Enter the Share Symbol you want to BUY : ");
				            String str1=Util.stringScanner();
				            System.out.print("Enter the number of shares you wish to BUY : ");
				            int amt1=Util.intScanner();
				            boolean b=obj3.buy(amt1,str1,name);
				            if(b==true)
				            System.out.println("The shares have been added in your account");
				            else
				            System.out.println("You don't have Sufficient Balance in your Account!!!");
				            break;
				    case 2: System.out.println("Enter the share Symbol you want to SELL");
				            String str2=Util.stringScanner();
		                    System.out.print("Enter the number of shares you wish to SELL : ");
		                    int amt2=Util.intScanner();
		                    obj3.sell(amt2,str2,name);
		                    break;
				    }
			        break;
		    case 4: System.exit(0);
			        break;

		   default: System.out.println("Wrong Choice!!");
		            
			        System.out.println("Do you wish to continue(y/n)");
			        a=Util.stringScanner();
			       
		  	}
	       }
			while(a!="n");
	
	
		    }
    
}