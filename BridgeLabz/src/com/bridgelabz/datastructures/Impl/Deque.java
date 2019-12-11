package com.bridgelabz.datastructures.Impl;



public class Deque<E> {

	public Node<E> head;
	public Node<E> tail;
	public  void addFront(E data)
	{
		Node<E> node=new Node<E>();
		node.data=data;
		node.next=null;
		if(isEmpty())
		{
			tail=node;
		}
		else
		{
			head.prev=node;
		}
		node.next=head;
		head=node;	
	}
	
    public  void addRear(E data)
    {
    	Node<E> node=new Node<E>();
		node.data=data;
		node.next=null;
		
		if(isEmpty())
		{
			head=node;
			tail=node;
			node.prev=null;
		}
		else
		{
			tail.next=node;
		node.prev=tail;
	    tail=node;
		}
    }
    
    public E removeFront()
    {
    	if(isEmpty())
    	{
    	return null;	
    	}
    	else
    	{
    		Node<E> x=head;
    		E data=x.data;
    		Node<E> n=head.next;
    		x=null;
    		head=n;
    		return (E)data;
    	}	
    }
    
    public E removeRear()
    {
    	if(isEmpty())
		{
		return null;	
		}	
		else
		{
		Node<E> y=tail;
		Node<E> x=y.prev;
		E data =tail.data;
		x.next=null;
		y=null;
		tail=x;
		return data;
		}	
    }

    public int size()
    {
    	Node<E> n=head;
    	if(isEmpty())
    	{
    		return 0;
    	}
    	else
    	{
    		int i=1;
    	while(n.next!=null)
    	{
    		n=n.next;
    		++i;
    	}
    	return i;
    	}
    }
    public void displayForward()
	{
		if(isEmpty())
		{
			System.out.println("List is Empty");
			return;
		}
		else
		{
		Node<E> n=head;
		while(n.next!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.print(n.data+" ");
	    }
    }
    
    public void reverse()
    {
    Node<E> previous=null;
    Node<E> current=head;
    Node<E> ahead=null;
    while(current!=null)
    {
    	ahead=current.next;
    	current.next=previous;
    	current.prev=ahead;
    	previous=current;
    	current=ahead;
    	}
    head=previous;
    }
    
    
    public boolean isEmpty()
    {
    	if(head==null)
			return true;
		else
			return false;
    }

    public boolean checkPalindrome()
    {
    Node<E> x=tail;
    Node<E> n=head;
    String[] arr1=new String[size()];
    String[] arr2=new String[size()];
    boolean flag=false;
    int i=0;
    while(n!=null)
    {
    arr1[i]=(String)n.data;
    n=n.next;
    i++;
    }
    reverse();
    int j=0;
    Node<E> y=head;
    while(y!=null)
    {
    	arr2[j]=(String)y.data;
    	y=y.next;
    	j++;
    } 
    
    for(int k=0;k<arr1.length;k++)
    {
    	if(arr1[k]==arr2[k])
    		flag=true;
    	
    }
    return flag;
    }
}
