package com.bridgelabz.datastructures.Impl;



public class UnorderedList<E> {
	public Node<E> head;
	public  Node<E> last;
	public  Node<E> prev;
	
		
		public Node<E> returnHead()
		{
			return head;
		}
		//add()-for adding a new item in the list.
		public void add(E data)
		{
			Node<E> node=new Node<E>();
		    node.data=data;
			if(isEmpty())
			{
			node.next=null;
			head=node;
			}
			else
			{
			Node<E> n=head;
			while(n.next!=null)
			{
			n=n.next;
			}
			n.next=node;
		    last=node;
			}
			
		}
		
		//search()
		public  boolean search(E data)
		{
			Node<E> n=head;
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
		public  boolean isEmpty()
		{
		  if(head==null)
		  {
		  return true;   
		  }
		  else
	      return false;
		}
		
		//size()
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
		
		//append()
		public void append(E data) 
		{
			Node<E> node=new Node<E>();
		    node.data=data;
			if(isEmpty())
			{
			node.next=null;
			head=node;
			}
			else
			{
			Node<E> n=head;
			while(n.next!=null)
			{
			n=n.next;
			}
			n.next=node;
		    last=node;
			}	
		}
		
		//remove()
		public void remove(String data)
		{
			boolean flag=false;
			Node<E> n=head;
			if(isEmpty())
			{
			System.out.println("List is empty!!!");
			flag=true;
			}
			else
		    if(head.next==null && head.data==data)
			{
		    	System.out.println(data+" is deleted");	  
		    	head=null;
		    	flag=true;
			}
		    else
		    {
		    	
			 for(int i=0;i<size();i++)
			 {
				 if(n.data.equals(data))
				 {
					 if(n==head)
					 {
						 Node<E> x=n.next;
						 System.out.println(n.data+" is deleted");					
	     				 n=null;
						 flag=true;
						 head=x;
					 }
					 else
						 if(n==last)
						 {
							 prev.next=null;
							 last=prev;
							 System.out.println(n.data+" is deleted");
							 n=null;
							 flag=true;
						 }
						 else
						 {
					 System.out.println(data+" is deleted");
					 prev.next=n.next;
					 n=null;
					 flag=true;
				 }
				 }
				 if(flag==true)
					 break;
				 if(n!=null)
				 {
				 prev=n;
				 n=n.next;
				 }
				 if(flag==true)
			     break;
			   }
			 }
			}
		
		//index()
		public int index(String data)
		{
			Node<E> n=head;
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
		public void insert(int pos,E data)
		{
			Node<E> node =new Node<E>();
			node.data=data;
			if(isEmpty())
			{
			System.out.println("List is Empty");
			}
			else
			{
				Node<E> n=head;
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
		
		
		//pop()
		public E pop()
		{
			Node<E> n=head;
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
				E s=last.data;
				last=null;
				last=n;
				return s;
			}
		}
		
		//pop(pos)
		public E pop(int pos)
		{
			if(isEmpty())
			{
			System.out.println("List is Empty");
			return null;
			}
			else
			{
			Node<E> n=head;
			int i=0;
			while(i<pos)
			{
				prev=n;
				n=n.next;
				++i;
			}
			prev.next=n.next;
			E s=n.data;
			n=null;
			return s;
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
			System.out.print(n.data);
			
		}
}
