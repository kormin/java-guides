package designpatterns.behavioral.observer.binary;

import java.util.Scanner;

/**
 * @author tom
 *
 *         Description: Observer in Java Example 1
 * 
 *         Link: https://sourcemaking.com/design_patterns/observer/java/1
 */
public class ObserverDemo {

	public static void main(String[] args) {
		Subject sub = new Subject();
		
		// Client configures the number and type of Observers
		new HexObserver(sub);
		new OctObserver(sub);
		new BinObserver(sub);
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("\nEnter a number: ");
			sub.setState(scan.nextInt());
		}
	}

}
