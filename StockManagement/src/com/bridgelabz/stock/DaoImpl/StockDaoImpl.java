package com.bridgelabz.stock.DaoImpl;

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

import com.bridgelabz.stock.Utility.Util;
import com.bridgelabz.stock.service.Stock;
import com.bridgelabz.stock.Dao.StockDao;

public class StockDaoImpl implements StockDao {


	JSONArray array=new JSONArray();
	private static Stock obj;
	
	
	public static Stock setObj()
	{
		obj=new Stock();
		return obj;
			
	}

	@Override
	public void addStock(File f) throws JSONException, IOException {
		// TODO Auto-generated method stub
	
			// TODO Auto-generated method stub
			Stock ob=setObj();
		    System.out.print("Enter the number of stocks");
		    int num=Util.intScanner();
		    for(int i=0;i<num;i++)
		    {
			System.out.println("Enter the Share Name :");
			String name=Util.stringScanner();
			ob.setName(name);
			System.out.println("Enter the number of shares:");
			float price=Util.floatScanner();
			ob.setPrice(price);
			System.out.println("Enter the Price of share");
			int qty=Util.intScanner();
			ob.setQty(qty);
			
			JSONObject object=new JSONObject();
	        object.put("Share name",ob.getName());
	        object.put("Price of share",ob.getPrice());
	        object.put("Number of shares",ob.getQty());
	        array.put(object);
		    }
	        PrintWriter pw=new PrintWriter(f);
	        pw.write(array.toString());
	        pw.flush();
	        pw.close();
		}

		@Override
		public void printStock(File f) throws IOException, ParseException, JSONException {
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

	

	@Override
	public void createFile(String file) throws IOException {
		// TODO Auto-generated method stub
		File f=new File(file);
		FileWriter fr=new FileWriter(f);
		fr.write("[]");
		fr.flush();
		fr.close();
	}

	@Override
	public void calcTotal(File f) throws IOException, JSONException, ParseException {
		// TODO Auto-generated method stub

		FileReader fr=null;
	Integer prod=0;
		fr=new FileReader(f);
		int gt=0;
		JSONArray arr=null;
		try
		{
		
		JSONParser parser=new JSONParser();
		array=new JSONArray(parser.parse(fr).toString());
	    arr=new JSONArray();
		for(int i=0;i<array.length();i++)
		{
		   JSONObject ob=array.getJSONObject(i);
	     
	      prod=(Integer)ob.get("Price of share")*(Integer)ob.get("Number of shares");
	       gt=gt+prod;
	       arr.put(prod);			
		
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
		new_ob.put("Stock Total",(Integer)gt);
	
        array.put(new_ob);
        JSONObject ob_new=new JSONObject();
        ob_new.put("Shares Total ",arr);
        array.put(ob_new);
	
        PrintWriter pw=new PrintWriter(f);
        pw.write(array.toString());
        pw.flush();
        pw.close();
	}

}
