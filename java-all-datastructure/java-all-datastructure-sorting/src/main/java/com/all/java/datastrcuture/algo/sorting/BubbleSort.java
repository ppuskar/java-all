package com.all.java.datastrcuture.algo.sorting;

public class BubbleSort implements Sort {

	private Integer[] sort(Integer[] dataToSort) {
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

	public static void main(String[] args) {
		Integer[] arr = { 23, 12, 43, 16, 65, 34, 87, 45, 1, 43, 23 };
		BubbleSort sort = new BubbleSort();
		sort.sortArray(arr);
		System.out.println("performed bubble sort.");
	}

	public Integer[] sortArray(Integer[] dataToSort) {
		return sort(dataToSort);
	}

}
