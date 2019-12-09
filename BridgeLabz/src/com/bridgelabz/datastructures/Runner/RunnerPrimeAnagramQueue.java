package com.bridgelabz.datastructures.Runner;

import com.bridgelabz.datastructures.Impl.PrimeAnagram;
import com.bridgelabz.datastructures.Impl.Queue;

public class RunnerPrimeAnagramQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=PrimeAnagram.addPrimeAnagram();
		Queue<Integer> s=new Queue<Integer>();
		for(int i:arr)
		{
			if(i!=0)
			{
			s.enqueue((Integer)i);
			}
		}
		s.show();
		int length=s.size();
		int i=0;
		while(i<length)
		{
			Integer data=s.dequeue();
			if(data!=null)
			System.out.print((int)data+" ");
			length++;
		}
	}

}
