package com.bridgelabs.inventory.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabs.inventory.service.MyInventoryDao;
import com.bridgelabz.inventory.Utility.Util;
import com.bridgelabz.inventory.model.Inventory;


public class MyInventoryDaoImpl implements MyInventoryDao {

	JSONArray array=new JSONArray();
	private static Inventory obj;
	
	
	public static Inventory setObj()
	{
		obj=new Inventory();
		return obj;
			
	}
	@Override
	public void addItems(File f) throws IOException, Exception {
		// TODO Auto-generated method stub
		Inventory ob=setObj();
	    System.out.print("Enter the number of items");
	    int num=Util.intScanner();
	    for(int i=0;i<num;i++)
	    {
		System.out.println("Enter the Item Name :");
		String name=Util.stringScanner();
		ob.setName(name);
		System.out.println("Enter the Weight(Kg):");
		float weight=Util.floatScanner();
		ob.setWeight(weight);
		System.out.println("Enter the Price/Kg");
		float addr=Util.floatScanner();
		ob.setPrice(addr);
		
		JSONObject object=new JSONObject();
        object.put("Item name",ob.getName());
        object.put("Weight",ob.getWeight());
        object.put("Price",ob.getPrice());
        array.put(object);
	    }
        PrintWriter pw=new PrintWriter(f);
        pw.write(array.toString());
        pw.flush();
        pw.close();
	}

	@Override
	public void printItems(File f) throws IOException, ParseException, JSONException {
		// TODO Auto-generated method stub
		
		FileReader fr=null;
		try
		{
		fr=new FileReader(f);
		JSONParser parser=new JSONParser();
		array=new JSONArray(parser.parse(fr).toString());
		
		for(int i=0;i<array.length();i++)
		{
			JSONObject ob=array.getJSONObject(i);
	        System.out.print(ob+" ");
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
		
			
	}

	public void createFile(String file) throws IOException {
		// TODO Auto-generated method stub
		File f=new File(file);
		FileWriter fr=new FileWriter(f);
		fr.write("[]");
		fr.flush();
		fr.close();
		
		
	}

}
