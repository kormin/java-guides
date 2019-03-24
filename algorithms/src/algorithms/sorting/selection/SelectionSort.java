package algorithms.sorting.selection;

public class SelectionSort {
	
	public int[] sort(int[] a) {
		int i, j;
		int n = a.length;

		for (j = 0; j < n - 1; j++) {
			int iMin = j;

			for (i = j + 1; i < n; i++) {
				if (a[i] < a[iMin]) {
					iMin = i;
				}
			}

			if (iMin != j) {
				int temp = a[j];
				a[j] = a[iMin];
				a[iMin] = temp;
			}
		}
		
		return a;
	}
	
}
