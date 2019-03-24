package designpatterns.behavioral.strategy.sorting;

/**
 * @author tom
 *
 *         Description: Consider the example of sorting, we implemented bubble
 *         sort but the data started to grow and bubble sort started getting
 *         very slow. In order to tackle this we implemented Quick sort. But now
 *         although the quick sort algorithm was doing better for large
 *         datasets, it was very slow for smaller datasets. In order to handle
 *         this we implemented a strategy where for small datasets, bubble sort
 *         will be used and for larger, quick sort.
 * 
 *         Link:
 *         https://github.com/kamranahmedse/design-patterns-for-humans#-strategy
 */
public class Main {

	public static void main(String[] args) {
		int[] dataset = { 1, 2, 3 };

		Sorter sorter = new Sorter(new BubbleSortStrategy());
		for (int i : sorter.sort(dataset)) {
			System.out.print(i + " ");
		}

		System.out.println();

		sorter = new Sorter(new QuickSortStrategy());
		for (int i : sorter.sort(dataset)) {
			System.out.print(i + " ");
		}
	}

}
