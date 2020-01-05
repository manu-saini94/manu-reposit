package com.bridgelabz.addressbook.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.LinkedList;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.addressbook.Utility.Util;
import com.bridgelabz.addressbook.model.AddressBook;
import com.bridgelabz.addressbook.service.AddressBookDao;

public class AddressBookDaoImpl implements AddressBookDao {

	JSONArray array=new JSONArray();
	String fileName;
	private static AddressBook obj;
	
	
	public static AddressBook setObj()
	{
		obj=new AddressBook();
		return obj;
			
	}
	
	@Override
	public void addRecord() throws Exception {
		AddressBook ob=setObj();
		System.out.println("Enter the First Name :");
		String first_name=Util.stringScanner();
		boolean b=false;
		try 
		{
			b=checkRecord(first_name);
		} 
		catch (IOException | ParseException | NullPointerException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(b==true)
			System.out.println("Record already exists!");
		else
		{
		ob.setFname(first_name);
		System.out.println("Enter the Last Name :");
		String last_name=Util.stringScanner();
		ob.setLname(last_name);
		System.out.println("Enter the Address");
		String addr=Util.stringScanner();
		ob.setAddress(addr);
		System.out.println("Enter the City :");
		String city_name=Util.stringScanner();
		ob.setCity(city_name);
		System.out.println("Enter the State :");
		String state_name=Util.stringScanner();
		ob.setState(state_name);
		System.out.println("Enter the Pin");
		int zip_code=Util.intScanner();
		ob.setZip(zip_code);
		System.out.println("Enter the Phone Number:");
		long phno=Util.longScanner();
		ob.setPhoneno(phno);
		
		JSONObject object=new JSONObject();
        object.put("firstname",ob.getFname());
        object.put("lastname",last_name);
        object.put("address",addr);
        object.put("city",city_name);
        object.put("state",state_name);
        object.put("zip",zip_code);
        object.put("Phone Number",phno);
        array.put(object);
        PrintWriter pw=new PrintWriter("AddressBook.json");
        pw.write(array.toString());
        pw.flush();
        pw.close();

		}
	}
    
    @Override
	public void deleteRecord(String fname) throws IOException, ParseException, JSONException {
		// TODO Auto-generated method stub
    	
    	FileReader fr=null;
		try
		{
		fr=new FileReader("AddressBook.json");
		JSONParser parser=new JSONParser();
		array=new JSONArray(parser.parse(fr).toString());
		
		
		for(int i=0;i<array.length();i++)
		{
			JSONObject ob=array.getJSONObject(i);
		    if(fname.equals(ob.getString("firstname")))
			array.remove(i);
		    
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
	public void updateRecord(String fname) throws JSONException, IOException, ParseException
	{
		FileReader fr=null;
		try
		{
		fr=new FileReader("AddressBook.json");
		JSONParser parser=new JSONParser();
		array=new JSONArray(parser.parse(fr).toString());
		boolean b=false;
		for(int i=0;i<array.length();i++)
		{
			JSONObject ob=array.getJSONObject(i);
		    if(fname.equals(ob.getString("firstname")))
		    {
		    	b=true;
				System.out.println("Enter the Last Name :");
				String last_name=Util.stringScanner();
				ob.put("lastname",last_name);
				System.out.println("Enter the Address");
				String addr=Util.stringScanner();
				ob.put("address", addr);
				System.out.println("Enter the City :");
				String city_name=Util.stringScanner();
				ob.put("city", city_name);
				System.out.println("Enter the State :");
				String state_name=Util.stringScanner();
				ob.put("state",state_name);
				System.out.println("Enter the Pin");
				int zip_code=Util.intScanner();
				ob.put("zip",zip_code);
				System.out.println("Enter the Phone Number:");
				long phno=Util.longScanner();
				ob.put("Phone Number",phno);
		        array.put(ob);
		        PrintWriter pw=new PrintWriter("AddressBook.json");
		        pw.write(array.toString());
		        pw.flush();
		        pw.close();	
		    }
		    if(b==true)
		    	break;
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
	public void printRecord() throws JSONException, IOException, ParseException 
	{
		
		FileReader fr=null;
		try
		{
		fr=new FileReader("AddressBook.json");
		JSONParser parser=new JSONParser();
		array=new JSONArray(parser.parse(fr).toString());
		
		for(int i=0;i<array.length();i++)
		{
			JSONObject ob=array.getJSONObject(i);
	        System.out.println(ob);
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
	public boolean checkRecord(String first_name) throws Exception  {
		boolean flag=false;
		FileReader fr=null;
		try
		{
		fr=new FileReader("AddressBook.json");
		JSONParser parser=new JSONParser();
		array=new JSONArray(parser.parse(fr).toString());
		
		for(int i=0;i<array.length();i++)
		{
			JSONObject ob=array.getJSONObject(i);
		if(first_name.equals(ob.getString("firstname")))
			flag=true;
		}
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception is thrown");
			flag=false;
		}
		finally
		{
			
			fr.close();
		}
		return flag;
		
	}

	

	@Override
	public boolean match(String fname)
	{
		boolean b=false;
	try
	{
		b=checkRecord(fname);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
		return b;
	}

	
	public void sorting() throws IOException, ParseException, JSONException {
		// TODO Auto-generated method stub
    	
    	FileReader fr=null;
    	JSONArray array1=new JSONArray();
		try
		{
		fr=new FileReader("AddressBook.json");
		JSONParser parser=new JSONParser();
		array=new JSONArray(parser.parse(fr).toString());
		
		LinkedList<String> l1=new LinkedList<String>();
		for(int i=0;i<array.length();i++)
		{
			JSONObject ob=array.getJSONObject(i);
		    l1.push(ob.getString("lastname"));
		}
		l1.sort(Comparator.comparing(e -> e));
		System.out.println(l1);
		for(String s:l1)
		{
			for(int i=0;i<array.length();i++)
			{
				JSONObject ob=array.getJSONObject(i);
			    if(s.equals(ob.getString("lastname")) )
			    {		
			    	array1.put(ob);
			    }
			}
		}
		  PrintWriter pw=new PrintWriter("Sorted.json");
	        pw.write(array1.toString());
	        pw.flush();
	        pw.close();
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
	
}
