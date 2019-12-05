package com.bridgelabz.datastructures.Runner;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.datastructures.Impl.OrderedList;
import com.bridgelabz.utility.Util;
import com.bridgelabz.utility.UtilDs;

public class RunnerOrderedList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OrderedList<Integer> list=new OrderedList<Integer>();
		File f=new File("D://numerics.txt");
		String s=UtilDs.readFile(f);
		String[] str=s.split(" ");
		int[] arr=new int[str.length];
		for(int j=0;j<str.length;j++)
		{
        arr[j]=Integer.parseInt(str[j]);
		}
		for(int j=0;j<arr.length;j++)
			System.out.print((int)arr[j]+" ");
			System.out.println();
		Arrays.sort(arr); 
		for(int j=0;j<arr.length;j++)
		{
			System.out.print((int)arr[j]+" ");
			list.add(arr[j]);
		}
		System.out.println();
		System.out.print("Enter the number :");
		int num=Util.intScanner();
		Integer I=new Integer(num);
		int x=list.index(I);

		if(x==-1)
		{
			System.out.println("Empty list");
			list.add(I);
			list.show();
		    UtilDs.writeFile(list);
		}
		else
			if(x==-2)
			{
				System.out.println("Element not found");
				list.add(I);
			    list.show();
			    UtilDs.writeFile(list);
			}
				else
				{
				System.out.println("Element present at "+x+" index");
				list.remove(I);
				list.show();
				
				}
		
		}
		}
	
      
	


