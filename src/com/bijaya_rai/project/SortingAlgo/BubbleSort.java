package com.bijaya_rai.project.SortingAlgo;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] number = { 5, 4, 3, 2, 1, 0 };
		BubbleSort bs= new BubbleSort();
		bs.bubbleSortWithWhileLoop(number);
		bs.bubbleSort(number);

	}

	private  void bubbleSort(int[] number) {
		int[] numToSort = number;
		int temp = 0;
		int length = numToSort.length;

		if (length >= 2) {
			for (int i = length; i > 0; i--) {
				for (int j = 1; j < i; j++) {
					if (numToSort[j - 1] > numToSort[j]) {
						temp = numToSort[j - 1];
						numToSort[j - 1] = numToSort[j];
						numToSort[j] = temp;
					}
				}
			}
			System.out.println("Bubble 1 FinalVal:" + Arrays.toString(numToSort));
		}else{
			System.out.println("Only 1 val:" + Arrays.toString(numToSort));
		}
	}

	private  void bubbleSortWithWhileLoop(int[] numList) {
		int[] numToSort = numList;
		boolean flag = true;
		int temp = 0;
		int length = numToSort.length;
		int j = 0;
	
		if (length >= 2) {
			while (flag) {
			
				flag = false;
				for (int i = 1; i < length; i++) {
					if (numToSort[i - 1] > numToSort[i]) {
						temp = numToSort[i - 1];
						numToSort[i - 1] = numToSort[i];
						numToSort[i] = temp;
						flag = true;

						// j++;
						// System.out.println("Step "+j+" =
						// "+Arrays.toString(numToSort));
					}
					j++;
					// System.out.println("InnerStep "+j);

				}

				// System.out.println("outerStep " + k);
			}
			System.out.println("Step " + j + " : " + Arrays.toString(numToSort));
		} else {
			System.out.println("Only 1 value:" + Arrays.toString(numToSort));
		}

	}

}
