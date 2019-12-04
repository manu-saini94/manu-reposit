package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.datastructures.Node;

public class UtilDs {

	static Node head;
	static Node last;
	static Node prev;
		
		
		//add()-for adding a new item in the list.
		public static void add(String data)
		{
			Node node=new Node();
		    node.data=data;
			if(isEmpty())
			{
			node.next=null;
			head=node;
			}
			else
			{
			Node n=head;
			while(n.next!=null)
			{
			n=n.next;
			}
			n.next=node;
		    last=node;
			}
			
		}
		
		//search()
		public static  boolean search(String data)
		{
			Node n=head;
			int i=0;
			if(isEmpty())
			{
			System.out.println("List is empty!!!");
			return false;
			}
			else
			{
				boolean flag=false;
				while(n.next!=null)
				{
					if(n.data==data)
					{
					System.out.println("Found at "+i+" index");
					flag=true;
					}
					else
					i++;
					if(flag==true)
						break;
					n=n.next;
				}
				return flag;
				
			}
		
		}
		
		//isEmpty()
		public static boolean isEmpty()
		{
		  if(head==null)
		  {
		  return true;   
		  }
		  else
	      return false;
		}
		
		//size()
		public static int size()
		{
			Node n=head;
			int i=0;
			if(head==null)
			{
				return 0;
			}
			else
			{
			while(n.next!=null)
			{
				i++;
				n=n.next;
			}
			return i+1;
			}
			
		}
		
		//append()
		public static void append(String data) 
		{
			Node node=new Node();
		    node.data=data;
			if(isEmpty())
			{
			node.next=null;
			head=node;
			}
			else
			{
			Node n=head;
			while(n.next!=null)
			{
			n=n.next;
			}
			n.next=node;
		    last=node;
			}	
		}
		
		//remove()
		public static  void remove(String data)
		{
			Node n=head;
			if(isEmpty())
			{
			System.out.println("List is empty!!!");
			}
			else
		    if(head.next==null && head.data==data)
			{
		    	System.out.println(data+" is deleted");
		    	head=null;
			}
		    else
		    {
			 for(int i=0;i<size();i++)
			 {
				 if(n.data.equals(data))
				 {
					 if(n==head)
					 {
						 Node x=n.next;
						 System.out.println(n.data+" is deleted");
						 n=null;
						 head=x;
					 }
					 else
						 if(n==last)
						 {
							 prev.next=null;
							 last=prev;
							 System.out.println(n.data+" is deleted");
							 n=null;
						 }
						 else
						 {
					 System.out.println(data+" is deleted");
					 prev.next=n.next;
					 n=null;
				 }
				 }
				 prev=n;
				 n=n.next;	 
				 
			 }
			
			}
			}
		
		//index()
		public static  int index(String data)
		{
			Node n=head;
			int i=0;
			int j=0;
			if(isEmpty())
			{
			System.out.println("List is empty!!!");
			return -1;
			}
			else
			{
				while(n.next!=null)
				{
	             if(n.data.equals(data))
		            break;
	            	 i++;
					n=n.next;
				}
			if(i==size()-1)
			    j=-2;
				else
				j=i;
			return j;
		}
		}
		//insert()
		public static  void insert(int pos,String data)
		{
			Node node =new Node();
			node.data=data;
			if(isEmpty())
			{
			System.out.println("List is Empty");
			}
			else
			{
				Node n=head;
				int i=0;
				while(i<pos)
				{
					prev=n;
					n=n.next;
					++i;
				}
				prev.next=node;
				node.next=n;
			}
		}
		
		
		public static int index1(String data)
		{
			Node temp=head;
			int len=size();
			for(int i=0;i<len;i++)
			{
				if(temp.data.equals(data))
				{
					return i;
				}
				temp=temp.next;
				
			}
			return 0;		
		}
		//pop()
		public static String pop()
		{
			Node n=head;
			if(isEmpty())
			{
				System.out.println("List is Empty!!!");
				return null;
			}
			else
			{
				while(n.next!=last)
				{
					n=n.next;
				}
				n.next=null;
				System.out.println(last.data+" is deleted");
				String s=last.data;
				last=null;
				last=n;
				return s;
			}
		}
		
		//pop(pos)
		public static String pop(int pos)
		{
			if(isEmpty())
			{
			System.out.println("List is Empty");
			return null;
			}
			else
			{
			Node n=head;
			int i=0;
			while(i<pos)
			{
				prev=n;
				n=n.next;
				++i;
			}
			prev.next=n.next;
			String s=n.data;
			n=null;
			return s;
			}
		}
		
		public static void show()
		{
			
			Node n=head;
			while(n.next!=null)
			{
				System.out.print(n.data+" ");
			n=n.next;
			}
			System.out.print(n.data);
			
		}
		
		public static String[] readFile(File f) throws IOException
		{
			
		FileReader fr=new FileReader(f);
	    BufferedReader br=new BufferedReader(fr);
	    String[] str=new String[100];
	    String line = null;
	    int i=0;
	    while((line =br.readLine())!=null)
	    {
	     str[i]=line;
	     i++;
	    }
	    br.close();
		return str;
		}

		public static void writeFile() throws IOException
		{
			File f=new File("D://mynewfile.txt");
		    FileWriter fr=new FileWriter(f);
		    BufferedWriter br=new BufferedWriter(fr);
			Node n=head;
			while(n.next!=null)
			{
				
				br.write(n.data+" ");
				n=n.next;
			}
			br.write(n.data);
		    br.close();
		}
}
