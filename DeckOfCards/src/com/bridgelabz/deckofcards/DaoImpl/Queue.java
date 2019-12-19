package com.bridgelabz.deckofcards.DaoImpl;


public class Queue<E> {
	public Node<E> head;
	public Node<E> rear;
	
	public Node<E> retHead()
	{
		Node<E> n=head;
		return n;
	}
	public void enqueue(E data)
	{
		  Node<E> node=new Node<E>();
		 node.data=data;
		  node.next=null;
		    if(head==null)
		   {
		     head=node;	
		     rear=node;
		   }
		else
		   {
		     Node<E> n=head;
		      while(n.next!=null)
		     {
			   n=n.next;
		     }
		     n.next=node;
		     rear=node;
		   }
		
		
	}
	public  int size()
	{
		Node<E> n=head;
		int i=1;
		if(head==null)
		{
			return 0;
		}
		else
		{
		while(n.next!=null)
		{
			n=n.next;
			++i;
		}
		return i;
		}
		
	}
	public void show()
	{
		 Node<E> n=head;
	     while(n.next!=null)
	    {
	    	 System.out.print(n.data+" ");
		   n=n.next;
	    }
	     System.out.println(n.data+" ");
	}
	
	public E dequeue()
	{
		if(isEmpty())
		{
			return null;
		}
		else
		if(head.next==null)
		{
			E data=head.data;
			head=null;
			return data;
		}
		else
		{
		Node<E> n=head;
        head=head.next;
        E data=(E) n.data;
	    n=null;
	    return data;
		}
	}
	public boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
	Node<E> n=head;
	String str="";
	while(n!=null) 
	{
	 str=str+n.data+" ";
	 n=n.next;
	  		
	} 
	 return str;
	 }
}
