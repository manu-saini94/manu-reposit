package com.bridgelabz.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
private List<String> emplist;
public Employees()
{
emplist=new ArrayList<String>();
}
public Employees(List<String> list)
{
	this.emplist=list;
}
public void loadData()
{
	emplist.add("Pankaj");
	emplist.add("Raj");
	emplist.add("David");
	emplist.add("Lisa");
}
public List<String> getEmpList()
{
	return emplist;
}
public Object clone()
{
	List<String> temp=new ArrayList<String>();
	for(String s:this.getEmpList())
	{
		temp.add(s);
	}
	return new Employees(temp);
	}
}
