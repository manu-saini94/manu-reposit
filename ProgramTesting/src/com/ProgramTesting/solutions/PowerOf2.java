package com.ProgramTesting.solutions;

public class PowerOf2 {

	public static int[] powersOf2(int n) {

		int i = 1;
		int x = 0;
		int[] arr = {};

		if (n > 0 && n < 32) {
			int[] table = new int[n];
			while (i <= n) {
				table[x] = (int) Math.pow(2, i);
				++i;
				++x;
			}
			return table;
		} else
			return arr;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

		int[] powerarray = {};
		if (n > 0 && n < 32) {
			powerarray = powersOf2(n);
			for (int arr : powerarray) {
				System.out.print(arr + " ");
			}
		} else {
			powerarray = powersOf2(n);
			System.out.println("Number entered is negative or 0 ");
		}
	}
}
