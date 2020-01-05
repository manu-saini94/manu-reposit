package com.bridgelabz.stockaccount.service;

public class Stack<E> {
	
	public Node<E> head;
	public Node<E> top;
	
	
	public void push(E data)
	{
	  Node<E> node=new Node<E>();
	  node.data=data;
	  node.next=null;
	    if(head==null)
	   {
	     head=node;	
	     top=node;
	   }
	   else
	   {
	     Node n=head;
	     while(n.next!=null)
	     {
		   n=n.next;
	     }
	     n.next=node;
	     top=node;
	   }
	}

	public void show()
	{
		 Node n=head;
	     while(n.next!=null)
	    {
	    	 System.out.print(n.data+" ");
		   n=n.next;
	    }
	     System.out.println(n.data+" ");
	}

	public  int size()
	{
		Node<E> n=head;
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
	public E popChar()
	{
		
	if(isEmpty())
	{
		Character c=Character.valueOf('\u0000');
		return (E)c;
	}
	else if(size()==1)
	{
		head=null;
		 E data=top.data;
		top=null;
		return data;
	}
	else
	{
		Node n=head;
		Node n1=top;
		  while(n.next!=top)
		    {
			   n=n.next;
		    }
		  E data=top.data;
	n.next=null;
	top=n;
	//System.out.println(n1.data+" is poped");
	n1=null;
	return data;
	}
	}
	
	public boolean isEmpty()
	{
		if(head==null)
			return true;
		else
			return false;
		
	}
	
	public String peek()
	{
		return (String)top.data;
	}
	
	public E pop()
	{
		
	if(isEmpty())
	{
		return null;
	}
	else if(size()==1)
	{
		head=null;
		 E data=top.data;
		top=null;
		return data;
	}
	else
	{
		Node n=head;
		Node n1=top;
		  while(n.next!=top)
		    {
			   n=n.next;
		    }
		  E data=top.data;
	n.next=null;
	top=n;
	//System.out.println(n1.data+" is poped");
	n1=null;
	return data;
	}
	}
	
}
