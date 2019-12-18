package com.bridgelabz.deckofcards.Runner;

import com.bridgelabz.deckofcards.DaoImpl.DaoImpl;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

DaoImpl obj=new DaoImpl();
String[] deck=obj.addCards();
for(String s:deck)
	System.out.print(s+" ");
System.out.println();
obj.distribute(deck);



	}

}
