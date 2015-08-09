package com.all.java.datastrcuture.algo.sorting;

/**
 * Place the smallest number to tits location, starting with 0th location.
 * 
 * @author Illusion
 *
 */
public class SelectionSort implements Sort {

	public Integer[] sortArray(Integer[] dataToSort) {
		for (int i = 0; i < dataToSort.length; i++) {
			for (int j = i + 1; j < dataToSort.length; j++) {
				if (dataToSort[i] > dataToSort[j]) {
					dataToSort[i] = dataToSort[i] + dataToSort[j];
					dataToSort[j] = dataToSort[i] - dataToSort[j];
					dataToSort[i] = dataToSort[i] - dataToSort[j];
				}
			}
		}
		return dataToSort;
	}

	public int[] sort(int[] dataToSort) {
		for (int i = 0; i < dataToSort.length; i++) {
			for (int j = i + 1; j < dataToSort.length; j++) {
				if (dataToSort[i] > dataToSort[j]) {
					dataToSort[i] = dataToSort[i] + dataToSort[j];
					dataToSort[j] = dataToSort[i] - dataToSort[j];
					dataToSort[i] = dataToSort[i] - dataToSort[j];
				}
			}
		}
		return dataToSort;
	}
}
