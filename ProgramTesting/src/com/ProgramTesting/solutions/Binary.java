package com.ProgramTesting.solutions;


import com.ProgramTesting.utility.BinaryUtil;

class Binary
{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		System.out.println("The number is : "+a);
		int[] x=BinaryUtil.toBinary(a);
		
		System.out.print("The Binary of the Number is : ");
		for(int h:x)
		{
			System.out.print(h);
		}
		int[] y=BinaryUtil.swap(x);
		System.out.println();
		System.out.print("The swapped nibbles array is : ");
		for(int z:y)
		{
			System.out.print(z);
		}
		int num=BinaryUtil.swappedDecimal(y);
		System.out.println();
		System.out.print("The swapped decimal is : "+num);
		boolean b=BinaryUtil.isPowerOf2(num);
		System.out.println();
		if(b==true)
		{
			System.out.println("The decimal no. is a power of 2");
		}
		else
		{
			System.out.println("The decimal no. is not a power of 2");
		}
	}
}

