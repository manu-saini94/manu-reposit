package com.bridgelabz.structural.adapter;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AssignmentWork aw=new AssignmentWork();
Pen p=new PenAdapter();
aw.setP(p);
aw.writeAssignment("I'm a bit tired to write an assignment");
  }

}
