package com.bridgelabz.datastructures.Runner;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;


import com.bridgelabz.datastructures.Impl.OrderedList;
import com.bridgelabz.utility.Util;
import com.bridgelabz.utility.UtilDs;

public class RunnerHashingFunction {
	
	public static LinkedHashMap<Integer,OrderedList<Integer>> evalagain(LinkedHashMap<Integer,OrderedList<Integer>> map,int data)
	{		
		    Integer rem=data%11;
			map.get(rem).add(data);
			map.put(rem,map.get(rem));		
			
		return map;
	}
	
	public static LinkedHashMap<Integer,OrderedList<Integer>> evaluate(int[] arr2)
	{
		LinkedHashMap<Integer,OrderedList<Integer>> map1=new LinkedHashMap<Integer,OrderedList<Integer>>();
		OrderedList<Integer> list0=new OrderedList<Integer>(); 
		OrderedList<Integer> list1=new OrderedList<Integer>(); 
		OrderedList<Integer> list2=new OrderedList<Integer>(); 
		OrderedList<Integer> list3=new OrderedList<Integer>(); 
		OrderedList<Integer> list4=new OrderedList<Integer>(); 
		OrderedList<Integer> list5=new OrderedList<Integer>(); 
		OrderedList<Integer> list6=new OrderedList<Integer>(); 
		OrderedList<Integer> list7=new OrderedList<Integer>(); 
		OrderedList<Integer> list8=new OrderedList<Integer>(); 
		OrderedList<Integer> list9=new OrderedList<Integer>(); 
		OrderedList<Integer> list10=new OrderedList<Integer>(); 

		map1.put(0,list0);
		map1.put(1,list1);
		map1.put(2,list2);
		map1.put(3,list3);
		map1.put(4,list4);
		map1.put(5,list5);
		map1.put(6,list6);
		map1.put(7,list7);
		map1.put(8,list8);
		map1.put(9,list9);
		map1.put(10,list10);
		
		for(int k=0;k<arr2.length;k++)
		{
			Integer rem=arr2[k]%11;
			if(rem==0)
			{
				list0.add(arr2[k]);
			    map1.put(rem,list0);
			}
			else
			if(rem==1)
			{
				list1.add(arr2[k]);
				map1.put(rem,list1);
			}
			else
			if(rem==2)
			{
				list2.add(arr2[k]);
				map1.put(rem,list2);
			}
			else
			if(rem==3)
			{
				list3.add(arr2[k]);
				map1.put(rem,list3);
			}
			else
			if(rem==4)
			{
				list4.add(arr2[k]);
				map1.put(rem,list4);
			}
			else
			if(rem==5)
			{
				list5.add(arr2[k]);
				map1.put(rem,list5);
			}
			else
			if(rem==6)
			{
				list6.add(arr2[k]);
				map1.put(rem,list6);
			}
			else
			if(rem==7)
			{
				list7.add(arr2[k]);
				map1.put(rem,list7);
			}
			else
			if(rem==8)
			{
				list8.add(arr2[k]);
				map1.put(rem,list8);
			}
			else
			if(rem==9)
			{
				list9.add(arr2[k]);
				map1.put(rem,list9);
			}
			else
			if(rem==10)
			{
				list10.add(arr2[k]);
				map1.put(rem,list10);
			}
			
			}
		return map1;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	

	
	File f=new File("D://hashingnums.txt");	
	String str=UtilDs.readFile(f);
	String[] arr1=str.split(" ");
	int[] arr2=new int[arr1.length];
	int i=0;
	for(String s:arr1)
	{
	arr2[i]=Integer.parseInt(s);	
	i++;
	}
	
	for(int j=0;j<arr2.length;j++)
	{
		System.out.print(arr2[j]+" ");
	}
	System.out.println();
	
	LinkedHashMap<Integer,OrderedList<Integer>> map=new LinkedHashMap<Integer,OrderedList<Integer>>();
	map=evaluate(arr2);
	
	for(int m=0;m<11;m++)
	{map.get(m).show();
	System.out.println();
	}
	LinkedHashMap<Integer,OrderedList<Integer>> map2=new LinkedHashMap<Integer,OrderedList<Integer>>();

	System.out.print("Enter the number to be searched : ");
	int data=Util.intScanner();
	boolean b=false;
	int p=0;
	for(p=0;p<11;p++)
	{
	b=map.get(p).search(data);
	if(b==true)
		break;
	}
	if(b==true)
	{
	map.get(p).remove(data);
	}
	else
	{
	map2=evalagain(map,data);
	}
	
	for(int m=0;m<11;m++)
	{map.get(m).show();
	System.out.println();
	}
	
	UtilDs.writeFile(map2);
	}

}
