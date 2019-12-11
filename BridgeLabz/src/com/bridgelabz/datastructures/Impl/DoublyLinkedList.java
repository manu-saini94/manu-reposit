package com.bridgelabz.datastructures.Impl;

public class DoublyLinkedList<E> {
	Node<E> head;
	Node<E> tail;
	
	public void insertAtStart(E data)
	{
		Node<E> node=new Node<E>();
		node.data=data;
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
	public boolean isEmpty()
	{
		if(head==null)
			return true;
		else
			return false;
		
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
	public void displayBackward()
	{
		if(isEmpty())
		{
			System.out.println("List is Empty");
			return;
		}
		else
		{
			Node<E> n=tail;
			while(n.prev!=null)
			{
				System.out.print(n.data+" ");
				n=n.prev;
			}
			System.out.print(n.data+" ");
		}
	}
	public void insertAtEnd(E data)
	{
		Node<E> node=new Node<E>();
		node.data=data;
		if(isEmpty())
		{
			head=node;
		}
		else
		{
			tail.next=node;
		}
		node.prev=tail;
	    tail=node;
	}
	
	public void insertAt(int index,E data)
	{
		Node<E> node=new Node<E>();
		node.data=data;
		if(index==0)
		{
		tail=node;
		head=node;
		}
		else
		{
			Node<E> n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			Node<E> y=n.next;
			node.prev=n;
			n.next=node;
			node.next=y;
			y.prev=node;
			System.out.println(node.next.data);
			System.out.println(node.prev.data);
			
		}
	}
	public void deleteAt(int index)
	{
		if(index==0)
		{
			Node<E> n=head;
			head=head.next;
		System.out.println(n.data+" is deleted");
		}
		else
		{
			Node<E> n=head;
			for(int i=0;i<index;i++)
			{
				n=n.next;
			}
			Node<E> x=n.prev;
			Node<E> y=n.next;
			x.next=y;
			y.prev=x;
			System.out.println(n.data+" is deleted");
		n=null;
		}
	}
	
	public void reverse()
	{
		Node<E> temp=head;
		temp.prev=tail;
	
		while(temp.next!=head) {
			temp=temp.next;
		}
		head=temp;
		Node<E> curr=head;
		Node<E> prev=head;
        while(curr.prev!=head){
			curr=curr.prev;
		}
		tail=curr;
	}
	
	public E deleteAtStart()
	{
	if(isEmpty())
	{
	return null;	
	}
	else
	{
		Node x=head;
		E data=head.data;
		Node<E> n=head.next;
		x=null;
		head=n;
		return (E)data;
	}
	}
	
	public E deleteAtEnd()
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
	}

