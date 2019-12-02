package com.bridgelabz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.bridgelabz.algortihms.BubbleSort;

class BubbleSortTest {

	@Test
	@DisplayName("Sorting Test")
	public void test() {
		int[] arr= {2,6,4,1,3};
		int[] arr_sort= {1,2,3,4,6};
		assertArrayEquals(arr_sort,BubbleSort.sort(arr));
	}

}
