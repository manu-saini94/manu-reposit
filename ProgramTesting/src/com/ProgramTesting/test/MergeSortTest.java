package com.ProgramTesting.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.ProgramTesting.algortihms.MergeSort;

class MergeSortTest {

	@Test
	@DisplayName("Merge sort Testing")
	public void test() 
	{

		String[] arr= {"manu","hunny","sunny","jimmy","shanky"};
		String[] arr_sort= {"hunny","jimmy","manu","shanky","sunny"};
		String[] arr_new=MergeSort.mergeSort(arr);
		assertArrayEquals(arr_sort,arr_new);
	}

}
