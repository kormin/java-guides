package algorithms.sorting.selection;

import display.array.DisplayArray;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 11, 25, 12, 22, 64 };
		SelectionSort selectionSort = new SelectionSort();
		DisplayArray display = new DisplayArray();

		System.out.println("Array Before Bubble Sort: ");
		display.displayIntArray(arr);

		arr = selectionSort.sort(arr);

		System.out.println("Array Before Bubble Sort: ");
		display.displayIntArray(arr);
	}

}
