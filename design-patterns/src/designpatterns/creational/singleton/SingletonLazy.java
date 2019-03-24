package designpatterns.creational.singleton;

/**
 * @author tom
 *
 *         Description: A singleton implementation may use lazy initialization,
 *         where the instance is created when the static method is first
 *         invoked. If the static method might be called from multiple threads
 *         simultaneously, measures may need to be taken to prevent race
 *         conditions that could result in the creation of multiple instances of
 *         the class. The following is a thread-safe sample implementation,
 *         using lazy initialization with double-checked locking, written in
 *         Java.
 * 
 *         Link:
 *         https://en.wikipedia.org/wiki/Singleton_pattern#Lazy_initialization
 */
public class SingletonLazy {
	private static volatile SingletonLazy instance = null;

	private SingletonLazy() {
	}

	public static SingletonLazy getInstance() {
		if (instance == null) {
			synchronized (SingletonLazy.class) {
				if (instance == null) {
					instance = new SingletonLazy();
				}
			}
		}
		return instance;
	}

}
