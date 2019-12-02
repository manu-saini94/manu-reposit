package com.bridgelabz.algortihms;

import com.bridgelabz.utility.Util;

public class MergeSort {
	
	public static String[] mergeSort(String[] array) 
    { 
		String[] a= {};
        if(array == null) 
        { 
            return a; 
        } 
  
        if(array.length > 1) 
        { 
            int mid = array.length / 2; 
  
            // Split left part 
            String[] left = new String[mid]; 
            for(int i = 0; i < mid; i++) 
            { 
                left[i] = array[i]; 
            } 
              
            // Split right part 
            String[] right = new String[array.length - mid]; 
            for(int i = mid; i < array.length; i++) 
            { 
                right[i - mid] = array[i]; 
            } 
            mergeSort(left); 
            mergeSort(right); 
  
            int i = 0; 
            int j = 0; 
            int k = 0; 
  
            // Merge left and right arrays 
            while(i < left.length && j < right.length) 
            { 
            	int l=left[i].compareTo(right[j]);
                if(l<0) 
                { 
                    array[k] = left[i]; 
                    i++; 
                } 
                else
                { 
                    array[k] = right[j]; 
                    j++; 
                } 
                k++; 
            } 
            // Collect remaining elements 
            while(i < left.length) 
            { 
                array[k] = left[i]; 
                i++; 
                k++; 
            } 
            while(j < right.length) 
            { 
                array[k] = right[j]; 
                j++; 
                k++; 
            } 
        } 
  return array;
    } 
	
	
	public static void main(String[] args) {
		System.out.println("Enter the value of n : ");
		int n=Util.intScanner();
		System.out.println("Enter the elements of the array : ");
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Util.stringScanner();
		}
	        
	        System.out.println("Given array is"); 
	        for(int i=0; i<arr.length; i++) 
	            System.out.print(arr[i]+" "); 
	  
	        String[] arr_sort=mergeSort(arr); 
	  
	        System.out.println("\n"); 
	        System.out.println("Sorted array is"); 
	  
	        for(int i=0; i<arr_sort.length; i++) 
	            System.out.print(arr_sort[i]+" "); 	
	}
}
