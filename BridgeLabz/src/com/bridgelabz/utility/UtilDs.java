package com.bridgelabz.utility;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.datastructures.Impl.OrderedList;
import com.bridgelabz.datastructures.Impl.UnorderedList;
import com.bridgelabz.datastructures.Impl.Node;

public class UtilDs {

		public static String readFile(File f) throws IOException
		{
			
			FileReader fr=new FileReader(f);
		    BufferedReader br=new BufferedReader(fr);
		    String str1="";
		    String line = null;
		    int i=0;
		    while((line =br.readLine())!=null)
		    {
		     str1=str1+line;
		     i++;
		    }
		    br.close();
			return str1;
		}

		public static void writeFile(UnorderedList list) throws IOException
		{
			Node<String> head=list.head;
			Node<String> n=head;
			File f=new File("D://mynewfile.txt");
		    FileWriter fr=new FileWriter(f);
		    BufferedWriter br=new BufferedWriter(fr);
			while(n.next!=null)
			{
				
				br.write(n.data+" ");
				n=n.next;
			}
			br.write(n.data);
		    br.close();
		}
		public static void writeFile(OrderedList list) throws IOException
		{
			//Node<Integer> head=list.returnHead();
			Node<Integer> n=list.head;
			File f=new File("D://newnumeric.txt");
			FileWriter fr=new FileWriter(f);
			BufferedWriter br=new BufferedWriter(fr);
			while(n.next!=null)
			{
				br.write(n.data+" ");
				n=n.next;
			}
			br.write(n.data);
			br.close();
			
		}

		
}
