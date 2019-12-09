package com.bridgelabz.datastructures.Runner;

import com.bridgelabz.datastructures.Impl.PrimeAnagram;
import com.bridgelabz.datastructures.Impl.Stack;

public class RunnerPrimeAnagramStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr=PrimeAnagram.addPrimeAnagram();
	Stack<Integer> s=new Stack<Integer>();
	for(int i:arr)
	{
		if(i!=0)
		{
		s.push((Integer)i);
		}
	}
	s.show();
	int length=s.size();
	while(length!=0)
	{
		Integer data=s.pop();
		System.out.print((int)data+" ");
		length=s.size();
	}
   
}
}