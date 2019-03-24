package algorithms.sorting.bubble;

public class BubbleSort {

	public int[] sort(int[] A) {
		int n = A.length;
		int temp = 0;
		boolean swapped = false;
		do {
			swapped = false;
			for (int i = 1; i < n - 1; i++) {
				if (A[i - 1] > A[i]) {
					temp = A[i - 1];
					A[i - 1] = A[i];
					A[i] = temp;
					swapped = true;
				}
			}
		} while (swapped);
		return A;
	}

}
