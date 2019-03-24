package designpatterns.structural.adapter.hunter;

/**
 * @author tom
 *
 *         Description: Consider that you have some pictures in your memory card
 *         and you need to transfer them to your computer. In order to transfer
 *         them you need some kind of adapter that is compatible with your
 *         computer ports so that you can attach memory card to your computer.
 *         In this case card reader is an adapter. Another example would be the
 *         famous power adapter; a three legged plug can't be connected to a two
 *         pronged outlet, it needs to use a power adapter that makes it
 *         compatible with the two pronged outlet. Yet another example would be
 *         a translator translating words spoken by one person to another
 * 
 *         Link:
 *         https://github.com/kamranahmedse/design-patterns-for-humans#-adapter
 */
public class Main {

	public static void main(String[] args) {
		WildDog wildDog = new WildDog();
		WildDogAdapter wildDogAdapter = new WildDogAdapter(wildDog);
		
		Hunter hunter = new Hunter();
		hunter.hunt(wildDogAdapter);
	}

}
