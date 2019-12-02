package com.bridgelabz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.bridgelabz.algortihms.InsertionSort;


class InsertionSortTest {

	@Test
	@DisplayName("Testing Insertion Sort")
	public void test() 
	{
		String[] arr= {"manu","hunny","sunny","jimmy","shanky"};
		String[] arr_sort= {"hunny","jimmy","manu","shanky","sunny"};
		String[] arr_new=InsertionSort.sort(arr);
		assertArrayEquals(arr_sort,arr_new);
	
	}

}
