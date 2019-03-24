package algorithms.sorting.bubble;

import display.array.DisplayArray;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 4, 2, 8 };
		BubbleSort bubbleSort = new BubbleSort();
		DisplayArray display = new DisplayArray();

		System.out.println("Array Before Bubble Sort: ");
		display.displayIntArray(arr);

		arr = bubbleSort.sort(arr);

		System.out.println("Array Before Bubble Sort: ");
		display.displayIntArray(arr);
	}

}
