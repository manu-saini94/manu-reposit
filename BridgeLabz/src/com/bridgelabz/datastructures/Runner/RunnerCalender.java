package com.bridgelabz.datastructures.Runner;

import com.bridgelabz.datastructures.Impl.Calender;
import com.bridgelabz.solutions.LeapYear;

public class RunnerCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int m=Integer.parseInt(args[0]);
   int y=Integer.parseInt(args[1]);
   LeapYear ob=new LeapYear();
   Calender.monthCalender(m,y,ob);
	
	}

}
