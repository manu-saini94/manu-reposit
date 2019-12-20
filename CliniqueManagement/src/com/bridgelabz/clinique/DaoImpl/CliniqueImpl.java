package com.bridgelabz.clinique.DaoImpl;

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

import com.bridgelabz.clinique.Dao.Clinique;
import com.bridgelabz.clinique.Utility.Util;
import com.bridgelabz.clinique.service.Doctor;
import com.bridgelabz.clinique.service.Patient;

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
	    String doc_name=Util.stringScanner();
		d.setDoc_name(doc_name);
		System.out.print("Enter the Doctor Id: ");
		String doc_id=Util.stringScanner();
		d.setDoc_id(doc_id);
		System.out.print("Enter the Doctor Specialization: ");
		String doc_spec=Util.stringScanner();
		d.setDoc_spec(doc_spec);
		System.out.print("Enter the Doctor Availability(AM/PM): ");
		String doc_avail=Util.stringScanner();
		d.setDoc_avail(doc_avail);
		
		JSONObject object=new JSONObject();
        object.put("doc name",d.getDoc_name());
        object.put("doc id",d.getDoc_id());
        object.put("doc spec",d.getDoc_spec());
        object.put("doc avail",d.getDoc_avail());
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
		    String pat_name=Util.stringScanner();
			p.setPat_name(pat_name);
			System.out.print("Enter the Patient Id: ");
			String pat_id=Util.stringScanner();
			p.setPat_id(pat_id);
			System.out.print("Enter the Patient Mobile No: ");
			String pat_mob=Util.stringScanner();
			p.setPat_mob(pat_mob);
			System.out.print("Enter the Patient age: ");
			String pat_age=Util.stringScanner();
			p.setPat_age(pat_age);
			
			JSONObject object=new JSONObject();
	        object.put("pat name",p.getPat_name());
	        object.put("pat id",p.getPat_id());
	        object.put("pat mob",p.getPat_mob());
	        object.put("pat age",p.getPat_age());
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
