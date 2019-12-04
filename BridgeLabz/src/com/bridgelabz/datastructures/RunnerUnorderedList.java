package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.utility.Util;
import com.bridgelabz.utility.UtilDs;

public class RunnerUnorderedList {

	public static void main(String[] args) throws IOException {
		
		
		File f=new File("D://myfile.txt");
		String[] str=new String[100];
		str=UtilDs.readFile(f);
		
		for(String s:str)
		{
			if(s!=null)
			{
		    String[] str_new=s.split(" ");
		      for(String m:str_new)
		      {
		       UtilDs.add(m);
		      }
		    }
		}
		UtilDs.show();
	    UtilDs.writeFile();
	    System.out.println();
		System.out.print("Enter the item to be searched : ");
		String val=Util.stringScanner();
		System.out.println(val);
		int x=UtilDs.index(val);
		
		if(x==-1)
		{
			System.out.println("Empty list");
			UtilDs.add(val);
			UtilDs.show();
		    UtilDs.writeFile();
		}
		else
			if(x==-2)
			{
				System.out.println("Element not found");
				UtilDs.add(val);
				UtilDs.show();
			    UtilDs.writeFile();
			}
				else
				{
				System.out.println("Element present at "+x+" index");
				UtilDs.remove(val);
				UtilDs.show();
				
				}
		
		
	}

}
