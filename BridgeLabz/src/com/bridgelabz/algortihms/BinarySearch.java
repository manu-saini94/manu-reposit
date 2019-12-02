package com.bridgelabz.algortihms;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	
	public static int binarysearch(String[] arr,int l,int r,String  x)
	{
	    int mid=0;
		if(r>=l)
	    mid=l+(r-l)/2;
		
		if(arr[mid].equals(x))
		return mid;
		
		int j=arr[mid].compareTo(x);
		if(j>0)
		return binarysearch(arr,l,mid-1,x);
		if(j<0)
		return binarysearch(arr,mid+1,r,x);
	
		return -1;
    }

	public static void main(String[] args) throws IOException {
File f=new File("D://Binary.txt");
FileReader fr=new FileReader(f);
BufferedReader br=new BufferedReader(fr);
String str=br.readLine();
System.out.println(str);
String[] arr=new String[6];
arr=str.split(",");
for(String a:arr)
{
	System.out.println(a+" ");
}
System.out.print("Enter the element  to be searched : ");
Scanner sc=new Scanner(System.in);
String s=sc.next();
Arrays.sort(arr);
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);

}
int n=arr.length;
int index=binarysearch(arr,0,n-1,s);
if(index==-1)
{
	System.out.println("Element not present");
}
else
{
	System.out.println("Element found at : "+index);
}
	}

}
