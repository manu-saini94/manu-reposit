package com.bridgelabz.datastructures.Runner;



import java.io.File;
import java.io.IOException;

import com.bridgelabz.datastructures.Impl.UnorderedList;
import com.bridgelabz.utility.Util;
import com.bridgelabz.utility.UtilDs;

public class RunnerUnorderedList extends UnorderedList {

	public static void main(String[] args) throws IOException {
		
		UnorderedList<String> list=new UnorderedList<String>();
		File f=new File("D://myfile.txt");
		
		String arr=UtilDs.readFile(f);
		    String[] str_new=arr.split(" ");
		      for(String m:str_new)
		      {
		       list.add(m);
		      }
		 
		list.show();
	    UtilDs.writeFile(list);
	    System.out.println();
		System.out.print("Enter the item to be searched : ");
		String val=Util.stringScanner();
		System.out.println(val);
		int x=list.index(val);
		
		if(x==-1)
		{
			System.out.println("Empty list");
			list.add(val);
			list.show();
		    UtilDs.writeFile(list);
		}
		else
			if(x==-2)
			{
				System.out.println("Element not found");
				list.add(val);
			    list.show();
			    UtilDs.writeFile(list);
			}
				else
				{
				System.out.println("Element present at "+x+" index");
				list.remove(val);
				list.show();
				
				}
		
		
	}

}
