package designpatterns.creational.factorymethod.hiringmanager;

/**
 * @author tom
 *
 *         Description: Consider the case of a hiring manager. It is impossible
 *         for one person to interview for each of the positions. Based on the
 *         job opening, she has to decide and delegate the interview steps to
 *         different people.
 * 
 *         Link:
 *         https://github.com/kamranahmedse/design-patterns-for-humans#-factory-method
 */
public class Main {

	public static void main(String[] args) {
		HiringManager devManager = new DevelopmentManager();
		devManager.takeInterview(); // Output: Asking about design patterns
		
		HiringManager marketingManager = new MarketingManager();
		marketingManager.takeInterview(); // Output: Asking about community building.
	}

}
