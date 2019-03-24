package designpatterns.creational.singleton;

/**
 * @author tom
 *
 *         Description: There can only be one president of a country at a time.
 *         The same president has to be brought to action, whenever duty calls.
 *         President here is singleton.
 * 
 *         Link:
 *         https://github.com/kamranahmedse/design-patterns-for-humans#-singleton
 */
public final class President {
	private static President instance;
	
	private President() {
	}
	
	public static President getInstance() {
		if(instance == null) {
			instance = new President();
		}
		return instance;
	}
	
}
