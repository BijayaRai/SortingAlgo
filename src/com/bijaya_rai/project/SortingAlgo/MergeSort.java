package com.bijaya_rai.project.SortingAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
	public static void main(String[] args) {
		//int is premitive datatype so Integer interface has to be used
		Integer[] number = { 5, 4, 3, 2, 1, 0 };
		mergeSort(number);
	}

	private static void mergeSort(Comparable[] numbersList) {
	
		int middle= numbersList.length/2;
		if(numbersList.length<=1)
		{
			System.out.println(Arrays.toString(numbersList));
			return;
		}
		
		List<Integer> leftFlank= new ArrayList<>();
		List<Integer> rightFlank= new ArrayList<>();
		
	}
}
