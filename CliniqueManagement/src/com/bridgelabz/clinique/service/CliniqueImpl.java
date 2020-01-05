package com.bridgelabz.clinique.service;

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

import com.bridgelabz.clinique.Utility.Util;
import com.bridgelabz.clinique.model.Doctor;
import com.bridgelabz.clinique.model.Patient;
import com.bridgelabz.clinique.service.Clinique;

public class CliniqueImpl implements Clinique {
	
	
	JSONArray array=new JSONArray();
	
	@Override
	public void addDoctors(File f) throws IOException, JSONException {
		// TODO Auto-generated method stub
		Doctor d=new Doctor();
		
	System.out.println("Enter the number of doctors you wish to enter");
	int n=Util.intScanner();
	for(int i=0;i<n;i++)
	{
		System.out.print("Enter the Doctor Name: ");
	    String docname=Util.stringScanner();
		d.setDocname(docname);
		System.out.print("Enter the Doctor Id: ");
		String docid=Util.stringScanner();
		d.setDocid(docid);
		System.out.print("Enter the Doctor Specialization: ");
		String docspec=Util.stringScanner();
		d.setDocspec(docspec);
		System.out.print("Enter the Doctor Availability(AM/PM): ");
		String docavail=Util.stringScanner();
		d.setDocavail(docavail);
		
		JSONObject object=new JSONObject();
        object.put("doc name",d.getDocname());
        object.put("doc id",d.getDocid());
        object.put("doc spec",d.getDocspec());
        object.put("doc avail",d.getDocavail());
        array.put(object);
	}
     PrintWriter pw=new PrintWriter(f);
     pw.write(array.toString());
     pw.flush();
     pw.close();
	
	}

	@Override
	public void addPatients(File f) throws IOException, JSONException {
		// TODO Auto-generated method stub
		Patient p=new Patient();
		System.out.println("Enter the number of patients you wish to enter");
		int n=Util.intScanner();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the Patient Name: ");
		    String patname=Util.stringScanner();
			p.setPatname(patname);
			System.out.print("Enter the Patient Id: ");
			String patid=Util.stringScanner();
			p.setPatid(patid);
			System.out.print("Enter the Patient Mobile No: ");
			String patmob=Util.stringScanner();
			p.setPatmob(patmob);
			System.out.print("Enter the Patient age: ");
			String patage=Util.stringScanner();
			p.setPatage(patage);
			
			JSONObject object=new JSONObject();
	        object.put("pat name",p.getPatname());
	        object.put("pat id",p.getPatid());
	        object.put("pat mob",p.getPatmob());
	        object.put("pat age",p.getPatage());
	        array.put(object);
		}
	     PrintWriter pw=new PrintWriter(f);
	     pw.write(array.toString());
	     pw.flush();
	     pw.close();
	}

	@Override
	public void bookAppointment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchDoctor(String data,File f) throws JSONException, IOException, ParseException {
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
	        if(ob.get("doc name").equals(data) || ob.get("doc id").equals(data) || ob.get("doc spec").equals(data) || ob.get("doc avail").equals(data))
	        {
	        	System.out.println("Name: "+ob.get("doc name"));
	        	System.out.println("Id :"+ob.get("doc id"));
	        	System.out.println("Spec. :"+ob.get("doc "));
	        	System.out.println("Avail :"+ob.get("doc avail"));
	        }
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
	public void searchPatient(String data,File f) throws JSONException, IOException, ParseException {
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
	        if(ob.get("pat name").equals(data) || ob.get("pat id").equals(data) || ob.get("pat mob").equals(data) || ob.get("pat age").equals(data))
	        {
	        	System.out.println("Name: "+ob.get("pat name"));
	        	System.out.println("Id :"+ob.get("pat id"));
	        	System.out.println("Mob no. :"+ob.get("pat mob"));
	        	System.out.println("Age :"+ob.get("pat age"));
	        }
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
	
	public void createFile(String file) throws IOException
	{
		File f=new File(file);
		FileWriter fr=new FileWriter(f);
		fr.write("[]");
		fr.flush();
		fr.close();
	}

}
