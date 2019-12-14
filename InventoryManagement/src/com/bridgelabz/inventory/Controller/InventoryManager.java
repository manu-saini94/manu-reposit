package com.bridgelabz.inventory.Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.inventory.DaoImpl.MyInventoryImpl;
import com.bridgelabz.inventory.Utility.Util;
import com.bridgelabz.inventory.service.Inventory;

public class InventoryManager extends MyInventoryImpl {

	static JSONArray array=new JSONArray();
	 Inventory obj=null;

	public static void grandTotal(String s) throws JSONException, IOException, ParseException,ClassCastException
	{
		FileReader fr=null;
		File f=null;
		f=new File(s);
		fr=new FileReader(f);
		int gt=0;
		try
		{
		
		JSONParser parser=new JSONParser();
		array=new JSONArray(parser.parse(fr).toString());
	    
		for(int i=0;i<array.length();i++)
		{
		   JSONObject ob=array.getJSONObject(i);
	     
	      Integer prod=(Integer)ob.get("Price")*(Integer)ob.get("Weight");
	       gt=gt+prod;
	        
		}
		
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			fr.close();
		}
		
	   JSONObject new_ob=new JSONObject();
		new_ob.put("Grand Total",(Integer)gt);
	
        array.put(new_ob);
	
        PrintWriter pw=new PrintWriter(f);
        pw.write(array.toString());
        pw.flush();
        pw.close();
	}
	public static void main(String[] args) throws IOException, JSONException, ParseException {
		// TODO Auto-generated method stub
    System.out.print("Enter the Inventory Name to calculate the Inventory Price :");
	String s1=Util.stringScanner();
	grandTotal(s1);
	
	}

}
